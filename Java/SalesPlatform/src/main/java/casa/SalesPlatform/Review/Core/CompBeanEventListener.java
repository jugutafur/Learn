package casa.SalesPlatform.Review.Core;

import casa.SalesPlatform.Review.Annotation.AuthenticatedUser;
import casa.SalesPlatform.Review.Soa.ServiceContextProvider;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;
import java.io.Serializable;



public class CompBeanEventListener implements ServiceContextProvider, SystemEventListener, Serializable{

	private static final long serialVerionUID = 1L;
	final private BaseCompBean baseCompBean; 
	
	public CompBeanEventListener(BaseCompBean baseCompBean) {
		this.baseCompBean = baseCompBean;
	}
	
	public void subscribeToEvents() {}
	public void unsubscribeFromEvents() {}

	@Override
	public boolean isListenerForSource(Object source){
		return false;
	}

	@Override
	public void processEvent(SystemEvent event) throws AbortProcessingException{

	}
	@Override
	public ServiceContext getServiceContext() {
		ServiceContext serviceContext = new ServiceContext();
		return serviceContext;
	}

	@Override
	public AuthenticatedUser getCurrentUser() {
		//SessionUtil.getAuthenticatedUser();
		return null;
	}
}
