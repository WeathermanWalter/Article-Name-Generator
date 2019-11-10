import ArticleGeneration.ArticleGenerator;

public class Main {
    //Test main, prints out a new news article every 3 seconds
    static ArticleGenerator ag = new ArticleGenerator();

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(ag.getArticle());
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                //good
            }
        }
    }
}