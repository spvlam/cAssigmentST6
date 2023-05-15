public class Store {
    private int Max=20;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[Max] ;
    private int number=0;
    public void  addDVD(DigitalVideoDisc dvd){
         if(number<Max){
            itemsInStore[number]=dvd;
            number++;
            System.out.println("add successfully");
         }else{
            System.out.print("full store");
         }
    }
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean dvdFound = false;
        for (int i = 0; i < number; i++) {
            if (itemsInStore[i].equals(dvd)) {
                dvdFound = true;
                DigitalVideoDisc items[] = new DigitalVideoDisc[number - 1];
                System.arraycopy(itemsInStore, 0, items, 0, i);
                for (int j = i + 1; j < number; j++) {
                    items[j - 1] = itemsInStore[j];
                }
                itemsInStore = items;
                System.out.print("Successfully deleted.");
                number--;
                break; // Exit the loop after deleting the DVD
            }
        }
        if (!dvdFound) {
            System.out.print("DVD not found.");
        }
    }
    public void in(){
        for(DigitalVideoDisc dvd : itemsInStore){
            System.out.println(dvd.getTitle());
        }
    }
    
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
