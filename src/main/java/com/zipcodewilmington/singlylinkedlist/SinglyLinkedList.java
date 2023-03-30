package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    Node<T> head;

    public void add(T node) {
        if(head == null){
            head = new Node<>(node);
        }else{
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.setNext(new Node<>(node));
        }
    }


    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.getData();
    }

    public void remove(T toRemove) {
        Node<T> before = head;
        Node<T> after = head.next;

        while(after != null){
            if(after.getData().equals(toRemove)){
                Node<T> temp = after;
                after = after.next;
                before.next = after;
                return;
            } else{
                before = after;
                after = after.next;
            }
        }

    }

    public int size() {
        if(head == null){
            return 0;
        }
        Node<T> current = head;
        int count = 1;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean contains(T target) {
        Node<T> current = head;
        while(current != null){
            if(current.getData().equals(target)){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int find(T target) {
        if(head == null){
            System.out.println("null");
            return -1;
        }
        Node<T> current = head;
        int count = 0;
        while(current != null){
            if(current.getData().equals(target)){
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> newList = new SinglyLinkedList<>();
        Node<T> current = head;
        while(current != null){
            newList.add(current.getData());
            current = current.next;
        }
        return newList;
    }

    public void sort() {
        //T.T
    }
}
