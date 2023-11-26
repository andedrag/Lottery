package LotteryWinnerCounter;

import java.util.List;
import java.util.Set;

class WinnerCounter {
    // Amit a factoryval elkezdtem, hogy könnyen módosítható legyen a kód más típusú lottókra, az itt még teljesen hiányzik, és így ellentmondásos a koncepcióm :(

    private static LotteryType lottery5_90 = new LotteryType5_90();
    private static final byte[] DRAW_NUMBERS = new byte[lottery5_90.getPickCount()];

    /**
     * count of winners with 2, 3, 4 and 5 matches respectively
     * Array size = as many match count options there are
     */
    private static final int[] WINNER_COUNTS = new int[lottery5_90.getPickCount() - lottery5_90.getMinMatchCountToWin() + 1];


    int[] countWinners(List<Set<Byte>> ticketList, Set<Byte> winNrs) {
        //TODO stream - ticket list set by set -> countMatchesIn1Ticket(winNrs);
        return WINNER_COUNTS;
    }

    private static void countMatchesIn1Ticket(Set<Byte> winNumbers) {
        int count = 0;
        //TODO ellenőrző ciklus (-> merged set size!)
        switch (count) {
            case 2:
                WINNER_COUNTS[0] = count;
                break;
            case 3:
                WINNER_COUNTS[1] = count;
                break;
            case 4:
                WINNER_COUNTS[2] = count;
                break;
            case 5:
                WINNER_COUNTS[3] = count;
                break;
            default:
                // do nothing
        }
    }
}

