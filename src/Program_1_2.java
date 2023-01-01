/** ЗАДАЧА 2
 Используя:
    a) Переменную типа String
    b) несколько переменных типа char
    c) одну переменную типа char

вывести свое имя в консоль.
Вывод в консоль с переходом на новую строку:    System.out.println(ваша переменная)
Вывод в консоль без перехода на новую строку: System.out.print(ваша переменная)

Усложнение для внимательных: вывести ваше имя посимвольно, где каждая буква — на новой строке, не используя System.out.println().
Реализуется как с использованием String, так и используя char. **/


public class Program_1_2 {

        public static <string> void main(String[] args) {


            String fullname = "Alex";   //  a) Переменную типа String

            System.out.println(fullname);


            // char chname = 'Alex'; не работатет


            char ch = 97;  //  b) несколько переменных типа char

            char ch2 = 'l';     //  b) несколько переменных типа char

            String sym = "\ne\nx";

            System.out.print("\n"+ ch + "\n" + ch2 + sym + "\n");


            String name = """ 
             \nA
             l
             e
             x""";  // тип переменной "стринг"-String

            System.out.println(name);


            String text = "\nВот мысль, которой весь я предан,\n"+
                          "Итог всего, что ум скопил.\n"+
                          "Лишь тот, кем бой за жизнь изведан,\n"+
                          "Жизнь и свободу заслужил.";

            System.out.println(text);
        }

    }