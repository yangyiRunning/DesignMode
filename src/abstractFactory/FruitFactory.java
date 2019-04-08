package abstractFactory;

import bean.Fruit;

public interface FruitFactory {

    Fruit getApple();

    Fruit getBanana();

    Fruit getOrange();

    Fruit getAnanas();
}
