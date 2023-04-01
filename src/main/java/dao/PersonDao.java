package dao;

import entities.Person;

import java.util.List;

public interface PersonDao {
    //creation des methodes qu'ok=n veut implementer
    //add
   public Person addPerson(Person person) throws Exception;
   //update
    public Person updatePerson(Person person) throws Exception;
    //delete
    public void deletePerson(Person person) throws Exception;
    //get
    public  Person getPerson(Long id) throws Exception;
    //get All
    public List<Person> getAllPeople() throws Exception;


}
