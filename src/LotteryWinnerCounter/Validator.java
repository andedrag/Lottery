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
                //TODO log - ticket dropped due to wrong format
            } else {
                Set<Integer> ticketAsSet = convert(m);
                validatedTickets.add(Objects.requireNonNull(ticketAsSet));
            }
        }
        //TODO log
        return validatedTickets;
    }
    // convert 1 Lottery ticket from String to Set
    // String parameter should be already validated for LINE_PATTERN
    // returns null if numbers were repeated within a ticket
    private Set<Integer> convert(Matcher m) {
        Set<Integer> ticketAsSet = new HashSet<>();
        for (int i = 1; i <= DRAW_COUNT; i++) {
            ticketAsSet.add(Integer.valueOf(m.group(i)));
        }
        if (ticketAsSet.size() != DRAW_COUNT) {
            //TODO log - ticket dropped due to repeated numbers within
            return null;
        }
        return ticketAsSet;
    }
}
