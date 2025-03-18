package progra.ejemplos_explicaciones.getyset;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para asegurar que la edad es válida
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad con validación
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida. Debe estar entre 0 y 120 años.");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        persona1.mostrarInfo();

        // Intentamos asignar una edad no válida
        persona1.setEdad(130);  // Esto debería mostrar un mensaje de error
        persona1.mostrarInfo();  // Verifica que la edad no se cambió
        persona1.setEdad(67);
        System.out.println(persona1.getNombre());
        persona1.mostrarInfo();
    }
}
