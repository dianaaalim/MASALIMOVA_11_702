import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QuickHull {

    public List<Point> quickHull(ArrayList<Point> points) {

        List<Point> convexHull = new ArrayList<>();
        Point extremeLeft = points.get(0);
        Point extremeRight = points.get(0);

        if (points.equals(null)) {
            throw new IllegalArgumentException("Zero points");
        }
        //Нашли крайние по х точки
        for (Point point : points) {
            if (point.getX() < extremeRight.getX()) {
                extremeRight = point;
            } else {
                if (point.getX() > extremeLeft.getX()) {
                    extremeLeft = point;
                }
            }
        }
        //Создали два списка НадПрямой()Слева и ПодПрямой()Справа
        List<Point> aboveLine = new LinkedList<>();
        List<Point> underLine = new LinkedList<>();


        for (Point point : points) {
            boolean checker = point.isAboveLine(extremeLeft, extremeRight, point);
            if (point.equals(extremeRight) || point.equals(extremeLeft)) {
                continue;
            }
            if (checker) {
                aboveLine.add(point);
            } else {
                underLine.add(point);
            }
        }
        convexHull.add(extremeLeft);
        List<Point> hull = sepsrstor(aboveLine, extremeLeft, extremeRight);
        convexHull.addAll(hull);
        convexHull.add(extremeRight);

        hull = sepsrstor(underLine, extremeRight, extremeLeft);
        convexHull.addAll(hull);


        return convexHull;
    }

    //Метод, который находит расстояние от точки до прямой
    private double distance(Point a, Point b, Point newPoint) {
        double distanceToLine = (Math.abs((b.getY() - a.getY()) * newPoint.getX() - (b.getX() - a.getX()) * newPoint.getY() + b.getX() * a.getY() - b.getY() * a.getX()))
                / (Math.sqrt((Math.pow((b.getY() - a.getY()), 2)) + Math.pow((b.getX() - a.getX()), 2)));
        return distanceToLine;
    }

    //Нахождение самой дальней из точек


    private List<Point> sepsrstor(List<Point> points, Point maxLeft, Point maxRight) {
        List<Point> hull = new ArrayList<>();

        List<Point> listA = new LinkedList<>();
        List<Point> listB = new LinkedList<>();

// Если точек нет или одна
        if (points == null) {
            return hull;
        } else if (points.size() == 1) {
            hull.add(points.get(0));
            return hull;
        }
        Point needPoint = null;
        double maxDistance = 0;
        for (Point point : points) {
            if (distance(maxLeft, maxRight, point) > maxDistance) {
                needPoint = point;
                maxDistance = distance(maxLeft, maxRight, point);
            }

            points.remove(needPoint);

            for (Point anotherPoint : points) {
                if (anotherPoint.isAboveLine(maxLeft, needPoint, anotherPoint)) {
                    listA.add(point);
                } else {
                    if (anotherPoint.isAboveLine(needPoint, maxRight, anotherPoint)) {
                        listB.add(point);
                    }
                }
            }
        }
        points.clear();

        List<Point> PartOfHull = sepsrstor(listA, maxLeft, needPoint);
        hull.addAll(PartOfHull);
        hull.add(needPoint);
        PartOfHull = sepsrstor(listB, needPoint, maxRight);
        hull.addAll(PartOfHull);


        return hull;
    }
}
