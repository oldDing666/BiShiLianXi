package JZOffer_v1;

import java.util.Map;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 11:35 上午
 */
public class T_11 {
    public int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i - 1])
                continue;
            if (numbers[i] <= numbers[i - 1] && numbers[i] < numbers[i + 1]
                    || numbers[i] < numbers[i - 1] && numbers[i] <= numbers[i + 1]
            )
                return numbers[i];
        }
        return Math.min(numbers[0], numbers[numbers.length - 1]);
    }
}
