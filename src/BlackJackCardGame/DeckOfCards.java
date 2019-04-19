package BlackJackCardGame;

public class DeckOfCards {

	private Suits suite;
	private int values;

	public Suits getSuite() {
		return this.suite;
	}

	/**
	 * 
	 * @param suite
	 */
	public void setSuite(Suits suite) {
		this.suite = suite;
	}

	public int getValues() {
		return this.values;
	}

	/**
	 * 
	 * @param values
	 */
	public void setValues(int values) {
		this.values = values;
	}

}