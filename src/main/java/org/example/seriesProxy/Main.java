package org.example.seriesProxy;

public class Main {
    public static void main(String[] args) {
        SerieProxy serieProxy = new SerieProxy();
        try {
            System.out.println(serieProxy.getPelicula("Breaking Bad"));
            System.out.println(serieProxy.getPelicula("Stranger Things"));
            System.out.println(serieProxy.getPelicula("The Walking Dead"));
            System.out.println(serieProxy.getPelicula("Game of Thrones"));
            System.out.println(serieProxy.getPelicula("The Big Bang Theory"));
            System.out.println(serieProxy.getPelicula("The Office"));
        } catch (SerieNoHabilitadaException e) {
            System.out.println(e.getMessage());
        }
    }
}
