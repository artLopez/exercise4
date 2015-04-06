package edu.csumb.app;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    @Test
    public void testNull(){
         App checkSize  = new App();
	 assertEquals(checkSize.getLength(""), 0);
    }

   @Test
   public void offByOne(){
 	App one = new App();
	assertEquals(one.getLength("Hello, World"), 12);
   }
   @Test
   public void checkIfFalse(){
        App checker = new App();
	assertFalse(checker.getLength("length") == 2);
   } 

   @Test
   public void checkIfNull(){
        App checker = new App();
        assertTrue(checker.checkNull("not null"));
   }

    @Test
   public void checkNull(){
        App checker = new App();
        assertFalse(checker.checkNull(null));
   }

}
