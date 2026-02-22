
public class Main {

    public static void main(String[] args) {
        Pelicula pelicula1;
        Pelicula pelicula2;
        Pelicula pelicula3;
        Catalogo catalogo;

        /*
        * A.- Crear la clase Película:
        *       -Definir los atributos y el constructor
        *       -Implementar los métodos getInformacion() y esClasica()
        **/
        System.out.println("Punto A: \n");
        pelicula1 = new Pelicula("Jaws", "Steven Spielberg", 1975, "Supervivencia", 129);
        pelicula1.getInformacion();
        if (pelicula1.esClasica(2026)) System.out.println("\nEs clásica");

        /*
        * B.- Crear la clase Catalogo:
        *       -Definir el atributo y el constructor
        *       -Implementar los métodos agregarPelicula(), getPeliculas() y buscarPeliculaPorTitulo()
         */
        pelicula2 = new Pelicula("Mr. Fantastic Fox", "Wes Anderson", 2009, "Animacion, comedia" , 87 );
        pelicula3 = new Pelicula("El Resplandor", "Stanley Kubrick", 1980,"Terror",146);

        System.out.println("\nPunto B: \n");
        catalogo = new Catalogo();
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);
        System.out.println(catalogo.getPeliculas());
        catalogo.buscarPeliculaPorTitulo("Jaws");

        System.out.println("\nPunto C: \n");
        catalogo.agregarPelicula(pelicula3);

        System.out.println(catalogo.getPeliculas());


    }
}