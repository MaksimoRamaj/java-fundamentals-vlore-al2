package ushtrimi19;

public class Main {
    public static void main(String[] args) {

        Author a1 = new Author("Frasheri", "Shqiptar");
        Author a2 = new Author("Kadare", "Shqiptar");
        Author a3 = new Author("Kafka","German");

        Poem poem1 = new Poem(15,a1);
        Poem poem2 = new Poem(10,a2);
        Poem poem3 = new Poem(14,a3);

        Poem[] poems = new Poem[]{poem1,poem2,poem3};


        String authorSurname = "";
        int maxStrophes = 0;
        for (Poem poem : poems){
            if (maxStrophes < poem.getStrophes()){
                maxStrophes = poem.getStrophes();
                authorSurname = poem.getAuthor().getSurname();
            }
        }
        System.out.println("Autori me me shume strofa: "+
                authorSurname);
    }
}
