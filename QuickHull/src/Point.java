public class Point{
    public int x;
    public int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        System.out.print("(" + x + ";" + y + ") ");
        return "";
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
}
