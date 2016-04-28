package ut3.ta2;

import java.util.ArrayList;

public class Almacen implements IAlmacen {

	private IProducto primero;
	private int valorActual;
	private int contador;
	@Override
	
	public int agregar(IProducto unProducto) {
		IProducto actual = this.primero;
		int montoAgregado;
		if(actual == null){//SI LA LISTA ESTA VACIA
			this.primero = unProducto;
			montoAgregado = unProducto.getStock() * unProducto.getPrecio();
			return montoAgregado;
		}
		else if(actual.getDescripcion().compareTo(unProducto.getDescripcion())>0){//SI EL ELEMENTO A INSERTAR ES MENOS QUE TODOS
			unProducto.setSiguiente(actual);
			this.primero = unProducto;
			montoAgregado = unProducto.getStock() * unProducto.getPrecio();
			return montoAgregado;
		}
		else if(actual.getDescripcion().compareTo(unProducto.getDescripcion())==0){//SI EL ELEMENTO A INSERTAR ES IGUAL AL PRIMERO
			actual.setStock(unProducto.getStock()+actual.getStock());
			montoAgregado = unProducto.getStock() * unProducto.getPrecio();
			return montoAgregado;
		}
		else{
			while(actual.getSiguiente()!= null){//RESTO DE LOS CASOS
				if(actual.getSiguiente().getDescripcion().compareTo(unProducto.getDescripcion())>0){
					unProducto.setSiguiente(actual.getSiguiente());
					actual.setSiguiente(unProducto);
					montoAgregado = unProducto.getStock() * unProducto.getPrecio();
					return montoAgregado;
				}
				else if(actual.getSiguiente().getDescripcion().compareTo(unProducto.getDescripcion())==0){
					actual.getSiguiente().setStock(unProducto.getStock()+actual.getSiguiente().getStock());
					montoAgregado = unProducto.getStock() * unProducto.getPrecio();
					return montoAgregado;
				}
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(unProducto);
			montoAgregado = unProducto.getStock() * unProducto.getPrecio();
			return montoAgregado;
		}
	}
	
	public String agregarUT4(IProducto unProducto) {
		int movimientos=0;
		int comparaciones=0;
		IProducto actual = this.primero;
		if(actual == null){//SI LA LISTA ESTA VACIA
			this.primero = unProducto;
			return "Producto agregado: "+unProducto.getDescripcion()+". Comparaciones: "+comparaciones+". Movimientos: 0 ";
		}
		else if(actual.getDescripcion().compareTo(unProducto.getDescripcion())>0){//SI EL ELEMENTO A INSERTAR ES MENOS QUE TODOS
			comparaciones=1; //COMPARACION
			unProducto.setSiguiente(actual);
			this.primero = unProducto;
			return "Producto agregado: "+unProducto.getDescripcion()+". Comparaciones: "+comparaciones+". Movimientos:  1";
		}
		else if(actual.getDescripcion().compareTo(unProducto.getDescripcion())==0){//SI EL ELEMENTO A INSERTAR ES IGUAL AL PRIMERO
			comparaciones=2; //COMPARACION
			actual.setStock(unProducto.getStock()+actual.getStock());
			return "Producto agregado: "+unProducto.getDescripcion()+". Comparaciones: "+comparaciones+". Movimientos: 0 ";
		}
		else{
			comparaciones = 2; //Para no perder la cantidad de comparaciones que se hicieron al principio
			                   //La verificacion para ver si esta vacia no se toma como comparacion
			while(actual.getSiguiente()!= null){//La comparacion en el while no se tiene en cuenta
				if(actual.getSiguiente().getDescripcion().compareTo(unProducto.getDescripcion())>0){
					comparaciones++; //COMPARACION
					movimientos++; //MOVIMIENTO
					unProducto.setSiguiente(actual.getSiguiente());
					actual.setSiguiente(unProducto);
					return "Producto agregado: "+unProducto.getDescripcion()+". Comparaciones: "+comparaciones+". Movimientos: 1";
				}
				else if(actual.getSiguiente().getDescripcion().compareTo(unProducto.getDescripcion())==0){
					comparaciones+=2; //Se le suma 2 para contabilizar el if anterior y este elseif
					actual.getSiguiente().setStock(unProducto.getStock()+actual.getSiguiente().getStock());
					return "Producto agregado: "+unProducto.getDescripcion()+". Comparaciones: "+comparaciones+". Movimientos: 0";
				}
				comparaciones+=2; //Para no perder las comparaciones que se hicieron en un ciclo while
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(unProducto);
			return "Producto agregado: "+unProducto.getDescripcion()+". Comparaciones: "+comparaciones+". Movimientos: 0";
		}
	}
	
	@Override
	public IProducto buscarPorCodigo(int unCodigo) {
		// TODO Auto-generated method stub
		IProducto actual = primero;
		while(actual!=null){
			if(primero.getCodigo() == unCodigo){
				return actual;
			}
			actual = actual.getSiguiente();
		}
		return null;
	}

	@Override
	public IProducto buscarPorDescripcion(String unaDescripcion) {
		// TODO Auto-generated method stub
		IProducto actual = primero;
		while(actual!=null){
			if(primero.getDescripcion() == unaDescripcion){
				return actual;
			}
			actual = actual.getSiguiente();
		}
		return null;
	}
	

	@Override
	public IProducto eliminar(int unCodigo) {
		IProducto actual = this.primero;
		if(actual == null)
			return null;
		if(actual.getCodigo()==unCodigo){
			this.primero = actual.getSiguiente();
			return actual;
		}
		else{
			while(actual.getSiguiente() != null){
				if(actual.getSiguiente().getCodigo()==unCodigo){
					actual.setSiguiente(actual.getSiguiente().getSiguiente());
					return actual.getSiguiente();
				}
				actual = actual.getSiguiente();
			}
			return null;
		}
	}
		
	

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		IProducto actual = this.primero;
		while(actual != null){
			System.out.println(actual.getDescripcion());
			actual=actual.getSiguiente();
		}
	}
	
	public int ventaProducto(IProducto producto, int cantidad) {
		int monto = 0;
		Producto elproducto=(Producto)producto;
		elproducto.setStock(elproducto.getStock() - cantidad);
		if (elproducto.getStock() < 0) {
			monto = (cantidad - elproducto.getStock()) * elproducto.getPrecio();
			elproducto.setStock(0);
			return monto;
		}
		return cantidad * elproducto.getPrecio();
	}

	public int reducirStock(String ventas) {
		
		String[] venta = ManejadorArchivosGenerico.leerArchivo(ventas);
		int vendido=0;
		for (int i = 0; i < venta.length; i++) {
			String[] lista = venta[i].split(",");
			int codigo = Integer.valueOf(lista[0]);
			int cantidad = Integer.valueOf(lista[1]);
			IProducto producto = buscarPorCodigo(codigo);
			if (producto != null) {
				vendido = vendido + ventaProducto(producto, cantidad);
			}
		}
		return vendido;
	}


	@Override
	public ArrayList<String> imprimir(String separador) {
		ArrayList<String> info = new ArrayList<String>();
		// TODO Auto-generated method stub
				IProducto actual = this.primero;
				while(actual != null){
					info.add(actual.imprimir(separador));
					actual=actual.getSiguiente();
	
				}
			return info;	
		
	}

	@Override
	public int cantElementos() {
		int cantidadElementos = 0;
		for(IProducto p = primero; p != null;p=p.getSiguiente())
			cantidadElementos++;
		return cantidadElementos;
	}

	@Override
	public boolean esVacia() {
		if(primero == null)
			return true;
		else
			return false;
	}

	@Override
	public IProducto getPrimero() {
		return primero;
	}

	public void Comprar(){
		
		String[] compras = ManejadorArchivosGenerico.leerArchivo("altasPrueba.txt");
		for (int i = 0; i < compras.length; i++){
			String[] lista = compras[i].split(",");
			int codigo = Integer.valueOf(lista[0]);
			int precio = Integer.valueOf(lista[2]);
			int stock = Integer.valueOf(lista[3]);
			Producto nuevo = new Producto(codigo,stock,precio,lista[1]);
			this.agregar(nuevo);	
		}
	}
	
	public void ComprarUT4(){
		try{
			String[] compras = ManejadorArchivosGenerico.leerArchivo("altas.txt");
			for (int i = 0; i < compras.length; i++){
				String[] lista = compras[i].split(",");
				int codigo = Integer.valueOf(lista[0]);
				int precio = Integer.valueOf(lista[2]);
				int stock = Integer.valueOf(lista[3]);
				Producto nuevo = new Producto(codigo,stock,precio,lista[1]);
				System.out.println(this.agregarUT4(nuevo));	
			}
		}catch(Exception ex){
			System.out.println(ex.toString());
		}
	}
	
	public void imprimirInvertido(IProducto producto){
		if(producto != null){
			imprimirInvertido(producto.getSiguiente());
			System.out.println(producto.getDescripcion());
		}
}

public IProducto eliminar(String descripcion){
    if(primero==null)
            return null;
    IProducto actual = primero;
    if(primero.getDescripcion().equals(descripcion)){
           
            primero = primero.getSiguiente();
            System.out.println("Caso1");
            return actual;
    }
    
    while(actual.getSiguiente().getSiguiente()!=null && !actual.getSiguiente().getDescripcion().equals(descripcion)){
            actual=actual.getSiguiente();
            System.out.println("Recorre");
    }
    if(actual.getSiguiente().getDescripcion().equals(descripcion))
    {
    	 IProducto aux = actual.getSiguiente();
    	    actual.setSiguiente(aux.getSiguiente());
    	    System.out.println("Caso 3");
    	    return aux;
    }
    
    if(actual.getSiguiente().getSiguiente() == null && actual.getDescripcion().equals(descripcion))
    {       
    IProducto aux = actual.getSiguiente();
    actual.setSiguiente(aux.getSiguiente());
    System.out.println("Caso 4");
    return aux;
    }
    System.out.println("No lo elimino");
    return null;
	}
public void insertarAlFinal(IProducto nuevo){
	
	if(this.primero==null)
	{
		this.primero=nuevo;
	}
	
	IProducto actual = this.primero;

	//this.primero=actual.getSiguiente();
	while(actual.getSiguiente()!=null){
		actual = actual.getSiguiente();
	}
	
	
	actual.setSiguiente(nuevo);
	nuevo.setSiguiente(null);
	
	}
public void invertirLista(IProducto producto){
	//System.out.println(producto.getDescripcion());
	if(!this.esVacia()){
        IProducto actual = producto;		
		eliminar(producto.getDescripcion());
		if(producto.getSiguiente()!=null)
		{
		invertirLista(producto.getSiguiente());
		}
         
		insertarAlFinal(actual);
	
	}


}

}
