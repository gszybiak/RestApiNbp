package org.example;

public class Main {
    public static void main(String[] args) {
        Double margin = 0.02;
        String usd = "usd";
        String eur = "eur";
        Double priceUsd = RestApiNbp.loadDataFromBank(usd) + margin;
        Double priceEur = RestApiNbp.loadDataFromBank(eur)  + margin;

        System.out.println("Dolar(sprzedaż): " + priceUsd);
        System.out.println("Euro(sprzedaż): " + priceEur);
    }
}