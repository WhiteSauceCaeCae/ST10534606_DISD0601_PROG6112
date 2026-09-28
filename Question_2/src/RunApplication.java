import java.util.Scanner;

public class RunApplication{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX" );
        System.out.println("3) SWITCH");
        String consoleType = scanner.nextLine();

        System.out.println("Enter the store: ");
        String store = scanner.nextLine();

        System.out.println("Enter the total sales of PS5 consoles for Number 1 Electronics Store: ");
        int totalSales = scanner.nextInt();

       ConsoleSales console = new ConsoleSales(consoleType,store,totalSales);
       console.printReport();
    }

}


