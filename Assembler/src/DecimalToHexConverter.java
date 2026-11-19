public class DecimalToHexConverter {
    static String toHex(int decimal) { //Aurelia
        if (decimal == 0) {
            return "0";
        }

        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder hexResult = new StringBuilder();

        //divide by 16 until the remainder is 0
        while (decimal > 0) {
            int remainder = decimal % 16;

            //match the remainder with a hex value
            hexResult.append(hexChars[remainder]);
            decimal = decimal/16;
        }

        //reverse the order of the results just like how we do when converting by hand
        return hexResult.reverse().toString();
    }
}
