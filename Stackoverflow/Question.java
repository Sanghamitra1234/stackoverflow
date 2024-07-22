import java.util.ArrayList;
import java.util.UUID;

public class Question {
    private UUID id;
    private ArrayList<Tag> tags;
    private String title;
    private User author;
    private String body;
    private ArrayList<Like> likes;
    private ArrayList<Answer> answers;

    public Question(ArrayList<Tag> tags, String title, 
        User author, String body) {
        this.id = UUID.randomUUID();
        this.tags = tags;
        this.title = title;
        this.author = author;
        this.body = body;
        this.likes = new ArrayList<Like>();
        this.answers = new ArrayList<Answer>();
    }

    public void addAnswer(Answer a) {
        this.answers.add(a);
    }

    public void questionLike(User likedBy) {
        Like l = new Like(likedBy);
        this.likes.add(l);
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }
    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }
    public ArrayList<Like> getLikes() {
        return likes;
    }
    public void setLikes(ArrayList<Like> likes) {
        this.likes = likes;
    }
    
    public void setId(UUID id) {
        this.id = id;
    }
    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public UUID getId() {
        return id;
    }
    public ArrayList<Tag> getTags() {
        return tags;
    }
    public String getTitle() {
        return title;
    }
    public User getAuthor() {
        return author;
    }
    public String getBody() {
        return body;
    }

}
