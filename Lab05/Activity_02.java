class Date{
    private int day;
    private int month;
    private int year;
    public Date(int m,int d,int y){
        day=checkday(d);
        month=checkmonth(m);
        year=y;
    }
    private int checkmonth(int testmonth){
        if(testmonth>0&&testmonth<=12){
            return testmonth;
        }
        else{
            System.out.println("invalid month  "+testmonth+" set to 1");
            return 1;
        }
    }
    private int checkday(int testday){
        int daysofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(testday>0&&testday<=daysofmonth[month]){
            return testday;
        }
        else if(month==2&&testday==29&&(year%400==0||year%4==0&&year%100!=0)){
            return testday;
        }
        else{
            System.out.println("invalid date "+testday+"set to 1");
            return 1;
        }
    }
        public int getday(){
            return day;
        }
        public int getmonth(){
            return month;
        }
        public int year(){
            return year;
        }
        public void display(){
            System.out.println("day: "+day+" month: "+month+" year "+year);
        }
}
class employee{
    private String name;
    private String fname;
    private Date  birthday;
    private Date hireDate;
    employee(){

    }
    employee(String x,String y,Date birthofday,Date hireofDate){
        name=x;
        fname=y;
        birthday=birthofday;
        hireDate=hireofDate;
    }
    public void setname(String x){
        name=x;
    }
    public void setFanme(String y){
        fname=y;
    }
    public String getname(){
        return name;
    }
    public String getFname(){
        return fname;
    }public void setbirthday(Date b){
        birthday=b;
    }
    public void sethiredate(Date h){
        hireDate=h;
    }
    public Date getbirthday(){
        return hireDate;
    }
    public Date gethireday(){
        return hireDate;
    }
    public void display(){
        System.out.println("Name : "+name+" || Father name :  "+fname);
        birthday.display();
        hireDate.display();
    }
}
public class Activity_02{
    public static void main(String[] args) {
        Date b=new Date(1,12,1990);
        Date h=new Date(5,6,2016);
        employee e1=new employee("XXX","YYYy",b,h);
        e1.display();
    }
}
