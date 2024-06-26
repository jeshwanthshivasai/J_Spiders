class Author {    
    public void writeStory() {
        System.out.println("Writing Story");
    }
    public void reviewStory() {
        System.out.println("Reviewing Story");
    }
}
class Book {
    public void holdStory() {
        System.out.println("Story Holded");
        Author am = new Author();
        am.writeStory();
    }
    public void navigatePage() {
        System.out.println("Navigating Page");
        Author am1 = new Author();
        am1.reviewStory();
    }
}
class AuthorMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.holdStory();
        b1.navigatePage();
    }
}
