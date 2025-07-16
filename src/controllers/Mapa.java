package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    
    // Imprime en cualquier orden
    public void runHashMap() {
        System.out.println("-- RunHashMap --");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        // Actualiza el valor y si no exite lo crea
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String key : mapa.keySet()) {
             System.out.println(mapa.get(key));
        }

        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));    

    }

    // Imprime como va ingresando los valores
    public void runLinkedHashMap() {
        System.out.println("-- runLinkedHashMap --");
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Celular");
        mapa.put(2, "Laptop");
        mapa.put(3, "TV");
        mapa.put(4, "PC");
        mapa.put(5, "Teclado");

        for (Integer key : mapa.keySet()) {
             System.out.println(mapa.get(key));
        }

        System.out.println(mapa.values());

    }

    // Imprime los valores ya ordenados
    public void runTreeMap() {
        System.out.println("-- runTreeMap --");
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        for (Integer key : items.keySet()) {
             System.out.println(items.get(key));
        }

        System.out.println(items);
    }

    public void runHashMapObj() {
        System.out.println("-- runHashMapObj --");
        Map<Empleado, Integer> empleados = new HashMap<>();

        empleados.put(new Empleado(1,"Juan", "Dev"),1200);
        empleados.put(new Empleado(2,"Juan", "Dev"),1500);
        empleados.put(new Empleado(3,"Pedro", "Dev"),2000);
        empleados.put(new Empleado(1,"Juan", "Dev"),2500);
        empleados.put(new Empleado(2,"Diego", "Dev"),3000);

        System.out.println(empleados);

        for (Empleado key : empleados.keySet()) {
             System.out.println(empleados.get(key));
        }

    }

    public void runTreeMapObj() {
         System.out.println("-- runTreeMapObj --");
        Map<Empleado, Integer> empleados = new TreeMap<>();

        empleados.put(new Empleado(1,"Juan", "Dev"),1200);
        empleados.put(new Empleado(2,"Juan", "Dev"),1500);
        empleados.put(new Empleado(3,"Pedro", "Dev"),2000);
        empleados.put(new Empleado(1,"Diego", "Dev"),1200);
        empleados.put(new Empleado(1,"Juan", "Senior"),3000);
    
        System.out.println(empleados);
    }
    
}
