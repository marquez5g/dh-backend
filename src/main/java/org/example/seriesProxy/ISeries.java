package org.example.seriesProxy;

public interface ISeries {
    String getPelicula(String serie) throws SerieNoHabilitadaException;
}
