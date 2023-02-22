package hospital;

public class TrabajadorNoMedico extends  Trabajador {
	 protected enum especialidad {ENFERMERO, RECEPCIONISTA, LIMPIADOR, OTRO};
	 protected  especialidad areaTrabajo;

	 public TrabajadorNoMedico(String nombre, int id, float sueldo, especialidad areaTrabajo){
		 super(nombre, id, sueldo);
		 this.areaTrabajo= areaTrabajo;
	 }
	 //Getters

	 public especialidad getAreaTrabajo() {
		 return areaTrabajo;
	 }


	 //Setters

	 public void setAreaTrabajo(especialidad areaTrabajo) {
		 this.areaTrabajo = areaTrabajo;
	 }

	 public void mostrarDatos() {
		  System.out.println("-----Trabajador no medico-----");
		 System.out.println("Nombre: " + nombre);
		 System.out.println("ID: " + id);
		 System.out.println("Sueldo: " + sueldo);
		  System.out.println("Area de trabajo: " + areaTrabajo);
		  System.out.println("-----Trabajador no medico-----");
		  System.out.println("                                                                             ");
	 }
}
