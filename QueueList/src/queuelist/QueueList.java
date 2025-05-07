package queuelist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {

    public static void main(String[] args) {

        Queue<Integer> numbers = new LinkedList<>();

//        numbers.add(5);
//        numbers.offer(6);
//        numbers.offer(50);
//        numbers.offer(500);
        try {
            System.out.println(numbers);
            numbers.remove();
        } catch (Exception e) {
            System.out.println(e);
        }

//        System.out.println(numbers);
//        numbers.poll();
        System.out.println(numbers);
    }

}
