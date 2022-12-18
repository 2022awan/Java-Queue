package queuejava;

import java.util.*;

public class QueueJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee awan = new Employee("fauzi", "darmawan", 2011);
        Employee bilbil = new Employee("bilbil", "lola", 4007);
        Employee cici = new Employee("cici", "caca", 2002);
        Employee mawar = new Employee("mawar", "indah", 3005);
        Employee desi = new Employee("desi", "mawasari", 7008);

        Queue<Employee> queue = new PriorityQueue<Employee>();
        queue.add(awan);
        queue.add(bilbil);
        queue.add(cici);
        queue.add(mawar);
        queue.add(desi);
        System.out.println("First init Queue");
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }
        System.out.println("\n");
        System.out.println("Head Of Queue");
        System.out.println(queue.element() + "--->> Using Element Method");
        System.out.println(queue.peek() + "--->> Using Peek Method");

        System.out.println("\n");
        System.out.println("Remove Head Of Queue");
        System.out.println(queue.remove(queue.element()));
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }

        System.out.println("\n");
        System.out.println("Head Of Queue After Remove");
        System.out.println(queue.element() + "--->> Using Element Method");
        System.out.println(queue.peek() + "--->> Using Peek Method");

        System.out.println("\n");
        System.out.println("Add data to Queue via offer");
        System.out.println(queue.offer(mawar));
        for (Employee employee : queue) {
            System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }

        System.out.println("\n");
        System.out.println("Get all data Queue");
        Iterator<Employee> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }

}