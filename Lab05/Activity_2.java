class Address{
    private int street;
    private String house;
    private String city;
    private  int code;
    public Address(){

    }
    public void setStreet(int s){
        street=s;
    }
    public void setHouse(String h){
        house=h;
    }
    public void setCity(String c){
        city=c;
    }
    public void setCode(int cd){
        code=cd;
    }
    public int getStreet(){
        return street;
    }
    public String getHouse(){
        return house;
    }
    public String getCity(){
        return city;
    }
    public int getcode(){
        return code;
    }
}
class Person{
    private String name;
    private String gender;
    private Address address;
    public Person(String n,String g,Address a){
        name=n;
        gender=g;
        address=a;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setGender(String g){
        gender=g;
    }
    public String getgender(){
        return gender;
    }
    public void display(){
        System.out.println("Detail of person ia as under: ");
        System.out.println("Person name is : "+name);
        System.out.println("Person gender is : "+gender);
        System.out.println("Person addres detail is as under : ");
        System.out.println("Street is : "+address.getStreet());
        System.out.println("House number is : "+address.getHouse());
        System.out.println("City is : "+address.getCity());
        System.out.println("Code is : "+address.getcode());
    }
}
public class Activity_2{
    public static void main(String[] args) {
        Address a1=new Address();
        a1.setCity("New york");
        a1.setStreet(451);
        a1.setCode(1233);
        a1.setHouse("B1-560");
        Person p1=new Person("Junaid","Male",a1);
        p1.setName("Waleed");
        p1.setGender("Male");
        p1.display();
    }
}
