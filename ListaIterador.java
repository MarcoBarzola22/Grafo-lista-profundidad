import java.util.Iterator;

public class ListaIterador {
    private Iterator<Integer> iterador;

    public ListaIterador(PilaLista lista) {
        iterador = lista.getAdyacentes().iterator();
    }

    public int siguiente() {
        if (iterador.hasNext()) {
            return iterador.next();
        } else {
            return -1; // O cualquier valor que indique que no hay siguiente elemento
        }
    }

    
}