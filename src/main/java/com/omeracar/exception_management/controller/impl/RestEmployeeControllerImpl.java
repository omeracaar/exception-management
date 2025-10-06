package com.omeracar.exception_management.controller.impl;

import com.omeracar.exception_management.controller.RestEmployeeController;
import com.omeracar.exception_management.dto.DtoEmployee;
import com.omeracar.exception_management.model.RootEntity;
import com.omeracar.exception_management.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
        return ok(iEmployeeService.findEmployeeById(id));
    }


}
