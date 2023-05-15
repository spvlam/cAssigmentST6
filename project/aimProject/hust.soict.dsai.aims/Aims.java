public class Aims{
    public static void main(String[] args) {
       //Create a new cart
        Cart anOrder = new Cart();
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
        "Animation", "Roger Allers", 87, 19.95f);

        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
        "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
        "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3) ;
 
        //print total cost of the items in the cart
        anOrder.list();
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        // when i remove the cost with be changed

        anOrder.removeDVD(dvd3);
        anOrder.removeDVD(dvd2);
        System.out.println("after removing the product from cart");
        anOrder.list();
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        }
}
