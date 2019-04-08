package factoryMethod;

import bean.Ananas;
import bean.Fruit;

public class AnanasFactory implements FruitFactory {
    @Override
    public Fruit getFruitObj() {
        return new Ananas();
    }
}
