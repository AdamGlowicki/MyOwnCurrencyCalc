import java.util.Scanner;

public class ConsoleReader {

    Scanner scanner = new Scanner(System.in);

    public String getString(String messege) {
        System.out.println(messege);
        return scanner.nextLine();

    } public String getString() {
        return scanner.nextLine();
    }


    public Integer getIntiger(String messege) {
        System.out.println(messege);
        return scanner.nextInt();

    }public Integer getIntiger() {
        return scanner.nextInt();
    }


    public Double getDouble(String messege) {
        System.out.println(messege);
        return scanner.nextDouble();
    }

    public Double getDouble() {
        return scanner.nextDouble();
    }
}
