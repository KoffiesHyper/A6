public class GenerateCombinations {

    public static void main(String[] args) {

        int[] values = { 0, 1, 2, 3, 4 };

        for (int a = 0; a < values.length; a++) {
            for (int b = 0; b < values.length; b++) {
                for (int c = 0; c < values.length; c++) {
                    for (int d = 0; d < values.length; d++) {
                        for (int e = 0; e < values.length; e++) {
                            for (int f = 0; f < values.length; f++) {
                                for (int g = 0; g < values.length; g++) {
                                    for (int h = 0; h < values.length; h++) {
                                        for (int i = 0; i < values.length; i++) {
                                            System.out.println(
                                                a + " " + 
                                                b + " " + 
                                                c + " " + 
                                                d + " " + 
                                                e + " " + 
                                                f + " " + 
                                                g + " " + 
                                                h + " " + 
                                                i + " ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}