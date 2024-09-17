abstract class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract boolean isOutStanding();
    public String toString(){
        return name;
    }
    
}
class Student extends Person{
    private double CGPA;

    public Student(double CGPA, String name) {
        super(name);
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isOutStanding() {
        return CGPA>=3.5;
    }   
    @Override
    public String toString() {
        return ("Student: "+"\n CGPA: "+CGPA);
    }
}
class Professor extends Person{
    private int number_of_publication;

    public Professor(int number_of_publication, String name) {
        super(name);
        this.number_of_publication = number_of_publication;
    }

    public int getNumber_of_publication() {
        return number_of_publication;
    }

    public void setNumber_of_publication(int number_of_publication) {
        this.number_of_publication = number_of_publication;
    }

    @Override
    public boolean isOutStanding() {
        return number_of_publication>=50;
    }  
    public String toString(){
        return ("Professor: "+"\nNumber of publication: "+number_of_publication);    }
}
public class Task_2 {
    public static void main(String[]args){
        Person []arr={new Student(4,"khuram"),new Student(2.5,"Abdull hasib"),new Professor(43,"Usman"),new Professor(50,"yasir"),new Professor(55,"Qasim")};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].isOutStanding());
        }
    }
}
