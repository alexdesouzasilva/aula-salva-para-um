package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDepartmentDTO {
    
    private Long id;
    private String name;
    private Double salary;

    // Nunca aninhar DTO com uma entidade. Sempre relacionar com DTO's
    // para não haver quebra de arquitetura.
    private DepartmentDTO department;

    public PersonDepartmentDTO(Person entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.salary = entity.getSalary();
        this.department = new DepartmentDTO(entity.getDepartment());
    }
}
