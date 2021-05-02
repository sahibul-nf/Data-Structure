/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data.learnstack;

import java.util.*;

/**
 *
 * @author sahibulNF13
 */
public class StackExp {

    protected int arr[];
    protected int top, size, len;

    // constructor for arrayStack
    public StackExp(int n) {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
    }

    // function to check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // function to check if stack if full
    public boolean isFull() {
        return top == size - 1;
    }

    // function to get the size of the stack
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return arr[top];
    }

    // function to add an element to the stack
    public void push(int i) {
        if (top + 1 >= size) {
            throw new IndexOutOfBoundsException("Overflow Exception");
        }
        if (top + 1 < size) {
            arr[++top] = i;
        }
        len++;
    }

    // function to delete an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        len--;
        return arr[top--];
    }

    // function to display the status of the stack
    public void display() {
        System.out.println("\nStack = ");
        if (len == 0) {
            System.out.println("Empty\n");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return len;
    }
}
