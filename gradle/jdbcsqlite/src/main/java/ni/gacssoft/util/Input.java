package ni.gacssoft.util;

import java.util.Scanner;
/**
 * Clase de utilidad para las vistas
 * aplicado bajo el modelo singleton
 * @author gacs
 */

public class Input {
	private static Scanner input=null;

	private Input() {
		input=new Scanner(System.in);
	}
	
	public static Scanner getInstance() {
        if(input==null)
     	   		new Input(); 
        return input;
	}
}
