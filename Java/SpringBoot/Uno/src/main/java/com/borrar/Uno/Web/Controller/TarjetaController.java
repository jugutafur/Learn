package com.borrar.Uno.Web.Controller;

import com.borrar.Uno.App.Model.Post;
import com.borrar.Uno.App.Pages.Pages;
import com.borrar.Uno.Domain.Card;
import com.borrar.Uno.Domain.Service.CardService;
import io.swagger.annotations.ApiResponse;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/redirect")
public class TarjetaController {

    @Autowired
    private CardService cardService;

    public ArrayList<Post> getPostData(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1,"descripcion Uno", "imagen 1", "titulo Uno", new Date()));
        posts.add(new Post(1,"descripcion Dos", "imagen 2", "titulo Dos", new Date()));
        return posts;
    }

    public ArrayList<Card> getAllCards(){
        List<Card> entrada = cardService.getAllCards();
        ArrayList<Card> cards = new ArrayList<>();
        for(Card e : entrada){
            cards.add(e);
        }
        return cards;
    }

    @GetMapping("/Card2")
    public String getPost(Model model){
        model.addAttribute("post", getAllCards());
        return "galeryCard/galerycard";
    }

    @GetMapping("/Card")
    public String getPost2(Model model){
        model.addAttribute("post", getAllCards());
        return "detailCard/detailcard";
    }

    @GetMapping("/detailCard")
    public String getCardIndividual(@RequestParam(defaultValue = "2", name = "id", required = false) int id, Model model){
        ModelAndView modelAndView =new ModelAndView(Pages.DETAILCARD);

        List<Card> cards = cardService.getAllCards()
                .stream()
                .filter(data->{ return data.getId() == id;})
                .collect(Collectors.toList());
        model.addAttribute("post", cards.get(0));
        return "detailCard/detailcard";
    }
}

@RestController
@RequestMapping("/dataCard")
class TarjetaControllerdata{

    @Autowired
    private CardService cardService;

    @GetMapping("/test")
    public String getPrueba(){
        return "Este es un msm de prueba";
    }

    @GetMapping("/AllCard")
    public List<Card> getAllCards(){
        return cardService.getAllCards();
    }

    @GetMapping("/{idCard}")
    public Optional<Card> getCardByID(@PathVariable("idCard") int id){
        return cardService.getCard(id);
    }
}