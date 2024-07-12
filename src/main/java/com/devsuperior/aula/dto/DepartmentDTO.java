package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepartmentDTO {

    private Long id;
    private String name;

    public DepartmentDTO(Department entity) {
        id = entity.getId();
        name = entity.getName();
    }
    
}
