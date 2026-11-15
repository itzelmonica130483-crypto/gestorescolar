// Clase hija que hereda de Cita
public class CitaPresencial extends Cita {

    String salon;

    // Constructor
    public CitaPresencial(String alumno, String tipoClase,
                          String dia, String hora, String salon) {

        super(alumno, tipoClase, dia, hora);
        this.salon = salon;
    }

    // Metodo para mostrar los datos de la cita
    @Override
    public void mostrarCita() {
        super.mostrarCita();
        System.out.println("Salon: " + salon);
        System.out.println("-------------------");
    }

    // Metodo para cambiar el salon
    public void cambiarSalon(String nuevoSalon) {
        salon = nuevoSalon;
    }
}
