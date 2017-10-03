package ru.itis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
	    Automobile automobile = new Automobile( );
	    automobile.setColor("Белый");
	    automobile.setModel("BMW x5");
	    automobile.setNumber("М213КС");
	    automobile.setPower(400);
	    automobile.go(n);
		System.out.println(automobile.getColor());
		System.out.println(automobile.getModel());
		System.out.println(automobile.getNumber());
		System.out.println(automobile.getPower());

	}
}
