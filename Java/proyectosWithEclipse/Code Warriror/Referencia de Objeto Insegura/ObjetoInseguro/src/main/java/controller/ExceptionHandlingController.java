package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.Messages;
import constant.ViewNames;

@ControllerAdvice
public class ExceptionHandlingController {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handel(HttpServletRequest request,
							   HttpServletResponse response,
							   Exception exception) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", Messages.Error.ERROR_OCCURRED);
		modelAndView.setViewName(ViewNames.ERROR_VIEW_NAME);
		return modelAndView;
	}
}