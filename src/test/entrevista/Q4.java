
package test.entrevista;

/**
 * Cree un metodo que reciba un caracter y una cadena de String, debe retornar
 * la cantidad de veces que esta el caracter en la frase. 
 * Condicion:contemplar mayuscula y minusculas
 * utilizar charAt Ejemplo: Buscar letra e : encontrado 11 veces
 *
 * @author **Jorge Carrenca**
 */
public class Q4 {

    public static void main(String[] args) {
        String frase = "Primero resuelve el problema. Entonces, escribe el codigo";
        int match = foundChar("e", frase);
        System.out.println("Repetido:" + match);
    }

    private static int foundChar(String c, String str) {
        return 0;
    }

}
