public class videojuegos {
    int anio; //año de lanzamiento del videojuego
    String nombre; //nombre del videojuego

    String tipo; // si su venta es digital o fisico
    int precio; // precio del videojuego por el tipo
    String categoria; // a que categoria pertenece el video juego (ficcion, accion, carreras etc... )


    // generacion de constructores mediante el empleo de ide
    public videojuegos(int anio, String nombre, String tipo, int precio, String categoria) {
        this.anio = anio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.categoria = categoria;
    }

    // generacion de setter y getters con el empleo del ide
    //setter y getters para anio
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //setter y getters para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //setter y getters para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //setter y getters para precio
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //setter y getters para categoria
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Generacion de un metodo que imprima todos los valores

    public void mostrar (){
        System.out.println("El nombre del videojuego es "+nombre+" fue lanzado en el año "+anio+" y su distribucion se realizado en formato "+tipo+
                " con un valor de "+ precio+" siendo un juego de categoria "+categoria);


    }


}
