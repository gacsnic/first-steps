package ni.gacssoft.view;

import java.util.Scanner;

import ni.gacssoft.model.Persona;
import ni.gacssoft.util.Input;

public class DeletePersona {
	
	public int getRegister() {
		int register;
		Scanner r= Input.getInstance();
		System.out.println("Digite el registro a eliminar");
		register=r.nextInt();
		return register;
	}

	public boolean postRegister(Persona a) {
		Scanner r= Input.getInstance();
		System.out.println("Se borra el registro");
		System.out.println("Id      :"+a.getId());
		System.out.println("Nombre  :"+a.getNombreCompleto());
		System.out.println("Sexo    :"+a.getSexo());
		System.out.print("Desear eliminar este registro ?[S/N]");
		String bln=r.next();
		return bln.equalsIgnoreCase("S");
	}
}
