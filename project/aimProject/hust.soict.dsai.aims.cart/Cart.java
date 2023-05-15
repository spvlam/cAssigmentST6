public class Cart{
    private static final int MAX_NUMBER_ORDER =20; 
    private int qtyOrder=0;
    private DigitalVideoDisc listOfProduct[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
    public DigitalVideoDisc[] getlDigitalVideoDiscs(){
        return this.listOfProduct;
    }
    public boolean check(String title){
          for(DigitalVideoDisc dvd:listOfProduct){
            if(dvd != null && dvd.getTitle()==title) return false;
          }
          return true;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(qtyOrder==MAX_NUMBER_ORDER){
            System.out.println("This cart has been full");
        }else{
            if(check(dvd.getTitle())){
                listOfProduct[qtyOrder]=dvd;
                qtyOrder++;
                // DigitalVideoDisc.setNumber(DigitalVideoDisc.getNumber()+1);
            }else{
                System.out.println("This dvd has been existed");
            }
        }
    }
    // overloading method for addDigitalVideoDisc with the list of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for(DigitalVideoDisc dvd: dvdList){
            if(qtyOrder==MAX_NUMBER_ORDER){
                System.out.println("This cart has been full");
            }else{
                if(check(dvd.getTitle())){
                    listOfProduct[qtyOrder]=dvd;
                    qtyOrder++;  
                    // DigitalVideoDisc.setNumber(DigitalVideoDisc.getNumber()+1);
                }else{
                    System.out.println("This dvd has been existed");
                }
            }
        }
    }
    // overloading method for addDigitalVideoDisc with the list of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        DigitalVideoDisc []dvdList ={dvd1,dvd2};
        for(DigitalVideoDisc dvd: dvdList){
            if(qtyOrder==MAX_NUMBER_ORDER){
                System.out.println("This cart has been full");
            }else{
                if(check(dvd.getTitle())){
                    listOfProduct[qtyOrder]=dvd;
                    qtyOrder++;  
                    // DigitalVideoDisc.setNumber(DigitalVideoDisc.getNumber()+1);
                }else{
                    System.out.println("This dvd has been existed");
                }
            }
        }
    }

    
    public void removeDVD(DigitalVideoDisc dvd){
        if(listOfProduct.length==0){
            System.out.println("there is no product here");
        }else{
            if(check(dvd.getTitle())){
                System.out.println("there is no product like this");
                
            }else{
                DigitalVideoDisc listOfProduct2[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
                int index=0;
                for(DigitalVideoDisc dvdSub:listOfProduct){
                      if(dvdSub!=dvd){
                           listOfProduct2[index]=dvdSub; 
                           index++;
                      }
                }
                qtyOrder--;
                listOfProduct=listOfProduct2;
            }
        }
    }
    public float totalCost(DigitalVideoDisc listOfProduct1[]){
        float totalCost=0;
        for(DigitalVideoDisc dvd:listOfProduct1){
            if(dvd!=null){
                totalCost+=dvd.getCost();
            }
        }
        return totalCost;
    }
    public void list(DigitalVideoDisc []listOfProduct1){
        System.out.println("***********************CART***********************");
        for(DigitalVideoDisc dvd:listOfProduct1){
            if(dvd!=null){
                System.out.printf("DVD-%20s %20s %20s %.2f %.2f\n",dvd.getTitle(), dvd.getCategory(),dvd.getDirector(),dvd.getCost(),dvd.getLength());
            }
        }
        System.out.printf("total cost : %f\n",totalCost(listOfProduct1));
        System.out.println("**************************************************");

    }
    public void searchTitle(String title){
        DigitalVideoDisc listOfProduct1[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
        int i=0,dem=0;
        
        for(DigitalVideoDisc dvd:listOfProduct){
            dem++;
            if(dem>qtyOrder){
                break;
            }
           if(dvd.isMatch(title)){
            listOfProduct1[i]=dvd;
            i++;
           }
          
        }
        if(i>0){
            this.list(listOfProduct1);
        }else{
            System.out.print("No dvd found");
        }
    }
    
}
