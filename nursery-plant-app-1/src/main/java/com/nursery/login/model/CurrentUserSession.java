package com.nursery.login.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class CurrentUserSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer userId;
	private LocalDateTime  now;
	private String uuid;
	

	@Override
	public String toString() {
		return "CurrentUserSession [userId=" + userId + ", now=" + now + ", uuid=" + uuid + "]";
	}
	
	
	
	
}
