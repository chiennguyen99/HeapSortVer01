package heapsort;


public class SleepTime extends Thread{
    int value; 
    void setValueTime(int value){
        this.value = value; 
    }
    void TestSleep(){

        try {
            
            Thread.sleep(value);
            
        } catch(InterruptedException e){
            
            System.out.println(e);
            
        }

    }
 
}
