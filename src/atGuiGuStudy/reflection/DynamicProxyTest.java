package atGuiGuStudy.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/1 3:58 下午
 */
interface Human {
    String getBelief();

    void eat(String food);
}

class SuperMan implements Human {

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("I love eat " + food);
    }
}

/**
 * 要想实现动态代理，需要解决的问题?
 * 问题一:如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
 * 问题二:当通过代理类的对象调用方法a时，如何动态的去调用被代理类中的同名方法a。
 */
class ProxyFactory {
    // 调用此方法，返回一个代理类的对象。解决问题一
    public static Object getProxyInstance(Object obj) {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj; // 需要使用被代理类的对象进行赋值

    public void bind(Object obj) {
        this.obj = obj;
    }

    /**
     * 当我们通过代理类的对象，调用方法a时，就会自动调用如下的方法：invoke()
     * 将被代理类要执行的方法a的功能就声明在invoke()中
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // method: 即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        // obj: 被代理类的对象
        Object returnValue = method.invoke(obj, args);
        return returnValue;
    }
}


public class DynamicProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        // 代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        // 当通过代理类对象调用方法时，会自动调用被代理类中，同名的方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("火锅");

        System.out.println("**********再一个例子**********");
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
        proxyClothFactory.produceCloth();
    }
}
