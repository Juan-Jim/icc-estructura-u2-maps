package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Empleado)) return false;
        Empleado empleado = (Empleado) obj;
        return id == empleado.id && name.equals(empleado.name);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public int compareTo(Empleado o) {
        int comparacionId = Integer.compare(id, o.id);
        if(comparacionId != 0) {
            return comparacionId;
        }
        return name.compareTo(o.getName());
        

    }

    
    
}