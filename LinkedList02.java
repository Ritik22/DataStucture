package com.geekforgeek.programmae;

/**
 * Created by Sony on 19-05-2018.
 */
public class LinkedList02 {

 Node head;
 public void insert(int data){
  Node nodeActual=new Node();
  nodeActual.item=data;
  nodeActual.next=null;

  if(head==null){
      head=nodeActual;
  }else{

      //we will create an object wewill make it head and then iterate///
      Node n=head;
      while (n.next!=null){
          n=n.next;
      }
      n.next=nodeActual;
    //  n=nodeActual;
  }
 }
   public void show(){
     Node n1= head;
     while(n1.next!=null){
         System.out.println("node value is "+n1.item);
         n1=n1.next;
     }
       System.out.println(" the node value is " +n1.item);
   }
}
