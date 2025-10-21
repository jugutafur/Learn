package model.dto;

import java.util.Set;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAlias;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)			//Ignora todos los campos que no estan presentes al transformar entidades
public class RecaptchResponseDto {
	
	private boolean success;
	
	@JsonAlias("error-codes")
	private Set<String> errorCode;

}
