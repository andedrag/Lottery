package LotteryWinnerCounter;

interface LotteryType {

    byte getMinValue();

    byte getMaxValue();

    byte getPickCount(); //how many picks you can have in that specific lottery type

    byte getMinMatchCountToWin(); // from how many matches you can win
}
