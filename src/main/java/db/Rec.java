package db;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

/**
 * Message-Driven Bean implementation class for: Rec
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "java:/jms/queue/DLQ"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		})
public class Rec implements MessageListener {

    /**
     * Default constructor. 
     */
    public Rec() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) 
    {
    	System.out.println("start transaction");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("onlyDB");
		//EntityManager em= EmFacSing.getEMF().createEntityManager();
    	System.out.println("end transaction");
    }

}
