
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            
            if (input.equals("quit")) {
                break;
            }
            
            String command = parts[0];
            int valor = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (Integer.valueOf(parts[1]) > 0) {
                    if (first + valor <= 100) {
                        first += valor;
                    } else {
                        first = 100;
                    }
                }
            }
            if (command.equals("move")) {
                if(first == 0){
                    second = 0;
                }
                else if(first - valor >= 0 && second + valor <= 100){
                    first -= valor;
                    second += valor;
                }
                else if(first < valor){
                    second = first;
                    first = 0;
                }
                else {
                    first = 0;
                    second = 100;
                }
                
            
            }
            
            if(command.equals("remove")){
                if(second < valor){
                second = 0;
                } else if(second - valor >= 0){
                    second -= valor;
                }
            }
            System.out.println();
        }
    }

}
