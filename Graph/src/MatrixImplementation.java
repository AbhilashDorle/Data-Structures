
public class MatrixImplementation {
	private boolean Graph[][];
	int vertexcount;
	MatrixImplementation(int count)
	{
		vertexcount=count;
		Graph= new boolean[vertexcount][vertexcount];
	}
	void addedge(int i,int j)
	{
		if(i>=0 && i<vertexcount && j>=0 && j<vertexcount)
		{
			Graph[i][j]=true;
			Graph[j][i]=true;
		}
	}
	void removeedge(int i,int j)
	{
		if(i>=0 && i<vertexcount && j>=0 && j<vertexcount)
		{
			Graph[i][j]=false;
			Graph[j][i]=false;
		}
	}
	boolean isedge(int i,int j)
	{
		if(i>=0 && i<vertexcount && j>=0 && j<vertexcount)
		return Graph[i][j];
		else
			return false;
	}
	public static void main(String[] args) {
		MatrixImplementation ob = new MatrixImplementation(8);
		ob.addedge(1, 2);
		ob.addedge(2, 3);
	}

}
