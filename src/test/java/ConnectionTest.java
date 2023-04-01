import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateUtil;

public class ConnectionTest {

@Test
public void connectionViaHibernate(){
    SessionFactory factory= HibernateUtil.getFactory();
    Assert.assertNotEquals(factory,null);
    }
}
