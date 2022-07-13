package Lesson1;

public class Lesson1_1 {
    public static void main(String[] args) {

        char[] myArray = new char[]{'a', 's', 'd', 'f'};
        //Заменить a на w  и  f на o
        myArray[0] ='w';
        myArray[3] = '0';

//        System.out.println(myArray);


        String myWife = "Моя жена красивая" + '\n';
        myWife = myWife.replaceAll("красивая", "самая красивая" );
        myWife = myWife.toUpperCase();
        myWife = myWife.repeat(10);


        System.out.println(myWife);






    }
}
