public class Pangram {
    public static void main(String[] args) {
        String sentence = "teqickobrownfoxjumpsoverthelazydogdfdfdfd";
        boolean checker = PangramChecker(sentence);
        if (checker) {
            System.out.println("the sentence is pangram");
        } else System.out.println("the sentence isn't pangram");
    }

    static boolean PangramChecker(String sentence) {
        boolean[] seen = new boolean[26];
        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            int index = c - 'a';
            seen[index] = true;
        }
        //now we'll check if all letters exist or nah
        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
