//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Перед выполнением кода раскомментируйте переменную int year (то есть удалите символ комментария //).
// Перед отправкой кода на проверку снова закомментируйте эту строку — система сама подставит разные значения для проверки вашего кода.


// Объявляем переменную, которая хранит год:

int year = 2027;

// Допишите пропущенный код:

        boolean isLeapYear =(year % 4) == 0;
        if (isLeapYear) {
            System.out.println(year + " год – високосный");
        } else {
            System.out.println(year + " год – не високосный");
        }
    }
}