package MINTIC_The_Horus_Team.Sistema.de.Gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import entities.Empleado;
import entities.Empresa;
import entities.MovDinero;

@SpringBootApplication
public class SistemaDeGestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeGestionApplication.class, args);

		Empleado empleado1 = new Empleado("Juan","juan@mail.com","Natural", "Administrador");
		Empresa empresa1 = new Empresa("Natural","carrera 12 #56-1",2245654,1055654);
		MovDinero dinero1 = new MovDinero("Para suministros",20000.23,"Juan");

		Empleado empleado2 = new Empleado("Maria","maria@mail.com","Natural", "Empleado");
		Empresa empresa2 = new Empresa("Natural","carrera 12 #56-1",2245654,1055654);
		MovDinero dinero2 = new MovDinero("Retiro de dinero",100.00,"Maria");

		System.out.println(empleado1.getNombreEmpleado()+" "+empleado1.getCorreoEmpleado()+" "+empleado1.getEmpresaEmpleadoPertenece()+" "+empleado1.getRoleEmpleado());
		System.out.println(empresa1.getNombreEmpresa()+" "+empresa1.getDireccionEmpresa()+" "+empresa1.getTelefonoEmpresa()+" "+empresa1.getNitEmpresa());
		System.out.println(dinero1.getMovConcept()+" "+dinero1.getMontoMov()+" "+dinero1.getUsuarioEncargado());

		System.out.println(empleado2.getNombreEmpleado()+" "+empleado2.getCorreoEmpleado()+" "+empleado2.getEmpresaEmpleadoPertenece()+" "+empleado2.getRoleEmpleado());
		System.out.println(empresa2.getNombreEmpresa()+" "+empresa2.getDireccionEmpresa()+" "+empresa2.getTelefonoEmpresa()+" "+empresa2.getNitEmpresa());
		System.out.println(dinero2.getMovConcept()+" "+dinero2.getMontoMov()+" "+dinero2.getUsuarioEncargado());


	}

}

