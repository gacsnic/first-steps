package ni.gacssoft.view;

import java.util.Scanner;

import ni.gacssoft.model.Persona;
import ni.gacssoft.util.Input;
/**
 * Agrega registro a la tabla
 * @author gacs
 *
 */
public class NewPersona {
	private Persona pm; 
	public NewPersona(Persona pm) {
            this.pm = pm;
	}
	/**
	 * Este metodo es llamado por el controlador
	 */ 
    public void setRegister() {
        Scanner reg = Input.getInstance();
        System.out.println( "Nombre:" );
        pm.setNombre(reg.next());
        System.out.println( "Apellido:" );
        pm.setApellido(reg.next());
        System.out.println( "Sexo:" );
        pm.setSexo(reg.next());
    }
}
