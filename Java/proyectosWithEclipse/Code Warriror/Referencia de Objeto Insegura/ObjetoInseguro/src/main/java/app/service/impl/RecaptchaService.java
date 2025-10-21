package app.service.impl;

import java.util.Collections;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import model.dto.RecaptchResponseDto;

@RequiredArgsConstructor
@Slf4j
@Service
public class RecaptchaService {
	
	private final RestTemplate restemplate;
	
	@Value("${recaptch.url")
	private String recaptchUrl;
	
	@Value("${recaptch.key.secret}")
	private String recaptchSecret;
	
	@Value("${recaptch.key.public}")
	private String recaptchPublic;
	
	public RecaptchResponseDto getRecaptchResponse(String responseCaptch) {
		String url = String.format(recaptchUrl+ "?secret=%s&response=%s", recaptchSecret, responseCaptch);
		return restemplate.postForObject(url, Collections.emptyList(),RecaptchResponseDto.class);
	}
	
	public String getRecaptchPublic() {
		return this.recaptchPublic;
	}
}
