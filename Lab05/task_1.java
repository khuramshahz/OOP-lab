class Address{
    String city;
    int code;
    int street;
    String house;
    Address(){
        city="new york";
        code=90;
        house="b5-900";
        street=455;
    }
    public void setCity(String c){
        city=c;
    }
    public void setStreet(int s){
        street=s;
    }
    public void setHouse(String h){
        house=h;
    }
    public void setCode(int c){
        code=c;
    }
    public String getCity(){
        return city;
    }
    public int getCode(){
        return code;
    }
    public int getStreet(){
        return street;
    }
    public String getHouse(){
        return house;
    }
}
class Person{
    String name;
    String gender;
    Address a;
    Person(String n,String g,Address t){
        name=n;
        gender=g;
        a=t;
    }
    public void setName(String n){
        name=n;
    }
    public void setGender(String g){
        gender=g;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public Address getAddress(){
        return a;
    }
    public void dsiplay(){
        System.out.println("Person profile is : ");
        System.out.print("Name: "+name+"\nGender: "+gender+"\nAddress is : ");
        System.out.print("\nCity: "+this.getAddress().city+"\nHouse: "+this.getAddress().house+"\nStreet: "+this.getAddress().street+"\nCode: "+this.getAddress().code);

    }
}
public class task_1{
    public static void main(String[] args) {
        Address a1=new Address();
        a1.setStreet(90);
        a1.setCity("New york");
        a1.setHouse("VC-900");
        a1.setCode(56);
        Person p1=new Person("Ali","male",a1);
        p1.setGender("Male");
        p1.setName("Waleed");  
        p1.dsiplay();
        
    }
    
}
