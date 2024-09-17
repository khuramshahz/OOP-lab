class HotDogStand{
    private String id_number;
    private int dog_sold;
    HotDogStand(){
        id_number="345-a";
        dog_sold=23;
        if(dog_sold<0){
            System.out.println("the number of dog sold inc"+id_number+" is not valid");
            dog_sold=0;
        }
    }
    HotDogStand(String a){
        id_number=a;
        dog_sold=56;
        if(dog_sold<0){
            System.out.println("the number of dog sold in "+id_number+" is not valid");
            dog_sold=0;
        }
    }
    HotDogStand(String a,int b){
        id_number=a;
        dog_sold=b;
        if(dog_sold<0){
            System.out.println("the number of dog sold  in "+id_number+" not valid");
            dog_sold=0;
        }
    }
    public void justSold(){
        dog_sold=dog_sold+1;
    }
    public int getnumber(){
        return dog_sold;
    }

}
public class task_4{
    public static void main(String[] args) {
        HotDogStand stand_1=new HotDogStand();
        stand_1.justSold();
        HotDogStand stand_2=new HotDogStand("234-b");
        stand_2.justSold();
        HotDogStand stand_3=new HotDogStand("111-c",-9);
        stand_3.justSold();
        System.out.println("The number of dog sold is stand-1 is : "+stand_1.getnumber());
        System.out.println("The number of dog sold is stand-2 is : "+stand_2.getnumber());
        System.out.println("The number of dog sold is stand-3 is : "+stand_3.getnumber());   
    }
}
