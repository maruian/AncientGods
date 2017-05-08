package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Ventanas.TerceraVentana;

public class TestsUnitarios {

	 @Test
	  public void testPrimeraPregunta() {
		 TerceraVentana tv = new TerceraVentana();
		 assertEquals(true, tv.testRespuesta("3.14"));
	  }
	 
	  @Test
      public void testSegundaPregunta() {
 	     TerceraVentana tv = new TerceraVentana();
	 	 assertEquals(true, tv.segundoTestRespuesta("1969"));
	  }
	 
}
	

