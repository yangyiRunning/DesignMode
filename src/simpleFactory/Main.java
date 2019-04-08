package simpleFactory;

import bean.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("简单工厂模式输出");
        Fruit fruit1 = SimpleFactory.getInstance(Apple.class.getName());
        if (fruit1 != null) {
            System.out.println("生产的第一种水果是：" + fruit1.getName());
        }
        Fruit fruit2 = SimpleFactory.getInstance(Banana.class.getName());
        if (fruit2 != null) {
            System.out.println("生产的第二种水果是：" + fruit2.getName());
        }
        Fruit fruit3 = SimpleFactory.getInstance(Orange.class.getName());
        if (fruit3 != null) {
            System.out.println("生产的第三种水果是：" + fruit3.getName());
        }
        Fruit fruit4 = SimpleFactory.getInstance(Ananas.class.getName());
        if (fruit4 != null) {
            System.out.println("生产的第四种水果是：" + fruit4.getName());
        }
    }
}
