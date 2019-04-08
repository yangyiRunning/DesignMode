package factoryMethod;

import bean.Banana;
import bean.Fruit;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruitObj() {
        return new Banana();
    }
}
