package lesson_19;
// Инкапсуляция.
/*
  public - виден всем
  privete - закрытый  модификатор доступа, доступен только из кода в том же классе

 */
public class MainLesson_19 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.whoAmI();
        cat.setName("Barsik");
        cat.setAge(3);
        cat.setWeight(5);

        System.out.println("Имя " + cat.getName());
        System.out.println("Возраст " + cat.getAge());
        System.out.println("Вес " + cat.getWeight());


    }
}
