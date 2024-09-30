package TimeMachine;

// Clase MáquinaDelTiempo
class MaquinaDelTiempo {

    // Método para realizar el viaje al año proporcionado
    public void viajarAlAño(int año) throws TiempoInvalidoException {
        if (año < 1900 || año > 2100) {
            // Si el año está fuera del rango, lanzamos una excepción
            throw new TiempoInvalidoException(año);
        } else {
            // Si el año es válido, mostramos un mensaje confirmando el viaje
            System.out.println("Viajando al year " + año + "... Asegurate de llevar tu Delorean DMC-12!");
        }
    }
}