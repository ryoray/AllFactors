public class FactorPrinter {

    public static int printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int factor = 0;

//        for (int i=1; i <= number; i++) {
//            if (number % i == 0) {
//                factor = i;
//                System.out.print(factor+" ");
//            }
//        }

        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                factor = i;
                System.out.print(factor + " ");
            }
            i++;
        }

        return factor;
    }
}
