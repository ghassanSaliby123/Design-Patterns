package com.prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("General clone() not implemented");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("General reset() not implemented");
	}
}
