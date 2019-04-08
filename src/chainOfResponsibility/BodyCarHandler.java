package chainOfResponsibility;

public class BodyCarHandler extends CarHandler {

    @Override
    public void handler() {
        System.out.println("组装车身");
        if (this.carHandler != null) {
            this.carHandler.handler();
        }
    }
}
