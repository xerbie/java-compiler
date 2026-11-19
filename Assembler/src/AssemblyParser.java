import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AssemblyParser {

    public List<String> splitAssemblyCode(File file1){ //Aurelia
        String[] splitCode = file1.toString().split("\\W+");

        List<String> splitCodeList = new ArrayList<>();
        for (int i = 0; i < splitCode.length; i++){
            splitCodeList.add(splitCode[i]);
        }
        return splitCodeList;
    }

}
