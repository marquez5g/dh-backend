package org.example.seriesProxy;

public class Series implements ISeries {
    @Override
    public String getPelicula(String serie) {
        return "www." + serie.toLowerCase().replace(" ", "-") + ".com";
    }
}
