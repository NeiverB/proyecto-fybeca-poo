public class Manager extends Empleado2 {
    private String redesSociales;
    private String estrategia;
    private String contenido;

    public Manager(){
        super();
    }

    public Manager(String nombre, String apellido, String departamento,int horasTrabajadas, String redesSociales, String estrategia, String contenido){
        super(nombre, apellido, departamento,horasTrabajadas);
        this.redesSociales=redesSociales;
        this.estrategia=estrategia;
        this.contenido=contenido;
    }

    public void setRedesSociales(String redesSociales){
        this.redesSociales=redesSociales;
    }

    public String getRedesSociales(){
        return redesSociales;
    }

    public void setEstrategia(String estrategia){
        this.estrategia=estrategia;
    }   

    public String getEstrategia(){
        return estrategia;
    }   

    public void setContenido(String contenido){
        this.contenido=contenido;
    }   

    public String getContenido(){
        return contenido;
    }   

    @Override
    public void verDatos(){
        super.verDatos();
        System.out.println("Redes Sociales: "+ redesSociales);
        System.out.println("Estrategia: "+ estrategia);
        System.out.println("Contenido: "+ contenido);
    }
}

