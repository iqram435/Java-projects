public class Laptop extends Device{
	private float size;
	public Laptop (){}
	
	public Laptop(int Did,double price,float size){
		super(Did,price);
		this.size=size;
	}
	public void setSize(float size){
		this.size=size;
	}
	public float getSize(){
		return size;
	}
	public void Details(){
		System.out.println("Laptop ID : "+getDID());
		System.out.println("Laptop Price : "+getPrice());
		System.out.println("Size : "+size);
	}
}