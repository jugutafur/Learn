package model.entity;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.Column;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Builder
@NoArgsConstructor			//Generate default constructor
@AllArgsConstructor			//Generate constructor with all fields
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Getter
	@Setter
	private String name;
	
	@ManyToMany
	private final List<User> users = new ArrayList<>();	

}
