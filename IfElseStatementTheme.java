public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        translatePseudocodeInJava();
        searchMinMaxValue();
        checkNumber();
        searchSimilarDigitsInNum();
        defineSymbolByCode();
        calculateSumDepositeAndAccruedInterest();
        defineAssessmentSubject();
        calculateAnnualProfit();
        calculateBanknotes();
    }

    public static void translatePseudocodeInJava() {
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
        char firstNameLetter = "Ivan".charAt(0);
        if(firstNameLetter == 'M') {
            System.out.println("У вас замечательное имя!"); 
        } else if(firstNameLetter == 'I') {
            System.out.println("Ваше имя превосходно"); 
        } else {
            System.out.println("Ваше имя очень красивое"); 
        }
    }

    public static void searchMinMaxValue() {
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

    public static void checkNumber() {
        System.out.println("\n(3) Проверка числа");
        int num = 7;
        String parity = "*";
        String positiveness = "*";
        if(num == 0) {
            System.out.println("Число = " + num);
        } else {
            if(num % 2 == 0) {
                parity = "четное";
            } else {
                parity = "нечетное";
            }
            if(num > 0) {
                positiveness = "положительное";
            } else {
                positiveness = "отрицательное";
            }
            System.out.println("Наше число " + num + ". Оно " + parity + ", " + positiveness);
        }
    }

    public static void searchSimilarDigitsInNum() {
        System.out.println("\n(4) Поиск одинаковых цифр в числе");
        int num1 = 123;
        int HundredsNum1 = num1 / 100;
        int tensNum1 = num1 % 100 / 10;
        int OnesNum1 = num1 % 10;
        int num2 = 223;
        int HundredsNum2 = num2 / 100;
        int tensNum2 = num2 % 100 / 10;
        int OnesNum2 = num2 % 10;
        System.out.println("Исходные числа: " + num1 + " и " + num2); 
        if (HundredsNum1 != HundredsNum2 & tensNum1 != tensNum2 &
                 OnesNum1 != OnesNum2) {
                System.out.println("Совпадений среди цифр в числах нет"); 
        } else {
            if (HundredsNum1 == HundredsNum2) {
                System.out.println(HundredsNum1 + " равно " + HundredsNum2 + 
                        ". В числах равны сотни."); 
            } else {
                System.out.println("Совпадений по сотням нет.");
            }
            if (tensNum1 == tensNum2) {
                System.out.println(tensNum1 + " равно " + tensNum2 + 
                        ". В числах равны десятки."); 
            } else {
                System.out.println("Совпадений по десяткам нет.");
            }
            if (OnesNum1 == OnesNum2) {
                System.out.println(OnesNum1 + " равно " + OnesNum2 + 
                        ". В числах равны единицы."); 
            } else {
                System.out.println("Совпадений по единицам нет.");
            }
        }
    }

    public static void defineSymbolByCode() {
        System.out.println("\n(5) Определение символа по коду");
        char someCode = '\u0057';
        if (someCode >= '0' & someCode <= '9') {
            System.out.println("Наш символ это цифра " + someCode);
        } else if (someCode >= 'A' & someCode <= 'Z') {
            System.out.println("Наш символ, это большая буква " + someCode);
        } else if (someCode >= 'a' & someCode <= 'z') {
            System.out.println("Наш символ, это маленькая буква " + someCode);
        } else {
            System.out.println("Наш символ не цифра и не буква. Это символ " + someCode); 
        }
    }

    public static void calculateSumDepositeAndAccruedInterest() {
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
        int programmPercent = 91;
        int programmAssessment = 0;
        if (programmPercent <= 60 & programmPercent >= 0) {
            historyAssessment = 2;
        } else if (programmPercent > 60 & programmPercent <= 73) {
            programmAssessment = 3;
        } else if (programmPercent > 73 & programmPercent <= 91) {
            programmAssessment = 4;
        } else if (programmPercent > 91 & programmPercent <= 100) {
            programmAssessment = 5;
        }
        double averagePercent = (historyPercent + programmPercent) / 2;
        double averageAssessment = (historyAssessment + programmAssessment) / 2;

        System.out.println("История: " + historyAssessment +
                "\nПрограммирование: " + programmAssessment + 
                "\nСредний балл оценок по предметам: " + averageAssessment +
                "\nСредний процент по предметам: " + averagePercent +"%");
    } 
    public static void calculateAnnualProfit() {
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
    public static void calculateBanknotes() {
        System.out.println("\n(9) Подсчет количества банкнот"); 
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