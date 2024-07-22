import java.util.UUID;

public class Like {

    private UUID id;
    private User likedBy;
    
    public Like(User likedBy) {
        this.likedBy = likedBy;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public void setLikedBy(User likedBy) {
        this.likedBy = likedBy;
    }
    public UUID getId() {
        return id;
    }
    public User getLikedBy() {
        return likedBy;
    }
}
