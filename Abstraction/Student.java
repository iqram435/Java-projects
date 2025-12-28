public class Student{
	private int id;
	private String name;
	private Device[] device;
	
	public Student(){}
	public Student(int id,String name, int size){
		this.id=id;
		this.name=name;
		device=new Device[size];
	}
	public void setID(int id){
		this.id=id;
	}
	public int getID(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void insert(Device d){
		for(int i=0;i<device.length;i++){
			if(device[i]==null){
				device[i]=d;
				break;
			}
		}
	}
	
	public void delete(Device d){
		for(int i=0;i<device.length;i++){
			if(device[i]==d){
				device[i]=null;
				break;
			}
			else{
				System.out.println("Device Not Found!!");
			}
		}
	}
	
	public void Details(){
		System.out.println("Student Name : "+name);
		System.out.println("Student Devices : ");
		System.out.println();
		
		for(int i=0;i<device.length;i++){
			if(device[i]!=null){
				device[i].Details();
			}
			else{
				System.out.println("Null Device !! ");
			}
		}
	}
}