package io.githib.ndimovt;

public class MyStack<Item> {
    //LIFO Queue implementation
    private Item[] stackArray = (Item[]) new Object[2];
    private int size;
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void push(Item item){
        if(stackArray.length == size){
            resize(stackArray.length * 2);
        }
        stackArray[size++] = item;
    }
    private void resize(int index){
        Item[] tempArray = (Item[]) new Object[index];
        for (int i = 0; i < size ; i++) {
            tempArray[i] = stackArray[i];
        }
        stackArray = tempArray;
    }
    public Item pop(){
        Item lastItem = stackArray[--size];
        if(size == stackArray.length / 4){
            resize(stackArray.length / 2);
        }
        return lastItem;
    }

}
