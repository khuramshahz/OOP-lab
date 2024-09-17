import java.util.ArrayList;
public class practice_1{
    public static void main(String[] args) {
        ArrayList<String>city=new ArrayList<>();
        city.add("London");
        city.add("New jersey");
        city.add("karachi");
        city.add("RYK");
        for(String i:city){
            System.out.println(i);

        }
        city.remove(2);
        for(String i:city){
            System.out.println(i);

        }
    }
}
