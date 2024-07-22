import java.util.ArrayList;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private ArrayList<Question> question;
    private ArrayList<Answer> answer;

    public User(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.question = new ArrayList<Question>();
        this.answer = new ArrayList<Answer>();
    }

    public void postQuestion(Question q) {
        q.setAuthor(this);
        this.question.add(q);

        System.out.println("Question posted by " + this.name+" the question is :"+q.getTitle() + " and the body is :"+q.getBody());
    }

    public void answer(Question q, Answer a) {
        a.setAuthor(this);
        this.answer.add(a);
        q.addAnswer(a);
    }

    public void comment(Answer a, Comment c) {
        c.setAuthor(this);
        a.addComentsToAnswer(c);
    }

    public void likeQuestion(Question q) {
        q.questionLike(this);
    }

    public void likeAnswer(Answer a) {
        a.answerLike(this);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestion() {
        return question;
    }

    public void setQuestion(ArrayList<Question> question) {
        this.question = question;
    }

    public ArrayList<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<Answer> answer) {
        this.answer = answer;
    }

    public void getUserInfo(){
        System.out.println("Hi I am " + this.name);
        System.out.println("I have asked questions: ");

        for (int i = 0; i < this.question.size(); i++) {
            System.out.println(this.question.get(i).getTitle());
        }

        System.out.println("===================");

        System.out.println("I have answered the below questions: ");
        for (int i = 0; i < this.answer.size(); i++) {
            System.out.println(this.answer.get(i).getBody());
        }
        System.out.println("===================");
    }
}