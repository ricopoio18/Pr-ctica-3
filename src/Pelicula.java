public class Pelicula {
    String titulo;
    String director;
    int añoEstreno;
    String genero;
    int duracion;

    public Pelicula(){
        titulo = "Raging Bull";
        director = "Matin Scorsese";
        añoEstreno = 1980;
        genero = "Deporte, drama";
        duracion = 129;
    }

    public Pelicula(String titulo, String director, int añoEstreno, String genero, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }
    public String getTitulo(){
        return titulo;
    }

    public void getInformacion(){
        System.out.println("\nTítulo: " + titulo + "\nDirector: " + director + "\nAño de estreno: "
                + añoEstreno + "\nGenero: " + genero + "\nDuracion: " + duracion + " minutos");
    }
    public boolean esClasica(int añoActual){
        boolean esClasica = false;
        if ((añoActual - añoEstreno) > 25){
            esClasica = true;
        }
        return esClasica;
    }

    public String toString(){
        return "Título: " + titulo + "\nDirector: " + director + "\nAño de estreno: "
                + añoEstreno + "\nGenero: " + genero + "\nDuracion: " + duracion + " minutos";
    }
}
