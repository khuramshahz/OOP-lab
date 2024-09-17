interface compare{ 
    
    boolean compareObjects(Object o);
}
class InventoryItem implements compare{
    private String name; 
    private int uniqueItemID; 
    InventoryItem(){

    }
    InventoryItem(String name,int uniqueItemID){
        this.name=name;
        this.uniqueItemID=uniqueItemID;
    }
    public String getName() {
        return name;
    }
    public int getUniqueItemID() {
        return uniqueItemID;
    }
    public void setName(String name) {
        this.name = name;
    } public void setUniqueItemID(int uniqueItemID) {
        this.uniqueItemID = uniqueItemID;
    }
    @Override
    public boolean compareObjects(Object o) {
        InventoryItem otherItem = (InventoryItem) o;
        if(this.name==otherItem.name&&this.uniqueItemID==otherItem.uniqueItemID){
            return true;
        }
        else{
            return false;
        }
    }

}

public class Task_3{
    public static void main(String[] args) {
        InventoryItem i1=new InventoryItem("usman",234);
        InventoryItem i2=new InventoryItem("usman",234);
        System.out.println(i1.compareObjects(i2));
    }
    
}
