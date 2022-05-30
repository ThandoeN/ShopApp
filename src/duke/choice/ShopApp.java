package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("This is a practice shopping application in Java");

        Customer c1 = new Customer();

        c1.name= "Pinky";
        System.out.println("Customer name is "+c1.name);


        Clothing item1  = new Clothing();
        Clothing item2 = new Clothing();

        item1.description ="Blue jacket";
        item1.price = 20.9;
        item1.size="M";

        item2.description="Orange tshirt";
        item2.price = 10.5;
        item2.size ="M";

        System.out.println("item1," +item1.description + "," +item1.size +","+item1.price);
        System.out.println("item1," +item2.description + "," +item2.size +","+item2.price);

    }
}