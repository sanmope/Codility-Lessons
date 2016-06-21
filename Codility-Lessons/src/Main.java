public class Main {

    public static void main(String[] args) {
        int[] A = new int[4];
        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 0;
//        A[4] = 0;
//        A[5] = 0;
//        A[6] = 0;
//        A[7] = 1;
//        A[8] = 0;
//        A[9] = 1;
        
        for (int pos : A) {
            System.out.println("Possition: " + pos);
        }
        Adjacency adjacency = new Adjacency();
        System.out.println(adjacency.solution(A));        
    }
}
