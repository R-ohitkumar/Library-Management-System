package libraryMangementSystem;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		char r;
		
		
		System.out.println();
		// TODO Auto-generated method stub
		System.out.println("********************* Library Management System****************************");
		do
		{
			System.out.println();
		System.out.println("Press 1 to add book");
		System.out.println();
		
		System.out.println("press 2 to issue  a book");
		System.out.println();
		
		System.out.println("press 3 to return a book");
		
		System.out.println();
		System.out.println("press 4 to print complete issue details");
		
		System.out.println();
		System.out.println("press 5 to exit");
		
		System.out.println();
		
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter your choice");
		int n=obj1.nextInt();
		
		System.out.println();
		
		
		switch(n)
		{
		
		case 1: 
			Library aa=new Library();
			aa.add();
			break ;
			
		case 2: 
			Library bb=new Library();
			bb.issue();
			break ;
			
		case 3:
			Library cc=new Library();
			cc.ret();
			break ;
			
			
		case 4:
			Library dd=new Library();
			dd.details();
			break ;
			
			
		case 5:
			Library ee=new Library();
			ee.exit();
			break ;
			
			default :
				System.out.println("Invalid number");
			
		}
		
		System.out.println("YOU WANT TO SELECT OTHER OPTION  :   Y/N");
		 r=obj1.next().charAt(0);
		}
		while(r=='y'||r=='Y');
		
		if(r=='n' || r=='N')
		{
			Library z=new Library();
			z.exit();
		}
		if(r!='y'|| r!='Y'  || r!='n' || r!='N')
		{
			System.out.println("Invalid Choice");
			System.out.println();
			System.out.println("###########      ThankYou    ############");
			//System.out.println("Plese Enter Y  or N");
		//	String p=obj1.nextLine();
			
		}
		
		
		
		

	}

}

class Library
{
	
	 static String str ,b,date ;
	 static int a,c;
	void add()
	{
		System.out.println("Enter book Name :");
		Scanner obj2= new Scanner(System.in);
		String str=obj2.nextLine();
		//obj2.next();
		System.out.println();
		System.out.println("Enter Price");
		float price = obj2.nextFloat();
		
		System.out.println();
		System.out.println("Enter Book number");
		int bookno=obj2.nextInt();
		//obj2.next();
		System.out.println("your details is :  ");
		
		System.out.println("Book Name: "+str);
		System.out.println("Book Price: "+price);
		System.out.println("Book no: "+bookno);
		System.out.println();
		System.out.println();
	}
	
	void issue()
	{
		Scanner obj3=new Scanner(System.in);
		System.out.println("Book Name");
		str =obj3.nextLine();
		
		System.out.println("Book_id");
		a=obj3.nextInt();
		obj3.nextLine();
		
		System.out.println("Issue Date");
		b=obj3.nextLine();
		
		System.out.println("Total no of book issued");
		c=obj3.nextInt();
		obj3.nextLine();
		
		System.out.println("Return book date");
		date=obj3.nextLine();
		
		System.out.println();
	}
	
	int getid()
	{
		return a;
	}
	void ret()
	{
		
		System.out.println("Enter Student Name");
		Scanner obj4=new Scanner(System.in);
		
		String name=obj4.nextLine();
		
		System.out.println("Enter Book_id");
		int book_id=obj4.nextInt();
		System.out.println();
		
		 
		if(a==book_id)
		{
			System.out.println("Total Details");
			System.out.println("Book Name :: " +Library.str  );
			System.out.println("Book id ::   " + Library.a);
			System.out.println("Issue date:: " + b);
			System.out.println("Total number of book issued :: "+Library.c);
			System.out.println("Book return date :: "+Library.date);
			
			System.out.println();
		}
		else
		{
			System.out.println("Wrong  Book_Id ");
			
			System.out.println();
			System.out.println("plese Enter correct Book Id");
		}
		
	}
	
	void details()
	{
		
		
		System.out.println("Book Name :: " +Library.str  );
		System.out.println("Book id ::   " + Library.a);
		System.out.println("Issue date:: " + Library.b);
		System.out.println("Total number of book issued :: "+Library.c);
		System.out.println("Book return date :: "+Library.date);
	}
	
	void exit()
	{
		System.exit(0);
	}
	
		
			
	
	
	
}
