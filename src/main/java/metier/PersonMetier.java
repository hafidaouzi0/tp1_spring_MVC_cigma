package metier;

import entities.Person;

import java.util.List;


public interface PersonMetier {

    //inscrire une personne
    public Person subscribe(Person person) throws Exception;
    //editer un profil
    public Person editProfile(Person person) throws Exception;
    //supprimer une personne
    public void deletePerson(Person person) throws Exception;
    //get Person and people
    public Person getPerson(Long id) throws Exception;
    public List<Person> getAllPerson() throws Exception;

}
