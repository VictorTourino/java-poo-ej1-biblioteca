package C006_Biblioteca4_0;

public class Usuario extends Persona implements Notificable{
    
   
    private String fecha_nac; //A poder ser introducirla YYYY-MM-DD, por ejemplo el 15 de abril del 2007 = 2007-04-15; Asi luego el LocalDate (en caso de querer usarlo/necesitarlo) "DEBERIA" detectarla bien y funcionar.
    private String numSocio;

    //Constructor por defecto
    public Usuario(){

        super();
        this.fecha_nac = ""; //Comando para luego poder convertir el String "fecha_nac" en un objeto LocalDate, con el que podremos realziar operaciones o sacacar ciertos datos como el año, asi podemos calcular si un usaurio es mayor de 18 años por si queremos restringir el registro a mayores de edad, o ciertos libros que sean +18 o +16, etc no dejarle realziar prestamo a alguien que no iguale o supere cierta edad. LocalDate fechaNacimiento = LocalDate.parse("1995-05-15");
        this.numSocio = "";

    }

    //Constructor de parámetros
    public Usuario(String nombre, String apellido1, String apellido2, String dni, String telefono, String email, String fecha_nac, String numSocio){

        super(nombre, apellido1, apellido2, dni, telefono, email);
        this.fecha_nac = fecha_nac;
        this.numSocio = numSocio;


    }

    //Constructor de copia
    public Usuario(Usuario u){

        super(u);
        this.fecha_nac = u.fecha_nac;
        this.numSocio = u.numSocio;
    }

    //Getters y Setters

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    public String getFecha_nac() {
        return fecha_nac;
    }


    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }
    public String getNumSocio() {
        return numSocio;
    }

    @Override
    public String toString() {
        return "\n-------------------------\n|                       |\n|        Usuario        |\n|                       |\n-------------------------\n\nNombre del Usuario: " + super.getNombre() + "\nPrimer Apellido: " + super.getApellido1() + "\nSegundo apellido: " + super.getApellido2() + "\nDNI: " + super.getDni() + "\nTelefono: " + super.getTelefono() + "\nEmail: " + super.getEmail() + "\nFecha Nacimiento: " + this.fecha_nac + "\nNumero de Socio: " + this.numSocio + "\n----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        //En este punto ya sabemos que es un Usuario.
        Usuario o = (Usuario) obj;
        return (this.numSocio.equals(o.numSocio)); //Con que tengan el mismo numero de socio ya sirve para que se considere el mismo usuario.
    }

    //Consulta los préstamos asociados a este usuario
    @Override
    public void consultarLibros(Prestamo[] prestamos) {

        System.out.println("\n\n\nEl usuario " + this.getNombre() + " ha realizado los prestamos de los siguientes libros: \n");
        
        for ( Prestamo p : prestamos){

            if (p.getUsuario().equals(this)){

                System.out.println("\n" + p);

            }

        }


    }

    //Envía una notificación al usuario
    public void notificar(String mensaje){

        System.out.println("\nMensaje para el usuario: " + this.getNombre() + "\n" + mensaje);

    }




    
    /*Main usado para comprobar el funcionamiento, funciona CORRECTAMENTE.
    
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();

        Usuario u2 = new Usuario("Victor", "Touriño", "Fernandez", "2103321X", "294089871", "eojermi@gmail.com", "2007-15-04", "123123SOCIO");

        Usuario u3 = new Usuario(u2);

        System.out.println(u1);

        System.out.println(u2);

        System.out.println(u3);


        System.out.println("El usuario u2 es igual al usuario u3?" + u2.equals(u3));
        System.out.println("El usuario u2 es igual al usuario u1?" + u2.equals(u1));

    }*/

}
