import java.util.Map;

public class commandToHex {
    Map<String, String> commandsToHex = Map.of(
            "LDBA", "D0",
            "STBA", "F1",
            "STWA", "E1",
            "ADDA", "60",

            "STOP", "00",
            ".END", "zz"
    );
}
