package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        CarHandler headCarHandler1 = new HeadCarHandler();
        CarHandler bodyCarHandler1 = new BodyCarHandler();
        CarHandler tailCarHandler1 = new TailCarHandler();
        System.out.println("组装顺序一：车头->车身->车尾");
        headCarHandler1
                .setNextCarHandler(bodyCarHandler1)
                .setNextCarHandler(tailCarHandler1);
        headCarHandler1.handler();

        CarHandler headCarHandler2 = new HeadCarHandler();
        CarHandler bodyCarHandler2 = new BodyCarHandler();
        CarHandler tailCarHandler2 = new TailCarHandler();
        System.out.println("组装顺序二：车身->车头->车尾");
        bodyCarHandler2
                .setNextCarHandler(headCarHandler2)
                .setNextCarHandler(tailCarHandler2);
        bodyCarHandler2.handler();

        CarHandler headCarHandler3 = new HeadCarHandler();
        CarHandler bodyCarHandler3 = new BodyCarHandler();
        CarHandler tailCarHandler3 = new TailCarHandler();
        System.out.println("组装顺序三：车尾->车身->车头");
        tailCarHandler3
                .setNextCarHandler(bodyCarHandler3)
                .setNextCarHandler(headCarHandler3);
        tailCarHandler3.handler();
    }
}
