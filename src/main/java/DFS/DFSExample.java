package DFS;

public class DFSExample {
	
	public void dfs(TreeNode root) {
		if(root == null)
			return;
		System.out.print(root.val+" ");
		dfs(root.left);
		dfs(root.right);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		DFSExample sol = new DFSExample();
		sol.dfs(root);
		
	}

}


class TreeNode {
	int val;
	TreeNode left,right;
	TreeNode(int x){
		val = x;
	}
}