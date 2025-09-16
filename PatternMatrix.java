import java.util.Scanner;

public class PatternMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        char ch = sc.next().charAt(0); 
        int n = sc.nextInt();          

        int[][] matrix = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean fill = false;

                switch (ch) {
                    case 'Z': 
                        if (i == 0 || i == n - 1 || j == n - 1 - i) fill = true;
                        break;
                    case 'D': 
                        if (j == i || j == n - 1 - i) fill = true;
                        break;
                    case 'A': 
                        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) fill = true;
                        break;
                    case 'X': 
                        if (j == i || j == n - 1 - i) fill = true;
                        break;
                    default:
                        System.out.println("Invalid pattern type");
                        return;
                }

                if (fill) {
                    matrix[i][j] = 1; 
                    sum += matrix[i][j];
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        
        System.out.println("Pattern Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the sum
        System.out.println("Sum of pattern values: " + sum);
        sc.close();
    }
}
