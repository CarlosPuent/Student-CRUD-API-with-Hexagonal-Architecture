package com.services.ms.student.app.infraestructure.adapters.input.rest.model.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
}

