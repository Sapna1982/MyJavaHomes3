package JavaHomework3;

public class TablesOf9WhileLoop {
    public static void main(String[] args) {
        int TablesOf9 = 9;
        int i = 1;
        while (i<=10) {
            System.out.println(TablesOf9 + "X" + i + "=" + i++ * TablesOf9);
        }
    }
}