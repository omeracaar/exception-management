package com.omeracar.exception_management.controller;

import com.omeracar.exception_management.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);

}
