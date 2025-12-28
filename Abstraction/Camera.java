public class Camera extends Device{
	private String type;
	public Camera(){}
	public Camera(int Did,double price,String type){
		super(Did,price);
		this.type=type;
	}
	
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}
	public void Details(){
		System.out.println("Camera ID : "+getDID());
		System.out.println("Camera Price : "+getPrice());
		System.out.println("Type : "+type);
	}
}