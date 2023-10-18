package LotteryWinnerCounter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final String NUMBER_PATTERN = "([1-9]|[1-8]\\d|90)";
    private static final Pattern LINE_PATTERN = Pattern.compile("(%1$s) (%1$s) (%1$s) (%1$s) (%1$s)".formatted(NUMBER_PATTERN));
    private static final int DRAW_COUNT = 5;

    List<Set<Integer>> validateAndConvert(List<String> tickets) {
        List<Set<Integer>> validatedTickets = new ArrayList<>();
        for (String ticket:tickets) {
            ticket.trim();
            Matcher m = LINE_PATTERN.matcher(ticket);
            if (!m.matches()) {
                //TODO log
            } else {
                Set<Integer> ticketAsSet = convert(ticket, m);
               if ()
            validatedTickets.add(convert(ticket));
            }
        }
        //TODO log
        return validatedTickets;

        /*
      TODO

        - minden szám csak egyszer szerepelhet egy sorban --> setekké alakítani a sorokat?
        - log
      */}

    private Set<Integer> convert(String numbersInLinePatternForm, Matcher m) {
        Set<Integer> ticketAsSet = new HashSet<>();
        //TODO convert algorythm
        if (ticketAsSet.size() != DRAW_COUNT) {
            //TODO log - ticket dropped due to repeated numbers within
            return null;
        }
        return ticketAsSet;
    }

    private void validate(String numbers) {


            }
}
