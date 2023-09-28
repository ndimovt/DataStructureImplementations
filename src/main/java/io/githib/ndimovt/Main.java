package io.githib.ndimovt;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();
        ms.push(22);
        ms.push(65);
        ms.push(54);
        ms.push(99);
        ms.push(78);
        System.out.println(ms.isEmpty());
        System.out.println(ms.size());
        while(!ms.isEmpty()){
            System.out.println(ms.pop());
        }
        System.out.println(ms.isEmpty());
        System.out.println(ms.size());
    }
}