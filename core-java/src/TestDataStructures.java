import com.mmcoe.ds.BinaryTree;

public class TestDataStructures {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.add(50);
		tree.add(30);
		tree.add(40);
		tree.add(70);
		tree.add(60);
		
		tree.traverse();
		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		list.insert(2, 25);
//		list.insert(0, 5);
//		list.insert(2, 15);
//		list.insert(5, 28);
//		
//		list.remove(4);
//		list.remove(0);
//		
//		list.remove(4);
//		list.add(50);
//		
//		list.print();
	}
}
