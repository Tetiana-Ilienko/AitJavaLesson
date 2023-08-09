public class Dog {

    /*
     Написать класс собака
     имя, высота прыжка
     методы - уметь прыгать и тренироваться ( после тренировки высота прыжка увеличивается на 10 см)
     Максимальная высота, котору может натренировать собака не может быть больше, чем 2 раза высоты
     первоначального прыжка
     */
    String name;
    int jumpHeight;
    int maxJump;

    public Dog(String name, int jumpHeight) { // Конструктор. Вызовется первым для того, чтобы объект мог существовать
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJump = jumpHeight * 2;

    }

    void whoAmI() {
        System.out.println("I am  " + name + ". I can jump  " + jumpHeight + " sm");

    }

    void jump() {
        System.out.println("I can jump ");
    }


    void jump(int height) {                                     // перегрузка
        System.out.println("I can jump " + height);
    }

//    void getBarrier(int barrierHeight) {
//        if (barrierHeight <= maxJump && jumpHeight < barrierHeight) {
//            while (jumpHeight <= barrierHeight) {
//                training();
//            }
//        }
//        if (jumpHeight >= barrierHeight) {
//            jump(barrierHeight);
//            //System.out.println("I can jump");
//        } else {
//
//            System.out.println("I can not jump  " + barrierHeight);
//        }
//    }
    void getBarrier(int barrierHeight) {
        System.out.println("Ap! Barrier!  " + barrierHeight );
        if (barrierHeight <= maxJump && jumpHeight < barrierHeight) {
            while (jumpHeight <= barrierHeight) {
                System.out.println("I have to training!");
                training();
            }
        }
        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
            //System.out.println("I can jump");
        } else {

            System.out.println("I can not jump  " + barrierHeight);
        }
    }


    // правильный вариант
    void training() {
        System.out.println("\nStart training:");
        if (jumpHeight + 10 <= maxJump) {     // если прыжок меньше мин на 10 от максимально - можем тренироваться
            jumpHeight += 10;
            System.out.println("I have been training");
            whoAmI();

        } else {
            System.out.println("I can't jump any higher than  " + maxJump); // иначе - прыгаем на максимум
        }
        System.out.println("End training. Jumping " + jumpHeight);
    }

//    void training() {
//        System.out.println(" Start training");
//        while (jumpHeight< maxJump){
//            System.out.println(" I can jump " + jumpHeight + " см");
//            jumpHeight += 10;
//        }
//        System.out.println("I can't jump any higher than" + maxJump);
//    }


}

