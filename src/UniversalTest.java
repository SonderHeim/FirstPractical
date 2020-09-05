import java.lang.*;
public class UniversalTest {
    public static void main(String[] args) {
        System.out.println("Information about dogs:");
        Dog d1 = new Dog("Djoshua", 213);
        Dog d2 = new Dog("Velzevul", 1243);
        Dog d3 = new Dog("Yucon");
        d3.setAge(667);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println('\n');

        System.out.println("Information about balls for dogs: ");
        Ball b1 = new Ball("Red", 14);
        Ball b2 = new Ball("Orange");
        b2.setPrice(11);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("Price the ball you want to buy: " + b2.getPrice() + "$");
        System.out.println('\n');

        System.out.println("There are two books on the table: ");
        Book bo1 = new Book("Hertman Angels", "Above the clouds");
        Book bo2 = new Book("Oliver Gorn", "Politics in politics");
        System.out.println(bo1);
        System.out.println(bo2);
        System.out.println("But you are not interested in them.");
    }
}