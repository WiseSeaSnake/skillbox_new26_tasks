//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean hasCryptoWallet = false;

// Объявляем переменные, представляющие доход и расход:

        int income = 100000;
        int expenses = 70000;

// Допишите пропущенный код:

        boolean hasPositiveCashFlow =expenses<income;
        boolean shouldBuyBitcoin=hasPositiveCashFlow && hasCryptoWallet;

        System.out.println("Стоит покупать биткоин? " + shouldBuyBitcoin);
    }
}