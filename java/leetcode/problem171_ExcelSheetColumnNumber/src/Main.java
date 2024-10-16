//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));

    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }


    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (char el : columnTitle.toCharArray()) {
            result *= 26;
            result += el - 'A' + 1;
        }
        return result;
    }
}