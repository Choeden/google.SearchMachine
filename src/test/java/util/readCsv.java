package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readCsv {


public String email;
public String password;

public static final String csvfile="./src/test/java/user.csv";
public static void main(String[]args) {
	readCsv rc = new readCsv();
	rc.readCredentials("paul");
	
	
}
public void readCreddentials(String customer) {
	
	String line;
	String delimitter=",";

	
	try(BufferedReader br=new BufferedReader(new FileReader(csvfile))){
		
while((line=br.readLine())!=null) {
	String[] userLine=line.split(delimitter);
	if(userLine[2].equals(customer)){
		
		email=userLine[0];
		password=userLine[1];
		System.out.println(email);
		System.out.println(password);
	}
}
	}
	catch (IOException e) {
		System.out.println("File not found");
	}
}
}