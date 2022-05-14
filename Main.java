
public class Main {
    public static void main(String[] args) {
        //Соритировка пузырьком
        System.out.println("Сортировка пузырьком");
        BubbleSort bubbleSort = new BubbleSort();
        // Создаем рандомныей массив длинной 20 int
        int [] RandMass = ServiceMethods.fillRandomDataList();
        // Выводимм массив на экран
        ServiceMethods.printMass(RandMass);
        System.out.println();

        // Вряемя старта
        double startTime = System.nanoTime();
        ServiceMethods.printMass(bubbleSort.fillSortedArray(RandMass));

        //Время завершения
        double endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println('\n' + "Время выполнения сортировки масива из 30 int пузырьком " +
                duration + " ns");

    }
}
