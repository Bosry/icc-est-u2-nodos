package controllers;

import models.Node;
import models.Person;

public class Queue<T>{

    private Node<T> first;
    private Node<T> last;
    private int size;
   
    public Queue(){
        this.first = null;
        this.last = null;
        this.size = size;
    }


    public T getFirst(){
        if (isEmpty()) {
            return null;
        }
        return first.getValue();
    }

    public T getLast(){
        if (isEmpty()) {
            return null;
        }
        return last.getValue();
    }

    public boolean isEmpty(){
        return first == null;
    }
    public void enqueue(T data){
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            // lleno 2
            first = newNode;
            last = newNode;
        }else{
            // lleno ultimo
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }
    
    public T dequeue(){
        if (isEmpty()) {
            return null;
        }
        T data = first.getValue();
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        size--;
        return data;
    }   

    public int size(){
        return size;
    }

    public void printAllNodes() {
        Node<T> current = first;
        System.out.print("Cima -> ");
        while (current != null) {
            System.out.print("Person: [");
            System.out.print(current.getValue() + "] -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
}