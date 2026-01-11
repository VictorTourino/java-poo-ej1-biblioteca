package C006_Biblioteca4_0;

public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private String isbn;

    //Constructor por defecto
    public Libro(){

        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.isbn = "";

    }

    //Constructor de parámetros
    public Libro(String titulo, String autor, int ejemplares, String isbn){

        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.isbn = isbn;

    }

    //Constructor de copia
    public Libro(Libro l){

        this.titulo = l.titulo;
        this.autor = l.autor;
        this.ejemplares = l.ejemplares;
        this.isbn = l.isbn;

    }

    //Getters y Setters

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "\n-----------------------\n|                     |\n|        Libro        |\n|                     |\n-----------------------\n\nTítulo del Libro: " + this.titulo + "\nAutor del libro: " + this.autor + "\nEjemplares disponibles: " + this.ejemplares + "\nISBN: " + this.isbn + "\n----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        //En este punto ya sabemos que es un Libro.
        Libro o = (Libro) obj;
        return (this.titulo.equals(o.titulo) && this.autor.equals(o.autor) && this.isbn.equals(o.isbn)); //Aqui en el equals no he puesto los ejemplares porque considero que para saber si dos libros son iguales da igual el numero de ejempalres, lo importante és que tengan el mismo ISBN, nombre y autor (realmente con solo ISBN debería servir).
    }
    /*Main usado para comprobar el funcionamiento, funciona BIEN.

    public static void main(String[] args) {
        
        Libro l1 = new Libro();

        Libro l2 = new Libro("El Quijote", "Cervantes", 6, "12309823ISBN");

        Libro l3 = new Libro(l2);

        System.out.println(l1);

        System.out.println(l2);

        System.out.println(l3);


        System.out.println("El libro l2 es igual al libro l3?" + l2.equals(l3));
        System.out.println("El libro l2 es igual al libro l1?" + l2.equals(l1));

    }*/

}
