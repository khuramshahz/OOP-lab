class Time{
    int hr;
    int second;
    int minutes;
    Time(){
        hr=6;
        second=9;
        minutes=54;
    }
    Time(int hr,int second,int minutes){
        this.minutes=minutes;
        this.hr=hr;
        this.second=second;
    }
    void Display(){
        System.out.println("Hours:    "+hr+"\nMinutes: "+minutes+"\nSeconds:  "+second);
    }
}
public class labtask_5{
    public static void main(String[] args) {
        Time set=new Time();
        System.out.println("Time:  1");
        set.Display();
        set=new Time(6,8,56);
        System.out.println("Time:  2");
        set.Display();   
    }
}
