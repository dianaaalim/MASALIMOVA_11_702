import java.util.ArrayList;

public class Point {
    public int x;
    public int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public boolean isAboveLine(Point left, Point right, Point newPoint) {
        int multiply;
        multiply = (right.getX() - left.getX()) * (left.getY() - newPoint.getY())
                - (right.getY() - left.getY()) * (left.getX() - newPoint.getX());
        if (multiply >= 0) {
            //ниже прямой
            return false;
        } else {
            //выше прямой
            return true;
        }
    }

    public static void print (ArrayList<Point> list) {
        Integer[] array = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i).getX();
            System.out.print("(" + array[i] + ";");
            array[i] = list.get(i).getY();
            System.out.print(array[i] + ")" + " ");
        }

    }
}
