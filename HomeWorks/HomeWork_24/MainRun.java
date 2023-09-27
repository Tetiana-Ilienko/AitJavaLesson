package HomeWork_24;

public class MainRun {
    public static void main(String[] args) {

        Human human = new Human();
        Amateur amateur = new Amateur();
        Profi profi = new Profi();


        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = amateur;
        humans[2] = profi;

        for (Human hum: humans) {
            hum.canRun();
        }
        /*
        Task 1

Напишите иерархию классов человек -> спортсмен-любитель - > спортсмен-профи У человека есть метод бежать.
Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10,
профи 5 В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
         */


    }
}
