package com.services.ms.student.app;

import com.services.ms.student.app.domain.model.Student;
import com.services.ms.student.app.infraestructure.adapters.output.persistence.entity.StudentEntity;
import com.services.ms.student.app.infraestructure.adapters.output.persistence.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentServiceApplication implements CommandLineRunner {

	private final StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<StudentEntity> entities = Arrays.asList(
				new StudentEntity(null, "Juan", "Pérez", 28, "Calle 1"),
				new StudentEntity(null, "María", "López", 22, "Calle 2"),
				new StudentEntity(null, "Carlos", "González", 30, "Calle 3"),
				new StudentEntity(null, "Ana", "Martínez", 25, "Calle 4"),
				new StudentEntity(null, "Luis", "Hernández", 27, "Calle 5"),
				new StudentEntity(null, "Sofía", "Ramírez", 24, "Calle 6")
		);

			repository.saveAll(entities);
	}

}
