
public class BinaryTree {
	private TreeNode root;
	BinaryTree()
	{
		root=null;
	}
	void find(int data)
	{
		TreeNode current = root;
		while(current!=null)
		{
			if(current.data==data)
			{
				System.out.println("Present");
			}
			else if(current.data>data)
			{
				current=current.left;
			}
			else
				current=current.right;
		}
	}
	void insert(int data)
	{
		TreeNode temp = new TreeNode(data);
		if(root==null)
		{
			root=temp;
			return;
		}
		TreeNode current = root;
		TreeNode parent=null;
		while(true)
		{
			parent=current;
			if(data<current.data)
			{
				current=current.left;
				if(current==null)
				{
					parent.left=temp;
					return;
				}
			}
			else
			{
				current = current.right;
				if(current==null)
				{
					parent.right=temp;
					return;
				}
			}
		}
	}
	void display(TreeNode root)
	{
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public static void main(String[] args) {
		BinaryTree ob = new BinaryTree();
		ob.insert(1);
		ob.insert(2);
		ob.insert(3);
		ob.insert(4);
		ob.insert(5);
		ob.insert(6);
		ob.insert(7);
		ob.insert(8);
		ob.display(ob.root);
	}

}
