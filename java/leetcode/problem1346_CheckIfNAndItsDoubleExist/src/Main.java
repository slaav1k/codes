
public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] {7, 1, 14, 11}));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && (arr[i] == arr[j] * 2 || arr[i] * 2 == arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}