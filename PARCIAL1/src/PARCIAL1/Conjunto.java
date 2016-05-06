package PARCIAL1;

public class Conjunto<E> extends Lista<E> implements IConjunto<E> {
    

    @Override
    public IConjunto complemento(IConjunto conjuntoUniversal) {
        INodo<E> aux = getPrimero();            
        IConjunto conjuntoComplemento = conjuntoUniversal;
        INodo<E> auxUniversal = conjuntoComplemento.getPrimero();   // Inicialmente es toda la lista

        while (auxUniversal != null) {
            while (aux != null) {
                if (auxUniversal.getEtiqueta() == aux.getEtiqueta()) {
                    conjuntoComplemento.eliminar(auxUniversal.getEtiqueta());
                }
                aux = aux.getSiguiente();
            }
            auxUniversal = auxUniversal.getSiguiente();
        }
        return conjuntoComplemento;

    }

    @Override   // aseguramos que no se inserten duplicados
    public void insertar(INodo<E> nodo) {
        if (buscar(nodo.getEtiqueta()) == null) {
            super.insertar(nodo);
        }

    }

}
