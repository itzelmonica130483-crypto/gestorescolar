// Clase hija que hereda de Cita
public class CitaVirtual extends Cita {

    String plataforma;

    // Constructor
    public CitaVirtual(String alumno, String tipoClase,
                       String dia, String hora, String plataforma) {

        super(alumno, tipoClase, dia, hora);
        this.plataforma = plataforma;
    }

    // Metodo para mostrar los datos de la cita
    @Override
    public void mostrarCita() {
        super.mostrarCita();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("-------------------");
    }

    // Metodo para cambiar la plataforma
    public void cambiarPlataforma(String nuevaPlataforma) {
        plataforma = nuevaPlataforma;
    }
}

