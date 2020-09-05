public class Ball {
    private String color;
    private int price;

    public Ball(String c, int p) {
        color = c;
        price = p;
    }
    public Ball(String c){
        color = c;
    }
    public void setPrice(int p) {
        this.price = p;
    }
    public Ball(){
        color = "green";
        price = 213;
    }
    public int getPrice(){
        return price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return this.color + ", price is: " + this.price + "$";
    }
}
