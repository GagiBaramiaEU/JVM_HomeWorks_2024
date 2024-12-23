package Task1;

public class Main {
    public static void main(String[] args) {
        WordPrinter wordPrinter = new WordPrinter();

        String sentence1 = "Hello from the other side";
        String sentence2 = "I am small girl";
        String sentence3 = "lovely tiny girl";

        PrintThread thread1 = new PrintThread(wordPrinter, sentence1);
        PrintThread thread2 = new PrintThread(wordPrinter, sentence2);
        PrintThread thread3 = new PrintThread(wordPrinter, sentence3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
