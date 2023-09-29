package io.githib.ndimovt;

public class MyFIFOQueue<Item> {
    private Node first;
    private Node last;
    private int size;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
        size++;
    }
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        size--;
        return item;
    }

}
