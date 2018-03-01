package ru.itis;

import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        File input = new File("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\LinesAndPoints\\src\\input.txt");
        Scanner scanner = new Scanner(input);
        ArrayList<Line> lines = new ArrayList<>();
        ArrayList<Point> points = new ArrayList<>();
        while(scanner.hasNext()){
            points.add(new Point(scanner.nextInt(),scanner.nextInt()));
        }
        points.sort((o1, o2) -> {
            if (o1.getX() > o2.getX()) {
                return 0;
            }
            if (o2.getX() == o1.getX() && o1.getY() > o2.getY()){
                return 0;
            }
            return -1;
        });
        for (int i = 0; i < points.size(); i++){
            lines.add(new Line());
            lines.get(lines.size() - 1).addPoint(points.get(0));
            System.out.print(lines.get(lines.size() - 1).getLastPoint().getX() + " " + lines.get(lines.size() - 1).getLastPoint().getY() + " ; ");
            points.remove(0);
            for (int j = 0; j < points.size(); j++)
            {
                if (lines.get(lines.size() - 1).getLastPoint().getY() <= points.get(j).getY() && lines.get(lines.size() - 1).getLastPoint().getX() <= points.get(j).getX()){
                    lines.get(lines.size() - 1).addPoint(points.get(j));
                    System.out.print(lines.get(lines.size() - 1).getLastPoint().getX() + " " + lines.get(lines.size() - 1).getLastPoint().getY() + " ; ");
                    points.remove(j);
                    j--;
                }
            }
            System.out.println("");
        }
    }
}