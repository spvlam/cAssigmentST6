public class TestPassingParameter {
    public static void main(String[] args) {
       DigitalVideoDisc jungleDVD = new DigitalVideoDisc( "jungle");
       // DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc( "cinderella");
       System.out.print(jungleDVD.isMatch("jungle5"));
       // System.out.println("jungle dvd title " + jungleDVD.getTitle());
       // System.out.println("cinderella dvd title " + cinderellaDVD.getTitle());
       // swap2(jungleDVD, cinderellaDVD);
       // System.out.println("jungle dvd title " + jungleDVD.getTitle());
       // System.out.println("cinderella dvd title " + cinderellaDVD.getTitle());
       // changeTitle(cinderellaDVD,jungleDVD.getTitle() );
       // System.out.println("cinderella dvd title " + cinderellaDVD.getTitle());
   }
   public static void swap(Object o1, Object o2){
       Object tmp = o1;
       o1=o2;
       o2=tmp;
   }
   public static void swap2(DigitalVideoDisc o1, DigitalVideoDisc o2){
       String title1 = o1.getTitle();
       String category1 = o1.getCategory();
       float cost = o1.getCost();
       float length = o1.getLength();
       String director = o1.getDirector();
       o1.setCategory(o2.getCategory());
       o1.setDirector(o2.getDirector());
       o1.setLength(o2.getLength());
       o1.setTitle(o2.getTitle());
       o1.setCost(o2.getCost());
       o2.setCategory(category1);
       o2.setCost(cost);
       o2.setDirector(director);
       o2.setLength(length);
       o2.setTitle(title1);
   }
   public static void changeTitle(DigitalVideoDisc dvd, String title){
         String oldTitle = dvd.getTitle();
         dvd.setTitle(title);
         dvd = new DigitalVideoDisc( oldTitle);
   }
   
}

