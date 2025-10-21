package constant;

public interface ViewNames {
	String MAIN_PAGE_URL = "/";
	String MAIN_PAGE_VIEW_NAME = "index";
	String LOGIN_VIEW_NAME = "login";
	String LOGIN_URL = MAIN_PAGE_URL + LOGIN_VIEW_NAME;
	String ADMIN_VIEW_NAME = "admin";
	String ADMIN_URL = MAIN_PAGE_URL+ ADMIN_VIEW_NAME;
	String LOGIN_ERROR_URL = LOGIN_URL + "?error" ;
	String SUCCESS_LOGOUT_OUT = LOGIN_URL + "?logout";
	String REGISTRATION_VIEW_NAME = "registration";
	String REGISTRATION_URL_ = MAIN_PAGE_URL + REGISTRATION_VIEW_NAME;
	String ACCOUNT_ACTIVATION_URL = MAIN_PAGE_URL + "account-activation";
	String INCLUDE_ALL = "/**";
	String USER_INFO_VIEW_NAME = "user-info";
	String USER_INFO_URL = MAIN_PAGE_URL + USER_INFO_VIEW_NAME;
	String AVATAR_URL = MAIN_PAGE_URL + "avatar";
	String LOGOUT_URL = MAIN_PAGE_URL + "logout";
	String ERROR_VIEW_NAME = "error";
	String ACCOUNT_ACTIVATION_MESSAGE_TEMPLATE = "email/account-activation";
}
