package com.ltp.gradesubmission;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ltp.gradesubmission.entity.Student;

@SpringBootApplication
public class GradeSubmissionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GradeSubmissionApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

}
