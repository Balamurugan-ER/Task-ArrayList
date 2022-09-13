/**
 * 
 */
package runner;
import java.util.*;

import framework.*;
/**
 * @author Balamurugan
 */
public class TestBArrayList {
	static Scanner scan = new Scanner(System.in);
	BArrayList obj = new BArrayList();
	private boolean isValidArr(String[] array,int expLength) throws MyException
	{
		obj.checkNull(array);
		if(array.length < expLength)
		{
			throw new MyException("Given Arguments are not Enough to Process");
		}
		return true;
	}
	private void isValidInd(int index,int maxIndex) throws MyException
	{
		if(index < 0 || index >= maxIndex)
		{
			throw new MyException("Index Not Valid");
		}
	}
	private void printAlDetails(ArrayList al) throws MyException
	{
		System.out.println("ArrayList : "+al);
		System.out.println("Length : "+obj.getSize(al));
	}
	private void mod1() throws MyException
	{
		ArrayList al = new ArrayList();
		printAlDetails(al);
	}
	private void mod2(String[] args) throws MyException
	{
		int n=5;
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter 5 Strings : ");
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			obj.setValue(al,args[i]);
		}
		printAlDetails(al);

	}
	private void mod3(String[] args) throws MyException
	{
		int n=5;
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter 5 Integers : ");
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			obj.setValue(al,Integer.parseInt(args[i]));
		}
		printAlDetails(al);
	}
	private void mod4(String[] args) throws MyException
	{
		int n=2;
		isValidArr(args,n);
		ArrayList<Dog> dogs = new ArrayList<Dog>();	
		obj.setValue(dogs, new Dog(args[0]));
		obj.setValue(dogs, new Dog(args[1]));
		printAlDetails(dogs);
	}
	private void mod5(String[] args) throws MyException
	{
		ArrayList al = new ArrayList();
		int n = 7;
		isValidArr(args,n);
		obj.setValue(al, Integer.parseInt(args[0]));
		obj.setValue(al, Integer.parseInt(args[1]));
		obj.setValue(al, args[2]);
		obj.setValue(al, args[3]);
		obj.setValue(al, args[4]);
		obj.setValue(al, new Dog(args[5]));
		obj.setValue(al, new Dog(args[6]));
		printAlDetails(al);
	}
	private void mod6(String[] args) throws MyException
	{
		ArrayList al = new ArrayList();
		int n=4;
		isValidArr(args,n);
		obj.setValue(al, args[0]);
		obj.setValue(al, args[1]);
		obj.setValue(al, args[2]);
		obj.setValue(al, args[3]);
		System.out.println("Enter the String two Find : ");
		String string = scan.next();
		int index = obj.indexOfObj(al, string,true);	
		System.out.println("Index : "+index);
		printAlDetails(al);
	}
	private void mod7(String[] args) throws MyException
	{
		ArrayList<String> al = new ArrayList<String>();
		int n=5;
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			obj.setValue(al, args[i]);
		}
		for (Iterator<String> iterator = al.iterator(); iterator.hasNext();) 
		{
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
	private void mod8(String[] args) throws MyException
	{
		int n =2;
		ArrayList al = new ArrayList();
		isValidArr(args,n);
		obj.setValue(al, args[0]);
		obj.setValue(al, args[1]);
		System.out.println("Enter the index (0,1) Find String : ");
		int index = scan.nextInt();
		isValidInd(index,n);
		String string = (String)obj.getValue(al, index);	
		System.out.println(string+" : at "+index);
		printAlDetails(al);
	}
	private void mod9(String[] args) throws MyException
	{
		ArrayList<String> al = new ArrayList<String>();
		int n = 5;
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			obj.setValue(al, args[i]);
		}
		System.out.println("Enter String To find in the ArrayList");
		String string = scan.next();
		System.out.println("Enter Boolean true for Find First Index\n False To Find Last Index");
		boolean first = scan.nextBoolean();
		int index = obj.indexOfObj(al,string,first);
		System.out.println(index);
		printAlDetails(al);
	}
	private void mod10(String[] args) throws MyException
	{
		ArrayList<String> al = new ArrayList<String>();
		int n = 5;
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			obj.setValue(al, args[i]);
		}
		System.out.println("Enter Index to add String");
		int index = scan.nextInt();	
		isValidInd(index,n);
		System.out.println("Enter String To add in the ArrayList");
		String string = scan.next();
		obj.setValue(al, string, index);
		printAlDetails(al);		
	}
	private void mod11(String[] args) throws MyException
	{
		ArrayList<String> al = new ArrayList<String>();
		int n = 10;
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			obj.setValue(al, args[i]);
		}
		System.out.println("Enter First index");
		int fromIndex = scan.nextInt();	
		isValidInd(fromIndex,n);
		System.out.println("Enter Last index");
		int toIndex = scan.nextInt();	
		isValidInd(toIndex,n);
		List l = obj.createSubList(al, fromIndex, toIndex);
		ArrayList<String> newAl = new ArrayList<String>(l);
		System.out.println("First ArrayList");
		printAlDetails(al);
		System.out.println("New ArrayList");
		printAlDetails(newAl);
	}
	private void mod12(String[] args) throws MyException
	{
		ArrayList<String> al1 = new ArrayList<String>();
		int limit1 = 3,limit2=5,total=limit1+limit2;
		isValidArr(args,total);
		for(int i=0;i< limit1;i++)
		{
			obj.setValue(al1, args[i]);
		}
		ArrayList<String> al2 = new ArrayList<String>();
		for(int i=limit1;i< total;i++)
		{
			obj.setValue(al2, args[i]);
		}
		ArrayList<String> al3 = new ArrayList<String>();
		al3.addAll(al1);
		al3.addAll(al2);
		System.out.println("First ArrayList");
		printAlDetails(al1);
		System.out.println("Second ArrayList");
		printAlDetails(al2);
		System.out.println("Third ArrayList");
		printAlDetails(al3);
	}
	private void mod13(String[] args) throws MyException
	{
		ArrayList<String> al1 = new ArrayList<String>();
		int limit1 = 5,limit2=3,total=limit1+limit2;
		isValidArr(args,total);
		for(int i=0;i< limit1;i++)
		{
			obj.setValue(al1, args[i]);
		}
		ArrayList<String> al2 = new ArrayList<String>();
		for(int i=limit1;i< total;i++)
		{
			obj.setValue(al2, args[i]);
		}
		ArrayList<String> al3 = new ArrayList<String>();
		al3.addAll(al2);
		al3.addAll(al1);
		System.out.println("First ArrayList");
		printAlDetails(al1);
		System.out.println("Second ArrayList");
		printAlDetails(al2);
		System.out.println("Third ArrayList");
		printAlDetails(al3);
	}
	private void mod14(String[] args) throws MyException
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		int n = 5;
		isValidArr(args,n);
		boolean index = false;
		for(int i=0;i<n;i++)
		{
			al.add(Integer.parseInt(args[i]));
		}
		printAlDetails(al);
		System.out.println("Enter True to Delete an index \nEnter False to Delete an element");
		index = scan.nextBoolean();
		System.out.println("Enter Number/index");
		int number = scan.nextInt();
		
		if(index)
		{
			isValidInd(number,n);
			al.remove(number);
		}
		else
		{
			al.remove((Object)number);
		}
		printAlDetails(al);
	}
	private void mod15(String[] args) throws MyException
	{
		ArrayList<Long> al = new ArrayList<Long>();
		int n = 10;
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			al.add(Long.parseLong(args[i]));
		}
		printAlDetails(al);
		System.out.println("Enter the From & To Index to Delete Values");
		int fromIndex = scan.nextInt();
		int toIndex = scan.nextInt();
		isValidInd(fromIndex,n);
		isValidInd(toIndex,n);
		obj.removeElements(al, fromIndex, toIndex);
		printAlDetails(al);
	}
	private void mod16(String[] args) throws MyException
	{
		ArrayList<String> fAl = new ArrayList<String>();
		ArrayList<String> sAl = new ArrayList<String>();
		int firstLen = 5,secondLen = 3,total=firstLen+secondLen;
		isValidArr(args,total);
		System.out.println("Enter True/false if need to remove presented element or not");
		boolean present = scan.nextBoolean();
		
		for(int i=0;i<firstLen;i++)
		{
			fAl.add(args[i]);
		}
		for(int i=firstLen;i<total;i++)
		{
			sAl.add(args[i]);
		}
		obj.removeIfPresent(fAl, sAl,present);
		printAlDetails(fAl);
		printAlDetails(sAl);
	}
	private void mod17(String[] args) throws MyException
	{
		ArrayList<Long> al = new ArrayList<Long>();
		int n = 10;
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			al.add(Long.parseLong(args[i]));
		}
		obj.removeAll(al);
		printAlDetails(al);				
	}
	private void mod18(String[] args) throws MyException
	{
		
		ArrayList<String> al = new ArrayList<String>();
		int n = 5;
		isValidArr(args,n);
		for(int i=0;i<n;i++)
		{
			obj.setValue(al, args[i]);
		}
		printAlDetails(al);
		System.out.println("Enter String to Find in the List");
		String string = scan.next();
		boolean present = obj.isPresent(al, string);
		System.out.println(present);
		printAlDetails(al);
		
	}
	public static void main(String[] args) throws MyException
	{
		TestBArrayList test = new TestBArrayList();
		System.out.println("1.Create ArrayList and Print Length");
		System.out.println("2.Add 5 String Objects & Print it and Length");
		System.out.println("3.Add 5 Integer Print Elements and length");
		System.out.println("4.Add Customs Objects");
		System.out.println("5.Add 2 Integers,3 Strings,2 Cust Objects");
		System.out.println("6.Find the index of Strings in ArrayList 4 Elements");
		System.out.println("7.Add 5 Strings - Print Using Iterator");
		System.out.println("8.String found by index 2 Elements");
		System.out.println("9.String to Index Find First/Last");
		System.out.println("10.Insert String at Given Index");
		System.out.println("11.Create SubList of given Indexes");
		System.out.println("12.Create 3rd ArrayList using 1st & 2nd ArrayList");
		System.out.println("13.Create 3rd ArrayList using 2nd & 1st ArrayList");
		System.out.println("14.Decimal Array List, Delete the Given elements");
		System.out.println("15.Long ArrayList deletes elements with range");
		System.out.println("16.Two ArrayList deletes first array list with condition");
		System.out.println("17.Add 10 Long And removes all ");
		System.out.println("18.Search a Element in a list ");
		System.out.println("0.Exit");
		try
		{	
			boolean flag = true;
			while(flag)
			{
				System.out.println("Enter Your choice");
				int n = scan.nextInt();
				switch(n)
				{
				case 0:
				{
					flag = false;
					break;
				}
				case 1: 
				{
					test.mod1();
					break;
				}
				case 2:
				{
					test.mod2(args);
					break;
				}
				case 3:
				{
					test.mod3(args);
					break;
				}
				case 4:
				{
					test.mod4(args);
					break;
				}
				case 5:
				{
					test.mod5(args);
					break;
				}
				case 6:
				{
					test.mod6(args);
					break;
				}
				case 7:
				{
					test.mod7(args);
					break;
				}
				case 8:
				{
					test.mod8(args);
					break;
				}
				case 9:
				{
					test.mod9(args);
					break;
				}
				case 10:
				{
					test.mod10(args);
					break;
				}
				case 11:
				{
					test.mod11(args);
					break;
				}
				case 12:
				{
					test.mod12(args);
					break;
				}
				case 13:
				{
					test.mod13(args);
					break;
				}
				case 14:
				{
					test.mod14(args);
					break;
				}
				case 15:
				{
					test.mod15(args);
					break;
				}
				case 16:
				{
					test.mod16(args);
					break;
				}
				case 17:
				{
					test.mod17(args);
					break;
				}
				case 18:
				{
					test.mod18(args);
					break;
				}
				}

			}


		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input type");
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("String Argument Found Instead of Number");
			e.printStackTrace();
		}
	}

}
