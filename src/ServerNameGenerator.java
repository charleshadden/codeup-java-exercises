import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        System.out.println("Here is your server name!");

        String[] nouns = {"cat","slime","fridge","light","swamp","governator","shoe","computer","drink","freedom"};
        String[] adjectives = {"gooey","sliced","covered","clothed","rubbery","justified","tiled","sticky","riled","mangy",};

        System.out.println(Rando(nouns, adjectives));
    }

    public static String Rando(String[] nouns, String[] adjectives) {

        Random random = new Random();
        return adjectives[random.nextInt(adjectives.length)] + "-" +  nouns[random.nextInt(nouns.length)];
    }

}
