package abstractFactory;

import bean.Fruit;

public class Main {

    public static void main(String[] args) {
        System.out.println("抽象工厂模式输出");
        FruitFactory chinaFruitFactory = new ChinaFruitFactory();
        Fruit fruit1 = chinaFruitFactory.getApple();
        System.out.println("中国工厂产出的第一种水果是：" + fruit1.getName());
        Fruit fruit2 = chinaFruitFactory.getBanana();
        System.out.println("中国工厂产出的第二种水果是：" + fruit2.getName());
        Fruit fruit3 = chinaFruitFactory.getOrange();
        System.out.println("中国工厂产出的第三种水果是：" + fruit3.getName());
        Fruit fruit4 = chinaFruitFactory.getAnanas();
        System.out.println("中国工厂产出的第四种水果是：" + fruit4.getName());
        System.out.println();
        FruitFactory usFruitFactory = new USFruitFactory();
        Fruit fruit11 = usFruitFactory.getApple();
        System.out.println("美国工厂产出的第一种水果是：" + fruit11.getName());
        Fruit fruit22 = usFruitFactory.getBanana();
        System.out.println("美国工厂产出的第二种水果是：" + fruit22.getName());
        Fruit fruit33 = usFruitFactory.getOrange();
        System.out.println("美国工厂产出的第三种水果是：" + fruit33.getName());
        Fruit fruit44 = usFruitFactory.getAnanas();
        System.out.println("美国工厂产出的第四种水果是：" + fruit44.getName());
    }
}
