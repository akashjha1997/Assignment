package SpringBootProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.apache.logging.log4j.util.Strings;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class EntityDao {
      public void saveData(){
        EmployeeEntity emp = new EmployeeEntity(1, "abc");
        EmployeeEntity emp1 = new EmployeeEntity(2, "xyz");
        Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the Employee objects
            session.save(emp);
            session.save(emp1);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
      }
        public List<EmployeeEntity> getDetails(){
        	Session session = HibernateUtil.getSessionFactory().openSession();

        	List < EmployeeEntity > empl=new ArrayList<>();
        try  {
            empl = session.createQuery("from EmployeeEntity", EmployeeEntity.class).list();
        } catch (Exception e) {
           /* if (transaction != null) {
                transaction.rollback();
            }*/
            e.printStackTrace();
        }
		return empl;
}
        
        public List<EmployeeEntity> getDetails(String roles){
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	List < EmployeeEntity > empl=new ArrayList<>();
            if(roles.equalsIgnoreCase("ADMIN")) {

        try  {
            empl = session.createQuery("from EmployeeEntity", EmployeeEntity.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }}
		return empl;
}
        
        public String deleteDetails(int id){
        	Session session = HibernateUtil.getSessionFactory().openSession();

        	List < EmployeeEntity > empl=new ArrayList<>();

        try  {
        	EmployeeEntity employee=new EmployeeEntity();
        	employee.setId(id);
        	session.delete(employee);
             	

        } catch (Exception e) {
            e.printStackTrace();

        	return "row not deleted";
        }
		return "row deleted";
}
    }
