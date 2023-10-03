package LotteryWinnerCounter;

public class Main {
    public static void main(String[] filename) {
        new Main().run(filename);
    }

    private void run(String... filename) {
        // read and prepare file
        FileProcessor Preparator = new FileProcessor();
        Preparator.readTicketsList(String.valueOf(filename)); //miért kérte az IntelliJ ezt a wrapet?
        // TODO ask for winner numbers
        // TODO count and report winners

    }
}