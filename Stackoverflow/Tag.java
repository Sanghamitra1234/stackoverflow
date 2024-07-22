import java.util.UUID;

public class Tag {
    private UUID id;
    private String name;

    public Tag(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
