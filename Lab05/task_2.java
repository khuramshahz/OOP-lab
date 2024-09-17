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
}
class Book{
    Person author;
    String bookName;
    String publisher;
    Book(Person p,String b,String pub){
        author=p;
        bookName=b;
        publisher=pub;
    }
    public Person getPerson(){
        return author;
    }
    public void dsipaly(){
        System.out.println("Name is "+author.getName());
        System.out.println("Gender is "+author.getGender());
        System.out.println("Adrress is \n"+"City: "+author.getAddress().getCity()+"\nStreet: "+author.getAddress().getStreet());
        System.out.print("House : "+author.getAddress().getHouse()+"\nCode : "+author.getAddress().getCode());
        

    }
}
public class task_2{
    public static void main(String[] args) {
        Address a1=new Address();
        a1.setStreet(90);
        a1.setCity("New york");
        a1.setHouse("VC-900");
        a1.setCode(56);
        Person p1=new Person("Ali","male",a1);
        p1.setGender("Male");
        p1.setName("Waleed");   
        Book b1=new Book(p1,"kiterunner","luke right");
        b1.dsipaly();
        b1.getPerson().getAddress().setHouse("mn-90");
        b1.getPerson().getAddress().setCity("London");
        b1.getPerson().getAddress().setCode(89);
        b1.getPerson().getAddress().setStreet(566);
        System.out.println("\nAfter changing the adddress: ");
        b1.dsipaly();
    }
}
