package LotteryWinnerCounter;

import java.util.Scanner;
import java.util.Set;

class UserIO implements AutoCloseable {
    private static UserIO instance;
    private final Scanner scanner = new Scanner(System.in);

    private UserIO() {
    }

    static UserIO getInstance() {
        if (instance == null) {
            instance = new UserIO();
        }
        return instance;
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
                input = scanner.nextLine();
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
        System.out.println(""); //TODO
    }

    @Override
    public void close() throws Exception {
        //TODO COnsole-t a Main-ben majd try-with-resources-zal hívni, hogy a scanner be is záródjon.
    }

}