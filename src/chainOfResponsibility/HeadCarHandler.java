package chainOfResponsibility;

public class HeadCarHandler extends CarHandler {

    @Override
    public void handler() {
        System.out.println("组装车头");
        if (this.carHandler!=null) {
            this.carHandler.handler();
        }
    }
}
