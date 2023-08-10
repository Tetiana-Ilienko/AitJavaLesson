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
    /*
    Пустой конструктор создается по умолчанию. При создании своего конструктора, пустой исчезает - его надо
    прописать вручную(если он нужен)
     */

    public Dog(String name, int jumpHeight) { // Конструктор. Вызовется первым для того, чтобы объект мог существовать
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJump = jumpHeight * 2;
    }

    void whoAmI() {                          // метод
        System.out.println("I am  " + name + ". I can jump  " + jumpHeight + " sm\n");

    }

    void jump() {
        System.out.println("I can jump ");
    }


    void jump(int height) {                                     // перегрузка
        System.out.println("I can jump " + height);
    }

    //----------------------------------------------------------------------------
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
//    -------------------------------------------------------------------------------------
    boolean getBarrier(int barrierHeight) {                      // метод возвращающий boolean переменную
        System.out.println("Ap! Barrier!  " + barrierHeight);

        // 84<=106 &&                     83 < 84
        if (barrierHeight <= maxJump && jumpHeight < barrierHeight) {
            while (jumpHeight <= barrierHeight) {
                System.out.println("I have to training!");
                training();
            }
        }
        boolean result;
        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
            result = true;
        } else {
            System.out.println("I can not jump barrier  " + barrierHeight);
            result = false;
        }
        return result;
    }


    // правильный вариант
    void training() {
        System.out.println("\nStart training:"); // есть собака с тек.прыжок 53, 106 -> барьер -> 105 (бесконечный цикл)
        //2. jump 50 -> maxJump 100 ->
        // jump [0..90] -> if
        if (jumpHeight + 10 <= maxJump) {     // если прыжок меньше мин на 10 от максимально - можем тренироваться
            jumpHeight += 10;
            System.out.println("I have been training");
            whoAmI();
        }
        //-> [91...infinity]
        // [9    100 - [91..inf] < 10 ==> будет true при значения [91-99]
        else if (maxJump - jumpHeight < 10) {
            jumpHeight  = maxJump;
            System.out.println("Small training start");
            whoAmI();
        } else {
            System.out.println("I can't jump any higher than  " + maxJump); // иначе - прыгаем на максимум
        }
        System.out.println("End training. Jumping " + jumpHeight + "\n");
    }
//-----------------------------------------------------------------------------------------
//    void training() {
//        System.out.println(" Start training");
//        while (jumpHeight< maxJump){
//            System.out.println(" I can jump " + jumpHeight + " см");
//            jumpHeight += 10;
//        }
//        System.out.println("I can't jump any higher than" + maxJump);
//    }
}

