/**
 * Created by santiago on 20/06/16.
 */
public class PrefixSum {
    public int[] getPrefixSum(int[] A) {
        int[] prefixSum = new int[A.length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= A.length; i++) {
            prefixSum[i] = prefixSum[i-1] + A[i-1];
        }
        return prefixSum;
    }
    public int countTotal(int[] A, int initPos,int finalPos){
        int[] prefixSum = getPrefixSum(A);
        return prefixSum[finalPos + 1]- prefixSum[initPos];
    }
}
