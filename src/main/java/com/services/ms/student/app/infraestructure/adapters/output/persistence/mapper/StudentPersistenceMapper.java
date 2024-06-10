package com.services.ms.student.app.infraestructure.adapters.output.persistence.mapper;

import com.services.ms.student.app.domain.model.Student;
import com.services.ms.student.app.infraestructure.adapters.output.persistence.entity.StudentEntity;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {

    Student toStudent(StudentEntity entity);

    StudentEntity toStudentEntity(Student student);

    List<Student> toStudentList(List<StudentEntity> entities);
}