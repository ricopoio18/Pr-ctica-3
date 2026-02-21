//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Pelicula pelicula1;
        Pelicula pelicula2;
        Pelicula pelicula3;
        Catalogo catalogo;

        System.out.println("Punto A: \n");
        pelicula1 = new Pelicula("Jaws", "Steven Spielberg", 1975, "Supervivencia", 129);
        pelicula1.getInformacion();
        if (pelicula1.esClasica(2026)) System.out.println("\nEs clásica");

        pelicula2 = new Pelicula("Mr. Fantastic Fox", "Wes Anderson", 2009, "Animacion, comedia" , 87 );
        pelicula3 = new Pelicula();

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