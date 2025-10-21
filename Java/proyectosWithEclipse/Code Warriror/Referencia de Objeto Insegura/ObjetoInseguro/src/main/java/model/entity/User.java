package model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import java.util.List;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;
import lombok.Builder; 
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Setter
@Getter
@Builder   					//se puede colocar en una clase, en un constructor o en un método
@NoArgsConstructor 			//Generates default constructor
@AllArgsConstructor 		//Generates constructor with all fields
@ToString
@Table(name ="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String username;
	
	private String prueba;
	
	@ManyToMany
	@JoinTable(name = "role_user",
			   joinColumns = @JoinColumn(name = "user_id"),
			   inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
	
	@Column(name = "active")
	private Boolean isUserNotLocked;
}
