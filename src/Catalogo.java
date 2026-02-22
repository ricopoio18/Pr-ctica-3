import java.util.ArrayList;


public class Catalogo {

    // ArrayList donde se guardan las películas
    ArrayList<Pelicula> peliculas;

    // Constructor vacío
    // Crea el catálogo e inicializa el ArrayList
    // Además agrega una película por defecto
    public Catalogo() {
        peliculas = new ArrayList<>();
        Pelicula pelicula = new Pelicula();
        peliculas.add(pelicula);
    }

    // Constructor que recibe una película
    // Crea el catálogo e inicializa el ArrayList
    // Agrega la película que se recibe como parámetro
    public Catalogo(Pelicula pelicula) {
        peliculas = new ArrayList<>();
        peliculas.add(pelicula);
    }

    // Método para agregar una nueva película al catálogo
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    // Método que regresa la lista completa de películas
    public ArrayList getPeliculas(){
        return peliculas;
    }

    // Método para buscar una película por su título
    public void buscarPeliculaPorTitulo(String titulo){
        for(Pelicula p: peliculas){
            if (titulo == p.getTitulo()){
                p.getInformacion();
            }
        }
    }

    // Devuelve todas las películas en formato String
    public String toString(){
        return peliculas.toString();
    }
}
