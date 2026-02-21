package com.example;

public class Main {
    public static void main(String[] args) {
        // Crear objetos usando ambos constructores [cite: 44]
        Product p1 = new Product(); 
        Product p2 = new Product("P123", "Laptop", 1200.0, 50);

        // Modificar atributos usando setters [cite: 45]
        p1.setId("P001");
        p1.setName("Teclado");
        p2.setPrice(1150.0);

        // Imprimir valores usando getters [cite: 46]
        System.out.println("Producto 1 - Nombre: " + p1.getName());
        System.out.println("Producto 2 - Precio: " + p2.getPrice());

        // Imprimir representación usando toString() [cite: 47]
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}