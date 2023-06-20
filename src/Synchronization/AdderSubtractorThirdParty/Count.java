package Synchronization.AdderSubtractorThirdParty;

public class Count {
    private int value = 0;
    public synchronized void incrementValue(int offset){
        value += offset;
    }

    public int getValue(){
        return this.value;
    }
}
