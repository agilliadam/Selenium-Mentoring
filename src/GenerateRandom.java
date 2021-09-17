import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GenerateRandom {


    public static class GenerateRandomized {

        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

        final java.util.Random rand = new java.util.Random();

        // consider using a Map<String,Boolean> to say whether the identifier is being used or not
        final Set<String> identifiers = new HashSet<String>();

        public String randomIdentifier() {
            StringBuilder builder = new StringBuilder();
            while (builder.toString().length() == 0) {
                int length = rand.nextInt(5) + 5;
                for (int i = 0; i < length; i++) {
                    builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
                }
                if (identifiers.contains(builder.toString())) {
                    builder = new StringBuilder();
                }
            }
            return builder.toString();
        }

        public static void main(String[] args) {

            char randomChar = (char) (97 + (int) (Math.random() * 26));

            System.out.println(randomChar);
            System.out.println();
            System.out.println(generateData(8) + "@gmail.com");

        }


        public static String generateData(int noOfChars) {

            String coll = "abcdefghijklmnopqrstuvwxyz123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()";
            String str = "";

            for (int i = 0; i < noOfChars; i++) {
                int index = (int) (Math.random() * coll.length());
                str += coll.charAt(index);
            }

            return str;
        }



    }
}