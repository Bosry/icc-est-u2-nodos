
import controllers.ListaEnlazada;
import models.Person;


public class App {
    public static void main(String[] args) throws Exception {
        // Queue<Person> persons = new Queue<Person>();
        // persons.enqueue(new Person("Juan", 30));
        // persons.enqueue(new Person("Maria", 35));
        // persons.enqueue(new Person("Pepito", 32));
        // persons.enqueue(new Person("Diego", 31));

        // System.out.println("Size=" + persons.size());
        // persons.printAllNodes();
        // System.out.println("Person " + persons.dequeue());
        // System.out.println("Primera person: " + persons.getFirst());
        // System.out.println("Ultimo person: " + persons.getLast());
        // System.out.println("Size= " + persons.size());
        // persons.printAllNodes();
        runLinkedListExample();

        // Person personA = new Person("Pepito", 32);
        // Person personB = new Person("Pepito", 32);

        // System.out.println(personA);
        // System.out.println(personB);
        
        // System.out.println(personA.equals(personB));
        
    }

    public static void runLinkedListExample() {
        ListaEnlazada<Person> persons = new ListaEnlazada<Person>();
        persons.append(new Person("Juan", 30));
        persons.append(new Person("Maria", 35));
        persons.append(new Person("Pepito", 32));
        persons.append(new Person("Diego", 31));
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();
        persons.deleteNode(new Person("Pepito", 32));
        persons.printAllNodes();
        persons.deleteFirst();
        persons.printAllNodes();
        persons.deleteLast();
        persons.printAllNodes();
        System.out.println("Size=" + persons.size());
    }
}
