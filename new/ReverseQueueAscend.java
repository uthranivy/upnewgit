import java.util.*;
import java.lang.*;

class StackOneQueue{
 
 public Queue<Integer> queue;
     
 public StackOneQueue()
 {
    this.queue = new LinkedList<Integer>();
 }
    
 public void push(int data) {
   this.queue.add(data);
 }
  
 public void pop() {
    this.queue.remove();
 }
    
 public void peek() {
  System.out.println("Element on top: " + this.queue.element());
 }
    
 public void reverse(){ 
      
     Integer temp;
     if(!queue.isEmpty()) {
         temp = this.queue.remove();
         this.reverse();
         this.queue.add(temp); 
      } 
 }
 
 public void printQueue()
 {
     System.out.println(this.queue.toString());
 }
}

class StackUsingQueueApp { 
 public static void main(String[] args) {
  StackOneQueue obj = new StackOneQueue();
  obj.push(1);
  obj.push(2);
  obj.push(3);
  obj.push(4);
  obj.push(5);
  obj.printQueue();   
  obj.reverse();
  obj.printQueue();   
 }
}
