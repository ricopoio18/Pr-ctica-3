
import java.util.ArrayList;

public class Catalogo {
    ArrayList<Pelicula> peliculas;

    public Catalogo() {
        peliculas = new ArrayList<>();
        Pelicula pelicula = new Pelicula();
        peliculas.add(pelicula);
    }

    public Catalogo(Pelicula pelicula) {
        peliculas = new ArrayList<>();
        peliculas.add(pelicula);
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public ArrayList getPeliculas(){
        return peliculas;
    }

    public void buscarPeliculaPorTitulo(String titulo){
            for(Pelicula p: peliculas){
                if (titulo == p.getTitulo()){
                    p.getInformacion();
                }
            }
    }

    public String toString(){
        return peliculas.toString();
    }
}
