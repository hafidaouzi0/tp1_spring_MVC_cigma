package web;


import entities.Person;
import metier.PersonMetier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/people")
public class PersonController {
    //injection via le contructor
    private final PersonMetier metier;

   public PersonController(PersonMetier metier){
       this.metier=metier;
   }

   @GetMapping("")
   public String listPeople(Model model){
       try {
           List<Person> people;
           people = metier.getAllPerson();
           model.addAttribute("people",people);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

       return "people";
   }




   //formulaire d'ajout
    @PostMapping("/save")
    public String addPerson(Person person, Model model){

       return "addPerson";
    }

}
