package model.entity;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
@Table(name = "avatars")
public class Avatar {

	@Id
	String id;
	String Type;
	String extension;
}
