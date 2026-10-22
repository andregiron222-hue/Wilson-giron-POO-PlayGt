import java.util.List;

public class OperacionesPlayGT {

    public static int sumarDuraciones(List<Reproducible> contenidos) {
        int total = 0;

        for (Reproducible contenido : contenidos) {
            total += contenido.getDuracionSeg();
        }

        return total;
    }

    public static double sumarTamanos(List<Descargable> contenidos) {
        double total = 0;

        for (Descargable contenido : contenidos) {
            total += contenido.calcularTamanoMB();
        }

        return total;
    }
}