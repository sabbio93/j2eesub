package db;

import javax.ejb.Local;

@Local
public interface PersistOnceLocal {

	public void pers();
}
