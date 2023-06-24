package Synchronization.AdderSubtractorThirdParty;

public class Count {
    private static int value = 0;
    public static synchronized void incrementValue(int offset){
        value += offset;
    }

    public synchronized int getValue(){
        return value;
    }
}
