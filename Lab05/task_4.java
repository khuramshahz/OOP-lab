class Pizza{
    private String size;
    private int cheese_toppings;
    private int pepperoni_toppings;
    private int  ham_toppings;
    Pizza(){
        cheese_toppings=2;
        size="Small";
        ham_toppings=3;
        pepperoni_toppings=1;
    }
    Pizza(String s,int c,int p,int h){
        size=s;
        cheese_toppings=c;
        pepperoni_toppings=p;
        ham_toppings=h;
    }
    public void setSize(String s){
        size=s;
    }
    public void setCheese(int c){
        cheese_toppings=c;
    }
    public void setPepperoni(int p){
        pepperoni_toppings=p;
    }
    public  void setHim(int h){
        ham_toppings=h;
    }
    public String getSize(){
        return size;
    }
    public int getCheese(){
        return cheese_toppings;
    }
    public int getPepperoni(){
        return pepperoni_toppings;
    }
    public int getham(){
        return ham_toppings;
    }
    public double calcCost(){
        double cost=(cheese_toppings*2)+(ham_toppings*2)+(pepperoni_toppings*2);
        if(size.equals("Small")){
            cost=cost+10;
        }
        if(size.equals("Medium")){
            cost=cost+12;
        }
        if(size.equals("Large")){
            cost=cost+14;
        }
        return cost;
    }
    public void getDescription(){
        System.out.println("The description odf pizza is : ");
        System.out.println("size: "+size+"\nchesse topping: "+cheese_toppings+"\nham topping: "+ham_toppings+"\npepperoni cheese: "+pepperoni_toppings);
    }
}
class pizzaorder{
    Pizza po_1;
    Pizza po_2;
    Pizza po_3;
    pizzaorder(Pizza p1,Pizza p2){
        po_1=p1;
        po_2=p2;
    }
    public double calcTotal(Pizza p1,Pizza p2){
        double cost=p1.calcCost()+p2.calcCost();
        return cost;
    }
}
public class task_4{
    public static void main(String[] args) {
        Pizza p2=new Pizza();

        Pizza p1=new Pizza("Medium",2,6,3);
        
        p1.setSize("Medium");
        p1.setCheese(2);
        p1.setPepperoni(3);
        p1.setHim(1);
        double prize=p1.calcCost();
        System.out.println("Prize of pizza is : "+prize);
        p1.getDescription();
        pizzaorder p_1=new pizzaorder(p1,p2);
        double total=p_1.calcTotal(p1,p2);
        System.out.println("the cost of order is: "+total);
    }
}
