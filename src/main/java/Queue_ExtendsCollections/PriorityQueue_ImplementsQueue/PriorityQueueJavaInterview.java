package Queue_ExtendsCollections.PriorityQueue_ImplementsQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class EmpComparator implements Comparator<PriorityQueueJavaInterview.Employee> {

    @Override
    public int compare(PriorityQueueJavaInterview.Employee o1, PriorityQueueJavaInterview.Employee o2) {
        return o1.salary - o2.salary;  // return o1.salary - o2.salary - will receive the highest value.
    }
}

public class PriorityQueueJavaInterview {
    static class Employee {
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
        }
    }

    public static void main(String[] args) {
        EmpComparator comp = new EmpComparator();
        PriorityQueue<Employee> pre = new PriorityQueue<Employee>(10, comp);
        pre.add(new Employee("A", 3000));
        pre.add(new Employee("B", 5000));
        pre.add(new Employee("G", 2500));
        pre.add(new Employee("D", 3500));
        pre.add(new Employee("F", 1500));

        System.out.println(pre.poll());
        System.out.println(pre);  // There are no 'F' = 1500 - poll remove a value from element

//        System.out.println(pre.remove());  // it will give a SuchElementException, if queue is empty;
//        System.out.println(pre.poll());  // it will give a null, if queue is empty; Will remove the latest value.

    }
}
