import java.util.Map;

public class AssemblyToHex {
    Map<String, String> commandsToHex = Map.of( //Xerin
            "LDBA", "D0",
            "STBA", "F1",
            "STWA", "E1",
            "ADDA", "60",

            "STOP", "00",
            ".END", "zz"
    );

    Map<Character, String> addressModeToHex = Map.of( //Aurelia
            'd', "1",
            'i', "0"
    );

    Map<String, String> hexNotation = Map.of( //Aurelia
            "0x", "00"
    );
}
