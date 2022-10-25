package org.example.seriesProxy;

public class SerieProxy implements ISeries {
    private int cantVisitas;
    private final Series series;

    public SerieProxy() {
        this.cantVisitas = 0;
        this.series = new Series();
    }
    @Override
    public String getPelicula(String serie) throws SerieNoHabilitadaException {
        if (cantVisitas < 5) {
            cantVisitas++;
            return "Visita " + cantVisitas + " " + series.getPelicula(serie);
        } else {
            throw new SerieNoHabilitadaException("No se pueden ver más series. Se llegó al límite semanal de 5 visitas.");
        }
    }
}
