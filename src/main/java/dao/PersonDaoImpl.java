package dao;

import entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    private SessionFactory factory= HibernateUtil.getFactory();
    private Session session;
    @Override
    public Person addPerson(Person person) throws Exception {
        try{
            //ouvrir la session
            if(session.isOpen()){
                session= factory.getCurrentSession();

            }else {
                session=factory.openSession();
            }
//commencer la transaction
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
            return person;
        }
        catch (Exception exception){
            session.getTransaction().rollback();
            throw new Exception(person.getId()+"cannot be registerd");
        }
        finally {
            session.close();
        }

    }

    @Override
    public Person updatePerson(Person person) throws Exception {
        try{
            //ouvrir la session
if(session.isOpen()){
   session= factory.getCurrentSession();

}else {
    session=factory.openSession();
}
//commencer la transaction
session.beginTransaction();
session.update(person);
session.getTransaction().commit();
return person;
        }
        catch (Exception exception){
            session.getTransaction().rollback();
throw new Exception(person.getId()+"cannot be updated");
        }
        finally {
            session.close();
        }

    }

    @Override
    public void deletePerson(Person person) throws Exception {
        try{
            //ouvrir la session
            if(session.isOpen()){
                session= factory.getCurrentSession();

            }else {
                session=factory.openSession();
            }
//commencer la transaction
            session.beginTransaction();
            session.delete(person);
            session.getTransaction().commit();
        }
        catch (Exception exception){
            session.getTransaction().rollback();
            throw new Exception(person.getId()+"cannot be deleted");
        }
        finally {
            session.close();
        }

    }

    @Override
    public Person getPerson(Long id) throws Exception {
        Person person=null;
        try{
            //ouvrir la session
            if(session.isOpen()){
                session= factory.getCurrentSession();

            }else {
                session=factory.openSession();
            }
//commencer la transaction
            session.beginTransaction();
           person= session.get(Person.class,id);
            session.getTransaction().commit();
            return person;
        }
        catch (Exception exception){
            session.getTransaction().rollback();
            throw new Exception(person.getId()+"not found");
        }
        finally {
            session.close();
        }

    }

    @Override
    public List<Person> getAllPeople() throws Exception {
        List <Person> people= new ArrayList<>();

        try{
            //ouvrir la session
            if( session!=null && session.isOpen()){
                session= factory.getCurrentSession();

            }else {
                session=factory.openSession();
            }
//commencer la transaction
            session.beginTransaction();
           people= session.createQuery("from Person ",Person.class).getResultList();
            session.getTransaction().commit();
            return people;
        }
        catch (Exception exception){
            session.getTransaction().rollback();
            throw new Exception("Empty ");
        }
        finally {
            session.close();
        }

    }
}
