// project1_HortonMcGuireLanzerotti
// Members: Xerin Horton, Christian McGuire, Aurelia Lanzerotti

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what do you want to convert?");
        String input = scanner.nextLine();
        InputToAssembly inputToAssembly = new InputToAssembly();

        System.out.println(inputToAssembly.inputToAssembly(input));

    }
}
