package com.omeracar.exception_management.controller;

import com.omeracar.exception_management.dto.DtoEmployee;
import com.omeracar.exception_management.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);

}
