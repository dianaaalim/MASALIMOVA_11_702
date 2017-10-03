package ru.itis;

public class Automobile {
    String model;
    String color;
    int power;
    String number;
    int mileage = 0;
          // n Надо ввести с клавиатуры(сканер)


    public Automobile() {
        setPower(power);
        setModel(model);
        setColor(color);
        setNumber(number);

    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        }
        else {
            System.err.println("Некорректное значение мощности");
            System.err.println("Введено значение по умолчанию(0)");
            this.power = 0;
        }

    }
    public int getPower() {
        return power;
    }

    void go(int n) {
        mileage = mileage + n;
        System.out.println("Пробег равен " + mileage + " километрам");
    }

}
