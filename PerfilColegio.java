import java.util.List;

public class PerfilColegio {
    private String nombre;
    private String ubicacion;
    private List<String> galeriaImagenes;
    private String descripcionServicios;
    private float calificacionPromedio;

    public PerfilColegio(String nombre, String ubicacion, List<String> galeriaImagenes, String descripcionServicios) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.galeriaImagenes = galeriaImagenes;
        this.descripcionServicios = descripcionServicios;
    }

    public Object mostrarPerfil() {
        // Lógica para mostrar el perfil del colegio
        return null;
    }

    public boolean actualizarInformacion() {
        // Lógica para actualizar la información
        return true;
    }

    protected float calcularCalificacionPromedio() {
        // Lógica para calcular la calificación promedio
        return 0.0f;
    }
}
