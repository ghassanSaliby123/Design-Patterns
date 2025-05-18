package com.company.liskov_1;

public class Square implements Shape {
	int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}
}
