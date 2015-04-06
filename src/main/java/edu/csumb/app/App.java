package edu.csumb.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello there");
    }
    int getLength(String str) {
 	   if (str == null) {
        	return 0;
    	} else {
        	return str.length();
    	}
     
    }

    boolean checkNull(String word){
         if(word == null){
		return false;
	}
	 return true;  
    }
}
