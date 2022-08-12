import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        this.set = new HashSet<>();
    }

    public boolean hasWord(String word) {
        text.toLowerCase();
        word.toLowerCase();
        List<String> list = List.of(text.split("\\P{IsAlphabetic}+"));
        set.addAll(list);
        return set.contains(word);
    }

    @Override
    public String toString() {
        return set.toString();
    }
}