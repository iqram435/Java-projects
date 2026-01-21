package Entities;
import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class AdminAccount{
	private String adname;
	private String adpass;

	private File myfile;
	private FileWriter fwriter;
	private Scanner sc;
	
	public AdminAccount(){}
	
	public AdminAccount(String adname,String adpass){
		this.adname=adname;
		this.adpass=adpass;
	}
	
	public void setAdname(String adname){
		this.adname=adname;
	}
	public String getAdname(){
		return adname;
	}
	public void setAdpass(String adpass){
		this.adpass=adpass;
	}
	public String getAdpass(){
		return adpass;
	}

	
	public void addAdminAccount(){
		try{
			myfile = new File("src/Datas/admindata.txt");
			myfile.createNewFile();
			fwriter = new FileWriter(myfile,true);
			
			fwriter.write(getAdname()+"\t");
			fwriter.write(getAdpass()+ "\n");;
			
			fwriter.flush();
			fwriter.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	public boolean getAdminAccount(String name,String pass){
		boolean flag = false;
		try{
			myfile = new File("src/Datas/admindata.txt");
			sc = new Scanner(myfile);
			
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String[] value = line.split("\t");
				if(value[0].equals(name)&& value[1].equals(pass)){
					flag = true;
				}
			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		return flag;
	}
	public String viewAllAdmins() {
		StringBuilder sb = new StringBuilder();
		try {
			File myfile = new File("src/Datas/admindata.txt");
			if (!myfile.exists()) {
				return "No admin data found!";
			}

			Scanner sc = new Scanner(myfile);

			while(sc.hasNextLine()){
				String line = sc.nextLine();
				sb.append(line).append("\n");
			}

			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

}