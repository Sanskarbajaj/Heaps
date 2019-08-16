package heaps;

import java.util.ArrayList;

public class heapimplementation {
	ArrayList<Integer> data=new ArrayList<Integer>();
	public void add(int item)
	{
		data.add(item);
		upheapify(data.size()-1);
	}

	private void upheapify(int ci) {
		
		int pi=(ci-1)/2;
		if(data.get(ci)<data.get(pi))
		{
			swap(pi, ci);
			upheapify(pi);
		}
		
	}
	public int remove()
	{ 
		swap(0,data.size()-1);
		int rv=data.get(data.size()-1);
		data.remove(data.size()-1);
		downheapify(0);
	return rv;	
	}
private void downheapify(int pi) {
		int lc=(pi*2)+1;
		int rc=(pi*2)+2;
		if(lc<data.size()&&data.get(lc)<data.get(pi))
		{
			swap(lc, pi);
			downheapify(lc);
		}
		if(rc<data.size()&&data.get(rc)<data.get(pi))
		{
			swap(rc, pi);
			downheapify(rc);
		}
		
	}

public void swap(int pi,int ci)
{
	int ith=data.get(pi);
	int jth=data.get(ci);
	data.set(pi,jth);
     data.set(ci,ith);	
}

public void display()
{
	System.out.println(data);
}
public int size()
{
	return data.size();
}
public boolean isempty()
{
	return this.data.size()==0;
}
	public static void main(String[] args) {
		heapimplementation heap=new heapimplementation();
		heap.add(10);
		heap.add(20);
		heap.add(30);
		heap.add(40);
		heap.add(9);
		heap.display();
		heap.add(4);
		heap.display();
		System.out.println(heap.remove());
		//heap.display();
		System.out.println(heap.remove());
		//heap.display();
		System.out.println(heap.remove());
		//heap.display();
		System.out.println(heap.remove());
		//heap.display();
		System.out.println(heap.remove());
	//	heap.display();
		System.out.println(heap.remove());
		//heap.display();
		
	   
	}

}
