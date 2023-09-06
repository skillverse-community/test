package com.skillverse;

public class Square {
	
	int _length;
	int _breadth;
	
	
	public Square(int _length, int _breadth) {
		super();
		this._length = _length;
		this._breadth = _breadth;
	}


	public int get_length() {
		return _length;
	}


	public int get_breadth() {
		return _breadth;
	}
	
	private void changeLength()
	{
		_length = _length + 1;
	}
	
	public int getArea()
	{
		changeLength();
		
		return _length * _breadth;
	}
	
	public boolean checkSquare()
	{
		boolean status = false;
		
		if(_length != _breadth)
			status = true;
		return status;
		
	}

}
