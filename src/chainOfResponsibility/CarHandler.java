package chainOfResponsibility;

public abstract class CarHandler {

    protected CarHandler carHandler;

    public CarHandler setNextCarHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public abstract void handler();
}
