import java.util.Scanner;

public class Menu {

    private ConsoleReader reader = new ConsoleReader();
    private ConsolePrinter printer = new ConsolePrinter();


    public Menu(){
        this.init();
    }

    private void init() {
        this.aboutProgram();
    }

    private void aboutProgram() {
        printer.print("bla bla o programie i opcjach ");
    }

    private void menuOpcjon() {

        Calculator calc = new Calculator();

        do {
            String choice = reader.getString();

            switch (choice) {
                case "calc":


            }
        } while (true);
    }
}
