public class Main {
    public static void main(String[] args) {
        //Задача 1
        int intVariable = 100_000;
        byte byteVariable = 100;
        short shortVariable = 10_000;
        long longVariable = 1_000_000;
        float floatVariable = 12.13f;
        double doubleVariable = 201.79;

        System.out.printf("Значение переменной intVariable с типом int равно %d\n", intVariable);
        System.out.printf("Значение переменной byteVariable с типом byte равно %d\n", byteVariable);
        System.out.printf("Значение переменной shortVariable с типом short равно %d\n", shortVariable);
        System.out.printf("Значение переменной longVariable с типом long равно %d\n", longVariable);
        System.out.printf("Значение переменной floatVariable с типом float равно %.2f\n", floatVariable);
        System.out.printf("Значение переменной doubleVariable с типом double равно %.2f\n", doubleVariable);

        //Задача 2
        double firstVariable = 27.2f;
        long secondVariable = 987_678_965_549L;
        float thirdVariable = 2.786f;
        short fourthVariable = 569;
        short fifthVariable = -159;
        short sixthVariable = 27_897;
        byte seventhVariable = 67;

        //Задача 3
        byte pavlovnaStudentsCount = 23;
        byte sergeevnaStudentsCount = 27;
        byte andreevnaStudentsCount = 30;
        short countOfPaperSheets = 480;

        System.out.printf("\nНа каждого ученика рассчитано %d листов бумаги\n", countOfPaperSheets / (pavlovnaStudentsCount + sergeevnaStudentsCount + andreevnaStudentsCount));

        //Задача 4
        byte bottlesPerMinute = 16 / 2;
        short bottlesInTwentyMinutes = (short) (20 * bottlesPerMinute);
        short bottlesInDay = (short) ((24 * 60) * bottlesPerMinute);// Переводим 24 часа в минуты
        int bottlesInThreeDay = bottlesInDay * 3;
        int bottlesInMonth = bottlesInThreeDay * 10;

        System.out.printf("\nЗа 20 минут машина произвела %d штук бутылок\n", bottlesInTwentyMinutes);
        System.out.printf("За 1 день машина произвела %d штук бутылок\n", bottlesInDay);
        System.out.printf("За 3 дня машина произвела %d штук бутылок\n", bottlesInThreeDay);
        System.out.printf("За 1 месяц машина произвела %d штук бутылок\n", bottlesInMonth);

        //Задача 5
        byte paintCansCount = 120;
        byte whitePaintCansPerRoom = 2;
        byte brownPaintCansPerRoom = 4;
        byte roomsCount = (byte) (paintCansCount / (whitePaintCansPerRoom + brownPaintCansPerRoom));

        System.out.printf("\nВ школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n",
                roomsCount,
                whitePaintCansPerRoom * roomsCount,
                brownPaintCansPerRoom * roomsCount);

        //Задача 6
        short bananasWeight = 5 * 80;
        short milkWeight = (short) (200 * 1.05);
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        short breakfastWeight = (short) (bananasWeight + milkWeight + iceCreamWeight + eggsWeight);

        System.out.printf("\nВес завтрака в граммах %d, в килограммах %.2f\n",
                breakfastWeight,
                breakfastWeight * 0.001);

        //Задача 7
        short currentWeight = 7 * 1000;//Переводим килограммы в граммы
        short minWeightLoss = 250;
        short maxWeightLoss = 500;

        short minDaysToGoal = (short) (currentWeight / maxWeightLoss);
        short maxDaysToGoal = (short) (currentWeight / minWeightLoss);
        short averageDaysToGoal = (short) ((minDaysToGoal + maxDaysToGoal) / 2);

        System.out.printf("\nМинимум дней до цели - %d\n", minDaysToGoal);
        System.out.printf("Максимум дней до цели -  %d\n", maxDaysToGoal);
        System.out.printf("В среднем дней до цели -  %d\n", averageDaysToGoal);

        //Задача 8
        float mashaSalary = 67_760f;
        float denisSalary = 83_690;
        float christinaSalary = 76_230;

        System.out.printf("\nМаша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", mashaSalary * 1.1, mashaSalary * 1.1 - mashaSalary);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", denisSalary * 1.1, denisSalary * 1.1 - denisSalary);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", christinaSalary * 1.1, christinaSalary * 1.1 - christinaSalary);
    }
}