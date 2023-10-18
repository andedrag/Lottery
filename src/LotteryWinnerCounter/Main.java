package LotteryWinnerCounter;

public class Main {
    public static void main(String[] filename) {
        new Main().run(filename[0]);
    }

    private void run(String filename) {
        // read and prepare file
        FileProcessor preparator = new FileProcessor();
        preparator.readTicketsList(filename);
        // TODO ask for winner numbers
        // TODO count and report winners

    }
}