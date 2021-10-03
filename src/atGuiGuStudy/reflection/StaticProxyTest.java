package atGuiGuStudy.reflection;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/10/1 3:27 下午
 */

/**
 * 静态代理
 * 特点：代理类和被代理类在编译期间，就确定下来了
 */

interface ClothFactory {
    void produceCloth();
}

// 代理类
class ProxyClothFactory implements ClothFactory {
    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂准备生产。。。");

        factory.produceCloth();

        System.out.println("代理工厂生产完毕。。。");
    }
}

class NikeClothFactory implements ClothFactory {

    @Override
    public void produceCloth() {
        System.out.println("NIKE要生产一些服装...");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        // 创建被代理类的对象
        ClothFactory nike = new NikeClothFactory();
        // 创建代理类对象
        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        // 使用代理类对象进行生产
        proxyClothFactory.produceCloth();
    }
}