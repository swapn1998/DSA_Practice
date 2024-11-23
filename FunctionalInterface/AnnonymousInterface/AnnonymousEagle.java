package FunctionalInterface.AnnonymousInterface;


public class AnnonymousEagle {

    public static void main(String[] args) {

        Bird eagle = new Bird() {
            @Override
            public void canFly() {
                System.out.println("Eagle can fly above sky......");
            }
        };

        eagle.canFly();

    }


}
