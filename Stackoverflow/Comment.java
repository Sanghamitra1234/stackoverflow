import java.util.ArrayList;
import java.util.UUID;

public class Comment {
    private UUID id;
    private User author;
    private String body;
    private ArrayList<Like> likes;

    public Comment(User author, String body) {
        this.author = author;
        this.body = body;
        this.likes = new ArrayList<Like>();
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public ArrayList<Like> getLikes() {
        return likes;
    }
    public void setLikes(ArrayList<Like> likes) {
        this.likes = likes;
    }
}
