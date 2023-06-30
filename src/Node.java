package src;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;

public class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    LinkedListNode(T data){
        this.data = data;
    }
}

class LinkedListUse{

   static Node<Integer> newElement = new Node<Integer>(40);

    public  static Node<Integer> addElement(Node<Integer> head){


        newElement.next=head;
        head=newElement;
        Node<Integer> temp=head;

        while(temp!=null){
            temp=temp.next;
        }
        return head;

    }

    public static LinkedListNode<Integer> deleteNodeRecusion(LinkedListNode<Integer> head,int pos) {
        if(head==null){
            return head;
        }
        if(pos==1 ){

            head.next=head.next.next;

            return head;

        }
        return deleteNodeRecusion(head.next,pos-1);
    }

    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
        if(head==null){
            return head;
        }
        if(pos==0) {
            return head.next;
        }
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer>  result=deleteNodeRecusion(head,pos);
        while(head!=null ){
            if(result==head){
                head.next=result.next;
                return head;
            }
            head=head.next;
        }
        return head;
    }


    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        Node<Integer> temp=head;
        HashSet<Integer> result=new LinkedHashSet<Integer>();
       while(temp!=null){
           if(!result.contains(temp.data)){
               result.add(temp.data);
           }
           temp=temp.next;
       }
        Node<Integer> resultHead=null;
        Node<Integer> tempHead=null;
        Node<Integer> nextElement;
       for(int val:result){
           if(resultHead==null){
               resultHead=new Node<>(val);
               tempHead=resultHead;
           }
           else {
               if(tempHead!=null){
                   nextElement=new Node<>(val);
                   tempHead.next=nextElement;
                   tempHead=tempHead.next;
               }

           }


       }
return resultHead;
    }
//    public  static void addElement(Node<Integer> head){
//
//        Node<Integer> temp=head;
//        Node<Integer> temp2;
//        int count=1;
//        while(temp!=null){
//            if(count==1){
//                temp2=temp.next;
//              temp.next=newElement;
//              temp.next.next=temp2;
//            }
//
//                temp=temp.next;
//
//            count++;
//        }
//
//
//    }

    public static void printReverse(Node<Integer> root) {
        if(root==null){
           return;
        }

        printReverse(root.next);
        System.out.print(root.data + " ");

        //Your code goes here
    }



    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //10 20 30 40 50


    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head ) {
        if(head==null) {
            return null;
        } if(head.next==null){
            return head;
        }
        LinkedListNode<Integer> prev=head;
        LinkedListNode<Integer> temp =  reverseLinkedListRec(head.next);
        temp.next=prev;
         System.out.println(temp.data);

        return temp;

    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {

        int count=0;
        int reCount=0;

        LinkedListNode<Integer> temp=head;

        if(head==null){
            return head;
        }
        while(head!=null){
            count++;
            head=head.next;
        }
        int midpoint=count/2;

        while(temp!=null) {

            if(reCount==midpoint){
                return temp;
            }
            reCount++;
            temp=temp.next;
        }
        return head;
    }


//1 4 5 2 -1
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> evenNode=null,evenHead=null;
        LinkedListNode<Integer> prevNode=null,prevHead=null;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> result;

        while(temp!=null){
            if(temp.data % 2==0){
                if(evenNode==null){
                    evenNode=temp;
                    evenHead=evenNode;
                }
                else {
                    evenNode.next=temp;
                    evenNode=evenNode.next;
                }

            }
            else {
                if(prevNode==null){
                    prevNode=temp;
                    prevHead=prevNode;
                }
                else {
                    prevNode.next=temp;
                    prevNode=prevNode.next;

                }

            }

            temp=temp.next;
        }
        if(prevHead!=null){
            prevNode.next=evenHead;
            return prevHead;
        }
        else {
            return evenHead;
        }

    }
    //you need to delete N nodes after every M nodes.
    // 1 2 3 4 5 6 7 8 -1
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {

        int includeCount=0;
        int skipCount=0;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> skipTemp=head;
        while(temp!=null){
            includeCount++;
            if(includeCount==M){

                while (skipCount<N){
                    skipTemp=skipTemp.next;
                    skipCount++;
                }
                includeCount=0;
                skipCount=0;
                temp.next=skipTemp.next;
            }
            else {
                temp=temp.next;
                skipTemp=temp;
            }

        }
return head;
    }
