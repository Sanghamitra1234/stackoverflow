import java.util.ArrayList;

public class StackOverFlow {

    public static void main(String[] args) {
        //create users
        User user1 = new User("John");
        User user2 = new User("Kris");
        User user3 = new User("Charlie");

        //create tags
        Tag tag1 = new Tag("Java");
        Tag tag2 = new Tag("Python");
        Tag tag3 = new Tag("C++");
    
        // create questions
        Question question1 = new Question(new ArrayList<Tag>() {{
            add(tag1);
            add(tag2);
        }}, 
        "How to create a class in Java?", 
        null, 
        "I am trying to create a class in Java but I am not able to do it. Can someone help me?");


        Question question2 = new Question(new ArrayList<Tag>() {{
            add(tag2);
        }}, 
        "How to create a class in Python?",
        null,
        "I am trying to create a class in Python but I am not able to do it. Can someone help me?");


        //create answers
        Answer answer1 = new Answer(null, "You can create a class in Java by using the class keyword.");
        Answer answer2 = new Answer(null, "You can create a class in Python by using the class keyword.");


        //create comments
        Comment comment1 = new Comment(null, "This is a great answer.");
        Comment comment2 = new Comment(null, "This worked for me.");
        Comment comment3 = new Comment(null, "This didnt work for me, can someone help me?");


        //Post questions
        //user1 post first question
        user1.postQuestion(question1);

        //user2 and user3 answers the question1
        user2.answer(question1, answer1);
        user3.answer(question1, answer1);

        //user3 comments on the answer1
        user3.comment(answer1, comment1);

        //user3 likes the question1 and answer1
        user3.likeQuestion(question1);
        user3.likeAnswer(answer1);
        

        //Get the questions and answer and likes by user1
        user1.getUserInfo();
    }
}
