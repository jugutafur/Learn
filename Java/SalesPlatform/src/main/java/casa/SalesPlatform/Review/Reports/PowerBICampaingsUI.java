package casa.SalesPlatform.Review.Reports;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import casa.SalesPlatform.Review.Annotation.AcsResource;
import casa.SalesPlatform.Review.Core.BasePageBean;
import casa.SalesPlatform.Review.Schema.AccessResource;

@ManagedBean(name = "powerBICampaingsUI")
@ViewScoped
@AcsResource(accessResource = AccessResource.POWER_BI_CAMPAINGS)
public class PowerBICampaingsUI extends BasePageBean{
	
	private static final long serialVerisonUID = 1l;
}
