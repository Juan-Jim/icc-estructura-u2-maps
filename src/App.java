import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import java.util.Arrays;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Juan Jimenez"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();
        runEmpleadoExample();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();

    }

    private static void runEmpleadoExample() {
    EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();  
    EmpleadoContoller empleadoControllerHash = new EmpleadoContoller(empleadoDAOHash);

    EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();  
    EmpleadoContoller empleadoControllerTree = new EmpleadoContoller(empleadoDAOTree);

    Empleado emp1 = new Empleado(4, "Pedro", "DEV");
    Empleado emp2 = new Empleado(2, "Pedro", "DEV");
    Empleado emp3 = new Empleado(5, "Juan", "DEV");
    Empleado emp4 = new Empleado(3, "Maria", "DEV");
    Empleado emp5 = new Empleado(1, "Jose", "DEV");

    empleadoControllerHash.agregarEmpleado(emp1);
    empleadoControllerHash.agregarEmpleado(emp2);
    empleadoControllerHash.agregarEmpleado(emp3);
    empleadoControllerHash.agregarEmpleado(emp4);
    empleadoControllerHash.agregarEmpleado(emp5);
    empleadoControllerHash.agregarEmpleado(emp5); 
    empleadoControllerHash.agregarEmpleado(emp5); 
    
    empleadoControllerTree.agregarEmpleado(emp1);
    empleadoControllerTree.agregarEmpleado(emp2);
    empleadoControllerTree.agregarEmpleado(emp3);
    empleadoControllerTree.agregarEmpleado(emp4);
    empleadoControllerTree.agregarEmpleado(emp5);

    System.out.println("HASHMAP:");
    empleadoControllerHash.list();
    empleadoControllerHash.remove(2);
    System.out.println("HASHMAP:");
    empleadoControllerHash.list();

    System.out.println("TREEMAP:");
    empleadoControllerTree.list();
    empleadoControllerTree.remove(2);
    System.out.println("TREEMAP:");
    empleadoControllerTree.list();
}


    private static void runEjerccios() {
        System.out.println("¿'listen' y 'silent' son anagramas? " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("¿'hello' y 'bello' son anagramas? " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("¿'triangle' y 'integral' son anagramas? " + Ejercicios.areAnagrams("triangle", "integral"));

        Ejercicios ejercicios = new Ejercicios(); 

        int[] resultado1 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        int[] resultado2 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);

        System.out.println("Resultado suma objetivo 5: " + (resultado1 != null ? Arrays.toString(resultado1) : "null"));
        System.out.println("Resultado suma objetivo 10: " + (resultado2 != null ? Arrays.toString(resultado2) : "null"));

        System.out.print("Frecuencia de caracteres en 'hola': ");
        ejercicios.contarCaracteres("hola");

        System.out.print("Frecuencia de caracteres en 'programación': ");
        ejercicios.contarCaracteres("programación");

        
        System.out.println("¿'roma' y 'amor' son anagramas? " + ejercicios.sonAnagramas("roma", "amor"));
        System.out.println("¿'gato' y 'toga' son anagramas? " + ejercicios.sonAnagramas("gato", "toga"));
        System.out.println("¿'perro' y 'gato' son anagramas? " + ejercicios.sonAnagramas("perro", "gato"));
    }

    
}
