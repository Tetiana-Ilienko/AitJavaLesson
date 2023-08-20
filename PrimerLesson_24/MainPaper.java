package PrimerLesson_24;

public class MainPaper {
    public static void main(String[] args) {
        Paper paper = new Paper();

        Marker marker = new Marker();
        Pencil pencil = new Pencil();
        Brush brush = new Brush();
        Pen pen = new Pen();

        paper.drawFigureOnMe("Круг", pencil);
        paper.drawFigureOnMe("Квадрат", brush);
        paper.drawFigureOnMe("Квадрат", marker);
        paper.drawFigureOnMe("Что-то", pen);
    }

    }


