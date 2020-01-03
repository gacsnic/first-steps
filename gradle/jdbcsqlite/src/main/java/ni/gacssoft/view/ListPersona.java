package ni.gacssoft.view;

import java.io.IOException;
import java.util.List;
import ni.gacssoft.model.Persona;

/**
 * Lista los registro de la tabla
 * @author gacs
 *
 */
public class ListPersona {

    public void sayRegisters(List<Persona> a) 
    {
        System.out.println(" Id "+"  -- Nombre --   "+" -- Apellido -- "+" - Sexo - ");
	a.forEach(p ->{
            System.out.println(p.toString());	
	});
        try
        {
            System.out.println("\n\n  Presione ENTER..");
            System.in.read();
	}
	catch(IOException exe)
	{
            System.out.printf("Error?");
	}
    }
	public void sayRegister(Persona a) 
	{
		System.out.println(" Id "+"  -- Nombre --   "+" -- Apellido -- "+" - Sexo - ");
		System.out.println(a.toString());	
	}
}
