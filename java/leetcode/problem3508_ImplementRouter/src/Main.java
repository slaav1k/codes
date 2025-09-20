import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Router router = new Router(3); // Initialize Router with memoryLimit of 3.
        System.out.println(router.addPacket(1, 4, 90)); // Packet is added. Return True.
        System.out.println(router.addPacket(2, 5, 90)); // Packet is added. Return True.
        System.out.println(router.addPacket(1, 4, 90)); // This is a duplicate packet. Return False.
        System.out.println(router.addPacket(3, 5, 95)); // Packet is added. Return True
        System.out.println(router.addPacket(4, 5, 105)); // Packet is added, [1, 4, 90] is removed as number of packets exceeds memoryLimit. Return True.
        System.out.println(Arrays.toString(router.forwardPacket())); // Return [2, 5, 90] and remove it from router.
        System.out.println(router.addPacket(5, 2, 110)); // Packet is added. Return True.
        System.out.println(router.getCount(5, 100, 110)); // The only packet with destination 5 and timestamp in the inclusive range [100, 110] is [4, 5, 105]. Return 1.
    }
}