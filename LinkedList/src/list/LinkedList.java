package list;

public class LinkedList {
	 private Node head;
	    
	    public LinkedList(){
	        head = null;
	    }
	    
	    public void add(String element) {
	        if(head == null){
	            head = new Node(element);
	            return ;
	        }
	        
	        Node temp = head;
	        while (temp.next != null){
	            temp = temp.next;
	        }
	        
	        temp.next = new Node(element);
	        
	    }
	    
	    public void removeHead (){
	       head=head.next;
	    }
	    
	    public void printList(){
	    	Node temp = head; 
	    	while(temp!=null){
	    		System.out.println(temp.element);
	    		temp=temp.next;
	    	}
	    }
	    
	    public void removeAtIndex(int index){
	    	if(head!=null&&index>0){
	    		Node temp=head;
	    		int id=0;
	    		while(temp!=null){
	    			if(id==index-1&&temp.next!=null){
	    				temp.next=temp.next.next;
	    				break;
	    			}
	    			temp=temp.next;
	    			id++;
	    		}
	    	}else head= head.next;
	    	
	    }

	    public  String get(int index) {
	    	if(head!=null){
	    		Node temp=head;
		    	int id=0;
		    	while(temp!=null){
		    		if(id == index)
		    			return temp.element;
		    		temp=temp.next;
		    		id++;
		    	}
		    	}
	    	return null;
	  
	    }
	    public void insertAtIndex(int index, String ele){
	    	if(head!=null){
	    		Node temp = head;
	    		int id=0;
	    		while(temp!=null){
	    			if(id==index-1){
	    				temp.next=new Node(ele,temp.next);
	    				break;
	    			}
	    			temp=temp.next;
	    			id++;
	    		}
	    	}
	    }
	    public void reverseLinkedList(){
	    	Node currNode=head; 
	    	Node nextNode=null, prevNode=null ; 
	    	while(currNode!=null){
	    		nextNode=currNode.next;
	    		currNode.next=prevNode;
	    		prevNode=currNode;
	    		currNode=nextNode;
	    	}
	    	head=prevNode;	
	    }
	    public Node mergeTwoLists(Node l1, Node l2){
	    	if(l1==null) return l2;
	    	if(l2==null) return l1;
	    	
	    	l1.next=l2;
	    	return l1;
	    	
	    }
	    public static void main(String args[]){
	    	LinkedList ll=new LinkedList();
	    	ll.add("hello");
	    	ll.add("world");
	    	ll.add("SFO");
	    	ll.add("Cali");
	    	//System.out.println(ll.get(0));
	    	//System.out.println(ll.get(1));
	    	//System.out.println(ll.get(3));
	    	//System.out.println(ll.get(10));
	    	//ll.printList();
	    	//ll.removeHead();
	    	//ll.printList();
	    	//ll.removeAtIndex(0);
	    	//ll.printList();
	    	//ll.removeAtIndex(3);
	    	//ll.printList();
	    	ll.insertAtIndex(3, "ram");
	    	ll.printList();
	    	ll.reverseLinkedList();
	    	ll.printList();
	    	LinkedList ll2=new LinkedList();
	    	ll2.add("tem");
	    	ll2.add("tem1");
	    	ll.mergeTwoLists(ll.head, ll2.head);
	    	ll.printList();
	    }
}
