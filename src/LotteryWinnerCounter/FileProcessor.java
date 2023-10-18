package LotteryWinnerCounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.sort;

public class FileProcessor {

    Map<Set<Integer>, Integer> readTicketsList(String ticketsFileName) {
        try {
            int lineCount = (int) Files.lines(Path.of(ticketsFileName)).count();
            if (lineCount > 0 && lineCount <= 10000000) {
                List<String> tickets = Files.readAllLines(Path.of(ticketsFileName));
                System.out.println("READY"); // Ez így csalás. LEhet ilyet? Vagy előbb futtassam a cleant, tegyem el változóba, aztán READY és utánA RETURN?
                return clean(tickets);
            } else {
                System.out.println("File length exceeded the acceptable interval.");
                return null;}
        } catch (IOException e) {
            System.out.println("File reading failed.");
            return null;
        }
    }

    private Map<Set<Integer>, Integer> clean(List<String> tickets) {
        Validator validator = new Validator();
        validator.validateAndConvert(tickets);
        return countCombinations(tickets);
    }

    private Map<Set<Integer>, Integer> countCombinations(List<String> tickets) {
        //TODO minden szelvénykombináció megszámlálása
        //egyedi kombinációk és mellettük számláló (hány db van belőlük a mapben)
        return null;
    }
}
