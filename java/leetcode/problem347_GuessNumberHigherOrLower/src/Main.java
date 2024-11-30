//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int pick = 6;

        Solution solution = new Solution(pick);

        System.out.println(solution.guessNumber(n));
    }
}

class GuessGame {
    private int pickedNumber;

    // Конструктор, чтобы задать число, которое нужно угадать
    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    // Метод guess возвращает -1, 1 или 0 в зависимости от разницы с pickedNumber
    public int guess(int num) {
        if (num > pickedNumber) return -1;
        if (num < pickedNumber) return 1;
        return 0;
    }
}

