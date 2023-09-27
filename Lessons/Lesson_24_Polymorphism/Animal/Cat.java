package Animal;

public class Cat extends Animal{ // назначаем класс наследником класса Animal


    @Override // переопределенный метод  компиллятор проверит соблюдена ли иерархия родительского метода
    public void voice() { // в классе наследника мы можем этот метод переписать
//        тогда наследник будет вызывать свой уникальный метод
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("I am eating");
    }
}
