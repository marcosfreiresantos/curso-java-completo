package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    Product product;
    public OrderItem(){
    }

    public OrderItem(Integer quantity, Double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public Double getPrice(Double price){
       return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void addEstoque(Integer quantity){
        quantity += quantity;
    }

    public void removeEstoque(Integer quantity){
        quantity -= quantity;
    }

    public Double subTotal(){
        return quantity * price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Items:").append("\n");
        sb.append(getProduct().getName());
        sb.append(", $");
        sb.append(String.format("%.2f", price));
        sb.append(", Quantity: ");
        sb.append(quantity);
        sb.append(", Subtotal: $");
        sb.append(String.format("%.2f", subTotal()));
        return sb.toString();
    }

}























