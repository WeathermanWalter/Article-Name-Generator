package ArticleGeneration;

import java.util.Random;

public class ArticleGenerator {
    static Random r;
    static StringBuilder sb;

    static String[] subjects;
    static String[] descriptions;
    static String[] actions;

    public ArticleGenerator() {
        r = new Random();
        sb = new StringBuilder();
        subjects = new WordScanner("subject.txt").toArray();
        descriptions = new WordScanner("description.txt").toArray();
        actions = new WordScanner("actions.txt").toArray();
    }

    public static String getArticle() {

        //Get a persons name on there
        sb.append(getSubject());

        //Describe who they are
        if (r.nextDouble() < 0.5) { //50% chance
            sb.append(", " + getDescription() + ", ");
        }

        if (r.nextDouble() < 0.2) { //20%c chance
            sb.append(" and " + getSubject());
        }

        sb.append(" " + getAction());

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
        return subjects[r.nextInt(subjects.length)];
    }

    static String getDescription() {
        return descriptions[r.nextInt(descriptions.length)];
    }

    static String getAction() {
        return actions[r.nextInt(actions.length)];
    }
}
