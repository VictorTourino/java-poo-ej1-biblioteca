/*
*   Ejercicio: T11E1 - Biblioteca con abstracción (4.0)
*
*
*   Autor: Victor Touriño Fernandez
*   Curso: 1 DAM MEDAC CASTELLON
*   Fecha: 19/12/2025
*
*/

package C006_Biblioteca4_0;

public class Main {
    
    public static void main(String[] args) {
        
        //Creación de biblioteca
        Biblioteca b1 = new Biblioteca("biblioteca Rafalafena", "Castellon", "ESP152");

        //Creación de vectores
        Prestamo[] prestamos = new Prestamo[0]; //Creamos el vector en el que almacenaremos los prestamos que hagamos con la funcion registrarUnPrestamo.
        Trabajador[] trabajadores = new Trabajador[0]; //Creamos un vector de trabajadores para almacenar los trabajadores que tenemos.
        Usuario[] usuarios = new Usuario[0]; //Creamos un vector en el que gracias a la funcion creada "registrarUnUsuario" almacenaremos los usuarios de nuestra biblioteca.
        Libro[] libros = new Libro[0];



        //Creación de trabajadores
        Trabajador t1 = new Trabajador("Pedro", "Roca", null, "12839021X", "609890211", "mwdkfwe@kwmfdk.com", 1920.22);
        Trabajador t2 = new Trabajador("Vicente", "Perez", null, "12839123>", "018274", "1412344@kwmfdk.com", 1880.22);
        //Creación de usuarios
        Usuario u1 = new Usuario("Victor", "Touriño", "Fernandez", "1087312X", "621057623", "victorjava@correoclase.com", "01-01-2007", "12983721S");
        //Creación de libros
        Libro l1 = new Libro("Don quijote de la mancha", "Federico Garcia Lorca", 2, "08712308237ISBN");
        //Creación de prestamos
        Prestamo p1 = new Prestamo();
        Prestamo p2 = new Prestamo(l1, u1, t1,"20-09-2025");
        Prestamo p3 = new Prestamo(p2);
        Prestamo p4 = new Prestamo(l1, u1, t2, null);


        //Añadimos los dos trabajadores al vector de trabajadores con la funcion creada "registrarUnTrabajador".
        trabajadores = b1.registrarUnTrabajador(t1);
        trabajadores = b1.registrarUnTrabajador(t2);

        //Registrar usuario
        usuarios = b1.registrarUnUsuario(u1);

        //Registrar libro
        libros = b1.registrarUnLibro(l1); //Almacenamos los libros dentro de su correspondiente vector.

        //Registrar préstamos
        prestamos = b1.registrarUnPrestamo(p2);
        prestamos = b1.registrarUnPrestamo(p4);

        t1.consultarLibros(prestamos); //También se puede consultar si el trabajador en este caso tiene coincidencias con algún prestamo del vector de prestamos.
        u1.consultarLibros(prestamos); //Hacemos la prueba también con el usuario.

        //Probar igualdad de préstamos
        System.out.println("El prestamo p2 es igual al prestamo p3?" + p2.equals(p3));
        System.out.println("El prestamo p2 es igual al prestamo p1?" + p2.equals(p1));

        //Llamamos a la interfaz, probando la de usuario con "u1" y la de trabajador con "t1".
        u1.notificar("Este usuario hace 20 días que no viene");
        t1.notificar("A este trabajador se le deben 200 euros");
        
    }


}
