package DataStructures.Tries;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            if (!current.children.containsKey(ch)) {
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            current = current.children.get(ch);
            if (current == null) {
                return false;
            }
        }
        return current != null && current.isEndOfWord;
    }
}
