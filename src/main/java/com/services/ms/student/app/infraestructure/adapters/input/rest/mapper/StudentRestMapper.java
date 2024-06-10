package com.services.ms.student.app.infraestructure.adapters.input.rest.mapper;

import com.services.ms.student.app.domain.model.Student;
import com.services.ms.student.app.infraestructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.services.ms.student.app.infraestructure.adapters.input.rest.model.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import java.util.List;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper {

    @Mapping(target = "firstname", source = "firstName")
    @Mapping(target = "lastname", source = "lastName")
    Student toStudent(StudentCreateRequest request);

    @Mapping(target = "firstName", source = "firstname")
    @Mapping(target = "lastName", source = "lastname")
    StudentResponse toStudentResponse(Student student);

    List<StudentResponse> toStudentResponseList(List<Student> studentList);
}
