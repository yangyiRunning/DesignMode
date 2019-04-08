package factoryMethod;

import bean.Apple;
import bean.Fruit;

public class AppleFactory implements FruitFactory {

    @Override
    public Fruit getFruitObj() {
        return new Apple();
    }
}
