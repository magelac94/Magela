package proyectov1;



public interface IPelicula{

    /**
     * Retorna el codigo del Producto.
     *
     * @return codigo del Producto.
     */
    public Comparable getId();

    /**
     * Retorna el precio unitario del Producto.
     *
     * @return precio del Producto.
     */
    public String getFecha();

    public void setRanking(String ranking);
    public String getRanking();

    /**
     * Retorna el stock del Producto.
     *
     * @return stock del Producto.
     */
    public String getDescripcion();

    public void setDescripcion(String descripcion);

    /**
     * Retorna la descripcion/nombre del Producto.
     *
     * @return descripci�n del Producto.
     */
    public String getNombre();

    public void setNombre(String nombre);

}
