package chapter1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class TestSecurityManager {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		new URL("http://www.yahoo.com:80").openConnection().connect();
		System.out.println("Succssful Connection");


	}

}
