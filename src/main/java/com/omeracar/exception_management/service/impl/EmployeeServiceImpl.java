package com.omeracar.exception_management.service.impl;

import com.omeracar.exception_management.dto.DtoDepartment;
import com.omeracar.exception_management.dto.DtoEmployee;
import com.omeracar.exception_management.exception.BaseException;
import com.omeracar.exception_management.exception.ErrorMessage;
import com.omeracar.exception_management.exception.MessageType;
import com.omeracar.exception_management.model.Department;
import com.omeracar.exception_management.model.Employee;
import com.omeracar.exception_management.repository.EmployeeRepository;
import com.omeracar.exception_management.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee=new DtoEmployee();
        DtoDepartment dtoDepartment=new DtoDepartment();

        Optional<Employee> optional= employeeRepository.findById(id);
        if (optional.isEmpty()){
          throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }
        Employee employee=optional.get();
        Department department=employee.getDepartment();
        BeanUtils.copyProperties(employee,dtoEmployee);
        BeanUtils.copyProperties(department,dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;

    }
}
