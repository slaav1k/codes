//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(countSegments("              "));
    }

    public static int countSegments(String s) {
        if (s == null || s.isEmpty()) return 0;
        String[] segments = s.trim().split("\\s+");
        return segments.length == 1 && segments[0].isEmpty() ? 0 : segments.length;
    }
}