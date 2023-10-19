package HWork6.scr;

import java.util.List;

public class Spisok{
    
    public static double calculationAverageValue(List<Integer> numbers){ // Расчет среднего значения списка чисел
        int sum = 0;
        for (int number: numbers){
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public static String compareAverages(List<Integer> numbers1, List<Integer> numbers2){
        double average1 = calculationAverageValue(numbers1);
        double average2 = calculationAverageValue(numbers2);
        if (average1 > average2){
            return "Среднее значение 1-го списка (" + average1 + ") больше среднего значения 2-ого списка (" + average2 + ").";
        } else if (average1 < average2){
            return "Среднее значение 2-го списка (" + average2 + ") больше среднего значения 1-ого списка (" + average1 + ").";
        } else {
            return "Средние значения списков равны (" + average1 + ").";
        }
    }
}