package com.omeracar.exception_management.dto;

import com.omeracar.exception_management.model.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class DtoEmployee {

    private Long id;

    private String name;

    private DtoDepartment department;
}
