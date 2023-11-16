package LotteryWinnerCounter;

import java.util.Scanner;
import java.util.Set;

class Console implements AutoCloseable {
    private final Scanner scanner;

    Console() {
        this.scanner = new Scanner(System.in);
    }

    Set<Byte> askWinnerNumbers() throws QuitException {
        printTutorials();
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new QuitException("Quitting has been indicated by empty input. Bye!");
            // TODO nem user friendly már az első esetnél is így lépni ki, mert ott valószínű, hogy véletlen volt az enter
        } else {
            Set<Byte> inputSet = Transformer.fromStringToByteSet(input);
            while (!Validator.isValidTicket(inputSet)) {
                warnForInvalidInput();
            }
            return inputSet;
        }
    }

    private void warnForInvalidInput() {
        System.out.println("Please make sure you type 5 space-separated 0-90 numbers");
    }

    private void printTutorials() {
        //TODO
    }


    static void welcome() {
        //TODO
    }

    public void close() {
        this.scanner.close();
    } //TODO hol zárom be?!
}