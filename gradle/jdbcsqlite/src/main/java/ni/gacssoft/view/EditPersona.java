package ni.gacssoft.view;

import java.util.Scanner;

import ni.gacssoft.model.Persona;
import ni.gacssoft.util.Input;

public class EditPersona {
	
    public int getRegister() {
        int register;
        Scanner r= Input.getInstance();
        System.out.print("Digite el Id del registro a modificar :");
        register=r.nextInt();
        return register;
    }	
    public void postRegister(Persona a) {
        Scanner r= Input.getInstance();
        System.out.println("Registro a modificar");
        System.out.println("Id      :"+a.getId());
        System.out.println("Apellido  :"+a.getApellido());
        a.setApellido(r.next());
        System.out.println("Nombre  :"+a.getNombre());
            a.setNombre(r.next());
        System.out.println("Sexo    :"+a.getSexo());
           a.setSexo(r.next());
    }
}
