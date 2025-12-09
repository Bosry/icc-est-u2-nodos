package controllers;

import models.Person;
import models.Node;

public class Stack<T> {

    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = size;
    }

    // Metodo para insertar
    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        top = newNode;
        size++;
    }

    // Metodo para sacar y/o eliminar
    public T pop() {
        if (top == null) {
            return null;
        }
        T data = top.getValue();
        top = top.getNext();
        size--;
        return data;
    }

    // Retorna el primero pero sin eliminar
    public T peek() {
        if (top == null) {
            return null;
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        // if (isEmpty()) {
        // return 0;
        // }
        // int count = 1;
        // Node<T> aux = top;
        // while (aux.getNext() != null) {
        // aux = aux.getNext();
        // count++;
        // }
        // return count;
        return size;
    }

    public void printAllNodes() {
        Node<T> current = top;
        System.out.println("Cima -> ");
        while (current != null) {
            System.out.println(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

}
