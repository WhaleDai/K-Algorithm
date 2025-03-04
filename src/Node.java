import java.util.ArrayList;

public class Node {
	String name;
	int degree;
	ArrayList<String> edge;
	
	public Node() {
		this.name= "";
		this.degree= 0;
		this.edge= new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}
}
