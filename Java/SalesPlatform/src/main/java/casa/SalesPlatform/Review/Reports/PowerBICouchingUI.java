package casa.SalesPlatform.Review.Reports;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import casa.SalesPlatform.Review.Annotation.AcsResource;
import casa.SalesPlatform.Review.Core.BasePageBean;
import casa.SalesPlatform.Review.Schema.AccessResource;

@ManagedBean(name = "powerBICouchingUI")
@ViewScoped 			//Con esta anotacion indicara esta clase Java de ahora en adelante se llamara Bean
@AcsResource(accessResource = AccessResource.POWER_BI_COUCHING)
public class PowerBICouchingUI extends BasePageBean{
	
	private static final long serialVersionUID = 1L;
}
