package casa.SalesPlatform.Review.Schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

//@Inherited
//@Retention(Retention.RUNTIME)
@XmlEnum
public enum AccessResource {

	@XmlEnumValue("POWER_BI_NEW_DASHBOARD")
	POWER_BI_NEW_DASHBOARD("POWER_BI_NEW_DASHBOARD"),
	@XmlEnumValue("POWER_BI_PORTOFOLIO")
	POWER_BI_PORTOFOLIO("POWER_BI_PORTOFOLIO"),
	@XmlEnumValue("POWER_BI_COUCHING")
	POWER_BI_COUCHING("POWER_BI_COUCHING"),
	@XmlEnumValue("POWER_BI_CAMPAINGS")
	POWER_BI_CAMPAINGS("POWER_BI_CAMPAINGS");
	
	private final String value;
	
	AccessResource(String v){
		this.value = v;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public static AccessResource fromValue(String value) {
		for (AccessResource accessResource : AccessResource.values()) {
			System.out.println("No Match de = "+accessResource);
			if(accessResource.value.equals(value)) {
				System.out.println("Encontro un match = "+accessResource);
				return accessResource;
			}
		}
		return null;
	}
	
}
