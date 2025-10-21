package model.dto;

import lombok.Setter;
import lombok.Getter;

import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
public class UserInfoRequestDto {
	private String address;
	private MultipartFile avatar;

}
