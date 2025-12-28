public abstract class Device{
	private int Did;
	private double price;
	
	public Device(){}
	public Device(int Did,double price){
		this.Did=Did;
		this.price=price;
	}
	public void setDID(int Did){
		this.Did=Did;
	}
	public int getDID(){
		return Did;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	
	public abstract void Details();
}