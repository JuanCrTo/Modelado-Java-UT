import java.util.List;

public class UsuarioEstudiante extends Usuario {
    private String gradoActual;
    private Object historialAcademico;

    public UsuarioEstudiante(String id, String nombre, String email, String contraseña, String gradoActual,
            Object historialAcademico) {
        super(id, nombre, email, contraseña);
        this.gradoActual = gradoActual;
        this.historialAcademico = historialAcademico;
    }

    public List<Colegio> buscarColegios(Object filtros) {
        // Lógica para buscar colegios
        return null; // Retorna una lista vacía si no se encuentran colegios que coincidan con los criterios o puede retornar null en caso de error en la búsqueda.
    }

    public boolean aplicarInscripcion(String colegioId) {
        // Lógica para aplicar inscripción
        return true; // true si la inscripción se aplica con éxito, false en caso contrario (por ejemplo, si ya está inscrito o hay un error).
    }

    @Override
    public boolean actualizarPerfil() {
        // Lógica para actualizar perfil del estudiante
        return true; // Retorna true si la actualización es exitosa
    }

    @Override
    public boolean autenticar(Object credenciales) {
        // Lógica para autenticar al estudiante usando las credenciales
        return true; // Retorna true si la autenticación es exitosa
    }
}