package casa.SalesPlatform.Review.Core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ComponentSystemEvent;

public abstract class BaseCompBean extends BaseUIBean implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	protected static final String FORM_ENCODING_MULTIPART = "Multipart/form-data";
	protected static final String FORM_ENCODING_URLENCODED = "application/x-www-form-urlencoded";
	protected static final String FORM_ENCODING_DEFAULT = "FORM_ENCODING_DEFAULT";
	
	private final CompBeanEventListener listener = new CompBeanEventListener(this);
	protected BasePageBean pageBean;
	private boolean disableValidator;
	private boolean displayRequiredIndicator;
	private String primaryKeys;
	private String actionName;
	
	protected BaseCompBean() {
		//if(getLogger().isDebugEnabled()) {
		//	getLogger().debug("Created a Component "+ this);
		//}
	}

	@Override
	@PostConstruct
	public void initChildren(){
		postInitChildren();
	}

	public void postInitChildren(){

	}

	@Override
	@PreDestroy
	public void onDestroyBean(){

	}
	
	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		// TODO Auto-generated method stub
	}

	public void setPageBean(BasePageBean pageBean){
		this.pageBean = pageBean;
	}
	public BasePageBean getPageBean(){
		return this.pageBean;
	}

	public boolean isDisableValidator(){
		return this.disableValidator;
	}

	public void getDisableValidator(boolean disableValidator){
		this.disableValidator = disableValidator;
	}

	public boolean istDisplayRequiredIndicator(){
		return this.displayRequiredIndicator;
	}

	public void getDisplayRequiredIndicator(boolean displayRequiredIndicator){
		this.displayRequiredIndicator = displayRequiredIndicator;
	}

	public String getPrimaryKeys(){
		return	this.primaryKeys;
	}

	public void setPrimaryKeys(String primaryKeys){
		this.primaryKeys = primaryKeys;
	}

	public String getActionName(){
		return this.actionName;
	}

	public void setActionName(String actionName){
		this.actionName = actionName;
	}


	protected  void preRenderView(ComponentSystemEvent event){

	}

	public void postFormValidate(ComponentSystemEvent event){

	}
}
