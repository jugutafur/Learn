package casa.SalesPlatform.Review.Soa;


import casa.SalesPlatform.Review.Annotation.AuthenticatedUser;
import casa.SalesPlatform.Review.Core.ServiceContext;

public interface ServiceContextProvider {
	ServiceContext getServiceContext();
	AuthenticatedUser getCurrentUser();
}
