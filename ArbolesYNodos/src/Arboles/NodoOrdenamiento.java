package Arboles;

public class NodoOrdenamiento<T extends Comparable<T>>{

    private T valor;
    private NodoOrdenamiento<T> padre, nodoIzq, nodoDer;

    public NodoOrdenamiento(T valor) {
        this.valor = valor;
    }

    public NodoOrdenamiento(T valor, NodoOrdenamiento<T> padre) {
        this.valor = valor;
        this.padre = padre;
    }

    public T getValor() {
        return valor;
    }

    public NodoOrdenamiento<T> getPadre() {
        return padre;
    }

    public NodoOrdenamiento<T> getNodoIzq() {
        return nodoIzq;
    }

    public NodoOrdenamiento<T> getNodoDer() {
        return nodoDer;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public void setPadre(NodoOrdenamiento<T> padre) {
        this.padre = padre;
    }

    public void setNodoIzq(NodoOrdenamiento<T> nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public void setNodoDer(NodoOrdenamiento<T> nodoDer) {
        this.nodoDer = nodoDer;
    }

}
