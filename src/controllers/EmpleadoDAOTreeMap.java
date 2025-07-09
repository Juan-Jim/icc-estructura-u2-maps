package controllers;

import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private TreeMap<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        for (Empleado emp : empleados.values()) {
            System.out.println(emp);
        }
    }

    @Override
    public void remove(int id) {
        Empleado empToRemove = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                empToRemove = emp;
                break;
            }
        }
        if (empToRemove != null) {
            empleados.remove(empToRemove);
        } else {
            System.out.println("Empleado with ID " + id + " not found.");
        }
    }
}
