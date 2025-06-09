//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyHashMap2 myHashMap = new MyHashMap2();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        System.out.println(myHashMap);
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(1));    // return 1, The map is now [[1,1], [2,2]]
        System.out.println(myHashMap.get(3));    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]
    }
}