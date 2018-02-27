package shapes;

public class ServerNameGenerator {

    public static String[] adjectives = {"Spooky", "Luminescent", "Enigmatic", "Nostalgic", "Fancy", "Blistering", "Blinding", "Perpetual", "Blissful", "Eventful"};
    public static String[] nouns = {"Comet", "Photon", "Planet", "Star", "Cloud", "Ocean", "Tree", "Lake", "Waterfall"};

    public static String getRand(String[] arr) {
        return arr[(int)(Math.random() * arr.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Here is your server name:\n%s-%s\n\n", getRand(adjectives), getRand(nouns));
        }
    }
}