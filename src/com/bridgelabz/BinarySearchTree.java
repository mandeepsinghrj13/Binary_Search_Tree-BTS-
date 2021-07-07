package com.bridgelabz;
import java.util.Scanner;
public class BinarySearchTree 
{
	private BSTNode root;

    /* Constructor */
    public BinarySearchTree()
    {
        root = null;
    }
   
    /* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    private BSTNode insert(BSTNode node, int data)
    {
        if (node == null)
            node = new BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
   
    
    /* Function for inorder traversal */
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
	public static void main(String[] args) 
	{
		System.out.println("welcomr to bts");
		Scanner scan = new Scanner(System.in);
	       /* Creating object of BST */
	       BinarySearchTree bst = new BinarySearchTree(); 
	       System.out.println("Binary Search Tree ");          
	       char ch;
	       do    
	       {
	           System.out.println("\nBinary Search Tree Operations");
	           System.out.println("1. insert ");           
	         
	           int choice = scan.nextInt();            
	           switch (choice)
	           {
	           case 1 : 
	               System.out.println("Enter integer element to insert");
	               bst.insert( scan.nextInt() );                     
	               break;                                       
	                                                                       
	           default : 
	               System.out.println("Wrong Entry \n ");
	               break;   
	           }
	          
	           System.out.print("\nIn order : ");
	           bst.inorder();

	           System.out.println("\nDo you want to continue (Type y or n) \n");
	           ch = scan.next().charAt(0);                        
	       } while (ch == 'Y'|| ch == 'y');               
	   }
	

}
	    
	
                    
       

