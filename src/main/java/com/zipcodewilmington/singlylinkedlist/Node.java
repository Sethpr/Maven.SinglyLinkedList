package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {

    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }


    public T getData() {
        return data;
    }
}
