public class Main {
    public static void main(String[] args) {

        // Creo una cita presencial
        CitaPresencial cita1 = new CitaPresencial(
                "Monica Medina", "Matematicas",
                "Lunes", "10:30", "Salon 2"
        );

        // Creo una cita virtual
        CitaVirtual cita2 = new CitaVirtual(
                "Alfonso Martinez", "Ingles",
                "Martes", "4:00", "Google Meet"
        );

        // Muestro los datos de las citas
        System.out.println("CITA PRESENCIAL");
        cita1.mostrarCita();

        System.out.println("CITA VIRTUAL");
        cita2.mostrarCita();

        // Cambio la hora de la cita virtual
        cita2.cambiarHora("6:00");

        // Cambio la plataforma
        cita2.cambiarPlataforma("Zoom");

        // Muestro la cita con los cambios
        System.out.println("CITA VIRTUAL ACTUALIZADA");
        cita2.mostrarCita();
    }
}
