package LotteryWinnerCounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.sort;

public class FileProcessor {

    Map<List<Set<Integer>>, Integer> readTicketsList(String ticketsFileName) {
        try {
            int lineCount = (int) Files.lines(Path.of(ticketsFileName)).count();
            if (lineCount > 0 && lineCount <= 10000000) {
                List<String> tickets = Files.readAllLines(Path.of(ticketsFileName));
                System.out.println("READY");
                return prepare(tickets);
            }
                return null;
        } catch (IOException e) { // tovább kéne dobja inkább? Béna itt a 2 return null
            System.out.println("File reading failed.");
            return null;
        }
    }

    private Map<List<Set<Integer>>, Integer> prepare(List<String> tickets) {
        validate(tickets);
        sort(tickets);
        // TODO check: sorok között és sorokon belól is legyen rendezve
        return countCombinations(tickets);
    }

    private Map<List<Set<Integer>>, Integer> countCombinations(List<String> tickets) {
        //TODO
        // minden szelvénykombináció megszámlálása
        //egyedi kombinációk és mellettük számláló (hány db van belőlük a mapben)
        return null;
    }

    private void validate(List<String> tickets) { // ezt használja majd a Console is. Külön osztályba kéne kiemelni inkább
        /*
      TODO
        - szóközök levágása elején, végén
        - felesleges köztes szóközök eliminálása
        - csak számként értelmezhető elemek legyenek benne
        - pontosan 5 db számként értelmezhető eleme legyen
        - regex a fentieket megoldja (check!)
        - minden szám csak egyszer szerepelhet egy sorban --> setekké alakítani a sorokat?
        - log
      */
    }
}
