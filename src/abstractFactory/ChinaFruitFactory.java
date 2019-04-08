package abstractFactory;

import bean.Fruit;

public class ChinaFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new ChinaApple();
    }

    @Override
    public Fruit getBanana() {
        return new ChinaBanana();
    }

    @Override
    public Fruit getOrange() {
        return new ChinaOrange();
    }

    @Override
    public Fruit getAnanas() {
        return new ChinaAnanas();
    }
}
