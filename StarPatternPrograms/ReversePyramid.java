public class ReversePyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 5; i >= 0; i--){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
