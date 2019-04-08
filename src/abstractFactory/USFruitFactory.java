package abstractFactory;

import bean.Fruit;

public class USFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new USApple();
    }

    @Override
    public Fruit getBanana() {
        return new USBanana();
    }

    @Override
    public Fruit getOrange() {
        return new USOrange();
    }

    @Override
    public Fruit getAnanas() {
        return new USAnanas();
    }
}
