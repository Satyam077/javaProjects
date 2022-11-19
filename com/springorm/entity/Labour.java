package com.springorm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Labour {
	@Id
	private int LabourID;
	private String LabourName;
	private int Age;
	private String State;

}
