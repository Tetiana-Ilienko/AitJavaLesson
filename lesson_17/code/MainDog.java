public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Dolly", 50);
        dog.whoAmI();
        dog.jump();
//        dog.training();
//        dog.training();
        for (int i=0; i<7; i++){
            dog.training();
        }
        System.out.println("++++++++++++++++++++++++");
        Dog dog1 = new Dog("Rex", 150);
//        int barrier = 120;
//        dog1.getBarrier(barrier);
//        System.out.println("++++++++++++++++++++++++");
//        barrier =180;
//        dog1.getBarrier(barrier);
        int[] barriers = {120,180,160,280,350,50};
        for (int barrier:barriers) {
            dog1.getBarrier(barrier);
        }



    }
}
