/**
*  File Name: Main.java
*
*  Software Quality Assurance Corporation 
*  Code Review Project
*
*  (c) Copyright 2023 SQAC
*  ALL RIGHTS RESERVED
*
* Functional description: This class demonstrates the working of the
* singly-linked list SSL implementation.
*
* Input: None.

* Output: None except error messages. 

* Supported Requirements: TBD

* Classes in this file: this class

* Related Documents: None; this file provides in-code documentation.

* Update History: 

* Error Messages:
 
* Constraints: None. 

* Assumptions: None. 
**/

package sll;

public class Main {
   public static void main(String[] args) {
      SinglyLinkedList sll=new SinglyLinkedList();
      // inserting 10 elements
      for(int i=9; i>=0; i--) {
         Node node=new Node(""+i);
         sll.insert(node, sll.head());
      } 
      System.out.println(sll);
      
      // insert 20 before 5
      Node n5=sll.find("5");
      sll.insert(new Node("20"), n5); 
      System.out.println(sll);

      // delete 6
      Node n6=sll.find("6");
      sll.remove(n6); 
      System.out.println(sll);
   }
}
         
