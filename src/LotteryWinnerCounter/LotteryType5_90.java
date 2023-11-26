package LotteryWinnerCounter;

public class LotteryType5_90 implements LotteryType {

    private static final byte MIN_VALUE = 1;
    private static final byte MAX_VALUE = 90;
    private static final byte PICK_COUNT = 5;
    private static final byte MIN_MATCH_COUNT_TO_WIN = 2;


    @Override
    public byte getMinValue() {
        return MIN_VALUE;
    }

    @Override
    public byte getMaxValue() {
        return MAX_VALUE;
    }

    @Override
    public byte getPickCount() {
        return PICK_COUNT;
    }

    @Override
    public byte getMinMatchCountToWin() {
        return MIN_MATCH_COUNT_TO_WIN;
    }
}
