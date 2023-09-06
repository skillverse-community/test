package org.skillversecommunity;

public class Toy {

	private String _name;
	private int _price;
	private int _ageRangeStart;
	private int _ageRangeEnd;
	
	/**
	 * Parameterized Constructor
	 * @param _name
	 * @param _price
	 * @param _ageRangeStart
	 * @param _ageRangeEnd
	 */
	public Toy(String _name, int _price, int _ageRangeStart, int _ageRangeEnd) {
		super();
		this._name = _name;
		this._price = _price;
		this._ageRangeStart = _ageRangeStart;
		this._ageRangeEnd = _ageRangeEnd;
	}

	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}

	/**
	 * @return the _price
	 */
	public int get_price() {
		return _price;
	}

	/**
	 * @return the _ageRangeStart
	 */
	public int get_ageRangeStart() {
		return _ageRangeStart;
	}

	/**
	 * @return the _ageRangeEnd
	 */
	public int get_ageRangeEnd() {
		return _ageRangeEnd;
	}
	
	/**
	 * Suppose the original range is 6 to 10
	 * 
	 * @param ageRange in the form 3-8 ... true if 3-12 ...false
	 * @return
	 */
	public boolean isItRightAgeToPlayWith(String ageRange )
	{
		boolean status = false;
		if(ageRange==null)
			throw new IllegalArgumentException();
		int ageStartSupplied = Integer.parseInt(ageRange.split("-")[0]);
		int ageEndSupplied = Integer.parseInt(ageRange.split("-")[1]);
		if(ageStartSupplied>=_ageRangeStart && ageEndSupplied <=_ageRangeEnd)
			status = true;
		
		return status;
	}
	
	public int costlierPriceBetween(Toy that) //wrong logic
	{
		if(this._price>that.get_price())
			return this.get_price();
		else
		{
			if(this._price == that.get_price())
				return that.get_price();
			else
				return -1;
		}
	}
	
	
}
