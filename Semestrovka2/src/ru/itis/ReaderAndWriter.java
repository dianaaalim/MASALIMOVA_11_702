package ru.itis;

import java.io.*;

import static ru.itis.Main.AMOUNT;

public class ReaderAndWriter {
    public static void writer() {
        int number;
        try(FileWriter writer = new FileWriter("C:\\Users\\Администратор.NOUTFNP-PC\\Desktop\\MASALIMOVA_11_702\\Semestrovka2\\src\\ru\\itis\\file.txt", false))
        {
            for (int i = 0; i < AMOUNT; i++ ) {
                number = (int) (Math.random() * 10000);
                writer.write(String.valueOf(number));
                writer.write('\n');
            }
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writerAnswer(int[] array) {
        int number;
        try(FileWriter writer = new FileWriter("C:\\Users\\Администратор.NOUTFNP-PC\\Desktop\\MASALIMOVA_11_702\\Semestrovka2\\src\\ru\\itis\\fileAnswer.txt", false))
        {
            for (int i = 0; i < AMOUNT; i++ ) {
                number = array[i];
                writer.write(String.valueOf(number));
                writer.write('\n');
            }
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int[] reader() {
        int[] array = new int[AMOUNT];
        try{
            FileInputStream fstream = new FileInputStream("C:\\Users\\Администратор.NOUTFNP-PC\\Desktop\\MASALIMOVA_11_702\\Semestrovka2\\src\\ru\\itis\\file.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int i = 0;
            while ((strLine = br.readLine()) != null && i < AMOUNT){

                array[i] = Integer.parseInt(strLine);
                i++;
            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }
        return array;

    }
}
