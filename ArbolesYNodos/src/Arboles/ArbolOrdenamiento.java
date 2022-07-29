package Arboles;

public class ArbolOrdenamiento<T extends Comparable<T>> {

    private NodoOrdenamiento<T> raiz;

    public NodoOrdenamiento<T> getRaiz() {
        return this.raiz;
    }
    
    public boolean isVacio() {
        return this.raiz == null;
    }


    public boolean isRaiz(NodoOrdenamiento<T> nodo) {
        return this.raiz == nodo;
    }

    public boolean isHoja(NodoOrdenamiento<T> nodo) {
        return (nodo.getNodoIzq() == null && nodo.getNodoDer() == null);
    }

    public boolean isInterno(NodoOrdenamiento<T> nodo) {
        return !isHoja(nodo);
    }
    
    public void imprimir(){
        
        System.out.print("(");
        if(this.raiz != null){
            raiz.imprimir();
        }
        System.out.print(")");
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
                    padre.setNodoIzq(nodo);
                }

            } else {

                if (padre.getNodoDer() != null) {
                    nodo = insertarNodoRecursivo(padre.getNodoDer(), valor);
                } else {
                    nodo = new NodoOrdenamiento<>(valor);
                    nodo.setPadre(padre);
                    padre.setNodoDer(nodo);
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
                        aux.setNodoIzq(nodo);
                        insertado = true;

                    }

                } else {

                    if (aux.getNodoDer() != null) {
                        aux = aux.getNodoDer();
                    } else {
                        nodo = new NodoOrdenamiento<>(valor);
                        nodo.setPadre(aux);
                        aux.setNodoDer(nodo);
                        insertado = true;

                    }

                }

            }

        }

        return nodo;

    }

    public void preOrden(NodoOrdenamiento<T> nodo) {

        System.out.print(nodo.getValor().toString()+ " ");

        if (nodo.getNodoIzq() != null) {
            preOrden(nodo.getNodoIzq());
        }

        if (nodo.getNodoDer() != null) {
            preOrden(nodo.getNodoDer());
        }

    }

    public void inOrden(NodoOrdenamiento<T> nodo) {

        if (nodo.getNodoIzq() != null) {
            inOrden(nodo.getNodoIzq());
        }

        System.out.print(nodo.getValor().toString()+ " ");

        if (nodo.getNodoDer() != null) {
            inOrden(nodo.getNodoDer());
        }

    }
    
    public void inOrdenInverso(NodoOrdenamiento<T> nodo) {

        if (nodo.getNodoDer() != null) {
            inOrdenInverso(nodo.getNodoDer());
        }

        System.out.print(nodo.getValor().toString()+ " ");
        
        if (nodo.getNodoIzq() != null) {
            inOrdenInverso(nodo.getNodoIzq());
        }
        
    }
    
    public void postOrden(NodoOrdenamiento<T> nodo) {

        if (nodo.getNodoIzq() != null) {
            postOrden(nodo.getNodoIzq());
        }

        if (nodo.getNodoDer() != null) {
            postOrden(nodo.getNodoDer());
        }

        System.out.print(nodo.getValor().toString()+ " ");

    }
    
    public int altura(NodoOrdenamiento<T> nodo){
        
        int altura = 0;
        
        if(isInterno(nodo)){
            
            if(nodo.getNodoIzq() != null){
                altura = Math.max(altura, altura(nodo.getNodoIzq()));
            }
            
            if(nodo.getNodoDer() != null){
                altura = Math.max(altura, altura(nodo.getNodoDer()));
            }
            
            altura++;
        }
        
        return altura;
    }
    
    public int profundidad(NodoOrdenamiento<T> nodo){
        int profundidad = 0;
        
        if(nodo != getRaiz()){
            profundidad = 1 + profundidad(nodo.getPadre());
        }
        
        return profundidad;
        
    }
    
    private final int SOLO_NODO_IZQ  = 1;
    private final int SOLO_NODO_DER = 2;
    private final int DOS_NODOS = 3;
    
    public void eliminar(NodoOrdenamiento<T> nodo){
        if (this.raiz == null) {
            System.out.println("No existe nodo que borrar");
        }else if (isHoja(nodo)) {
            
        }else if (nodo.getNodoDer() != null && nodo.getNodoIzq() == null) {
            
        }else if (nodo.getNodoDer() == null && nodo.getNodoIzq() != null){
            
        }else{
            
        }
    }
    
    private void eliminarHoja(NodoOrdenamiento<T> nodo){
        
        NodoOrdenamiento<T> padre = null;
        
        if(isRaiz(nodo)){
            this.raiz = null;
        }else{
            padre = nodo.getPadre();
            
            if (padre.getNodoIzq() == nodo) {
                padre.setNodoIzq(null);
            }
            
            if (padre.getNodoDer() == nodo) {
                padre.setNodoDer(null);
            }
            
            nodo = null;
        }
    }
    
    private void eliminarConHijo(NodoOrdenamiento<T> nodo, int tipoNodo){
        
        NodoOrdenamiento<T> nodoSucesivo;
        
        switch(tipoNodo){
            case SOLO_NODO_IZQ:
                nodoSucesivo = nodo.getNodoIzq();
                break;
            case SOLO_NODO_DER:
                nodoSucesivo = minSubArbol(nodo.getNodoDer());
                break;
            case DOS_NODOS:
                nodoSucesivo = minSubArbol(nodo.getNodoDer());
                
                if(!isRaiz(nodoSucesivo.getPadre())){
                    
                    
                    nodo.getNodoIzq().setPadre(nodoSucesivo);
                    nodo.getNodoDer().setPadre(nodoSucesivo);
                    
                    if(nodoSucesivo.getPadre().getNodoIzq() == nodoSucesivo){
                        
                        nodoSucesivo.getPadre().setNodoIzq(null);
                        
                    }else if(nodoSucesivo.getPadre().getNodoDer() == nodoSucesivo){
                        
                        nodoSucesivo.getPadre().setNodoDer(null);
                        
                    }
                    
                }
                break;
        }
        
        
        
    }
    
    private NodoOrdenamiento<T> minSubArbol(NodoOrdenamiento<T> nodo){
        
        if(nodo != null && nodo.getNodoIzq() != null){
            
            while(!isHoja(nodo)){
                nodo = minSubArbol(nodo.getNodoIzq());
            }
            
        }
        
        return nodo;
    }
    
}
