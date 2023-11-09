package LotteryWinnerCounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WinnerCounter {

    private static final int[] drawNumbers = new int[Validator.DRAW_COUNT]; // 5 numbers that has been drawn as winner numbers
    private static final int[] winnerCounts = new int[Validator.DRAW_COUNT-1]; // count of winners with 2, 3, 4 and 5 matches respectively

    WinnerCounter(int nr1, int nr2, int nr3, int nr4, int nr5) {
        drawNumbers[0] = nr1;
        drawNumbers[1] = nr2;
        drawNumbers[2] = nr3;
        drawNumbers[3] = nr4;
        drawNumbers[4] = nr5;
        Arrays.sort(drawNumbers);
    }

    int[] countWinners(List<byte[]> ticketList) {
        int count =0;
        //TODO ellenőrző ciklus (-> count!)
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
}

