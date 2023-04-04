import java.sql.SQLOutput;

public class Calculator{
        static String name = "I want to get £200, so that I can buy my $item";

        public static void main(String[] args) {
            System.out.println((name.replaceAll("[^0-9]", "")));
            System.out.println(name.replaceAll("[^a-zA-Z]",""));

            System.out.println(name.replaceAll("[a-zA-Z\\d, ]",""));

        }
}