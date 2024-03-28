package org.example;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    // Tek bir örnek döndüren metot
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton örneği oluşturuldu.");
    }
}
