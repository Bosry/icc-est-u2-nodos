import models.Person;
import controllers.Stack;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Person> persons = new Stack<Person>();
        persons.push(new Person("Juan", 30));
        persons.push(new Person("Maria", 35));
        persons.push(new Person("Pepito", 32));
        persons.push(new Person("Diego", 31));

        System.out.println("Size=" + persons.size());
        persons.printAllNodes();
        System.out.println(persons.pop());
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();

    }
}
