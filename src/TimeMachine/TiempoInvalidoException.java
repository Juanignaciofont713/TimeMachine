package TimeMachine;

// Clase personalizada de excepción para manejar años inválidos
class TiempoInvalidoException extends Exception {

    // Constructor que recibe el año inválido e imprime un mensaje divertido
    public TiempoInvalidoException(int año) {
        super("Cuidado! Intentar viajar al year " + año + " es demasiado arriesgado. " +
              "Podrias quedar atrapado en una era de dinosaurios o en una distopia futurista!");
    }
}