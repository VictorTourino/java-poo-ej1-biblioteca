package C006_Biblioteca4_0;

public class Trabajador extends Persona implements Notificable{
    
   
    private double sueldo;

    //Constructor por defecto
    public Trabajador(){

        super();
        this.sueldo = 0;

    }

    //Constructor de parámetros
    public Trabajador(String nombre, String apellido1, String apellido2, String dni, String telefono, String email, double sueldo){

        super(nombre, apellido1, apellido2, dni, telefono, email);
        this.sueldo = sueldo;


    }

    //Constructor de copia
    public Trabajador(Trabajador t){

        super(t);
        this.sueldo = t.sueldo;
    }

    //Getters y Setters

    public double getSueldo() {
    return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "\n----------------------------\n|                          |\n|        Trabajador        |\n|                          |\n----------------------------\n\nNombre del Usuario: " + super.getNombre() + "\nPrimer Apellido: " + super.getApellido1() + "\nSegundo apellido: " + super.getApellido2() + "\nDNI: " + super.getDni() + "\nTelefono: " + super.getTelefono() + "\nEmail: " + super.getEmail() + "\nSueldo: " + this.sueldo + "\n----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        //En este punto ya sabemos que es un Trabajador.
        Trabajador o = (Trabajador) obj;
        return (super.getDni().equals(o.getDni())); //Con que tengan el mismo numero de DNI ya sirve para que se considere la misma persona o trabajador.
    }


    //Consulta los préstamos asociados a este trabajador
    @Override
    public void consultarLibros(Prestamo[] prestamos) {

        System.out.println("\n\n\nEl trabajador " + this.getNombre() + " ha realizado los prestamos de los siguientes libros: \n");
        for (int i = 0; i < prestamos.length; i++ ){
        
            if (prestamos[i].getTrabajador().equals(this)){

                System.out.println("\n" + prestamos[i]);

            }
    
        }

    }

    //Envía una notificación al trabajador
    public void notificar(String mensaje){

        System.out.println("\nMensaje para el trabajador: " + this.getNombre() + "\n" + mensaje);

    }




    
    /* Main usado para comprobar el funcionamiento, funciona CORRECTAMENTE.
    public static void main(String[] args) {
        
        Trabajador t1 = new Trabajador();

        Trabajador t2 = new Trabajador("Alejandro", "Baltazar", null, "S0128329D", "632284292", "alejandro@prueba.com", 1500.29);

        Trabajador t3 = new Trabajador(t2);

        System.out.println(t1);

        System.out.println(t2);

        System.out.println(t3);


        System.out.println("El trabajador t2 es igual al usuario u3? " + t2.equals(t3));
        System.out.println("El trabajador t2 es igual al usuario u1? " + t2.equals(t1));

    }*/

}
