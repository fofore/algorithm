package uf;

public class QuickFindUF1 {
	private int[] arr;

	public QuickFindUF1(int N)
	{
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}
	}

	public boolean connected(int p, int q) 
	{
		return arr[p] == arr[q];
	}

	public void union(int p, int q)
	{
		int pid = arr[p];
		int qid = arr[q];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == pid) {
				arr[i] = qid;
			}
		}
	}

	public void printid()
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}