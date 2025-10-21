package controller;

import constant.Messages;
import constant.ViewNames;

import javax.servlet.http.HttpServletRequest;
import exception.UserNotFoundException;
import model.dto.AccountActivationTokenDto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.service.api.AccountActivationTokenService;
import app.service.api.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor  //generates a constructor with a parameter for each field that requires special handling 
						  //genera un constructor con 1 parámetro para cada campo que requiere un manejo especial
public class ActivationController {
	
	private final AccountActivationTokenService accountActivationTockenService;
	private final UserService userService;
	
	@GetMapping(value = ViewNames.ACCOUNT_ACTIVATION_URL)
	public String displayAccountActivationPage(
			@RequestParam(required = false) 
			String token, Model model, HttpServletRequest request) 
			throws UserNotFoundException
	{
		AccountActivationTokenDto tokenDto = accountActivationTockenService.findByToken(token, request);
		
		if(tokenDto == null) {
			model.addAttribute("error", Messages.Error.FIND_ACCOUNT_ACTIVATION_TOKEN);
			return "login";
		}
		
		if(tokenDto.isExpired()) {
			model.addAttribute("error", Messages.Error.EXPIRED_ACCOUNT_ACTIVATION_TOKEN);
			return "login";
		}
		
		userService.activateUser(tokenDto);
		
		model.addAttribute("message", Messages.SUCCESS_ACCOUNT_ACTIVATION);
		return "login";
	}

}
