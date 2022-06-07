package Main.Trees;

public class BinaryTree <T extends Comparable> {
    private DoubleNode <T> root;
    public BinaryTree(){root = null;}
    public BinaryTree(T o){root = new DoubleNode<T>(o);}
    public BinaryTree(T o, BinaryTree<T> tLeft, BinaryTree<T> tRight){
        root = new DoubleNode<>(o, tLeft.root, tRight.root);
    }
    public T getRoot(){return root.data;}
    public BinaryTree<T> getLeft(){
        BinaryTree<T> t = new BinaryTree<>();
        t.root = root.left;
        return t;
    }
    public BinaryTree<T> getRight(){
        BinaryTree<T> t = new BinaryTree<>();
        t.root = root.right;
        return t;
    }
    public  boolean isEmpty(){return root == null;}
}
