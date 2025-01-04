package model;

import java.util.LinkedList;
import java.util.Queue;

public class QueOfCustomers {
    
    private Queue<Customer> customerQueue; 	// Queue to store customer objects

    // Constructor
    public QueOfCustomers() {
        customerQueue = new LinkedList<>();
    }

    // Add a customer to the queue
    public void addToQueue(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Customer added to the queue: " + customer);
    }

    // Remove and return the next customer in the queue
    public Customer removeFromQueue() {
        Customer removedCustomer = customerQueue.poll();
        if (removedCustomer != null) {
            System.out.println("Customer removed from the queue: " + removedCustomer);
        } else {
            System.out.println("Queue is empty. No customer to remove.");
        }
        return removedCustomer;
    }

    // Peek at the next customer in the queue without removing
    public Customer peek() {
        Customer nextCustomer = customerQueue.peek();
        if (nextCustomer != null) {
            System.out.println("Next customer in the queue: " + nextCustomer);
        } else {
            System.out.println("Queue is empty.");
        }
        return nextCustomer;
    }

    // Print all customers in the queue
    public void printQueue() {
        if (customerQueue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current Queue:");
            for (Customer customer : customerQueue) {
                System.out.println(customer);
            }
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return customerQueue.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return customerQueue.size();
    }

    
}

