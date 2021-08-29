package demo4.com;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/29-4:04 下午
 * @motto: Never say die Never give up
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add is in use..............");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update is in use ..............");
        return id;
    }
}
