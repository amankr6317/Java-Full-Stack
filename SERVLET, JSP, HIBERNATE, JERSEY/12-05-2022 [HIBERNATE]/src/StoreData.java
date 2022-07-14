import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
         Employee e1=new Employee();    
            //e1.setId(1);    
            e1.setFirstName("Kumar");    
            e1.setLastName("Technologies");    
            e1.setSalary(400000);
       session.save(e1);  
       t.commit();  
       System.out.println("successfully saved"); 
       
       String hql = "FROM Employee";
       Query query = session.createQuery(hql);
       List results = query.list();
       System.out.println(results.toString());
       
        factory.close();  
        session.close();     
    }  
}  