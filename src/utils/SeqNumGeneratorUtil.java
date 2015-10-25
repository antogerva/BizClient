package utils;

public class SeqNumGeneratorUtil {
    private static long seqNumber = 0;
    
    public static long getNumber(){
        seqNumber++;
        return seqNumber;
    }

}
