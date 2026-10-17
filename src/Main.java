public class Main {
    public static void main(String[] args) {

        //creo dos citas (objetos)
        Cita cita1 = new Cita("Monica Medina", "Matematicas", "Lunes", "10:30");
        Cita cita2 = new Cita("Alfonso Martinez", "Inglés", "Martes", "4:00");

        //Muestro los datos de cada cita
        cita1.mostrarCita();
        cita2.mostrarCita();

        //Cambia la hora de la segunda cita y la muestro de nuevo
        cita2.cambiarHora("6:00");
        System.out.println("Cita 2 con la hora nueva:");
        cita2.mostrarCita();
    }
}

// Clase Cita: guardar datos sobre una cita de clase
class Cita {
    String alumno;
    String tipoClase;
    String dia;
    String hora;

    //Constructor: guardar datos al crear la cita
    Cita(String alumno, String tipoClase, String dia, String hora) {
        this.alumno = alumno;
        this.tipoClase = tipoClase;
        this.dia = dia;
        this.hora = hora;
    }

    // Metodo para mostrar datos de la cita
    void mostrarCita() {
        System.out.println("Alumno: " + alumno);
        System.out.println("Clase: " + tipoClase);
        System.out.println("Dia: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("-------------------");
    }

    // Metodo para cambiar la hora de la cita
    void cambiarHora(String nuevaHora) {
        hora = nuevaHora;
    }
}