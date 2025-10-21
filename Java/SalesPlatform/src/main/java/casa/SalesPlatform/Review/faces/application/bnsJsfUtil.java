package casa.SalesPlatform.Review.faces.application;

import javax.faces.context.FacesContext;

public class bnsJsfUtil {
    private final static String CHAR_SET = "ISO-8859-1";

    public static FacesContext getFacesContext(){
        return FacesContext.getCurrentInstance();
    }
}
