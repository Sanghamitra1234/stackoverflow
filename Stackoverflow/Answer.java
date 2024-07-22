import java.util.ArrayList;
import java.util.UUID;

public class Answer {
    private UUID id;
    private User author;
    private String body;
    private ArrayList<Like> likes;
    private ArrayList<Comment> comments;
    
    public Answer(User author, String body) {
        this.id = UUID.randomUUID();
        this.author = author;
        this.body = body;
        this.likes = new ArrayList<Like>();
        this.comments = new ArrayList<Comment>();
    }

    public void answerLike(User likedBy) {
        Like l = new Like(likedBy);
        this.likes.add(l);
    }

    public void addComentsToAnswer(Comment c) {
        this.comments.add(c);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }
    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
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
