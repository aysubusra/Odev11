package org.example;

public class Main {
    public static void main(String[] args) {
        // Singleton örneği
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.showMessage();



            Araba araba = Araba.ArabaBuilder.aAraba()
                    .withMarka("VolksWagen")
                    .withVites("DSG")
                    .withModel(2020)
                    .withKilometre(10000)
                    .build();


            System.out.println(araba);
    }
}