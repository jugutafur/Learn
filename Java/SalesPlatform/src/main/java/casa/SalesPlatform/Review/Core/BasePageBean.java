package casa.SalesPlatform.Review.Core;

import casa.SalesPlatform.Review.Schema.SystemConfiguration;
import casa.SalesPlatform.Review.faces.application.bnsJsfUtil;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.PreRenderViewEvent;

public abstract class BasePageBean extends BaseUIBean{
	
	private static final long serialVersionUID = 1L;
	private final List<BaseCompBean> compBeans = new ArrayList<BaseCompBean>(2);
	private final List<FacesMessage> noticeMessages = new ArrayList<FacesMessage>();

	@Override
	@PostConstruct
	public void initChildren(){
		postInitChildren();
	}

	protected void postInitChildren(){}

	@Override
	@PreDestroy
	public void onDestroyBean(){

	}

	public List<BaseCompBean> getCompBeans(){
		return compBeans;
	}

	public List<FacesMessage> getNoticeMessages(){
		return noticeMessages;
	}

	public void processSystemEvent(ComponentSystemEvent even){
		if(even instanceof PreRenderViewEvent){
			selectMenuByPage();
		}
	}

	protected void selectMenuByPage(){
		final FacesContext facesContext = bnsJsfUtil.getFacesContext();
	}

	public String getPowerBINewDashboardURL() {
		return SystemConfigurationUtil.getStringSimpleValue(getCurrentCountryCode(), SystemConfiguration.POWER_BI_NEW_DASHBOARD);
	}
	
	public String getPowerBICampaingsURL() {
		return SystemConfigurationUtil.getStringSimpleValue(getCurrentCountryCode(), SystemConfiguration.POWER_BI_CAMPAIGNS);
	}
	
	public String getPowerBIMyCoachingNewURL() {
		return SystemConfigurationUtil.getStringSimpleValue(getCurrentCountryCode(), SystemConfiguration.POWER_BI_COACHING);
	}
	
	@Override
	public String getInfoClass() {
		return "abstract BasePageBean";
	}
	
	public String getNomalMethodBasePageBean() {
		return "Normal Method of BasePageBean";
	}
	
	public static String getStaticMethodBasePageBean() {
		return "Static Method of BasePageBean";
	}
}
