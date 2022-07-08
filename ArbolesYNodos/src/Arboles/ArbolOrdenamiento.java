package Arboles;

public class ArbolOrdenamiento<T extends Comparable<T>> {

    private NodoOrdenamiento<T> raiz;

    public boolean isVacio() {
        return this.raiz == null;
    }

    public NodoOrdenamiento<T> getRaíz() {
        return this.raiz;
    }

    public boolean isRoot(NodoOrdenamiento<T> nodo) {
        return this.raiz == nodo;
    }

    public boolean isHoja(NodoOrdenamiento<T> nodo) {
        return (nodo.getNodoIzq() == null && nodo.getNodoDer() == null);
    }

    public boolean isInterno(NodoOrdenamiento<T> nodo) {
        return !isHoja(nodo);
    }

    public NodoOrdenamiento<T> insertarNodoRecursivo(NodoOrdenamiento<T> padre, T valor) {

        NodoOrdenamiento<T> nodo = null;

        if (this.raiz == null) {
            this.raiz = new NodoOrdenamiento<>(valor);
        } else if (padre == null) {
            System.out.println("El origen es nulo");
        } else {

            if (padre.getValor().compareTo(valor) > 0) {

                if (padre.getNodoIzq() != null) {
                    nodo = insertarNodoRecursivo(padre.getNodoIzq(), valor);
                } else {
                    nodo = new NodoOrdenamiento<>(valor);
                    nodo.setPadre(padre);
                    nodo.setNodoIzq(nodo);
                }

            } else {

                if (padre.getNodoDer() != null) {
                    nodo = insertarNodoRecursivo(padre.getNodoDer(), valor);
                } else {
                    nodo = new NodoOrdenamiento<>(valor);
                    nodo.setPadre(padre);
                    nodo.setNodoDer(nodo);
                }

            }

        }

        return nodo;

    }

    public NodoOrdenamiento<T> insertarNodoIterativo(T valor) {

        NodoOrdenamiento<T> nodo = null;

        if (this.raiz == null) {
            this.raiz = new NodoOrdenamiento<>(valor);
        } else if (this.raiz == null) {
            System.out.println("El origen es nulo");
        } else {

            NodoOrdenamiento<T> aux = this.raiz;
            boolean insertado = false;

            while (!insertado) {

                if (aux.getValor().compareTo(valor) > 0) {

                    if (aux.getNodoIzq() != null) {
                        aux = aux.getNodoIzq();
                    } else {
                        nodo = new NodoOrdenamiento<>(valor);
                        nodo.setPadre(aux);
                        nodo.setNodoIzq(nodo);
                        insertado = true;

                    }

                } else {

                    if (aux.getNodoDer() != null) {
                        aux = aux.getNodoDer();
                    } else {
                        nodo = new NodoOrdenamiento<>(valor);
                        nodo.setPadre(aux);
                        nodo.setNodoDer(nodo);
                        insertado = true;

                    }

                }

            }

        }

        return nodo;

    }

    public void preOrden(NodoOrdenamiento<T> nodo) {

        System.out.println(nodo.getValor().toString());

        if (nodo.getNodoIzq() != null) {
            preOrden(nodo.getNodoIzq());
        }

        if (nodo.getNodoDer() != null) {
            preOrden(nodo.getNodoDer());
        }

    }

    public void inOrden(NodoOrdenamiento<T> nodo) {

        if (nodo.getNodoIzq() != null) {
            preOrden(nodo.getNodoIzq());
        }

        System.out.println(nodo.getValor().toString());

        if (nodo.getNodoDer() != null) {
            preOrden(nodo.getNodoDer());
        }

    }

    public void postOrden(NodoOrdenamiento<T> nodo) {

        if (nodo.getNodoIzq() != null) {
            preOrden(nodo.getNodoIzq());
        }

        if (nodo.getNodoDer() != null) {
            preOrden(nodo.getNodoDer());
        }

        System.out.println(nodo.getValor().toString());

    }

}
