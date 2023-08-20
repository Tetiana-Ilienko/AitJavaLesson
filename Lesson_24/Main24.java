package Lesson_24;
/*
Полиморфизмом   называется возможность работать с несколькими типами так, как будто
это один и тот же тип и в то же время поведение каждого типа будет уникальным в
зависимости от его реализации.
 */

public class Main24 {
    public static void main(String[] args) {


        Cat cat = new Cat(); // Восходящее преобразование. Происходит автоматически
        Dog dog = new Dog();
        Hamster hamster = new Hamster();

        Animal[] animals = new Animal[3]; // так как классы являются наследниками
//        одного класса мы можем сложить их в массив
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = hamster;

        for (Animal animal : animals) { // вызываем наш массив и он поочереди выполняет
            // метод  voice
            animal.voice();
//            метод вызова нисходящего преобразования
            if (animal instanceof Cat) {
                Cat newCat = (Cat) animal; // нисходящее преобразование
                newCat.eat();
            }
        }

        cat.voice();
        dog.voice();
        hamster.voice();

        Object objectCat = new Cat(); //  используя самый выский класс, можем создать
//        новый объект наследника
        /*
        Если в результате присваивания мы двигаемся по цепочке наследования вверх (к типу Object),
        то это — расширение типа (оно же — восходящее преобразование или upcasting), а если вниз, к типу объекта,
        то это — сужение типа (оно же — нисходящее преобразование или downcasting).
         */

        cat.eat(); //вызываем прописанный метод
        /* если мы создадим котика
        Animal cat = new Cat() // выполняем возходящее преобазование
         метод eat  не вызоветься
         у класса Animal нет метода eat
          тип перемееной Animal  не дает обратиться к методу
         */

    }
}
