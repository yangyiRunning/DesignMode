package factoryMethod;

import bean.Fruit;
import bean.Orange;

public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit getFruitObj() {
        return new Orange();
    }
}
