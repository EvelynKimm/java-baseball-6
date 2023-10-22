package baseball.control;

import static baseball.model.NumConst.MAX_NUMBER;
import static baseball.model.NumConst.MIN_NUMBER;
import static baseball.model.NumConst.NUM_LENGTH;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class ComputerControl {
    public static List<Integer> generateRandomNum() {
        List<Integer> computerNum = new ArrayList<>();
        while (computerNum.size() < NUM_LENGTH) {
            int randomNum = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (!computerNum.contains(randomNum)) {
                computerNum.add(randomNum);
            }
        }
        return computerNum;
    }
}