package demo4.com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/29-4:05 下午
 * @motto: Never say die Never give up
 */
public class JDKProxy {
    public static void main(String[] args) {
//        创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();

        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result:" + result);
    }
}

class UserDaoProxy implements InvocationHandler {
    //    1.把创建的是谁的代理对象，把谁传递过来
//    有参构造传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        方法之前处理
        System.out.println("方法之前执行。。。。。。。" + method.getName() + "::传递的参数" + Arrays.toString(args));

//        被增强的方法执行
        Object res = method.invoke(obj, args);


//        方法之后处理
        System.out.println("方法之后执行。。。" + obj);


        return res;
    }
}