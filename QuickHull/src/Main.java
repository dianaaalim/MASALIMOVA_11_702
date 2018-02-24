import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final int DEFAULT_ARRAY_SIZE = 10;
    public static void main(String[] args) throws IOException {
        Point[] points = new Point[DEFAULT_ARRAY_SIZE];
        int size = 0;
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\QuickHull\\src\\pointsList");
        Scanner reader = new Scanner(fileInputStream);

        while((reader.hasNext()) && (size < DEFAULT_ARRAY_SIZE)) {
            String str = reader.nextLine();
            points[size] = new Point();
            points[size].x = str.charAt(0) - '0';
            points[size].y = str.charAt(2) - '0';
            size++;
        }


        for(int i = 0; i < size; i++) {
            points[i].toString();
        }
    }

}
