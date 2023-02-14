public class Main {
    public static void main(String[] args) {
        task_001();
        task_002();
        task_003();
        task_004();
        task_005();
        task_006();
        task_007();
        task_008();
    }
    public static void space(){
        System.out.println("__________________________________________________");
    }
    public static void task_001() {
        byte byteVar = -128;
        short shortVar = -32768;
        int intVar = 2147483466;
        long longVar = -92233702222222228L;
        float floatVar = 5f;
        double doubleVar = 18000;
        System.out.println("Значение переменной \"byteVar\" с типом \"" + ((Object)byteVar).getClass().getSimpleName() + "\" равно " + byteVar);
        System.out.println("Значение переменной \"shortVar\" с типом \"" + ((Object)shortVar).getClass().getSimpleName() + "\" равно " + shortVar);
        System.out.println("Значение переменной \"intVar\" с типом \"" + ((Object)intVar).getClass().getSimpleName() + "\" равно " + intVar);
        System.out.println("Значение переменной \"longVar\" с типом \"" + ((Object)longVar).getClass().getSimpleName() + "\" равно " + longVar);
        System.out.println("Значение переменной \"floatVar\" с типом \"" + ((Object)byteVar).getClass().getSimpleName() + "\" равно " + floatVar);
        System.out.println("Значение переменной \"doubleVar\" с типом \"" + ((Object)doubleVar).getClass().getSimpleName() + "\" равно " + doubleVar);
        space();
    }
    public static void task_002() {
        float floatVar = 27.12f;
        long longVar = 987678965549L;
        double doubleVar = 2.786;
        short shortVar1 = 569;
        short shortVar2 = -159;
        int intVar = 27897;
        byte byteVar = 67;
    }

    public static void task_003() {
        byte studentsOfLP = 23;
        byte studentsOfAS = 27;
        byte studentsOfEA = 30;
        short sheetsOfPaper = 480;
        short amountOfStudents = (short) (studentsOfEA + studentsOfAS + studentsOfLP);
        System.out.println("На каждого ученика рассчитано " + (sheetsOfPaper / amountOfStudents) + " листов бумаги.");
        space();
    }
    public static void task_004() {
        int bottlesPerTwoMin = 16;
        int time = 2;
        int minInOneDay = 24 * 60;
        int bottlePerMin = bottlesPerTwoMin / time;
        System.out.println("За 20 минут машина произвела " + (20 * bottlePerMin) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (minInOneDay * bottlePerMin) + " штук бутылок");
        System.out.println("За 3 дня  машина произвела " + (3 * minInOneDay * bottlePerMin) + " штук бутылок");
        System.out.println("За месяц (если принять, что в месяце 30 дней) машина произвела " + (30 * minInOneDay * bottlePerMin) + " штук бутылок");
        space();
    }
    public static void task_005() {
        short tinsOfPaint = 120;
        short tinsOfWhiteColor = 2;
        short tinsOfBrownColor = 4;
        float classroomsAtSchool = (float) (tinsOfPaint / (tinsOfWhiteColor + tinsOfBrownColor));
        System.out.println("В школе, где " + classroomsAtSchool + " классов, нужно " + (classroomsAtSchool * tinsOfWhiteColor) + " банок белой краски и " + (classroomsAtSchool * tinsOfBrownColor) + " банок коричневой краски.");
        space();
    }
    public static void task_006() {
        short   bananas = 5,
                weightOfBanana = 80,
                milk = 200,
                weightOf100mlOfMilk = 105,
                iceCream = 2,
                weightOfIceCream = 100,
                eggs = 4,
                weightOfEgg = 70;
        short   amountRecipeWeight = (short) (bananas * weightOfBanana + milk / 100 * weightOf100mlOfMilk + iceCream * weightOfIceCream + eggs * weightOfEgg);
        System.out.println("Вес спортзавтрака (г): " + amountRecipeWeight);
        System.out.println("Вес спортзавтрака (кг): " + amountRecipeWeight / 1000f);
        space();
    }
    public static void task_007() {
        short   weightToLoose = 7,
                minWeightToLoose = 250,
                maxWeightToLoose = 500;
        float   daysMinWeightToLoose = (float) (weightToLoose * 1000 / minWeightToLoose),
                daysMaxWeightToLoose = (float) (weightToLoose * 1000 / maxWeightToLoose);
        System.out.println("Дней понадобится, чтобы потерять " + weightToLoose + " кг, теряя по " + minWeightToLoose + "г в день: " + daysMinWeightToLoose);
        System.out.println("Дней понадобится, чтобы потерять " + weightToLoose + " кг, теряя по " + maxWeightToLoose + "г в день: " + daysMaxWeightToLoose);
        System.out.println("Дней понадобится в среднем, чтобы потерять " + weightToLoose + " кг: " + (daysMaxWeightToLoose + daysMinWeightToLoose) / 2);
        space();

    }
    public static void task_008() {
        int     salaryOfMasha = 67760,
                salaryOfDenis = 83690,
                salaryOfChristina = 76230;
        System.out.println("Маша теперь получает " + salaryOfMasha * 1.1f + " рублей. Годовой доход вырос на " + (salaryOfMasha * 1.1f - salaryOfMasha) * 12 + " рублей");
        System.out.println("Денис теперь получает " + salaryOfDenis * 1.1f + " рублей. Годовой доход вырос на " + (salaryOfDenis * 1.1f - salaryOfDenis) * 12 + " рублей");
        System.out.println("Кристина теперь получает " + salaryOfChristina * 1.1f + " рублей. Годовой доход вырос на " + (salaryOfChristina * 1.1f - salaryOfChristina) * 12 + " рублей");
    }
}