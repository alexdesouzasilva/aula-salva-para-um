package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
    
    private Long id;
    private String name;
    private Double salary;
    private Long departmentId; // Em vez de usar o Objeto Department

    //Construtor que converte entity em DTO
    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.salary = person.getSalary();
        this.departmentId = person.getDepartment().getId();
    }

}
