/**
 * 
 */
package framework;
import java.util.*;
/**
 * @author Balamurugan
 *
 */
public class BArrayList {
	
	public void checkNull(Object obj) throws MyException
	{
		if(Objects.isNull(obj))
		{
			throw new MyException("Value should not be Null");
		}
	}
	public boolean isValidRange(int length,int fromIndex,int toIndex) throws MyException
	{
		if(fromIndex > toIndex)
		{
			throw new MyException("From Index Should be Lesser than To Index");
		}
		if(fromIndex > length || toIndex > length)
		{
			throw new MyException("Index Should not be Greater than size of list");
		}
		return true;
	}
	public int getSize(List l) throws MyException
	{
		checkNull(l);
		return l.size();
	}
	public boolean setValue(List l,Object obj) throws MyException
	{
		checkNull(l);
		return l.add(obj);
	}
	public void setValue(List l,Object obj,int index) throws MyException
	{
		if(index > getSize(l))
		{
			throw new MyException("Index should not be Greater than Size of List");
		}
		l.add(index,obj);
	}
	public int indexOfObj(List l,Object obj,boolean first) throws MyException
	{
		checkNull(l);
		if(first)
		{
			return l.indexOf(obj);
		}
		return l.lastIndexOf(obj);
	}
	public Object getValue(List l,int index) throws MyException
	{
		checkNull(l);
		return l.get(index);
	}
	public List createSubList(List l,int fromIndex,int toIndex) throws MyException
	{
		isValidRange(getSize(l),fromIndex,toIndex);
		return l.subList(fromIndex, toIndex);
	}
	public void removeElement(List l,Object obj) throws MyException
	{
		checkNull(l);
		l.remove(obj);
	}
	public void removeElements(ArrayList l,int start,int end) throws MyException
	{
		isValidRange(getSize(l),start,end);
		l.subList(start, end).clear();
	}
	public boolean isPresent(List l,Object o) throws MyException
	{
		checkNull(l);
		return l.contains(o);
	}
	public void removeIfPresent(List list,List subList,boolean present) throws MyException
	{
		checkNull(list);
		if(present)
		{
			list.removeIf(f->(subList.contains(f)));
		}
		else 
		{
			list.removeIf(f->(!subList.contains(f)));
		}
	}
	public void removeAll(List l) throws MyException
	{
		checkNull(l);
		l.clear();
	}
}
