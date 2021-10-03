package hengsheng_09_23;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/23 5:52 下午
 */
public class T_01 {
    public static void main(String[] args) {
//        float f = 11.1;
        double d = 5.3E12;
        double d2 = 3.14159;
        double d3 = 3.14D;
        int a[] = new int[]{1,3,5,2,4,6};
        String strs[] = new String[]{"111"};
        System.out.println(strs.length);

        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println(max);
        System.out.println(min);

//        select p.id, p.name, t.content from person as p
//        left join task as t
//        on p.id = t.person_id
//        order by p.id;
//
//        select d.dept_name, count(e.dept_no) from emp as e
//        left join dept as d
//        on e.dept_no = d.dept_no
//        group by e.dept_no
//        order by count(e.dept_no) desc;
    }
}
