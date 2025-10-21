import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScarpingUno {
	
	public static void main(String args[]) throws IOException {
		
		System.out.println("Prueba domingo");
		
		try {
			Document documento = Jsoup.connect("https://www.google.com/").get();
			Document documentoForex = Jsoup.connect("https://www.larepublica.co/indicadores-economicos/mercado-cambiario/euro").get();
			String title = documento.title();
			
			String titleForex = documentoForex.title();
			System.out.println("titulo = "+title);
			System.out.println("titulo titleForex = "+titleForex);
			
			Elements links = documento.select("a[href]");
			//Elements spans = documentoForex.select("a[href]");
			String html = "<html><head><title>First parse</title></head>"
					  + "<body><p>Parsed HTML into a doc.</p></body></html>";
					Document doc = Jsoup.parse(html);
					System.out.println("text = "+doc);
			Elements AllElements = documentoForex.getAllElements();
					
					Elements spans = documentoForex.select("span[class*='value']");
			
			
//			for(Element link: links) {
//				System.out.println("\nlink = "+link.attr("href"));
//				System.out.println("text = "+link.text());
//			}
			
			for(Element span: spans) {
				System.out.println("\nlink = "+span.attr("href"));
				System.out.println("text = "+span.text());
			}
			
			System.out.println("text x");
			
			
		} catch (Exception e) {
			System.out.println("Va a lanzar la exepcion");
			e.printStackTrace();
		}
		
	} 

}
