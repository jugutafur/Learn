package casa.SalesPlatform.Review.Annotation;

public abstract class BaseBean {
	//private transient bnsLogger logger;
	private transient String logger;		//Este tipo de datos debe ser cambiado 
	
	//public logger getLogger(){
	public String getLogger() {
		if(logger == null) {
			//logger = bnsLogManager.getLogger(getClass().getName());
			return null;
		}
		return logger;
	}
	
	
	public abstract String getInfoClass();
	
	public String getNomalMethodBaseBean() {
		return "Normal Method of BaseBean";
	}
	
	public static String getStaticMethodBaseBean() {
		return "Static Method of BaseBean";
	}
}
