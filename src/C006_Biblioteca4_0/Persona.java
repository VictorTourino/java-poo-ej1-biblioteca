package C006_Biblioteca4_0;

/*
*
* Clase abstracta que representa a una persona de la biblioteca, la cual puede ser o un Usuario o un Trabajador.
*
*/
public abstract class Persona {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;
    private String email;
    
    //Constructor por defecto
    public Persona(){

        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.dni = "";
        this.telefono = "";
        this.email = "";
    }

    //Constructor de parámetros
    public Persona(String nombre, String apellido1, String apellido2, String dni, String telefono, String email){

        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;

    }

    //Constructor de copia
    public Persona(Persona p){

        this.nombre = p.nombre;
        this.apellido1 = p.apellido1;
        this.apellido2 = p.apellido2;
        this.dni = p.dni;
        this.telefono = p.telefono;
        this.email = p.email;
    }

    //Getters y setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getApellido2() {
        return apellido2;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }



    @Override
    public String toString() {
        return "\n-------------------------\n|                       |\n|        Persona        |\n|                       |\n-------------------------\n\nNombre del Usuario: " + this.nombre + "\nPrimer Apellido: " + this.apellido1 + "\nSegundo apellido: " + this.apellido2 + "\nDNI: " + this.dni + "\nTelefono: " + this.telefono + "\nEmail: " + this.email + "\n----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        //En este punto ya sabemos que es una Persona.
        Persona o = (Persona) obj;
        return (this.dni.equals(o.dni)); //Con que tengan el mismo DNI ya sirve para que se considere el mismo usuario.
    }

    //Método abstracto para consultar los préstamos de libros asociados a un Trabajador o a un Usuario.
    public abstract void consultarLibros(Prestamo[] prestamos);


}
