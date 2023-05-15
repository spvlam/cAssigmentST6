public class storeTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
        "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King22",
        "Animation", "Roger Allers", 87, 19.95f);
       Store abc = new Store();
       abc.addDVD(dvd2);
       abc.addDVD(dvd1);
       abc.addDVD(dvd2);
       abc.removeDVD(dvd1);
       abc.in();
       abc.removeDVD(dvd1);
       abc.in();
    }
}
