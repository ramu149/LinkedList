package Trees;

public class BinarySearchTree {


    private Treenode root = null;


    public void addElement(int element) {
        this.root =  insert(this.root,element);
    }


    private Treenode insert(Treenode node, int element){

        if(node == null) {
            node = new Treenode(element);
            return node;

        } else {
            if (element < node.element) {
                 node.left = insert(node.left, element);
            } else {
                node.right = insert(node.right, element);
            }
            return node;
        }

    }

    public void printInorder() {
        printInorder(this.root);
    }

    private void printInorder(Treenode node){
        if(node == null)
            return ;
        printInorder(node.left);
        System.out.println(node.element);
        printInorder(node.right);
    }



    public void printPreOrder() {
    	printPreOrder(this.root);
    }
    private void printPreOrder(Treenode node){
    	if(node==null){
    		return;
    	}
    	System.out.println(node.element);
    	printPreOrder(node.left);
    	printPreOrder(node.right);
    }
    public void printPostOrder() {
    	printPostOrder(this.root);
    }
    private void printPostOrder(Treenode node) {
    	if(node==null){
    		return;
    	}
    	printPostOrder(node.left);
    	printPostOrder(node.right);
    	System.out.println(node.element);
    	
    }
    
    

    public boolean isPresent(int element) {
    	
       	return isPresent(this.root,element);
    	
    
    }
    private boolean isPresent(Treenode node,int element) {
    	if(node==null)
    		return false;
    	else if(node.element==element)
        	return true;
    	else if(node.element>element)
    		return isPresent(node.left,element);
    	else 
    		return isPresent(node.right,element);
    	
    }

    public Treenode mirrorTree(Treenode node){
    	
    	if(node!=null){
    	Treenode temp;
    	temp=node.left;
    	node.left=node.right;
    	node.right=temp;	
    	mirrorTree(node.left);
    	mirrorTree(node.right);
    	return node;
    	}
    	
    	return node;
    }
    
    public int countElements( Treenode node){
    	if(node==null)
			return 0;
		else if (node.left==null&&node.right==null)
			return 1;
		else return 1+countElements(node.left)+countElements(node.right);
			
    }	
    	
    public int maxDepth(Treenode node){
    	int countLeftDepth=0;
    	int countRightDepth=0;
    	if(node==null)
			return 0;
    	else if (node.left==null&&node.right==null)
			return 1;
    	else{
    		countLeftDepth =maxDepth(node.left);
    		countRightDepth=maxDepth(node.right);
    		return (countLeftDepth>countRightDepth)? countLeftDepth+1:countRightDepth+1;
    	}
    	
    }
    public static void main(String[] args) {
        BinarySearchTree searchTree= new BinarySearchTree();
        searchTree.addElement(5);
        searchTree.addElement(3);
        searchTree.addElement(6);
        searchTree.addElement(2);
        searchTree.addElement(4);
        searchTree.addElement(1);
        System.out.println("Inorder:");
        searchTree.printInorder();
        System.out.println("Postorder:");
        searchTree.printPostOrder();
        System.out.println("Preorder:");
        searchTree.printPreOrder();
        System.out.println("find");
        System.out.println(searchTree.isPresent(8));
        System.out.println("mirror");
        searchTree.mirrorTree(searchTree.root);
        searchTree.printInorder();
        searchTree.printPostOrder();
        System.out.println("count");
        System.out.println(searchTree.countElements(searchTree.root));
        System.out.println(searchTree.maxDepth(searchTree.root));
    }



}
