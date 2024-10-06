public interface IGestionableReportes {
    
    // Este método se encarga de crear y devolver un objeto que representa un reporte.
    Object generarReporte();

    // Este método se utiliza para exportar el reporte generado en el formato especificado por el parámetro.
    boolean exportarReporte(String formato);
}
