public class Cuenta {

    // Atributos privados
    private String usuario;
    private int contrasena;

    // Relación: Cuenta tiene un Usuario (1 a 1)
    private Usuario usuarioObj;

    // Constructor
    public Cuenta(String usuario, int contrasena, Usuario usuarioObj) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.usuarioObj = usuarioObj;
    }

    // Métodos protegidos del diagrama
    protected boolean validarLogin(String usuario, int contrasena) {
        if (this.usuario.equals(usuario) && this.contrasena == contrasena) {
            System.out.println("Login exitoso. Bienvenido, " + usuario);
            return true;
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
            return false;
        }
    }

    protected void cerrarSesion() {
        System.out.println("Sesión cerrada para el usuario: " + usuario);
    }

    // Getters y Setters
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public int getContrasena() { return contrasena; }
    public void setContrasena(int contrasena) { this.contrasena = contrasena; }

    public Usuario getUsuarioObj() { return usuarioObj; }
    public void setUsuarioObj(Usuario usuarioObj) { this.usuarioObj = usuarioObj; }
}
