package casa.SalesPlatform;

import casa.SalesPlatform.Review.Reports.PowerBINewDashboardUI;
import casa.SalesPlatform.Review.Schema.AccessResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesPlatformApplication.class, args);

		PowerBINewDashboardUI powerBINewDashboardUI = new PowerBINewDashboardUI();

		System.out.println("hola desde consola");
		System.out.println("object = "+ powerBINewDashboardUI.getNomalMethodBaseBean());
		System.out.println("hay mMatch = " + AccessResource.fromValue("POWER_BI_PORTOFOLIO"));
	}

}
