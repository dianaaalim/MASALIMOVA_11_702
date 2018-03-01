import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Point> points = new ArrayList<>();
        QuickHull hull = new QuickHull();
        FileReader f = new FileReader("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\QuickHull\\src\\pointsList");
        Scanner reader = new Scanner(f);
        while(reader.hasNextLine()){
            points.add(new Point(reader.nextInt(), reader.nextInt()));
        }

        Point.print(points);
        ArrayList<Point> quickHull = hull.quickHull(points);
        Point.print(quickHull);







    }

}
