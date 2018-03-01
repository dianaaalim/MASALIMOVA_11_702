package ru.itis.TwoSameNum;

/*Вводится n целых чисел
Проверить что среди них существует ровно два таких числа что их цифры либо все четные либо все нечетные
*/
public class FinderTwoSame {
    public boolean checker(int[] array){
        int countCountable = 0; // кол-во четных
        int countOdd = 0; // кол-во нечетных
        for(int i = 0; i < array.length; i++){
            boolean isSuitable = true; //подходил ли нам число
            int res;
            boolean isCountable; // цифры в числе четные или не четные

            if ((array[i]%10)%2 == 0){
                isCountable = true;
            } else {
                isCountable = false;
            }
            while(array[i] > 0 && isSuitable){
                res = array[i] % 10; // берем последнюю цифру числа
                array[i] = array[i] / 10;
                if(res % 2 == 0) { // узнаем цифра четная или не четная
                    if(isCountable != true){
                        isSuitable = false;
                    }
                } else {
                    if(isCountable == true){
                        isSuitable = false;
                    }
                }
            }
            if(isSuitable){
                if(isCountable){
                    countCountable++;
                } else {
                    countOdd++;
                }
            }
        }
        if(countCountable == 2 || countOdd == 2){
            return true;
        } else {
            return false;
        }

    }
}
