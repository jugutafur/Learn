package casa.SalesPlatform.Review.Core;

import casa.SalesPlatform.Review.Annotation.BaseBean;

import java.io.Serializable;


public abstract class BaseUIBean extends BaseBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private boolean initialized = false;
	
	public static final String PARAM_NUMBER_FORMAT = "NUMBER_FORMAT_";
	public static final String PARAM_DATE_FORMAT = "PARAM_DATE_FORMAT";
	public static final String PARAM_LOCAL_CURRENCY = "LOCAL_CURRENCY";
	public static final String PARAM_PAGINATION_SIZE = "PAGINATION_SIZE";
	
	public boolean isInitialized() {
		return this.initialized;
	}
	
	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}
	
	public void initChildren() {}
	public void onDestroyBean() {}

	public String getCurrentCountryCode() {
		return "Colombia";
	}

	@Override
	public String getInfoClass() {
		return "abstract BaseUIBean";
	}
	
	public String getNomalMethodBaseUIBean() {
		return "Normal Method of BaseUIBean";
	}
	
	public static String getStaticMethodBaseUIBean() {
		return "Static Method of BaseUIBean";
	}
}
