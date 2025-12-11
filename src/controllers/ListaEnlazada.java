package controllers;

import models.Node;

public class ListaEnlazada<T> {
    public Node<T> head;
    private int size = 0;
    

    public void append(T data){
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node<T> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node<>(data));
        size++;
    }

    public void deleteFirst(){
        if (head != null) {
            head = head.getNext();
            size--;
        }
        
    }

    public void deleteLast(){
        if (head == null) {
            return;
        }
        if (head.getNext() == null) {
            head = null;
            return;
        }
        Node<T> current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        size--;
        current.setNext(null);
    }

    public void deleteNode(T data){
        Node<T> current = head;
        //verifica si esta vacio
        if (head == null) {
            return;
        }
        //verificar si el objetivo es primero / eliminar head
        if (head.getValue().equals(data)) {
            deleteFirst();
            return;
        }
        //iterar y preguntar por cada uno si es obj
        while (current.getNext() != null && !current.getNext().getValue().equals(data)) { 
            current = current.getNext();
        }

        if(current.getNext() != null){
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    public int size(){
        return size;
    }

    public void printAllNodes() {
        Node<T> current = head;
        System.out.print("Cima -> ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
}
    

