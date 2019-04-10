public class CarpetDeluxe {
    public static void main(String... args) {
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        Boolean value = Boolean.parseBoolean(args[2]);

        String elementArray[] = { ".", "o" };

        for (int row = 0; row < height; row++) {
            int offset = row % 2;
            if (value && offset == 0) {
                System.out.print("*-");
            } else {
                System.out.print("  ");
            }
            if (row == 0 || row == height - 1) {
                System.out.print("#");
                for (int i = 0; i < width; i++) {
                    System.out.print("-");
                }
                System.out.print("#");
            } else {
                System.out.print("|");
                for (int elementIndex = 0; elementIndex < width; elementIndex++) {
                    System.out.print(elementArray[(elementIndex + offset) % 2]);
                }
                System.out.print("|");
            }
            if (value && offset == 0) {
                System.out.print("-*");

            } else {
                System.out.print("  ");
            }

            System.out.println();

        }

    }
}
