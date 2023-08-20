package PrimerLesson_24;

public class Paper {
    public void drawFigureOnMe(String figure, Pen pen){ //  бумага может принимать pen -  можно подставить
                                                        // любой метод наследника
        pen.draw(figure);
    }
}
