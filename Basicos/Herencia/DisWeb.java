public class DisWeb extends Empleado2 {
    private String herramientas;
    private String experiencia;
    private String proyectos;

    public DisWeb(){
        super();
    }

    public DisWeb(String nombre, String apellido, String departamento,int horasTrabajadas, String herramientas, String experiencia, String proyectos){
        super(nombre, apellido, departamento, horasTrabajadas);
        this.herramientas=herramientas;
        this.experiencia=experiencia;
        this.proyectos=proyectos;
    }

    public void setHerramientas(String herramientas){
        this.herramientas=herramientas;
    }

    public String getHerramientas(){
        return herramientas;
    }   

    public void setExperiencia(String experiencia){
        this.experiencia=experiencia;
    }

    public String getExperiencia(){
        return experiencia;
    }

    public void setProyectos(String proyectos){
        this.proyectos=proyectos;
    }

    public String getProyectos(){
        return proyectos;
    }

    @Override
    public void verDatos(){
        super.verDatos();
        System.out.println("Herramientas: "+ herramientas);
        System.out.println("Experiencia: "+ experiencia);
        System.out.println("Proyectos: "+ proyectos);
    }
}
