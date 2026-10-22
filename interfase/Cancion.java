public class Cancion extends Contenido
        implements Reproducible, Descargable {

    private int duracionSeg;

    public Cancion(String titulo, String autor,
                   int duracionSeg) {

        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public String tipo() {
        return "Cancion";
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo());
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public double calcularTamanoMB() {
        return (duracionSeg / 60.0) * 1.5;
    }
}