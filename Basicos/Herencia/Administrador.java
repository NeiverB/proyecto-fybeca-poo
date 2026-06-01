public class Administrador extends Usuario {
    private String rol;
    private String permisos;
    private String area;

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String correo, String contrasena, String rol, String permisos, String area) {
        super(nombre, correo, contrasena);
        this.rol = rol;
        this.permisos = permisos;
        this.area = area;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Rol: " + rol);
        System.out.println("Permisos: " + permisos);
        System.out.println("Área: " + area);
    }
}
