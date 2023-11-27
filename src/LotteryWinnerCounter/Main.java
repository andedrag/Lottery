package LotteryWinnerCounter;

import java.io.IOException;

//bármi
public class Main {
    public static void main(String[] filename) {
        new Main().run(filename[0]);
    }

    private void run(String filename) {
        UserIO.welcome();
        readTickets(filename);
        System.out.println("READY");
        // TODO ask for winner numbers (Console try-catch-csel!)
        // TODO count and report winners
    }

    private void readTickets(String filename) {
        try {
            FileProcessor preparator = new FileProcessor(filename);
            preparator.prepareTicketList();
        } catch (IOException e) {
            System.out.println("File reading failed."); // Kell specifikusabb hibaüzenet?
        }
    }
}