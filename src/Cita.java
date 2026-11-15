
public class Cita {
    String alumno;
    String tipoClase;
    String dia;
    String hora;

    // Constructor para guardar los datos
    public Cita(String alumno, String tipoClase, String dia, String hora) {
        this.alumno = alumno;
        this.tipoClase = tipoClase;
        this.dia = dia;
        this.hora = hora;
    }

    // Metodo para mostrar los datos
    public void mostrarCita() {
        System.out.println("Alumno: " + alumno);
        System.out.println("Clase: " + tipoClase);
        System.out.println("Dia: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("-------------------");
    }

    // Metodo para cambiar la hora
    public void cambiarHora(String nuevaHora) {
        hora = nuevaHora;
    }
}

