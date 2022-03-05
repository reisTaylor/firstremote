package academy.learnprogramming.binarysearchtrees;

//4.) we need a new class to construct the tree
public class Tree {
    //5.) only need one instance field and that's the root node. if we have the root
    //we can get to everything else (like the head in a LinkedList)
    private TreeNode root;



    public void insert(int value)
    {
        if(root == null)
        {
            root = new TreeNode(value);
        }
        else
        {
            root.insert(value);
        }
    }

    //8.) after writing the traverseInOrder() method for traversing the tree, we write this method()
    //by the same name to traverse the root. The explanation for this being that after this method
    //executes, it will determine whether a tree exists, and calls the traverseInOrder() method
    // in TreeNode accordingly
    public void traverseInOrder()
    {
        if(root != null)
            root.traverseInOrder();
    }


    public TreeNode get(int value)
    {
        if (root != null)
        {
        return root.get(value);
        }
            return null;
    }
}
