package tw;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/29 9:04 下午
 */
public class test_5 {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        User u1 = new User("z3", "123", "*");
        User u2 = new User("l4", "456", "*");
        User u3 = new User("w5", "789", "*");
        User u4 = new User("b6", "101", "*");
        User u5 = new User("m7", "112", "*");

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        String username = "m6";
        String password = "112";

        findUserV2(users, username, password);
    }


    public static void findUser(List<User> users, String username, String password) throws Exception {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                System.out.println("登录成功");
                return;
            }
        }
        throw new Exception("用户名或密码错误");
    }

    public static void findUserV2(List<User> users, String username, String password) throws Exception {
        User user = users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst().orElse(null);
        if (user != null)
            System.out.println("登录成功");
        else
            throw new Exception("用户名或密码错误");
    }
}
