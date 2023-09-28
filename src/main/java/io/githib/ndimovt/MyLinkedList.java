package io.githib.ndimovt;
public class MyLinkedList<Item> {
    private int size;
    private Node last;
    private Node first;
    private class Node{
        Node next;
        Item item;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void offerFirst(Item item){
            Node oldFirst = first;
            first = new Node();
            first.item = item;
            first.next = oldFirst;
            size++;
    }
    public void offerLast(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = oldLast;
        size++;
    }
    public Item pollFirst(){
        Item firstItem = first.item;
        first = first.next;
        size--;
        return firstItem;
    }
    public Item pollLast(){
        Item lastItem = last.item;
        last = last.next;
        size--;
        return lastItem;
    }
    public Item peekFirst(){
        return first.item;
    }
    public Item peekLast(){
        return last.item;
    }
}
