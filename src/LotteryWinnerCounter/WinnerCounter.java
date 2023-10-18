package LotteryWinnerCounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WinnerCounter {

    private static final int[] drawNumbers = new int[5]; // 5 numbers that has been drdrown and winner numbers
    private static final int[] winnerCounts = new int[4]; // count of winners with 2, 3, 4 and 5 matches respectively

    WinnerCounter(int nr1, int nr2, int nr3, int nr4, int nr5) {
        drawNumbers[0] = nr1;
        drawNumbers[1] = nr2;
        drawNumbers[2] = nr3;
        drawNumbers[3] = nr4;
        drawNumbers[4] = nr5;
        Arrays.sort(drawNumbers);
    }

    int[] countWinners(Map<List<Set<Integer>>, Integer> ticketsAndCombinationCounts) { //Map<Set<Integer>> kéne csak legyen, ezt elírtam pár helyen (FileProcessorban is!)

        //TODO
        ticketsAndCombinationCounts.keySet().stream().forEach(countMatches(entry.getKey())); // hogy adom meg az aktális setet az arra vonatkozó stream lépésen belül argumentumként?
        //találatok számát (2-5 esetén) szorozni kell még az azonos szelvények mennyiségével (Map value)
        //switchnek hol a helye? streambe hogyan tudom beépíteni (vagy a countMatchesbe tenni? vagy önálló method? kell neki a Map value még!)
        switch (count) {
            case 2:
                winnerCounts[0] = count;
                break;
            case 3:
                winnerCounts[1] = count;
                break;
            case 4:
                winnerCounts[2] = count;
                break;
            case 5:
                winnerCounts[3] = count;
                break;
            default:
                // do nothing
        }

        return winnerCounts;
    }

    private int countMatches(Set<Integer> ticketNumbers) { //1 szelvényen megszámolja a találatszámot
        // Biztos lehet egyszerűbb. Ilyesmi , csak boolean helyett true-számlálós kellene: https://stackoverflow.com/questions/8708542/something-like-contains-any-for-java-set
        // Lehetne merge-ölni a két set-et (addAll) --> eredeti méretük összegének és a mergelt set méretének a különbsége adja a találatok számát. Ez lehet, gyorsabb (nem kell iterálni a kihúzott számokkal)
        int count = 0;
        for (int drawNumber : drawNumbers) {
            if (ticketNumbers.contains(Integer.valueOf(drawNumber))) {
                count++;
            }
        }
        return count;
    }
}

