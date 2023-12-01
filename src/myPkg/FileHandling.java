package myPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{

	public static void readProp() throws Exception 
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("automation"));
		System.out.println(prop.get("url"));
	}
	
	
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nThis is forth line");
		fw.flush();
		fw.close();
	}
	
	public static void readData() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt"); //file connection
		
		//FileReader fr = new FileReader("C:\\Users\\Santosh\\Desktop\\abc.txt");
		
		FileReader fr = new FileReader("./TestData/data.txt");
		
		int a = fr.read();  //116
	
		while(a!=-1)  //true  //-1!=-1 false
		{
			System.out.print((char)a);  //thi
			a = fr.read();  //h=104, 
		}
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
		//FileHandling.readData();
		//FileHandling.writedata();
		FileHandling.readProp();
	}
}
