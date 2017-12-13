package db;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sample
 *
 */
@Entity
public class Sample implements Serializable {

	
	private String word;
	private int count;
	private static final long serialVersionUID = 1L;

	public Sample() {
		super();
	}   
	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}   
	@Id    
	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}
   
}
