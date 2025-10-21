package Validator;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("vCelular")
public class ValidarCelular implements Validator{

    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
        
        String nCelular = arg2.toString().trim();
        
        if(nCelular.length() == 0){
            throw new ValidatorException(new FacesMessage("Ingrese un numero, por favor")); 
        }
        
        //Con esta expresion regular podemos dar formato de entrada al numero el formato debe ser 9##-###-###
        else{
            String erText = "^9\\d\\d-\\d\\d\\d-\\d\\d\\d$";
            boolean ok = Pattern.matches(erText, nCelular);
            
            if(!ok){
                throw new ValidatorException(new FacesMessage("el formato debe ser 9##-###-###"));
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
