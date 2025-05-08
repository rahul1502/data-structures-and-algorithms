package DataStructures.Tries;

public class TriesRunner {

    public void run() {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("able");
        trie.insert("application");
        trie.insert("aviator");
        trie.insert("avengers");

        System.out.println("Trie.search(apple) - " + trie.search("apple"));
        System.out.println("Trie.search(app) - " + trie.search("app"));
        System.out.println("Trie.search(cat) - " + trie.search("cat"));
        System.out.println("Trie.search(aviator) - " + trie.search("aviator"));

    }

}
