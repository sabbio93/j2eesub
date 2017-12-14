package db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmFacSing
{
	private static EntityManagerFactory em=null;
	
	public static EntityManagerFactory getEMF()
	{
		if(em==null)
		{
			em=Persistence.createEntityManagerFactory("onlyDB");
		}
		return em;
	}
}
