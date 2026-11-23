import java.util.Map;
import static java.util.Map.entry;

public class InputToAssembly {
    Map<Character, String> charsToHex = Map.ofEntries(
        // Numbers 1 - 9
        entry('0', "30"), entry('1', "31"), entry('2', "32"), entry('3', "33"), entry('4', "34"),
        entry('5', "35"), entry('6', "36"), entry('7', "37"), entry('8', "38"), entry('9', "39"),

        // Uppercase A-Z
        entry('A', "41"), entry('B', "42"), entry('C', "43"), entry('D', "44"), entry('E', "45"),
        entry('F', "46"), entry('G', "47"), entry('H', "48"), entry('I', "49"), entry('J', "4A"),
        entry('K', "4B"), entry('L', "4C"), entry('M', "4D"), entry('N', "4E"), entry('O', "4F"),
        entry('P', "50"), entry('Q', "51"), entry('R', "52"), entry('S', "53"), entry('T', "54"),
        entry('U', "55"), entry('V', "56"), entry('W', "57"), entry('X', "58"), entry('Y', "59"),
        entry('Z', "5A"),

        // Lowercase a-z
        entry('a', "61"), entry('b', "62"), entry('c', "63"), entry('d', "64"), entry('e', "65"),
        entry('f', "66"), entry('g', "67"), entry('h', "68"), entry('i', "69"), entry('j', "6A"),
        entry('k', "6B"), entry('l', "6C"), entry('m', "6D"), entry('n', "6E"), entry('o', "6F"),
        entry('p', "70"), entry('q', "71"), entry('r', "72"), entry('s', "73"), entry('t', "74"),
        entry('u', "75"), entry('v', "76"), entry('w', "77"), entry('x', "78"), entry('y', "79"),
        entry('z', "7A")
    );

    public String inputToAssembly(String input) {
        StringBuilder assemblyResult = new StringBuilder();
        char[] inputCharArray = input.toCharArray();

        for (int i = 0; i < inputCharArray.length; i++) {
            // Converts each letter from the input into its hex code
            String hex = charsToHex.get(inputCharArray[i]);

            assemblyResult.append("LDBA 0x" + hex + ", i\n");
            assemblyResult.append("STBA 0xFC16, d\n");
        }

        assemblyResult.append("STOP\n");
        assemblyResult.append(".END\n");

        return assemblyResult.toString();
    }
}
