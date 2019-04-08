package simpleFactory;

import bean.Fruit;

public class SimpleFactory {

    public static Fruit getInstance(String type) {
        try {
            Class<Fruit> fruitClass = (Class<Fruit>) Class.forName(type);
            return fruitClass.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
