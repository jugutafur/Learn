package casa.SalesPlatform.Review.Reports;

import casa.SalesPlatform.Review.Annotation.AcsResource;
import casa.SalesPlatform.Review.Core.BasePageBean;
import casa.SalesPlatform.Review.Schema.AccessResource;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name ="powerBINewDashboardUI")
@ViewScoped				//Con esta anotacion indicamos que esta clase java de ahora en adelante se va a llamar Bean
@AcsResource(accessResource = AccessResource.POWER_BI_NEW_DASHBOARD)
public class PowerBINewDashboardUI extends BasePageBean {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String getInfoClass() {
		return "abstract PowerBINewDashboardUI";
	}
	
	public String getNomalMethod() {
		return "Normal Method of PowerBINewDashboardUI";
	}
	
	public static String getStaticMethod() {
		return "Static Method of PowerBINewDashboardUI";
	}
}
