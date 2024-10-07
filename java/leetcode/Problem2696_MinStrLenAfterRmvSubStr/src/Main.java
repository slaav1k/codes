//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }

    public static int minLength(String s) {
        String subStr1 = "AB";
        String subStr2 = "CD";
        while (s.contains(subStr1) || s.contains(subStr2)) {
            s = s.replaceAll(subStr1, "").replaceAll(subStr2, "");
        }
        return s.length();
    }
}