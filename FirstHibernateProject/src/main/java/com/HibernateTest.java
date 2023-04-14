import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.io.File;


public class HibernateTest {

    public static void main(String[] args) {
        String cfgFile ="/Applications/FirstHibernateProject/src/main/resources/hibernate.cfg.xml";
        File hibernateConfig = new File(cfgFile);

        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("first user");

        SessionFactory sessionFactory =
                new Configuration()
                        .configure(hibernateConfig)
                        .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
    }
}
