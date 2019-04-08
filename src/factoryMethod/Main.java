package factoryMethod;

import bean.Fruit;

public class Main {

    public static void main(String[] args) {
        System.out.println("工厂方法模式输出");
        FruitFactory fruitFactory1 = new AppleFactory();
        Fruit fruit1 = fruitFactory1.getFruitObj();
        if (fruit1 != null) {
            System.out.println("生产的第一种水果的名字叫：" + fruit1.getName());
        }
        FruitFactory fruitFactory2 = new BananaFactory();
        Fruit fruit2 = fruitFactory2.getFruitObj();
        if (fruit2 != null) {
            System.out.println("生产的第二种水果的名字叫：" + fruit2.getName());
        }
        FruitFactory fruitFactory3 = new OrangeFactory();
        Fruit fruit3 = fruitFactory3.getFruitObj();
        if (fruit3 != null) {
            System.out.println("生产的第三种水果的名字叫：" + fruit3.getName());
        }
        FruitFactory fruitFactory4 = new AnanasFactory();
        Fruit ananas = fruitFactory4.getFruitObj();
        if (ananas != null) {
            System.out.println("生产的第四种水果的名字叫：" + ananas.getName());
        }
    }
}
