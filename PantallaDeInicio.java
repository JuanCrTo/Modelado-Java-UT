import java.util.List;

public class PantallaDeInicio {
    private String logo;
    private String nombreApp;
    private List<String> menu;
    private Object filtrosBusqueda;

    public PantallaDeInicio(String logo, String nombreApp, List<String> menu) {
        this.logo = logo;
        this.nombreApp = nombreApp;
        this.menu = menu;
    }

    public List<Colegio> aplicarFiltros(Object filtros) {
        // Lógica para aplicar filtros de búsqueda
        return null; // Ejemplo: devolver null o una lista de colegios filtrados
    }

    public List<String> mostrarMenu () {
        // Lógica para mostrar el menú
        return menu; // Devuelve la lista de elementos del menú
    }
}
