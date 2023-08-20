package HomeWork_24;

public class Amateur extends Human{

//    private int speed;    поля прописывать не обязательно, так как они уже прописаны в родительском классе
//    private int timeRest;

//    public Amateur() {
//        super();
//        /*
//        Оператор super(); используется в конструкторе подкласса (наследника) для вызова
//        конструктора суперкласса (родителя). Это позволяет инициализировать состояние объекта,
//        используя конструктор родительского класса перед добавлением дополнительной логики и инициализации
//        в конструкторе подкласса.
//     !!   Если конструктор родительского класса не имеет аргументов, вызов super() можно опустить,
//        так как он будет вызван автоматически.
//         */
//    }

    @Override // Переопределяет метод установки скорости и устанавливает скорость 15.
    public void setSpeed(int speed) {
        super.setSpeed(15);
    }

    @Override //Переопределяет метод установки времени отдыха и устанавливает время отдыха 10.
    public void setTimeRest(int timeRest) {
        super.setTimeRest(10);}


    @Override
        public void canRun(){
        System.out.println("Любитель умеет бегать со скоростью " + getSpeed());
        needForRest();
    }


   public void needForRest(){
        System.out.println(" Любитель, теперь ты должен отдохнуть " + getTimeRest());
    }
}
