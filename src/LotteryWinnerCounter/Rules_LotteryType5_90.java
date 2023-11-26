package LotteryWinnerCounter;

import java.util.regex.Pattern;

public class Rules_LotteryType5_90 extends Rules {
    private static LotteryType lottery590Instance = new LotteryType5_90();
    private static final String PATTERN0 = "([1-9]|[1-8]\\d|90)";
    private static final Pattern PATTERN = Pattern.compile("(%1$s) (%1$s) (%1$s) (%1$s) (%1$s)".formatted(PATTERN0));

    @Override
    LotteryType getLotteryType() {
        if (lottery590Instance == null) {
            lottery590Instance = new LotteryType5_90();
        }
        return lottery590Instance;
    }
    // Ilyet nem láttam a Factory leírásban - lehet/szokás így singeltonnal kombinálni?
    // Ez a getLotteryType() csak akkor kéne, ha ez az oezstály használná, nem?

    @Override
    Pattern getPattern() {
        return PATTERN;
    }
}
