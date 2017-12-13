package db;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Session Bean implementation class PersistOnce
 */
@Stateless(mappedName = "Pone")
public class PersistOnce implements PersistOnceLocal {

    /**
     * Default constructor. 
     */
    public PersistOnce() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void pers() 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onlyDB");
		EntityManager em= emf.createEntityManager();
		
		Sample sm= new Sample();
		sm.setCount(2);
		sm.setWord("ciao");
		
		em.persist(sm);
		em.flush();
		
		em.close();
		emf.close();
		
	}

}
