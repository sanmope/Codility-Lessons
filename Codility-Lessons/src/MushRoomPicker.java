/**
 * Created by santiago on 20/06/16.
 */
public class MushRoomPicker {
    public int getMaxMushRooms(int[] A,int initPossition,int moves){
        int endOfRoad= A.length - 1;
        int leftPossition = 0;
        int rightPossition = 0;
        int result = 0;
        PrefixSum prefixSum = new PrefixSum();
        for (int pos=0; pos <= min(initPossition,moves); pos++){
            leftPossition = initPossition - pos;
            rightPossition = min(endOfRoad,max(initPossition,initPossition+moves - 2*pos));
            result = max (result,prefixSum.countTotal(A,leftPossition,rightPossition));
        }
        for (int pos=0; pos <= min(endOfRoad-initPossition,moves); pos++){
            leftPossition = max(0,min(initPossition,moves-2*pos));
            rightPossition = initPossition+pos;
            result = max (result,prefixSum.countTotal(A,leftPossition,rightPossition));
        }
        return result;
    }
    private int min(int a,int b){
        if(a<=b) return a;
        else return b;
    }
    private int max(int a,int b){
        if(a>=b) return a;
        else return b;
    }
}
