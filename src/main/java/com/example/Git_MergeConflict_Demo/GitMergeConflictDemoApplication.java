package com.example.Git_MergeConflict_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitMergeConflictDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitMergeConflictDemoApplication.class, args);
	}
	 public String hello() {
	      return String.format("Hello  this is DevOps");
	 }
}
