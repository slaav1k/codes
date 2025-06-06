//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        System.out.println(myHashSet);
        myHashSet.add(1);      // set = [1]
        System.out.println(myHashSet);
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(1)); // return True
        System.out.println(myHashSet.contains(3)); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(2)); // return True
        myHashSet.remove(2);   // set = [1]
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(2)); // return False, (already removed)
    }
}