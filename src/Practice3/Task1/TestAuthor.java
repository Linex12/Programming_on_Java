package Practice3.Task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Carl Jupiter","carjulp@gmail.com",'M');
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());
        author.setEmail("carl_jupiter@gmail.com");
        System.out.println(author);
    }
}
