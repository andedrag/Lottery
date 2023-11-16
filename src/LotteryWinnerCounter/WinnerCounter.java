package LotteryWinnerCounter;

import java.util.List;
import java.util.Set;

public class WinnerCounter {

    private static final byte[] drawNumbers = new byte[Validator.drawCount]; // 5 numbers that has been drawn as winner numbers
    private static final int[] winnerCounts = new int[Validator.drawCount - 1]; // count of winners with 2, 3, 4 and 5 matches respectively
//Mi a helyes megközelítés? Minden találatot megszámláljak (az 1-est is), és csak a nyomtatásnál hagyjam ki? Így rugalmasabb lenne a kód, de ront a hatékonyságon


    int[] countWinners(List<Set<Byte>> ticketList, Set<Byte> winNrs) {
        //TODO stream - ticket list set by set -> countMatchesIn1Ticket(winNrs);
        return winnerCounts;
    }

    private static void countMatchesIn1Ticket(Set<Byte> winNumbers) {
        int count = 0;
        //TODO ellenőrző ciklus (-> merged set size!)
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
    }
}

