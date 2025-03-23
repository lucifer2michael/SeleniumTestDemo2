package com.funnygorilla.studentmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.ToString;

@Accessors(chain = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
	@ToString.Include
	private Long id;
	@ToString.Include
	private String firstName;
	@ToString.Include
	private String lastName;
	@ToString.Include
	private String contact;
	@ToString.Include
	private String course;
}
