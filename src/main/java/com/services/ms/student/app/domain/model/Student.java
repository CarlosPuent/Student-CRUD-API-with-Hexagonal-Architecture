package com.services.ms.student.app.domain.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;
    private String firstname;
    private String lastname;
    public Integer age;
    private String address;
}
