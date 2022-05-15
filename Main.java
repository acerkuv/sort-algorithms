import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Варианты сортировок масивов iht[10K]");

        //Соритировка пузырьком
        ChoiceSort choiceSort = new ChoiceSort();
        // Создаем рандомныей массив длинной  int[100K]
        int [] RandMass = ServiceMethods.fillRandomDataList();
        // Выводимм массив на экран
//        ServiceMethods.printMass(RandMass);

        // Сортировка выбором
        double startTime = System.currentTimeMillis();
        choiceSort.fillSortedArray(RandMass);
        double endTime = System.currentTimeMillis();
        System.out.println("Сортировка выбором " + (endTime - startTime)+ " ms");

        // Сортировка пузырьком
        int [] RandMass3 = ServiceMethods.fillRandomDataList();
        double startTime3 = System.currentTimeMillis();
        BubbleSortAlg.bubbleSort(RandMass3);
        double endTime3 = System.currentTimeMillis();
        System.out.println("Сортировка пузырьком " + (endTime3 - startTime3)+ " ms");

        // Стандартная сортировка
        int [] RandMass2 = ServiceMethods.fillRandomDataList();
        double startTime2 = System.currentTimeMillis();
        Arrays.sort(RandMass2);
        double endTime2 = System.currentTimeMillis();
        System.out.println("Стандартная сортировка " + (endTime2 - startTime2) + " ms");

        //Сортировка
    }
}
