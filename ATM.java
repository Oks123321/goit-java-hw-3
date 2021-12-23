import java.util.*;

public class ATM {
    public int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int index = 0;
        int result = 0;
        if (sum > 0) {
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }
            index = (index + 1);
            while (sum >= banknotes[index]) {
                sum = sum - banknotes[index];
                result = result + 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ATM bank = new ATM();

        System.out.println(bank.countBanknotes(63));
    }
}