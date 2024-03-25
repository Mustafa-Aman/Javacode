public class Droid {
    String name;
    int batteryLevel;
    public Droid(String driodName){
        name = driodName;
        batteryLevel = 100;

    }
    public void performingTask(String string){

    }
    public void startingBattreyLevel(){

    }
    public String toString(){
        return "Hello,I'm the droid: " + name; 
    }
    public void perfromTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10; 
    }
    public void energyReport(){
        System.out.println("my battery level is: "+ batteryLevel);
    }
    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        System.out.println(codey.batteryLevel);
        codey.perfromTask("dancing");
        System.out.println(codey.batteryLevel);
        codey.perfromTask("baking");
        System.out.println(codey.batteryLevel);    

        Droid D1 = new Droid("First driod");
        System.out.println(D1);
        D1.energyReport();
    }
}
