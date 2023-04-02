package metier;

import dao.PersonDao;
import entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class PersonMetierImpl implements PersonMetier {

//using setter
    private PersonDao dao;

    public void setDao(PersonDao dao) {
        this.dao = dao;
    }
    /*  @Autowired
    private PersonDao dao;*/

    //using constructor
/*  private final PersonDao dao;

  public PersonMetierImpl (PersonDao dao){
      this.dao=dao;
  }*/

    @Override
    public Person subscribe(Person person) throws Exception {
        if(!person.getEmail().contains("@gmail.com"))
            throw new Exception("email non authorized");
        return dao.addPerson(person);
    }

    @Override
    public Person editProfile(Person person) throws Exception {
        //code business logic or les contraintes fonctionnels
        return dao.updatePerson(person);
    }

    @Override
    public void deletePerson(Person person) throws Exception {
        //code business logic or les contraintes fonctionnels
        dao.deletePerson(person);

    }

    @Override
    public Person getPerson(Long id) throws Exception {
        //code business logic or les contraintes fonctionnels

        return dao.getPerson(id);
    }

    @Override
    public List<Person> getAllPerson() throws Exception {
        //code business logic or les contraintes fonctionnels

        return dao.getAllPeople();
    }
}
