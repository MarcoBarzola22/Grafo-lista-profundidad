import java.util.LinkedList;

public class PilaLista {
    private LinkedList<Integer> pila;

    public PilaLista() {
        pila = new LinkedList<>();
    }

    public boolean pilaVacia() {
        return pila.isEmpty();
    }

    public void insertar(int elemento) {
        pila.push(elemento);
    }

    public int quitar() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        return pila.pop();
    }

    public int cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        return pila.peek();
    }

    public void limpiarPila() {
        pila.clear();
    }

    public LinkedList<Integer> getAdyacentes() {
        return pila;
    }
}