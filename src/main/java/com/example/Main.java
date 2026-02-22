package com.example;

public class Main {
    public static void main(String[] args) {
        // 1. Crear al menos dos objetos de la clase Product
        Product producto1 = new Product("P123", "Laptop", 1200.0, 50);
        Product producto2 = new Product("P456", "Smartphone", 800.0, 30);

        System.out.println("--- Estado Inicial ---");
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());

        // 2. Utilizar los métodos setter para modificar al menos un atributo de cada objeto
        producto1.setPrice(1150.0); // Rebaja de precio
        producto2.setStock(25);     // Cambio en inventario

        // 3. Utilizar los métodos getter para imprimir valores específicos
        System.out.println("\n--- Después de las modificaciones ---");
        System.out.println("Nuevo precio del producto 1 (" + producto1.getName() + "): $" + producto1.getPrice());
        System.out.println("Nuevo stock del producto 2 (" + producto2.getName() + "): " + producto2.getStock());

        // Imprimir representación final
        System.out.println("\n--- Resumen Final ---");
        System.out.println(producto1);
        System.out.println(producto2);
    }
}