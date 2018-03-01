package ru.itis;
import java.util.Scanner;
    public class Ilnur {

        public static double xi(double[] x) {
            double sum = 0;
            for (double aX : x) {
                sum += aX;
            }
            return sum;
        }

        public static double yi(double[] y) {
            double sum = 0;
            for (double aY : y) {
                sum += aY;
            }
            return sum;
        }

        public static double xi2(double[] x) {
            double sum = 0;
            for (double aX : x) {
                sum += aX * aX;
            }
            return sum;
        }

        public static double xiyi(double[] x, double[] y) {
            double sum = 0;
            for (int i = 0; i < x.length; i++) {
                sum += x[i] * y[i];
            }
            return sum;
        }

        public static double y_(double[] y) {
            double sum = 0;
            double k = yi(y) / y.length;
            for (double aY : y) {
                sum += (aY - k) * (aY - k);
            }
            return sum;
        }

        public static double end(double[] x, double[] y, double k, double b) {
            double sum = 0;
            for (int i = 0; i < x.length; i++) {
                double buf = k * x[i] + b;
                sum += (y[i] - buf) * (y[i] - buf);
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double xs[] = new double[n];
            double ys[] = new double[n];
            init(xs);
            init(ys);
            double a = yi(ys) / n;
            double k = (n * xiyi(xs, ys) - xi(xs) * yi(ys)) / (n * xi2(xs) - (xi(xs) * xi(xs)));
            double b = (xi2(xs) * yi(ys) - xi(xs) * xiyi(xs, ys)) / (n * xi2(xs) - xi(xs) * xi(xs));
            double r = Math.sqrt(Math.abs((y_(ys) - end(xs, ys, k, b)) / y_(ys)));


            System.out.println("*************");
            System.out.println("y= " + k + "x+" + "(" + b + ")");
            System.out.println("*************");
            System.out.println("r= " + r);
            System.out.println("*************");


        }

        private static void init(double[] xs) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < xs.length; i++) {
                xs[i] = sc.nextDouble();
            }
        }
    }
