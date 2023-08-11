package lesson_19;

public class Cat {

    private String name;    //  инкапсуляция, пользователь не может напрямую присваивать значения полям класса
    // privete -  модификатор доступа
    private double weight;
    private int age;

    //  конструкторы
    //---------------------------------------------------------------------------------------------------------

    public Cat() {
    }

    public Cat(String catName, double weight, int age) {
        name = catName;
        this.weight = weight;
        this.age = age;
    }
    //           геттеры и сеттеры
    //-------------------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        if(weight < 0){
            weight = 0;
        } else {
        this.weight = weight;}
    }


    // методы
//-----------------------------------------------------------------------------------------------------------
    void whoAmI() {
        System.out.println("Я котик " + name + " и я вешу " + weight + "кг." + " Мне " + age + " лет" + "Мяу!");
    }

    void startTraining(int laps) {
        System.out.println("Старт тренировки с  " + laps + " кругами");

        for (int i = 0; i < laps; i++) {
            System.out.println("Круг № " + (i + 1));
            run();  // ==> this.run();
            System.out.println("end lap \n");
        }
    }

    void run() {
        while (weight <= 2) {
            System.out.println("Я слишком голоден и слишком худой! Бегать не могу!! мой вес " + weight);
            eat();
            System.out.println("мой вес после еды " + weight);
        }
        System.out.println("Я бегу! Ох, как тяжело...( " + weight);
        weight -= 2;
    }

    void eat() {
        System.out.println("Я кушаю!");
        weight++;
    }


}
