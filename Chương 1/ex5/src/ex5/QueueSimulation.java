package ex5;

import java.util.LinkedList;

public class QueueSimulation {

    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Sau khi them 10, 20, 30:          " + queue);

        queue.addFirst(5);
        queue.addLast(40);

        System.out.println("Sau khi them 5 vao dau va 40 vao cuoi: " + queue);

        queue.removeFirst();
        queue.removeLast();

        System.out.println("Sau khi xoa phan tu dau va cuoi:       " + queue);

        System.out.println("\nDanh sach con lai:");
        for (Integer num : queue) {
            System.out.println("- " + num);
        }
    }
}
