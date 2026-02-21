package com.example;

/**
 * Clase que representa un producto del mundo real. [cite: 19, 59]
 */
public class Product {
    // Atributos de instancia [cite: 23, 25, 26, 27, 28]
    private String id;
    private String name;
    private double price;
    private int stock;

    /**
     * Constructor por defecto: inicializa con valores sensatos. [cite: 30, 59]
     */
    public Product() {
        this.id = "N/A";
        this.name = "Sin nombre";
        this.price = 0.0;
        this.stock = 0;
    }

    /**
     * Constructor parametrizado: inicializa todos los atributos. [cite: 31, 59]
     */
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Métodos Getter [cite: 33, 34]
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Métodos Setter con validación opcional [cite: 36, 37, 38]
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    
    public void setPrice(double price) {
        // Validación básica: el precio no puede ser negativo [cite: 38]
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        // Validación básica: el stock no puede ser negativo [cite: 38]
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    /**
     * Sobrescritura del método toString para representación legible. [cite: 39, 40, 41]
     */
    @Override
    public String toString() {
        return "Producto [ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock + "]";
    }
}