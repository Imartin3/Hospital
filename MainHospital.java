package hospital;

public class MainHospital {
	 public static void main(String[] args) {
		 TrabajadorMedico trabajadorMedico = new TrabajadorMedico("Juan", 1, 1000, 1, 1, TrabajadorMedico.especialidad.CARDIOLOGIA);
		 TrabajadorNoMedico trabajadorNoMedico = new TrabajadorNoMedico("Pedro", 2, 1000, TrabajadorNoMedico.especialidad.RECEPCIONISTA);

		trabajadorMedico.mostrarDatos();
		trabajadorNoMedico.mostrarDatos();
	 }
}
