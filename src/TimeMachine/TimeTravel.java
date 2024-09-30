package TimeMachine;

public class TimeTravel {

    // Método principal
    public static void main(String[] args) {
        // Creamos un objeto de la clase MáquinaDelTiempo
        MaquinaDelTiempo maquina = new MaquinaDelTiempo();

        try {
            // Intentamos viajar a un año válido
            maquina.viajarAlAño(1930);
            // Intentamos viajar a un año inválido
            maquina.viajarAlAño(2700);
        } catch (TiempoInvalidoException e) {
            // Capturamos y mostramos el mensaje de la excepción
            System.out.println(e.getMessage());
        }
    }
}