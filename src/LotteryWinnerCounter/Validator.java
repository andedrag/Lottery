package LotteryWinnerCounter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final String NUMBER_PATTERN = "([1-9]|[1-8]\\d|90)";
    private static final Pattern LINE_PATTERN = Pattern.compile("(%1$s) (%1$s) (%1$s) (%1$s) (%1$s)".formatted(NUMBER_PATTERN));

    List<Set<Integer>> validateAndConvert(List<String> tickets) {
        List<Set<Integer>> validatedTickets = new ArrayList<>();
        for (String ticket:tickets ) {


        }
        validate(tickets);
        return convert(tickets);

        /*
      TODO
        - szóközök levágása elején, végén
        - felesleges köztes szóközök eliminálása
        - csak számként értelmezhető elemek legyenek benne
        - pontosan 5 db számként értelmezhető eleme legyen
        - regex a fentieket megoldja (check!)
        - minden szám csak egyszer szerepelhet egy sorban --> setekké alakítani a sorokat?
        - log
      */}

    private Set<Integer> convert(String numbersInLinePatternForm) {
        //TODO
        return null;
    }

    private void validate(String numbers) {
        numbers.trim();
        Matcher m = LINE_PATTERN.matcher(numbers);
        //TODO
            }
}
