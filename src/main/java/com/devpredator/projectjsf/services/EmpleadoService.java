/**
 * 
 */
package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

/**
 * @author DevPredator
 * Clase que permite realizar la logica de negocio para empleados.
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados() {
		
		//Generar la lista de empleados a consultar.
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("López");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luís Jesús");
		empleadoMicrosoft.setPrimerApellido("López");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("López");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		//:::::::::::::::::::::::::::::::::::
		
		empleadoAmazon.setNombre("Christian");
		empleadoAmazon.setPrimerApellido("Paniagua");
		empleadoAmazon.setSegundoApellido("López");
		empleadoAmazon.setPuesto("Senior Developer Java");
		empleadoAmazon.setEstatus(true);
		
		empleadoDeloitte.setNombre("Luisa");
		empleadoDeloitte.setPrimerApellido("López");
		empleadoDeloitte.setSegundoApellido("Romero");
		empleadoDeloitte.setPuesto("CEO");
		empleadoDeloitte.setEstatus(true);
		
		empleadoHP.setNombre("Lupita");
		empleadoHP.setPrimerApellido("López");
		empleadoHP.setSegundoApellido("Romero");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setEstatus(true);
		
		empleadoNetflix.setNombre("Carlos");
		empleadoNetflix.setPrimerApellido("Paniagua");
		empleadoNetflix.setSegundoApellido("López");
		empleadoNetflix.setPuesto("Senior Developer Java");
		empleadoNetflix.setEstatus(true);
		
		empleadoOracle.setNombre("Adrián");
		empleadoOracle.setPrimerApellido("López");
		empleadoOracle.setSegundoApellido("Romero");
		empleadoOracle.setPuesto("CEO");
		empleadoOracle.setEstatus(true);
		
		empleadoDisney.setNombre("César");
		empleadoDisney.setPrimerApellido("López");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("Architect");
		empleadoDisney.setEstatus(true);
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoDisney);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoHP);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoOracle);
		
		return empleados;
	}
}
