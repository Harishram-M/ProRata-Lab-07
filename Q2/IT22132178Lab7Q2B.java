public class IT22132178Lab7Q2B {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            System.out.print(row + " - ");
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + (column == row ? "" : " "));
            }
            System.out.println();
        }
    }
}
