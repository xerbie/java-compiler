// project1_HortonMcGuireLanzerotti
// Members: Xerin Horton, Christian McGuire, Aurelia Lanzerotti

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        String program1 = "program1.pep";
        String program2 = "program2.pep";

        File file1 = new File(program1);
        File file2 = new File(program2);

        Scanner scanner = new Scanner(file1);

        AssemblyParser test1 = new AssemblyParser();
        test1.splitAssemblyCode(file1);

    }
}
