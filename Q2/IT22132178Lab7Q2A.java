public class IT22132178Lab7Q2A {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("$" + (column == 5 ? "" : " "));
            }
            System.out.println();
        }
    }
}
