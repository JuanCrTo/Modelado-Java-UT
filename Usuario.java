public abstract class Usuario implements IAutenticable {
    protected String id;
    protected String nombre;
    protected String email;
    private String contraseña;

    public Usuario(String id, String nombre, String email, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public boolean iniciarSesion() {
        // Lógica para iniciar sesión
        return true;
    }

    public void cerrarSesion() {
        // Lógica para cerrar sesión
    }

    public abstract boolean actualizarPerfil();

    public abstract boolean autenticar(Object credenciales);
}
