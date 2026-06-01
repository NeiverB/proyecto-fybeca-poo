public class Empleado2 {
    private String nombre;
    private String apellido;
    private String departamento;
    private int horasTrabajadas;
   
    public Empleado2(){
        System.out.println("Se creo un empleado");
    }

    public Empleado2(String nombre, String apellido, String departamento, int horasTrabajadas){
        this.nombre=nombre;
        this.apellido=apellido;
        this.departamento=departamento;
        this.horasTrabajadas=horasTrabajadas;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getApellido(){
        return apellido;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }

    public String getDepartamento(){
        return departamento;
    }
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public void verDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Departamento: "+ departamento);
        System.out.println("Horas Trabajadas: "+ horasTrabajadas);
    }
}
