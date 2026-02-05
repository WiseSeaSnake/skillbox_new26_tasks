//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Перед выполнением кода раскомментируйте переменные char answer1, char answer2, char answer3 (то есть удалите символ комментария //).
// Перед отправкой кода на проверку снова закомментируйте эти строки — система сама подставит разные значения для проверки вашего кода.

        char yes = 'Y';
        char no = 'n';

// Две целочисленные переменные yesCounter и noCounter должны играть роль счётчика эталонных ответов ‘Y’ и ‘n’ соответственно. Допишите пропущенный код:

        int yesCounter = 0;
        int noCounter = 0;

// Выводим вопросы пользователю.

        System.out.println("Вы согласны, что программирование - это круто? [Y/n]");
        System.out.println("Будете изучать программирование дальше? [Y/n]");
        System.out.println("Собираетесь изменить свою жизнь? [Y/n]");

// Переменные answer1, answer2 и answer3 имитируют ответы пользователей. Здесь вы задаёте их значения самостоятельно.

char answer1 = 'Y';
char answer2 = 'Y';
char answer3 = 'Y';

// Посчитайте общее количество ответов ‘Y’ и ‘n’. Вставьте столько строк кода, сколько потребуется.

        if (answer1 == yes) {
            yesCounter++;
        } else if (answer1 == no) {
            noCounter++;
        }

        if (answer2 == yes) {
            yesCounter++;
        } else if (answer2 == no) {
            noCounter++;
        }

        if (answer3 == yes) {
            yesCounter++;
        } else if (answer3 == no) {
            noCounter++;
        }

// Выведите на экран статистику в виде двух сообщений (количество ответов «да» и «нет»). Заполните пропуски кода справа.
        System.out.println("Ответили Y: " + yesCounter);
        System.out.println("Ответили n: " + noCounter++);
    }
}