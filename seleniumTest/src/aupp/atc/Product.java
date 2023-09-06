package aupp.atc;

public class Product {

	private String _name;
	private String _description;
	private double _price;
	public Product(String _name, String _description, double _price) {
		super();
		this._name = _name;
		this._description = _description;
		this._price = _price;
	}
	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}
	/**
	 * @return the _description
	 */
	public String get_description() {
		return _description;
	}
	/**
	 * @return the _price
	 */
	public double get_price() {
		return _price;
	}
	
	public boolean equals(Product that)
	{
		boolean status = false;
		if(this._name.equals(that.get_name()))
		{
			if(this._description.equals(that.get_description()))
			{
				if(this._price == that.get_price())
					status = true;
			}
		}
		return status;
	}
}
