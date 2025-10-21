package casa.SalesPlatform.Review.Core;

import java.io.Serializable;

public class ServiceContext implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected String actionType;
	protected String accessResource;
	protected String serviceType;
	protected String userSubjectID;
	protected String userSubjectPath;
	protected String reference;
}
