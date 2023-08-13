package homeWork_19;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Dolly");
        dog.setBreed("Bobtail");
        dog.setAge(11);
        dog.setHeightJump(43);
        dog.whoAmI();

//        System.out.println(dog.getAge());
//        System.out.println(dog.getHeightJump());

//        dog.jump();
//        dog.training();
//        dog.jump();
          System.out.println("________________________");
//        for (int i =0; i <5; i++){
//            dog.training();
//        }
//        dog.getBarrier(85);
        int[] barrierArray = {-1, 25, 159, 100, 79};
        for (int barrier: barrierArray) {
            dog.getBarrier(barrier);

        }

    }
}
