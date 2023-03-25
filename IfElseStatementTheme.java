public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        translationOfPdeudocodeInJava();
        searchingMinMaxValue();
        checkingNumber();
        searchinSimilarDigitsInNum();
        defineDigitByCode();
        caclculatingSumDepositeAndAccruedInterest();
        defineAssessmentSubject();
        caclculatingAnnualProfit();
        calculatingAmountBanknotes();


    }
    public static void translationOfPdeudocodeInJava() {
        System.out.println("(1) Перевод псевдокода на язык Java");

        int age = 69;
        if(age > 20) {

            System.out.println("Вам " + age + ", вы взрослый человек");

        } else {

            System.out.println("Вам " + age + ", вы взрослый человек");

        }
        String sex = "male";
        if (sex != "male") {

            System.out.println("Вы красивая!");

        } else {

            System.out.println("Вы сильный!");
        }
        double height = 1.92;
        if(height < 1.80) {

            System.out.println("Вы не высокий человек");

        } else {
            System.out.println("Вы высокий человек");
        }
        String name = "Ivan";
        char firstNameLetter = name.charAt(0);
        if(firstNameLetter == 'M') {

            System.out.println("У вас замечательное имя!"); 

        } else if(firstNameLetter == 'I') {

            System.out.println("Ваше имя превосходно"); 

        } else {

            System.out.println("Ваше имя очень красивое"); 
        }
    }

    public static void searchingMinMaxValue() {
        System.out.println("\n(2) Поиск максимального и минимального значения");
        int num1 = 9;
        int num2 = 9;
        if (num1 > num2) {

            System.out.println("Максимальное значение " +  num1 +
                "\nМинимальное значение " + num2); 
         } else if(num1 < num2) {

            System.out.println("Максимальное значение " + num2 + 
                "\nМинимальное значение " + num1); 
         } else {

            System.out.println(num1 + " = " + num2); 
         }
    }

    public static void checkingNumber() {
        System.out.println("\n(3) Проверка числа");

        int num = 7;
        if(num == 0){
            System.out.println("Число = 0");
        } else {
            if(num % 2 == 0){
                System.out.println("Число " + num + " четное");
            } else {
                System.out.println("Число " + num + " нечетное");
            }
        }
    }

    public static void searchinSimilarDigitsInNum () {
        System.out.println("\n(4) Поиск одинаковых цифр в числе");

        int num1 = 123;
        int amountHundredsNum1 = num1 / 100;
        int amountTensNum1 = num1 % 100 / 10;
        int amountOnesNum1 = num1 % 10;
        int num2 = 223;
        int amountHundredsNum2 = num2 / 100;
        int amountTensNum2 = num2 % 100 / 10;
        int amountOnesNum2 = num2 % 10;

        System.out.println("Исходные числа: " + num1 + " и " + num2); 

        if (amountHundredsNum1 != amountHundredsNum2 & amountTensNum1 != amountTensNum2 &
                 amountOnesNum1 != amountOnesNum2) {

                System.out.println("Совпадений среди цифр в числах нет"); 
        
        } else {
            if (amountHundredsNum1 == amountHundredsNum2) {

                System.out.println(amountHundredsNum1 + " равно " + amountHundredsNum2 + 
                        ". В числах равны сотни."); 
        
            } else {

                System.out.println("Совпадений по сотням нет.");
            }
            if (amountTensNum1 == amountTensNum2) {

                System.out.println(amountTensNum1 + " равно " + amountTensNum2 + 
                        ". В числах равны десятки."); 

            } else {

                System.out.println("Совпадений по десяткам нет.");
            }
            if (amountOnesNum1 == amountOnesNum2) {

                System.out.println(amountOnesNum1 + " равно " + amountOnesNum2 + 
                        ". В числах равны единицы."); 
            
            } else {

                System.out.println("Совпадений по единицам нет.");
            }
        }
    }

    public static void defineDigitByCode() {
        System.out.println("\n(5) Определение символа по коду");

        char ourChar = '\u0057';
        if (ourChar <= '/' & 0 <= ourChar | ourChar >= ':' & ourChar <= '@' | '[' <= ourChar 
                & ourChar <= '`' | '{' <= ourChar & ourChar <= 127) {

            System.out.println("Наш символ - это " + ourChar + ". Это не число и не цифра");

        } else if (ourChar >= '0' & ourChar <= '9') {

            System.out.println("Наш символ это цифра " + ourChar);

        } else if (ourChar >= 'A' & ourChar <= 'Z') {

            System.out.println("Наш символ, это большая буква " + ourChar);

        } else if (ourChar >= 'a' & ourChar <= 'z') {

            System.out.println("Наш символ, это маленькая буква " + ourChar);
        }
    }

    public static void caclculatingSumDepositeAndAccruedInterest() {
        System.out.println("\n(6) Подсчет суммы вклада и начисленных банком процентов");

        int deposit = 300_000;
        int percent = 0;
        if (deposit < 100_000) {
            percent = (int) (deposit * 0.05);
        } else if (deposit >= 100_000 & deposit <= 300_000) {
            percent = (int) (deposit * 0.07);
        } else if (deposit > 300_000) {
            percent = (int) (deposit * 0.10);
        }
        int finalSum = deposit + percent;

        System.out.println("Сумма депозита: " + deposit + "\nСумма процентов: " + percent + 
                "\nИтоговая сумма с процентом: " + finalSum);
    }
    public static void defineAssessmentSubject() {
        System.out.println("\n(7) Определение оценки по предметам");

//Не понимаю, как избежать дублирование кода
        int historyPercent = 59;
        int historyAssessment = 0;
        if (historyPercent <= 60 & historyPercent >= 0) {
            historyAssessment = 2;
        } else if (historyPercent > 60 & historyPercent <= 73) {
            historyAssessment = 3;
        } else if (historyPercent > 73 & historyPercent <= 91) {
            historyAssessment = 4;
        } else if (historyPercent > 91 & historyPercent <= 100) {
            historyAssessment = 5;
        }
        int programmingPercent = 91;
        int programmingAssessment = 0;
        if (programmingPercent <= 60 & programmingPercent >= 0) {
            historyAssessment = 2;
        } else if (programmingPercent > 60 & programmingPercent <= 73) {
            programmingAssessment = 3;
        } else if (programmingPercent > 73 & programmingPercent <= 91) {
            programmingAssessment = 4;
        } else if (programmingPercent > 91 & programmingPercent <= 100) {
            programmingAssessment = 5;
        }
        double averagePercent = (historyPercent + programmingPercent) / 2;
        double averageAssessment = (historyAssessment + programmingAssessment) / 2;

        System.out.println("История: " + historyAssessment +
                "\nПрограммирование: " + programmingAssessment + 
                "\nСредний балл оценок по предметам: " + averageAssessment +
                "\nСредний процент по предметам: " + averagePercent +"%");
    } 
    public static void caclculatingAnnualProfit() {
        System.out.println("\n(8)Расчет прибыли за год");

        int monthRent = 5000;
        int monthSales = 13000;
        int costPrice = 9000; 
        int annualProfit = (monthSales - costPrice - monthRent) * 12;
        if (annualProfit > 0) {

            System.out.println("Прибыль за год: +" + annualProfit);

        } else if (annualProfit < 0) {

            System.out.println("Прибыль за год: " + annualProfit);

        } else {

            System.out.println("Прибыль за год: 0");
        }
    }
    public static void calculatingAmountBanknotes() {
        System.out.println("(9) Подсчет количества банкнот"); 

        int hundredAtm = 10;
        int tenAtm = 5;
        int oneAtm = 50;

        int requiredCash = 1099;
        
        int hundredUser = Math.min(requiredCash / 100, hundredAtm);
        int tenUser = Math.min((requiredCash - hundredUser * 100) / 10, tenAtm);
        int oneUser = Math.min(requiredCash - hundredUser * 100 - tenUser * 10, oneAtm);
        int dispensedCash = hundredUser * 100 + tenUser * 10 + oneUser;
        if(requiredCash != dispensedCash) {
            
            System.out.println("В банкомате недостаточно банкнот"); 
        
        } else {

            System.out.println("Выдано: " + requiredCash +
                    "\nКупюры по 100$: " + hundredUser +
                    "\nКупюры по 10$: " + tenUser +
                    "\nКупюры по 1$: " + oneUser);
        }
    }

}