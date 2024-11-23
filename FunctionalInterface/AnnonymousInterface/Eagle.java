package FunctionalInterface.AnnonymousInterface;

public class Eagle implements Bird {

    @Override
    public void canFly() {
        System.out.println("Eagle can fly");
    }

    public static void main(String[] args) {

        Bird eagleObject = new Eagle();
        eagleObject.canFly();

    }

}
