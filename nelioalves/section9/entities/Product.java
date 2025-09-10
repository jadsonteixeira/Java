package nelioalves.section9.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // construtor
    public Product() {
        // construtor padrão
    }

    public Product(String name, double price, int quantity) {
        this.name = name; // this significa uma referência ao objeto
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // retornar o valor total em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    // adicionar a quantidade de produtos
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // remover do estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ " + String.format("%.2f", price)
                + ", " + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
