package hospital;

public class TrabajadorMedico extends  Trabajador{
	 protected int numColegiado;
	 protected int numPacientes;
	 protected enum especialidad {CARDIOLOGIA, PEDIATRIA, CIRUJANO, OTRO};
	 protected  especialidad areaTrabajo;

	 public TrabajadorMedico(String nombre, int id, float sueldo, int numColegiado, int numPacientes, especialidad areaTrabajo){
		 super(nombre, id, sueldo);
		 this.numColegiado = numColegiado;
		 this.numPacientes = numPacientes;
		 this.areaTrabajo= areaTrabajo;
	 }

	 //Getters
	 public int getNumColegiado() {
		 return numColegiado;
	 }

	 public int getNumPacientes() {
		 return numPacientes;
	 }

	 public especialidad getAreaTrabajo() {
		 return areaTrabajo;
	 }

	 //Setters

	 public void setNumColegiado(int numColegiado) {
		 this.numColegiado = numColegiado;
	 }

	 public void setNumPacientes(int numPacientes) {
		 this.numPacientes = numPacientes;
	 }

	 public void setAreaTrabajo(especialidad areaTrabajo) {
		 this.areaTrabajo = areaTrabajo;
	 }

	 public void mostrarDatos() {
		  System.out.println("------Trabajador Medico------");
		 System.out.println("Nombre: " + nombre);
		 System.out.println("ID: " + id);
		 System.out.println("Sueldo: " + sueldo);
		  System.out.println("Area de trabajo: " + areaTrabajo);
		 System.out.println("Numero de colegiado: " + numColegiado);
		 System.out.println("Numero de pacientes: " + numPacientes);
		  System.out.println("-----Trabajador Medico-------");
		  System.out.println("                                                                             ");
	 }


}
