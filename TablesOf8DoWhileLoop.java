package JavaHomework3;

public class TablesOf8DoWhileLoop {
    public static void main(String[] args) {
        int TablesOf8 = 8;
        int a = 1;
        do {
            System.out.println(TablesOf8 + "X" + a + "=" + a++ * TablesOf8);
        } while (a<= 10);
    }
}
