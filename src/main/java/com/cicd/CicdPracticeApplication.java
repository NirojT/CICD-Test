package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CicdPracticeApplication {

	@GetMapping("/")
	public String home() {
		return "postgress done";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdPracticeApplication.class, args);
	}
/*
echo "# CICD-Test" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/NirojT/CICD-Test.git
git push -u origin main
 */
}
