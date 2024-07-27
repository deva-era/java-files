import java.util.Scanner;
public class rows {
    int rows;
    int columns;
    public static void main(String[] args) {
        rows rows=new rows();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.print("enter number of rows: ");
            rows.rows=scanner.nextInt();
            System.out.print("enter number of columns: ");
            rows.columns=scanner.nextInt();
            System.out.print("enter the symbol: ");
            String symbol=scanner.next();
            for (int i = 0; i < rows.rows; i++) {
                for (int j = 0; j < rows.columns; j++) {
                    System.out.print(symbol);
                }
            System.out.println("");    
            }
            System.out.print("enter the length: ");
            int length=scanner.nextInt();
            for (int i = 1; i <= length; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(symbol);
                }
            System.out.println("");    
            }
        }
          

 }      
}