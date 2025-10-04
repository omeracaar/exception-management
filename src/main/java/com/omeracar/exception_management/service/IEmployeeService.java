package com.omeracar.exception_management.service;

import com.omeracar.exception_management.dto.DtoEmployee;
import com.omeracar.exception_management.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);

}
