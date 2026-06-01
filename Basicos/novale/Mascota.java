public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setEspecie(String especie) {
        if (!especie.isEmpty()) {
            this.especie = especie;
        } else {
            System.out.println("La especie no puede estar vacía.");
        }
    }
    public String getEspecie() {
        return especie;
    }
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    public int getEdad() {
        return edad;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
}