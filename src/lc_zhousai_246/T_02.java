package lc_zhousai_246;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/20 10:30 上午
 */
public class T_02 {
    public static void main(String[] args) {
        String start = "20:00";
        String end = "06:00";
        System.out.println(numberOfRounds(start, end));
    }

    public static int numberOfRounds(String startTime, String finishTime) {
        int startHH = Integer.parseInt(startTime.split(":")[0]);
        int startMM = Integer.parseInt(startTime.split(":")[1]);
        int finishHH = Integer.parseInt(finishTime.split(":")[0]);
        int finishMM = Integer.parseInt(finishTime.split(":")[1]);

        int count = 0;
        // 没有通宵
        if (startHH * 60 + startMM <= finishHH * 60 + finishMM) {
            int num = finishHH * 60 + finishMM - (startHH * 60 + startMM);
            if (startMM > 0 && startMM < 15) {
                num = num - (15 - startMM);
            } else if (startMM > 15 && startMM < 30) {
                num = num - (30 - startMM);
            } else if (startMM > 30 && startMM < 45) {
                num = num - (45 - startMM);
            } else if (startMM > 45 && startMM < 60) {
                num = num - (60 - startMM);
            }
            count += num / 15;
        } else {
            int num = 24 * 60  - (startHH * 60 + startMM);
            if (startMM > 0 && startMM < 15) {
                num = num - (15 - startMM);
            } else if (startMM > 15 && startMM < 30) {
                num = num - (30 - startMM);
            } else if (startMM > 30 && startMM < 45) {
                num = num - (45 - startMM);
            } else if (startMM > 45 && startMM < 60) {
                num = num - (60 - startMM);
            }
            count += num / 15;
            count += (finishHH * 60 + finishMM) / 15;
        }
        return count;
    }
}
