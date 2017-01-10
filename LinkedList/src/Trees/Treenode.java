package Trees;





/**
 * Created by dneralla on 1/8/17.
 */
public class Treenode {
    public int element;
    public Treenode left;
    public Treenode right;

    public Treenode(int element){
        this.element = element;
        this.left = null;
        this.right = null;
    }
}