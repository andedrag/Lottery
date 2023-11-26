package LotteryWinnerCounter;

import java.util.regex.Pattern;

abstract class Rules {

    abstract LotteryType getLotteryType();

    /**
     * regex pattern describing the acceptable format of a lottery ticket in the input file
     */
    abstract Pattern getPattern();
}
