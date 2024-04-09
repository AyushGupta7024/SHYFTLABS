import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index = findIndex();
        System.out.println("Output: " + index);
    }

    public static int findIndex() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == -1) {
                return count;
            }
            count++;
        }
        return 0; 
    }
}