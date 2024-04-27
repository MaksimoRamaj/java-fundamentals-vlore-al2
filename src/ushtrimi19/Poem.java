package ushtrimi19;

public class Poem {
    private int strophes;
    private Author author;

    public Poem(int strophes, Author author) {
        this.strophes = strophes;
        this.author = author;
    }

    public Poem() {
    }

    public int getStrophes() {
        return strophes;
    }

    public void setStrophes(int strophes) {
        this.strophes = strophes;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
