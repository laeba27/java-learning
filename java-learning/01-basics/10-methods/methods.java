// package java-learning.01-basics.10-methods;

class Computer{
    public void playmusic(){
        //void- when you dont want to return anything from the method
        System.out.println("Playing music...");     
    }
    public String getMePen(int cost){ 
        //return type- when you want to return something from the method
    
        if(cost>=10)
        return "Here is your pen";
        else 
        return "Not enough money";
    }
}
public class methods {
    
    public static void main(String a[]) {
       Computer mycomputer = new Computer();
       mycomputer.playmusic(); //method call
       String pen = mycomputer.getMePen(8); //method call
       System.out.println(pen);
    }
}
