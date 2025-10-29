package Classes;

/**
 * SquirtleNadador.java (Ejercicio de Interfaz - "USA HABILIDAD")
 *
 * MISIÓN: Hacer que Squirtle "USE HABILIDAD" (Runnable).
 * Él no es un Hilo... él es una "Habilidad" que un Hilo puede ejecutar.
 *
 * Ventaja: ¡Squirtle es flexible! Aún podría heredar de "Pokemon"
 * (ej: class SquirtleNadador extends Pokemon implements Runnable)
 */

// TODO 1: Haz que esta clase IMPLEMENTE la interfaz Runnable.
// (Pista: usa la palabra clave "extends")
public class SquirtleNadador implements Runnable {

    private String nombre;

    public SquirtleNadador(String nombre) {
        this.nombre = nombre;
    }

    // TODO 2: ¡Define la tarea de la Interfaz!
    // Como "firmaste el contrato" Runnable, Java te OBLIGA
    // a escribir el método run().

    // Escribe el método run() aquí...
    @Override
    public void run() {
        System.out.println( this.nombre + " empieza a surfear! (Método: extends Thread)");
        
        try {
            // Simulamos que la carrera toma 1 segundo
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("¡Squirtle se ha caido!");
        }
        
        System.out.println(this.nombre + " terminó la ola!");
    }
}