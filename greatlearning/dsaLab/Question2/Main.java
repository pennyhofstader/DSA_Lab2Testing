package greatlearning.dsaLab.Question2;

import greatlearning.dsaLab.Question2.SumOfTwoNodesFunction.Node;

public class Main {
	// Driver code
	public static void main(String[] args) {
		Node root = null;
		int sum = 110;
		SumOfTwoNodesFunction findSumPair = new SumOfTwoNodesFunction();
		root = findSumPair.insert(root, 40);
		root = findSumPair.insert(root, 20);
		root = findSumPair.insert(root, 60);
		root = findSumPair.insert(root, 10);
		root = findSumPair.insert(root, 30);
		root = findSumPair.insert(root, 50);
		root = findSumPair.insert(root, 70);
		System.out.println("Sum = " + 130);
		findSumPair.findPairOfSum(root, sum);
	}

}
