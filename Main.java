import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> morseAscii = new HashMap<String, String>();
        morseAscii.put(".-", "A");
        morseAscii.put("-...", "B");
        morseAscii.put("-.-.", "C");
        morseAscii.put("-..", "D");
        morseAscii.put(".", "E");
        morseAscii.put("..-.", "F");
        morseAscii.put("--.", "G");
        morseAscii.put("....", "H");
        morseAscii.put("..", "I");
        morseAscii.put(".---", "J");
        morseAscii.put("-.-", "K");
        morseAscii.put(".-..", "L");
        morseAscii.put("--", "M");
        morseAscii.put("-.", "N");
        morseAscii.put("---", "O");
        morseAscii.put(".--.", "P");
        morseAscii.put("--.-", "Q");
        morseAscii.put(".-.", "R");
        morseAscii.put("...", "S");
        morseAscii.put("-", "T");
        morseAscii.put("..-", "U");
        morseAscii.put("...-", "V");
        morseAscii.put(".--", "W");
        morseAscii.put("-..-", "X");
        morseAscii.put("-.--", "Y");
        morseAscii.put("--..", "Z");
        morseAscii.put(".----", "1");
        morseAscii.put("..---", "2");
        morseAscii.put("...--", "3");
        morseAscii.put("....-", "4");
        morseAscii.put(".....", "5");
        morseAscii.put("-....", "6");
        morseAscii.put("--...", "7");
        morseAscii.put("---..", "8");
        morseAscii.put("----.", "9");
        morseAscii.put("-----", "0");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un mensaje en codigo morse (separado por espacios): ");
        String morseInput = scanner.nextLine();

        String[] morseArray = morseInput.split(" ");
        StringBuilder asciiMessage = new StringBuilder();
        for (String morse : morseArray) {
            if (morseAscii.containsKey(morse)) {
                asciiMessage.append(morseAscii.get(morse));
            }else{
                asciiMessage.append("?");
            }
        }
        System.out.println("El mensaje es: " + asciiMessage.toString());


    }
}
