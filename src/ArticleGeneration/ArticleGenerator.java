package ArticleGeneration;

import java.util.Random;

public class ArticleGenerator {
    static Random r;
    static StringBuilder sb;

    ArticleGenerator() {
        r = new Random();
        sb = new StringBuilder();
    }

    static String getArticle() {

        //Get a persons name on there
        if (r.nextDouble() < 1.0) { //100% chance
            sb.append(getSubject());
        }

        //Describe who they are
        if (r.nextDouble() < 0.5) { //50% chance
            sb.append(", " + getDescription() + ", ");
        }

        if (r.nextDouble() < 0.2) { //20%c chance
            sb.append(" and " + getSubject());
        }

        if (r.nextDouble() < 1.0) { //100% chance
            sb.append(" " + getAction());
        }

        if (r.nextDouble() < 0.2) { //20% chance
            sb.append(" and " );
            getArticle();
        }
        String article = sb.toString();
        sb = new StringBuilder();
        return article;
    }

    //supplemental methods

    static String getSubject() {
        //TODO
    }

    static String getDescription() {
        //TODO
    }

    static String getAction() {
        //TODO
    }
}
