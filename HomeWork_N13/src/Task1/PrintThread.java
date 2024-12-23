package Task1;

public class PrintThread extends Thread {
    private WordPrinter wordPrinter;
    private String sentence;

    public PrintThread(WordPrinter wordPrinter, String sentence) {
        this.wordPrinter = wordPrinter;
        this.sentence = sentence;
    }

    @Override
    public void run() {
        String[] words = sentence.split(" ");

        for (int i = 0; i < 10; i++) {
            synchronized (wordPrinter) {
                for (String word : words) {
                    wordPrinter.printWord(word);
                }
                System.out.println();
            }
        }
    }
}
