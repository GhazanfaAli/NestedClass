/*
class Bag{

    String color;
    int weight;
    boolean checkBagOpen;
    class Zip{
        void zip_open(){
            checkBagOpen = true;

        }
        void zip_close(){
            checkBagOpen = false;

        }
    }
    Zip zip1 = new Zip();
    void bag_status(){

        if(checkBagOpen == true){
            System.out.println("Bag is open");

        }
        else if (checkBagOpen == false) {
            System.out.println("Bag is cloed");

        }
    }
    }


*/
/*

public class Main {
    public static void main(String[] args) {

        Bag bag1 = new Bag();

        bag1.zip1.zip_open();
        bag1.bag_status();

        System.out.println();

        bag1.zip1.zip_close();
        bag1.bag_status();


    }
}

*/



 class Bag{

   static boolean checkBagOpen = true;
   static class Zip{
        void zip_open(){
            checkBagOpen = true;

        }
        void zip_close(){
            checkBagOpen = false;

        }
    }
    Zip zip1 = new Zip();
    void bag_status(){

        if(checkBagOpen == true){
            System.out.println("Bag is open");

        }
        else if (checkBagOpen == false) {
            System.out.println("Bag is cloed");

        }
    }
}



public class Main {
    public static void main(String[] args) {

        Bag bag1 = new Bag();


        bag1.zip1.zip_open();
        bag1.bag_status();

        System.out.println();

        bag1.zip1.zip_close();
        bag1.bag_status();


    }
}