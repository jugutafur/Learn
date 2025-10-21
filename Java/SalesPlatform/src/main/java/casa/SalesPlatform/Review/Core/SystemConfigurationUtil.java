package casa.SalesPlatform.Review.Core;


import casa.SalesPlatform.Review.Annotation.Services;
import casa.SalesPlatform.Review.Schema.SystemConfiguration;

public class SystemConfigurationUtil {
	
	public static String getSimpleValue(String countryCode, String name) {
		Services services = Services.SystemConfigurationCachedGet1;
		System.out.println("countryCode = " +countryCode + " name = "+name);
		if(SystemConfiguration.HOST_BUSINESS_DATE.toString().equals(name)) {
			services = Services.SystemConfigurationByNameGet1;
			System.out.println("Service = " +services);
		}
		System.out.println("Service = " +services);
		String prueba1 = ":)";
		return prueba1;
	}
	
	public static String getStringSimpleValue(String countryCode, SystemConfiguration systemConfiguration ) {
		return getStringSimpleValue(countryCode, systemConfiguration, null);
	}
	
	public static String getStringSimpleValue(String countryCode, SystemConfiguration systemConfiguration, String defaulValue) {
		//Notar que systemConfiguration tiene To Sgtring() para sacar el string de la constante
		String simpleValue = getSimpleValue(countryCode, systemConfiguration.toString());
		return simpleValue;
	}
}
