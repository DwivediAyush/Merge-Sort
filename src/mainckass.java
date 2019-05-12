import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class node
{
    int data;
    node next;
}
public class mainckass
{
   node head;
 node que2head;
   node que2tail;
    node tail;
    Queue<Integer> Q
            = new LinkedList<Integer>();
    void insert(int data)
    {
       node n=new node();
       n.data=data;
       Q.add(data);
       if(que2head ==null)
       {
           que2head =n;
           que2tail =n;

       }
       else
       {
           que2tail.next=n;
           que2tail =n;

       }
    }

    Stack<Integer> stack=new Stack<Integer>();
    void reverse()
    {


        while(Q.size()>0)
        { //int d=delete();
            //System.out.println(d);
       //    System.out.println(Q.peek());
           stack.push(Q.remove());


           //d=delete();
        }
//insrtion;

    }
    void insertre()
    {
        while(!stack.empty()) {
         //   System.out.println(stack.peek());
            node n = new node();
            n.data = stack.pop();
            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next=n;
                tail=n;
            }

        }
    }
    void printq1()
    {
        node temp=head;
        while(temp!=null) {
            System.out.print(temp.data);
         temp=temp.next;
        }
    }
    void printq2()
    {
        node temp=que2head;
        while(temp!=null) {
            System.out.print(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        mainckass obj=new mainckass();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.reverse();
        obj.insertre();
        System.out.println("reverse");
        obj.printq1();

        System.out.println("original");
        obj.printq2();
    }
}