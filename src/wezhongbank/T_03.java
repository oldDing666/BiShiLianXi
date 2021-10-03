package wezhongbank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/23 9:00 下午
 */
public class T_03 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int count = 0;
        for (int i = y1; i <= y2; i++) {
            for (int j = 1; j <= 12; j++) {
                String date = ""+i+"-"+j+"-"+1;
                if(help(date).equals("星期一")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static String help(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat day = new SimpleDateFormat("E");
        Date d = sdf.parse(date);
//        System.out.println(day.format(d));
        return day.format(d);
    }
}
