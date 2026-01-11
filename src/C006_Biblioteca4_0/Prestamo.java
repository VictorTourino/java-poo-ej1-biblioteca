package C006_Biblioteca4_0;

public class Prestamo {
    
    private Libro libro;
    private Usuario usuario;
    private Trabajador trabajador;
    private String fecha_prestamo;
    

    //Constructor por defecto
    public Prestamo(){

        //this.libro = null; También se podría hacer, pero es mejor iniciarlizar los objetos para asi evitar referencias null.
        this.libro = new Libro();
        //this.usuario = null;
        this.usuario = new Usuario();
        this.trabajador = new Trabajador();
        this.fecha_prestamo = "";

    }

    //Constructor de parámetros
    public Prestamo(Libro libro, Usuario usuario, Trabajador trabajador, String fecha_prestamo){

        this.libro = libro;
        this.usuario = usuario;
        this.trabajador = trabajador;
        this.fecha_prestamo = fecha_prestamo;
    }

    //Este otro tambien es de parametros. Este es uno que crearia directamente el libro y el usuario al realizar el prestamo, en el caso de que viniera un usuario nuevo con un libro nuevo, en este ejemplo practico no tiene demasiado sentido, pero si que aplicaría en otros ejemplos, como sería en compramostucoche o sistemas similares.
    public Prestamo(String titulo, String autor, int ejemplares, String isbn, String nombre, String apellido1, String apellido2, String dni, String telefono, String email, String fecha_nac, String numSocio, String fecha_prestamo, String nombreTrabajador, String apellido1Trabajador, String apellido2Trabajador, String dniTrabajador, String telefonoTrabajador, String emailTrabajador, double sueldoTrabajador){

        this.libro = new Libro(titulo, autor, ejemplares, isbn);
        this.usuario = new Usuario(nombre, apellido1, apellido2, dni, telefono, email, fecha_nac, numSocio);
        this.trabajador = new Trabajador(nombreTrabajador, apellido1Trabajador, apellido2Trabajador, dniTrabajador, telefonoTrabajador, emailTrabajador, sueldoTrabajador);
        this.fecha_prestamo = fecha_prestamo;
    }

    //Constructor de copia
    public Prestamo (Prestamo p){

        this.libro = p.libro;
        this.usuario = p.usuario;
        this.trabajador = p.trabajador;
        this.fecha_prestamo = p.fecha_prestamo;

    }

    //Getters y Setters

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }
    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }


    public String getFecha_prestamo() {
        return fecha_prestamo;
    }
    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }


    @Override
    public String toString() {
        return "\n--------------------------\n|                        |\n|        Prestamo        |\n|                        |\n--------------------------\n\nLibro: " + this.libro + "\n\nUsuario: " + this.usuario + "\n\nTrabajador que realiza el prestamo: " + this.trabajador + "\n\nFecha del prestamo: " + this.fecha_prestamo + "\n--------------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        //En este punto ya sabemos que es un Prestamo.
        Prestamo o = (Prestamo) obj;
        return (this.usuario.equals(o.usuario) && this.libro.equals(o.libro)); //Para considerar que dos prestamos son iguales se verifica el libro y el usuario.
    }

    
    /*Main usado para comprobar el funcionamiento, funciona todo bien.

    public static void main(String[] args) {
        
        Prestamo p1 = new Prestamo();
        Libro l1 = new Libro("Don quijote de la mancga", "Federico Garcia Lorca", 2, "08712308237ISBN");
        Usuario u1 = new Usuario("Victor", "Touriño", "Fernandez", "1087312X", "621057623", "victorjava@correoclase.com", "01-01-2007", "12983721S");
        Trabajador t1 = new Trabajador("Pedro", "Sanchez", null, "12839021X", "609890211", "mwdkfwe@kwmfdk.com", 1920.22);

        Prestamo p2 = new Prestamo(l1, u1, t1,"20-09-2025");

        Prestamo p3 = new Prestamo(p2);

        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p3);


        System.out.println("El prestamo p2 es igual al prestamo p3?" + p2.equals(p3));
        System.out.println("El prestamo p2 es igual al prestamo p1?" + p2.equals(p1));


    }*/


}
