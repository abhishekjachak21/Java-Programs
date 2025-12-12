public class StringVsStringBuilderTest {

    public static void main(String[] args) {

        // ----------------------------------
        // String concatenation test
        // ----------------------------------
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 50000; i++) {
            s = s + "a";    // String concatenation
        }

        long end = System.currentTimeMillis();
        System.out.println("String time: " + (end - start) + " ms");


        // ----------------------------------
        // StringBuilder concatenation test
        // ----------------------------------
        long start2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append("a");   // StringBuilder append
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end2 - start2) + " ms");
    }
}
