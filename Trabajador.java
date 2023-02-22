package hospital;

public class Trabajador {
	 protected String nombre;
	 protected int id;
	 protected float sueldo;

	 public Trabajador(String nombre, int id, float sueldo) {
		 this.nombre = nombre;
		 this.id = id;
		 this.sueldo = sueldo;
	 }

	 //Getters
	 public String getNombre() {
		 return nombre;
	 }

	 public int getId() {
		 return id;
	 }

	 public float getSueldo() {
		 return sueldo;
	 }

	 //Setters

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public void setId(int id) {
		 this.id = id;
	 }

	 public void setSueldo(float sueldo) {
		 this.sueldo = sueldo;
	 }

	 public void mostrarDatos() {
		 System.out.println("Nombre: " + nombre);
		 System.out.println("ID: " + id);
		 System.out.println("Sueldo: " + sueldo);
	 }
}
