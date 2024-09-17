class Student{
    private String name;
    private int Result[];
    Student (int arr[]){
        name="Ali";
        Result=arr;
    }
    Student(String a,int []arr){
        Result=arr;
        name=a;
    }
    public int Avergae(){
        int sum=0;
        for(int i=0;i<Result.length;i++){
            sum=sum+Result[i];
        }
        return (sum/5);
    }
    public String getname(){
        return name;
    }
    public int[] getmarks(){
        return Result;
    }
    public void display(){
        int sum=0;
        for(int i=0;i<Result.length;i++){
            sum=sum+Result[i];
        }
        System.out.println("has name : "+name+" and average of marks is  "+sum);
    }
}
public class task_3{
    public static void main(String[] args) { 
        int arr_1[]={23,56,77,90,34}; 
        Student st_1=new Student(arr_1);
        int arr_2[]={23,56,78,90,12};
        Student st_2=new Student("Walid",arr_2); 
        double avg_1=st_1.Avergae();
        double avg_2=st_2.Avergae();
        System.out.println("The student 1 is :");
        st_1.display();
        System.out.println("The student 2 is : ");
        st_2.display();
        if(avg_1>avg_2){
         System.out.println("The first student has better average");
        }
        else if(avg_1==avg_2){
         System.out.println("Both student has same avergae");
        }
        else{
         System.out.println("The student 2  has better average");
        }
        Student st_3=new Student(st_1.getname(),st_2.getmarks());
        System.out.println("The Student 3 has : ");
        st_3.display();
    }
}
