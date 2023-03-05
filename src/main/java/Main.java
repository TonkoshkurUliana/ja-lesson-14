import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction transaction = session.beginTransaction();
        try {
            Item item1 = new Item(1);
            Item item2 = new Item(2);
            Item item3 = new Item(3);
            Item item4 = new Item(4);
            Card cart = new Card(12,"name1");
            cart.setItems(new HashSet<Item>(Arrays.asList(item1, item2, item3, item4)));

            session.persist(cart);
            transaction.commit();

        } finally {
            session.close();
        }
    }
}