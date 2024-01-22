public class Main {
    public static void main(String[] args) {
        //1
        int aFirst = 1000000;
        byte bFirst = 127;
        short cFirst = 32767;
        long dFirst = 2000000L;
        float eFirst = 5.12f;
        double fFirst = 3.34234556;

        System.out.println("Значение переменной aFirst с типом int равно " + aFirst);
        System.out.println("Значение переменной bFirst с типом byte равно " + bFirst);
        System.out.println("Значение переменной cFirst с типом short равно " + cFirst);
        System.out.println("Значение переменной dFirst с типом long равно " + dFirst);
        System.out.println("Значение переменной eFirst с типом float равно " + eFirst);
        System.out.println("Значение переменной fFirst с типом double равно " + fFirst);

        //2
        float aSecond = 27.12f;
        long bSecond = 987678965549L;
        float cSecond = 2.786f;
        short dSecond = 569;
        short eSecond = -159;
        int fSecond = 27897;
        byte gSecond = 67;

        //3
        byte studentsFirstTeacher = 23;
        byte studentsSecondTeacher = 27;
        byte studentsThirdTeacher = 30;
        short totalSheets = 480;
        int sheetsStudent = totalSheets / (studentsFirstTeacher + studentsSecondTeacher + studentsThirdTeacher);
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");

        //4
        byte totalBottles = 16;
        byte time = 2;
        byte timeFirst = 20;
        short timePerDay = 24*60;
        short timePerThreeDay = 3*24*60;
        int timePerMonth = 30*24*60;
        int bottlesFirst = timeFirst*totalBottles/time;
        int bottlesPerDay = timePerDay*totalBottles/time;
        int bottlesPerThreeDay = timePerThreeDay*totalBottles/time;
        int bottlesPerMonth = timePerMonth*totalBottles/time;
        System.out.println("За 20 минут машина произвела " + bottlesFirst + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        //5
        byte whitePaintPerOneClass = 2;
        byte brownPaintPerOneClass = 4;
        byte totalCans = 120;
        int totalClass = totalCans/(whitePaintPerOneClass+brownPaintPerOneClass);
        int totalWhitePaint = totalClass*whitePaintPerOneClass;
        int totalBrownPaint = totalClass*brownPaintPerOneClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        //6
        byte numberBananas = 5;
        byte weightBanana = 80;
        short volumeMilk = 200;
        byte weightHundredMillilitersMilk = 105;
        byte numberIceCream = 2;
        byte weightIceCream = 100;
        byte numberEggs = 4;
        byte weightEgg = 70;

        int totalWeight = numberBananas*weightBanana+volumeMilk*weightHundredMillilitersMilk/100+
                numberIceCream*weightIceCream+numberEggs*weightEgg;
        float totalWeightKilos = (float) totalWeight /1000;
        System.out.println("Вес завтрака в граммах: " + totalWeight);
        System.out.println("Вес завтрака в килограммах: " + totalWeightKilos);

        //7
        byte loseKilos = 7;
        short FirstloseGramm = 250;
        short SecondloseGramm = 500;
        int totalDaysFirstLose = loseKilos*1000/FirstloseGramm;
        int totalDaysSecondLose = loseKilos*1000/SecondloseGramm;
        System.out.println("Если сбрасывать 250 грамм в день, то потребуется " + totalDaysFirstLose + " дней");
        System.out.println("Если сбрасывать 500 грамм в день, то потребуется " + totalDaysSecondLose + " дней");

        //8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte percentageIncrease = 10;
        int newSalaryMasha = salaryMasha+salaryMasha*percentageIncrease/100;
        int newSalaryDenis = salaryDenis+salaryDenis*percentageIncrease/100;
        int newSalaryKristina = salaryKristina+salaryKristina*percentageIncrease/100;
        int oldAnnualIncomeMasha = salaryMasha*12;
        int oldAnnualIncomeDenis = salaryDenis*12;
        int oldAnnualIncomeKristina = salaryKristina*12;
        int newAnnualIncomeMasha = newSalaryMasha*12;
        int newAnnualIncomeDenis = newSalaryDenis*12;
        int newAnnualIncomeKristina = newSalaryKristina*12;
        int differenceNewAndOldSalariesMasha = newAnnualIncomeMasha-oldAnnualIncomeMasha;
        int differenceNewAndOldSalariesDenis = newAnnualIncomeDenis-oldAnnualIncomeDenis;
        int differenceNewAndOldSalariesKristina = newAnnualIncomeKristina-oldAnnualIncomeKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
                + differenceNewAndOldSalariesMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на "
                + differenceNewAndOldSalariesDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на "
                + differenceNewAndOldSalariesKristina + " рублей");
    }
}