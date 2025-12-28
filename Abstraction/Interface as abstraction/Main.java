public class Main{
	public static void main(String[] args){
		Device d1 = new Laptop(111,55000,16.5f);
		Device d2 = new Laptop(222,65000,17.5f);
		
		Device d3= new Camera(333,75000,"Mirrorless");
		Device d4 = new Camera(444,85000,"DSLR");
		
		Student s = new Student(62274,"Md. Iqram", 5);
		
		s.insert(d1);
		s.insert(d2);
		s.insert(d3);
		s.insert(d4);
		
		s.delete(d3);
		s.Details();
	}
}