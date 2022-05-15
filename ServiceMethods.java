import java.util.Random;

public class ServiceMethods {
    private static int[] StartVector;
    // Метод создания массива int длинной из 30 элеметов
    public static int [] fillRandomDataList() {
        Random random = new Random();
        StartVector = random.ints(100000, 1,
                        100000)
                .toArray();
        return StartVector;
    }
    // Процедура посиска максимального значения в массиве
     public static int  findMaxNumInArray (int [] array){
        int max = 0;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }
    // Печатаем масссив
    public static void printMass(int [] M){
        for (int i: M) System.out.print( i + " ");
    }
}
