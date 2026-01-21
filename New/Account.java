package Entities;
import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class Account{
    private String uname;
    private String upass;
    private String unum;
    private String udob;
    private String umail;

    private File myfile;
    private FileWriter fwriter;
    private Scanner sc;

    public Account(){}

    public Account(String uname,String upass,String unum, String udob,String umail){
        this.uname=uname;
        this.upass=upass;
        this.unum=unum;
        this.udob=udob;
        this.umail=umail;
    }

    public void setUname(String uname){

        this.uname=uname;
    }
    public String getUname(){

        return uname;
    }
    public void setUpass(String upass){

        this.upass=upass;
    }
    public String getUpass(){

        return upass;
    }
    public void setUnum(String unum){

        this.unum=unum;
    }
    public String getUnum(){

        return unum;
    }
    public void setUdob(String udob){

        this.udob=udob;
    }
    public String getUdob(){

        return udob;
    }
    public void setUmail(String umail){

        this.umail=umail;
    }
    public String getUmail(){

        return umail;
    }

    public void addAccount(){
        try{
            myfile = new File("src/Datas/userdata.txt");
            myfile.createNewFile();
            fwriter = new FileWriter(myfile,true);

            fwriter.write(getUname()+"\t");
            fwriter.write(getUpass()+ "\t");
            fwriter.write(getUnum()+ "\t");
            fwriter.write(getUdob()+ "\t");
            fwriter.write(getUmail()+ "\n");

            fwriter.flush();
            fwriter.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    public boolean getAccount(String name,String pass){
        boolean flag = false;
        try{
            myfile = new File("src/Datas/userdata.txt");
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
    public String viewAllAccounts() {
        StringBuilder sb = new StringBuilder();
        try {
            myfile = new File("src/Datas/userdata.txt");
            if (!myfile.exists()) {
                return "No data found!";
            }

            sc = new Scanner(myfile);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                sb.append(line).append("\n"); // line by line append
            }

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}