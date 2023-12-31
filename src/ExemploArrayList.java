import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são.
 *
 */
public class ExemploArrayList {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("Pedro Carlos");
        lista.add("Mateus Pinto");
        lista.add("Ana Banana");
        lista.add("Sabrina Sato");
        lista.add("Guto Pimenta");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("Pedro Carlos");
        lista.add("Mateus Pinto");
        lista.add("Ana Banana");
        lista.add("Sabrina Sato");
        lista.add("Guto Pimenta");
        Collections.sort(lista);  // para uma lista em java ordenar em java utilizar Collections.sort(lista); //
        System.out.println(lista);
        System.out.println("");
    }
}