public class Podcast extends Contenido
        implements Reproducible, Descargable {

    private int duracionSeg;
    private int episodio;

    public Podcast(String titulo, String autor, int duracionSeg, int episodio) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }

    @Override
    public String tipo() {
        return "Podcast";
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + getTitulo());
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public double calcularTamanoMB() {
        return (duracionSeg / 60.0) * 1.0;
    }

    public int getEpisodio() {
        return episodio;
    }
}