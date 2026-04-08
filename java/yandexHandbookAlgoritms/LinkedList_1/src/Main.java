import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input;
        String[] inputs;
        for (int i = 0; i < n; i++) {
            input = sc.nextLine();
            inputs = input.split(" ");
            switch (inputs[0]) {
                case "1":
                    addEl(inputs);
                    break;
                case "2":
                    printEl(inputs);
                    break;
                case "3":
                    removeEl(inputs);
                    break;
            }
        }
    }

    private static void addEl(String[] pCommand) {
        int x = Integer.parseInt(pCommand[1]);
        int y = Integer.parseInt(pCommand[2]);
        if (x == 0) {
            list.addFirst(y);
        } else {
            list.add(x, y);
        }
    }

    private static void printEl(String[] pCommand) {
        int x = Integer.parseInt(pCommand[1]);
        System.out.println(list.get(x - 1));
    }

    private static void removeEl(String[] pCommand) {
        int x = Integer.parseInt(pCommand[1]);
        list.remove(x - 1);
    }
}