//10 20 30 40 -1
//1 2
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        LinkedListNode<Integer> temp=head,lastHead=null;
        LinkedListNode<Integer> temp1=null,temp2=null,prev1=null,prev2=null;
        int count=0;
        while(temp!=null){
            if(count==i){
                temp1=temp;
            }
            if(count==j){
                temp2=temp;
                lastHead=temp.next;
            }
            count++;
            if(temp1==null){
                prev1=temp;
            }
            if(temp2==null){
                prev2=temp;
            }
            if(i==0 && count==j){
                LinkedListNode<Integer> tempHead=temp;
                LinkedListNode<Integer> endElements=tempHead.next;
                LinkedListNode<Integer> startElement=head;
                temp.next=startElement.next;
                prev2.next=startElement;
                startElement.next=endElements;

                return temp2;
            }

            if(temp1!=null && temp2!=null){
                prev1.next=temp2;
                temp2.next=temp1;
                temp1.next=lastHead;

                return head;
            }
            temp=temp.next;


        }
        return head;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> result=null,temp=null,result1=null;
        LinkedListNode<Integer> temp1=head1;
        LinkedListNode<Integer> temp2=head2;

        while(temp1!=null && temp2!=null) {
            if(temp1.data<= temp2.data){
                if(temp==null){
                    temp=new LinkedListNode<Integer>(temp1.data);
                    result1=temp;
                    result=result1;
                }
                else {

                    temp=new LinkedListNode<>(temp1.data);
                    result.next=temp;
                    result=result.next;
                }
                temp1=temp1.next;
            }
            else {
                if(temp==null){
                    temp=new LinkedListNode<Integer>(temp2.data);
                    result1=temp;
                    result=result1;
                }
                else {
                    temp=new LinkedListNode<>(temp2.data);
                    result.next=temp;
                    result=result.next;
                }
                temp2=temp2.next;
            }
        }
        if (temp1==null){
            temp.next=temp2;
        } else {
            temp.next=temp1;
        }
        return result1;
    }
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {

        if(head==null){
            return head;
        }
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> tempHead=head;
        LinkedListNode<Integer> tempTailCursor=null,tempHeadCursor=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int startIndex=count-n;
        int reCount=0;
        temp=head;
        while(temp!=null && reCount<startIndex){
            tempHeadCursor=temp;
            temp=temp.next;
            reCount++;
        }
        tempTailCursor=temp;
        LinkedListNode<Integer> tempTail=tempTailCursor;

        while(tempTail.next!=null){
            tempTail=tempTail.next;
        }
        tempHeadCursor.next=null;
        tempTail.next=head;


        return tempTailCursor;
    }
//10,20,30

    public static boolean isPalindrome(LinkedListNode<Integer> head) {

        if(head==null || head.next==null){
            return true;
        }
        Stack<Integer> stack=new Stack<>();
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        while( head!=null ){
            if(stack.pop()!=head.data){
                return false;
            }
            head=head.next;
        }
        if(head==null ){
            return true;
        }
        return false;

    }

    public static void main(String args[]){

        Node<Integer> node1 = new Node<Integer>(3);
        Node<Integer> node2 = new Node<Integer>(6);
        Node<Integer> node3 = new Node<Integer>(9);

        node1.next = node2;
        node2.next=node3;

        LinkedListNode<Integer> node15 = new LinkedListNode<Integer>(3);
        LinkedListNode<Integer> node25 = new LinkedListNode<Integer>(6);
        LinkedListNode<Integer> node35 = new LinkedListNode<Integer>(9);

        node15.next = node25;
        node25.next=node35;

        LinkedListNode<Integer> node10 = new LinkedListNode<Integer>(9);
        LinkedListNode<Integer> node20 = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> node30 = new LinkedListNode<Integer>(3);
        LinkedListNode<Integer> node40 = new LinkedListNode<Integer>(3);
        LinkedListNode<Integer> node50 = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> node60 = new LinkedListNode<Integer>(9);


        node10.next = node20;
        node20.next=node30;
        node30.next=node40;
        node40.next=node50;
        node50.next=node60;


        isPalindrome(node10);
//1 11 3 6 8 0 9
       // 70 80 90 25 65 85 90
        LinkedListNode<Integer> node100 = new LinkedListNode<Integer>(70);
        LinkedListNode<Integer> node200= new LinkedListNode<Integer>(80);
        LinkedListNode<Integer> node300 = new LinkedListNode<Integer>(90);
        LinkedListNode<Integer> node400 = new LinkedListNode<Integer>(25);
        LinkedListNode<Integer> node500= new LinkedListNode<Integer>(65);
        LinkedListNode<Integer> node600 = new LinkedListNode<Integer>(85);
        LinkedListNode<Integer> node700 = new LinkedListNode<Integer>(90);

        node100.next = node200;
        node200.next=node300;
        node300.next=node400;
        node400.next = node500;
        node500.next=node600;
        node600.next=node700;
      //  deleteNodeRec(node10,2);
       // swapNodes(node100,0,6);
        //2 5 8 12 -1
        //3 6 9 -1
       // Node<Integer> result=addElement(node1);

        //print(result);
    }
}