public class Zero {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 5; i > 0; i--){
            for( int j = 0; j < n; j++)
            {
                if(i == n || i == 1 || j == 0 || j == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
