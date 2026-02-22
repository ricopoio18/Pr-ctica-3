
public class Pelicula {

    // Atributos de clase
    String titulo;
    String director;
    int añoEstreno;
    String genero;
    int duracion;

    // Constructor vacío
    // Inicia atributos de la clase
    public Pelicula(){
        titulo = "Raging Bull";
        director = "Matin Scorsese";
        añoEstreno = 1980;
        genero = "Deporte, drama";
        duracion = 129;
    }

    // Constructor parametrizado
    // Inicia atributos de la clase
    public Pelicula(String titulo, String director, int añoEstreno, String genero, int duracion){
        this.titulo = titulo;          // Asigna el título recibido
        this.director = director;      // Asigna el director recibido
        this.añoEstreno = añoEstreno;  // Asigna el año de estreno
        this.genero = genero;          // Asigna el género
        this.duracion = duracion;      // Asigna la duración en minutos
    }

    // Método que regresa el título de la película
    public String getTitulo(){
        return titulo;
    }

    // Método que muestra toda la información de la película en la consola
    public void getInformacion(){
        System.out.println("\nTítulo: " + titulo +
                "\nDirector: " + director +
                "\nAño de estreno: " + añoEstreno +
                "\nGenero: " + genero +
                "\nDuracion: " + duracion + " minutos"+ "\n");
    }

    // Método que determina si la película es clásica
    // Se considera clásica si tiene más de 25 años
    public boolean esClasica(int añoActual){
        boolean esClasica = false;

        if ((añoActual - añoEstreno) > 25){
            esClasica = true;
        }

        return esClasica;
    }

    // Método que convierte el objeto en texto
    public String toString(){
        return "Título: " + titulo +
                "\nDirector: " + director +
                "\nAño de estreno: " + añoEstreno +
                "\nGenero: " + genero +
                "\nDuracion: " + duracion + " minutos";
    }
}