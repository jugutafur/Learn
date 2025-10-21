package casa.SalesPlatform.Web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class Test {
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola Juan desde test";
    }

    @GetMapping("/test")
    public String getString(){
        return null;
    }
}
