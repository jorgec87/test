
package test.entrevista;

/**
 * Pasos:
 * 1. Crea los metodos habla y duerme en la interface AccionesAnimales.
 * 2. Implementa los metodos de la interface para las clases Perro y Gato.
 * 3. Extiende a las clases Gato y Perro de la clase Animal.
 * 4. Ejecuta el main sin errores.
 *
 * Condiciones
 * - No modifique el main.
 * - No modifique la clase Animal
 * 
 * @author **Jorge Carrenca**
 */
public class Q11 {

    public static void main(String[] args) {

        /* Descomente para probar
        Gato gato = new Gato();
        Perro perro = new Perro();
        System.out.println("El gato dice " + gato.Habla());
        System.out.println("El perro dice " + perro.Habla());
        if (!gato.isDormido()) {
            gato.Duerme();
            System.out.println("El gato esta dormido? " + (gato.isDormido() ? "Si" : "No"));
        }
        */

    }

    public interface AccionesAnimales {

    }

    static class Animal {

        boolean isDormido = false;

        boolean isDormido() {
            return isDormido;
        }

    }

    private static class Gato {

    }

    private static class Perro {

    }

}
