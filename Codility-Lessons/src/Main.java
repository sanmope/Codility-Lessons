public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.arraySol();
        System.out.println("Array of length: " + solution.arraySol().length);
        
        for (int pos: solution.arraySol()){
            System.out.println("Possition: " + pos);
        }
    }
}
