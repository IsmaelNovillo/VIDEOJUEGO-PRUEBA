public class Impresion {
    public static void main(String[] args) {
        // generacion de las cinco instancias o objetos mediante la estructura clase objeto = new clase ();
        videojuegos good_of_war = new videojuegos(2010,"Good of War", "fisico", 20, "guerra-historia");
        videojuegos marioKart = new videojuegos(2012,"Mario Kart", "digital", 15, "carreras");
        videojuegos Street = new videojuegos(2008,"Street of Figthers", "fisico", 10, "peleas");
        videojuegos orizon = new videojuegos(2020,"Orizon Game", "digital", 22, "historia");
        videojuegos Awesome = new videojuegos(2023,"Awesome Spiderman", "fisico", 20, "accion-historia");
        //uso de un setter para categoria en el juego orizon
        System.out.println("Uso de un set");// enunciado
        orizon.setCategoria("peleas");// se coloca elnuevo valor de la varialble categoria
        System.out.println(orizon.categoria);// se manda a imprimir el nuevo valor seleccionado

        System.out.println("Uso de un get");//enunciado para get
        System.out.println("Mario Kart es un juego de tipo "+marioKart.getCategoria());// se llama al metodo get categoria para mario

        // Mostrar los valores de cada instancia
        good_of_war.mostrar();
        marioKart.mostrar();
        Street.mostrar();
        orizon.mostrar();
        Awesome.mostrar();






    }
}
