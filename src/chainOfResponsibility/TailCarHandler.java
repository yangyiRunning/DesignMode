package chainOfResponsibility;

public class TailCarHandler extends CarHandler {

    @Override
    public void handler() {
        System.out.println("组装车尾");
        if (this.carHandler != null) {
            this.carHandler.handler();
        }
    }
}
