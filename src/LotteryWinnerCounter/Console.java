package LotteryWinnerCounter;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
// sdsdbskhfb
class Console implements AutoCloseable {
    private final Scanner scanner;

    Console() {
        this.scanner = new Scanner(System.in);
    }

    List<Integer> askWinnerNumbers() throws QuitException {
        String input = this.scanner.nextLine();
        if (input.isEmpty()) {
            throw new QuitException("Quitting has been indicated by empty input. Bye!");
        } else {
            return validateInput(input);
        }
    }

    private List<Integer> validateInput(String input) throws InputMismatchException {
        List<Integer> inputList = new ArrayList();
        //TODO
        // regex ellenőrzés
        // -- hiba esetén exception dobás
        // -- valid forma esetén List-té alakítás
        return inputList;
    }

    public void close() {
        this.scanner.close();
    }
}