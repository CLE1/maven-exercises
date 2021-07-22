import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MStringUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");

        String input = scanner.nextLine();

        System.out.println("You entered: " + input);

        if (StringUtils.isNumeric(input)){
            System.out.printf("%s is a number%n", input);
        }else {
            System.out.printf("%s is not a number%n", input);
        }

        System.out.println("Flipped Case: "+ StringUtils.swapCase(input));

        System.out.println("Reversed Case: "+ StringUtils.reverse(input));
    }
}
