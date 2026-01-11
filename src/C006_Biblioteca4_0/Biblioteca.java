package C006_Biblioteca4_0;

public class Biblioteca {
    
    private String nombre;
    private String ciudad;
    private String codbiblioteca; //Codigo identificador unico de la biblioteca
    private Prestamo[] prestamos = new Prestamo[0]; //Vector de prestamos.
    private Trabajador[] trabajadores = new Trabajador[0]; //Vector en el que añadiremos los trabajadores.
    private Usuario[] usuarios = new Usuario[0]; //Vector en el que añadiremos los usuarios.
    private Libro[] libros = new Libro[0];//Vector en el que añadiremos los libros

    //Constructor por defecto
    public Biblioteca(){

        this.nombre = "";
        this.ciudad = "";
        this.codbiblioteca = "ESP0"; //El codigo de biblioteca sera ESP seguido de uno o varios numeros.
        
    }

    //Constructor de parametros
    public Biblioteca(String nombre, String  ciudad, String codbiblitoeca){

        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codbiblioteca = codbiblitoeca;

    }

    //Constructor de copia
    public Biblioteca(Biblioteca b){

        this.nombre = b.nombre;
        this.ciudad = b.ciudad;
        this.codbiblioteca = b.codbiblioteca;

    }

    //Getters y Setters

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodbiblioteca() {
        return codbiblioteca;
    }
    public void setCodbiblioteca(String codbiblioteca) {
        this.codbiblioteca = codbiblioteca;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }
    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }


    @Override
    public String toString() {
        return "\n----------------------------\n|                          |\n|        Biblioteca        |   \n|                          |\n----------------------------\n\nBiblioteca: " + this.nombre + "\nCiudad: " + this.ciudad + "\nCódigo único de la biblioteca: " + this.codbiblioteca + "\n----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        //En este punto ya sabemos que es una Bilbioteca.
        Biblioteca o = (Biblioteca) obj;
        return (this.codbiblioteca.equals(o.codbiblioteca)); //Para que dos bibliotecas sean iguales tienen que tener el mismo codigo identificador unico.
    }

    //Funcion que registra un nuevo préstamo en la biblioteca, añadiendolo al vector de prestamos.
    public Prestamo[] registrarUnPrestamo (Prestamo p){

        Prestamo[] nuevoPrestamos = new Prestamo[this.prestamos.length + 1]; //Creamos un vector nuevo con una posicion extra al original para asi añadirle el nuevo prestamo que queremos registrar.

        for ( int i = 0; i < this.prestamos.length; i++){//Copiamos los valores del vector original al nuevo.

            nuevoPrestamos[i] = this.prestamos[i];

        }
        nuevoPrestamos[nuevoPrestamos.length - 1] = p; //Añadimos el nuevo prestamo en el ultimo indice del nuevo vector.

        this.prestamos = nuevoPrestamos; //Agregamos el nuevo vector creado temporalmente al que teniamos originalmente.
        return this.prestamos;

    }

    //Registra un nuevo trabajador en la biblioteca
    public Trabajador[] registrarUnTrabajador (Trabajador t){

        Trabajador[] nuevoTrabajador = new Trabajador[this.trabajadores.length + 1];

        for ( int i = 0; i < this.trabajadores.length; i++){

            nuevoTrabajador[i] = this.trabajadores[i];

        }
        nuevoTrabajador[nuevoTrabajador.length - 1] = t;

        this.trabajadores = nuevoTrabajador;
        return this.trabajadores;

    }


    //Registra un nuevo usuario en la biblioteca
    public Usuario[] registrarUnUsuario (Usuario u){

        Usuario[] nuevoUsuario = new Usuario[this.usuarios.length + 1];

        for ( int i = 0; i < this.usuarios.length; i++){

            nuevoUsuario[i] = this.usuarios[i];

        }
        nuevoUsuario[nuevoUsuario.length - 1] = u;

        this.usuarios = nuevoUsuario;
        return this.usuarios;

    }

    //Registra un nuevo libro en la biblioteca
    public Libro[] registrarUnLibro (Libro l){

        Libro[] nuevoLibro = new Libro[this.libros.length + 1];

        for ( int i = 0; i < this.libros.length; i++){

            nuevoLibro[i] = this.libros[i];

        }
        nuevoLibro[nuevoLibro.length - 1] = l;

        this.libros = nuevoLibro;
        return this.libros;

    }

    /*Main usado para comprobar el funcionamiento, funciona todo bien.
    public static void main(String[] args) {
        
        Biblioteca b1 = new Biblioteca();

        Biblioteca b2 = new Biblioteca("Biblioteca Sancho PAnza", "Castellon", "ESP001");

        Biblioteca b3 = new Biblioteca(b2);


        System.out.println(b1);

        System.out.println(b2);

    


        System.out.println(b3);



        System.out.println("La biblioteca b2 es igual a la biblioteca b3?" +  b2.equals(b3));
        System.out.println("La biblioteca b2 es igual a la biblioteca b1?" + b2.equals(b1));

    }*/

}
