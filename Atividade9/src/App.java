import br.unicesumar.edu.classes.Student;
import br.unicesumar.edu.classes.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.cadastrarUser();
        System.out.println(u);

        Student s = new Student();
        s.cadastrarUser();
        System.out.println(s);

        User u2 = new Student();
        u2.cadastrarUser();
        System.out.println(u2);
    }
}