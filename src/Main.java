import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	    String[] words = new String[]{
	            "Hello", "I", "am", "ILYOS",
                "TeST", "aioYT", "AAbCDOJIJ",
                "w2fh(k", "Kj%?df", "BKH+/456JYV~",
                "Yf^#K", "sf)4;M", "BKU*=!njIKB"
        };

        for (String word : words) {
            System.out.println(word + " => " + detectCapital(word));
        }
    }

    private static boolean detectCapital(String word){
        if (word.length() < 2) return true;
        Predicate<Character> incorrectCase = Character::isUpperCase;

        if(incorrectCase.test(word.charAt(0)) && incorrectCase.test(word.charAt(1))) {
            incorrectCase = Character::isLowerCase;
        }

        for (int i = 1; i < word.length(); i++) {
            if (incorrectCase.test(word.charAt(i))) return false;
        }

        return true;
    }
}
