package PARCIAL0;

public class Lista<E> implements ILista<E> {

    private INodo<E> primero;

    public Lista() {
        primero = null;
    }

    public Lista(INodo<E> unNodo) {
        this.primero = unNodo;
    }

    public void insertar(INodo<E> unNodo) {
        if (esVacia()) {
            primero = unNodo;
        } else {
            INodo<E> aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(unNodo);
        }
    }

    public INodo<E> buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            INodo<E> aux = primero;
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        INodo<E> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            //Eliminamos el primer elemento
            INodo<E> temp1 = aux;
            INodo<E> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                INodo<E> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            INodo<E> temp = primero;
            while (temp != null) {
                temp.imprimirEtiqueta();
                aux += temp.getEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    public String imprimir(String separador) {
        String aux = "";
        if (esVacia()) {
            return "";
        } else {
            INodo<E> temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            INodo aux = primero;
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    public INodo<E> getPrimero() {
        return primero;
    }

    @Override
    public void Ordenar() {
        // Para la lista auxiliar ordenada
        Lista<E> auxiliar = new Lista();
        INodo<E> recorre;
        INodo<E> aux;
        recorre = primero.getSiguiente();
        System.out.println("Etiqueta de el que recorre " + recorre.getEtiqueta());
        // Para el Primer caso 
        auxiliar.insertar(quitarPrimero());
        System.out.println("Etiqueta del auxiliar primero" + auxiliar.getPrimero().getEtiqueta());
        System.out.println("Etiqueta de el que recorre " + recorre.getEtiqueta());

        while (recorre != null) {
            // System.out.println("PARCIAL0.Lista.Ordenar() ANTES");
            System.out.println("Etiqueta de el que recorre " + recorre.getEtiqueta());

          recorre = recorre.getSiguiente();
            
            auxiliar.insertarOrdenado(quitarPrimero()); 
            
            System.out.println("Etiqueta de el que recorre " + recorre.getEtiqueta());

            System.out.println("PARCIAL0.Lista.Ordenar(RECORE ANTES)" + recorre.getEtiqueta());
            
            System.out.println("PARCIAL0.Lista.Ordenar(RECORRE DESPUES)" + recorre.getEtiqueta());

               // quitarPrimero();
        }

        primero = auxiliar.primero;
    }

    public void insertarOrdenado(INodo<E> unNodo) {
        if (esVacia()) {
            primero = unNodo;
        } else {
            INodo<E> aux = primero;
            if (aux.getSiguiente() != null) {
                while (aux.getSiguiente().getEtiqueta().compareTo(unNodo.getEtiqueta()) < 0) {
                    aux = aux.getSiguiente();
                }

                unNodo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(unNodo);

            } else {
                aux.setSiguiente(unNodo);
            }

        }
    }

    @Override
    public INodo<E> quitarPrimero() {
        INodo tempNodo = getPrimero();
        if (tempNodo != null) {
            this.primero = tempNodo.getSiguiente();
            tempNodo.setSiguiente(null);
        }
        return tempNodo;
    }
}
