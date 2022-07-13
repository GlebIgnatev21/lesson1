package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
//        System.out.println("Учеба!");

//        1.char[] 2.arrayCharVoda = 3.new char[4]; Где:
//        1.boolean 2.answer = 3.true; Где:
//        1.int 2.number1 = 3.10;    Где:
//        1. - это тип данных; 2. - это переменная(место хранения значения); 3. - это значение переменной.

        // Приметивные типы данных.
        // True - да. False - нет.
        boolean answer = true;
        boolean answer2 = false;
        System.out.println("text " +true);
//        System.out.println("Do you like a coffee?");
        System.out.println(answer);
//        System.out.println("Do you want a cap of tea");
//        System.out.println(answer2);

        //Типы данных.

        //От -128 до +127 (учитывается Ноль)
//        byte bt = -128;
        byte bt = 127;

        //От -32765 до +32764 (учитывается Ноль)
        short sh = 32764;

        //От -2 147 483 648 до +2 147 483 648 (учитывается Ноль)
        int number = 2_000_000_000;

        //Самый большей диапазон. В конце обязательно ставить L
        long ln = 8_000_000_000L;

        //Числа с плавающей точкой до 7 знака после запятой.
        //В конце обязательно ставить f, чтобы программа распознала float
        float fl = 3.1234567f;

        //Числа с плавающей точкой до 17 знаков после запятой.
        //Быквы вконце ставить не надо
        double dl = 3.12345678901234567;
//        System.out.println(fl);

        //Сложение вычитание умножение деление
        //Для целых чисел без запятой можно использовать int на всех позициях
        int number1 = 10;
        int number2 = 2;
        int result = number1/number2;
        int result1 = number1*number2;
        int result2 = number1-number2;
        int result3 = number1+number2;
//        System.out.println(result);
//        System.out.println(result3);
        //Для чисел с запятой в ответе или производной нужно использовать double
        int number3 = 20;
        double number4 = 3;
        double result4 = number3/number4;
        double result5 = number4/number3;
//        System.out.println(result5);
        int number8 = 2;
        int number9 = 23;
        int result9 = number8-number9;
        int result10 = (number8-number9) * 2;
//        System.out.println(result10);

        //Символы и буквы отображаются командой char
        char ch = 164;
        char ch1 = 164 + 1;
//        System.out.println(ch);
//        System.out.println(ch1);

        //Ссылочный тип данных.
        //Массив данных обозначается []  array-массив.
        //роцесс заполнения массива - инициализация.
        // Конструкция new означает создать навый массив.
        //int[] array = new int[5] - числовой массив.
        //Где [5] обозначает число массиа(количество данных)
        //Отсчет начинается от НУЛЯ, а не от еденицы.
        int[] array = new int[3];
        array[0] = 'g';
        array[1] = 2;
        array[2] = 55;
//        array[3] = 4;
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);

        char[] arrayCharVoda = new char[4];
        //char[] arrayCharVoda = new char[4] - буквенный массив.
        //Буквы вписывать в '' (одинапные ковычки).
        arrayCharVoda[0] = 'v';
        arrayCharVoda[1] = 'o';
        arrayCharVoda[2] = 'd';
        arrayCharVoda[3] = 'a';
        //Что бы вывесть массив в строчку, нучно использовать print без ln
        //Пинт распознает массив сhar без индексации номера:
        //Можно так
//        System.out.println(arrayCharVoda);
        //Или так:
//        System.out.print(arrayCharVoda[0]);
//        System.out.print(arrayCharVoda[1]);
//        System.out.print(arrayCharVoda[2]);
//        System.out.println(arrayCharVoda[3]);

        char[] arreyCharNewVoda = new char[]{'v','o','d','a'};
//        System.out.println(arreyCharNewVoda);

        //Тип данных String для набора текста.
        //Текст надо заключать в "" (двойные ковычки).
        String text = "voda";
        String text1 = " вкусная";
        String text2 = "voda вкусная" + true + 1 ;
        //Объединение нескольких строк в одну называется Контатенация
        // String resultText = text + text1 + text2  -  пример конкатенации.
        String resultText = text + text1 + text2;
        //        System.out.println(text);
//        System.out.println(text1);
//        System.out.println(text2);
//        System.out.println(resultText);

        //Пояснение как работает print и println, где ln это /n(функция)
//        System.out.print("a");
//        System.out.print("\n");
//        System.out.print("b");

        //java: reached end of file while parsing - означает, что скобки не закрыты вконце.
    }
}
