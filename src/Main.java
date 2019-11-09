import ArticleGeneration.ArticleGenerator;

public class Main {
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