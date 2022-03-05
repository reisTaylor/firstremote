package academy.learnprogramming.binarysearchtrees;

public class TreeNode {
    //1.) declare instance variables from the get-go
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    //6.) We need a method to insert a node. The algorithm is as follows:
    //if we come here in our program to insert a node:
    //I.) if the tree is empty, the value inserted becomes the root
    //II.) if the tree isn't empty we compare the value being passed to the value of the root.
    //III.) if it is less than the root node: go to the left
    //IV.) if it is greater than the root node: go to the right

    //3.) Constructor
    public TreeNode(int data)
    {
        this.data = data;
    }

    public void insert(int value)
    {
        if (value == data) //we are not allowing duplicate values in this tree.
        {
            return;
        }

        if (value < data) {
            if (leftChild == null) //then we have found or insertion point
            {
                leftChild = new TreeNode(value);
            }
            else {
                leftChild.insert(value);//calling the insert() method means we are going to continue
            }//exploring it's left subtree
        }
        else { //if value isn't equal to or less than the data, it must be greater than the data
            if (rightChild == null) //then we have found or insertion point
            {
                rightChild = new TreeNode(value);
            }
            else
            {
                rightChild.insert(value);//calling the insert() method means we are going to continue
            }//exploring it's right subtree
        }
    }

    public TreeNode get(int value)
    {
        if (value == data)
        {
            return this;
        }
        if(value < data)
        {
            if(leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else if (rightChild != null)
            {
                return rightChild.get(value);
            }
        return null;

    }

    //7.) we need a method for traversal.
    public void traverseInOrder()
    {
        if(leftChild != null)
            leftChild.traverseInOrder();
        System.out.print(data + ", ");
        if(rightChild != null)
            rightChild.traverseInOrder();
    }


    //2.) Next we generate the gets and sets for our instance variables
    //***************************************************************************************************
    //For data
    //***************************************************************************************************
    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }
    //***************************************************************************************************
    //For leftChild
    //***************************************************************************************************
    public TreeNode getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild)
    {
        this.leftChild = leftChild;
    }
    //***************************************************************************************************
    //For rightChild
    //***************************************************************************************************
    public TreeNode getRightChild()
    {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {

        this.rightChild = rightChild;
    }
}
