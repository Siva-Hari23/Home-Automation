import java.util.Scanner;
import java.time.LocalTime;
import java.io.Console;
import java.time.temporal.ChronoUnit;
class Main
{
	static Scanner sc=new Scanner(System.in);
	static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
	static String whitebackground = "\u001B[47m";
	static String black = "\u001B[30m";
	static Console console = System.console();
	public static void main(String[]args)
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                               *************************************************************");
		System.out.println("                              *  *                                                          *");
		System.out.println("                             *    *                                                          *");
		System.out.println("                            *      *                     PROJECT - OOPS                       *");
		System.out.println("                           *        *                                                          *");
		System.out.println("                          *          *                                                          *");		
		System.out.println("                          ***********************************************************************");
		System.out.println("                          *          *    "+yellow+" ______  ______   ___  ______  __ ______  __  _______ "+def+"*");
		System.out.println("                          *          *  "+yellow+"  / __/  |/  / _ | / _ \\/_  __/ / // / __ \\/  |/  / __/ "+def+"*");
		System.out.println("                          *   *****  *  "+yellow+" _\\ \\/ /|_/ / __ |/ , _/ / /   / _  / /_/ / /|_/ / _/   "+def+"*");
		System.out.println("                          *   *   *  *"+yellow+"  /___/_/  /_/_/ |_/_/|_| /_/   /_//_/\\____/_/  /_/___/   "+def+"*");
	    System.out.println("                          *   *   *  *                                                          *");
		System.out.println("                          *   *   *  *"+skblue+"  YOUR HOME, YOUR RULES - ALL WITHOUT MANUAL MANEUVERS"+def+"    *");
	    System.out.println("                          ***********************************************************************");
		System.out.println();
		System.out.println();
		Login loginobj=new Login();
		System.out.println(blue+"                                                     ENTER INTO HOME BY"+def);
		System.out.println(yellow+"                                                        1 . LOGIN"+def);
		System.out.println(yellow+"                                                        2 . SIGNUP"+def);		
		System.out.println();
		int n=0;
		do
		{
			System.out.print(skblue+"                                                     ENTER THE INPUT : "+def);
			String logindetails=Main.sc.next();
			switch(logindetails)
			{
				case "1":loginobj.login();
						n=1;
						break;
				case "2":loginobj.signup();
				System.out.println();
			System.out.println(Main.green+Main.blink+"          Signup Succesfull	Signup Succesfull	Signup Succesfull	Signup Succesfull	Signup Succesfull"+Main.def);
			System.out.println();
			System.out.println("                                                     PLEASE LOGIN WITH SAME DETAILS"+Main.def);
						loginobj.login();
						n=1;
						break;
				default:
				System.out.println(Main.red+Main.blink+"                                                        INVALID INPUT");

			}
		}while(n!=1);
		RoomDisplay RoomsDisplayobj=new RoomDisplay();
		RoomsDisplayobj.RoomDisplay();
	}	
}
class Login
{
	int c=0;
	int c1=0;
	int c2=0;
	int n5=0;
	private String Username="ProjectOOps";
	private String Password="Corejava@1";
	private String Phonenumber="9364587144";

	void login()
	{
		do
		{
			System.out.print(Main.skblue+"                                              Enter your username : "+Main.def);
			String Username=Main.sc.next();
			System.out.println();
			if(this.Username.equals(Username))
			{
				break;
			}
			else
			{
				System.out.println(Main.red+Main.blink+"                                                     Incorrect Username "+Main.def);
				
			}
		}while(true);
		do
		{
			char[] passwordArray = Main.console.readPassword(Main.skblue+"                                        Enter your Password : (Password will not be visible)"+Main.def);
			String Password = new String(passwordArray);
			System.out.println();	
			if(this.Password.equals(Password))
			{
				break;
			}
			else
			{
					System.out.println(Main.red+Main.blink+"                                                     Incorrect Password"+Main.def);
			}
		}while(true);
		do
		{
			System.out.print(Main.skblue+"                                              Enter Phonenumber   : "+Main.def);
			String Phonenumber=Main.sc.next();
			System.out.println();

			if(this.Phonenumber.equals(Phonenumber))
			{
				break;
			}
			else
			{
				System.out.println(Main.red+Main.blink+"                                                     Incorrect Phonenumber"+Main.def);
					
			}
		}while(true);
		System.out.println(Main.green+Main.blink+"          Login Succesfull 	Login Succesfull	 Login Succesfull	 Login Succesfull	 Login Succesfull"+Main.def);
	}
	void signup()
	{
		if(c==0)
		{
			System.out.print(Main.skblue+"                                                     Enter your username : "+Main.def);
			String Username=Main.sc.next();
			setUsername(Username);
						System.out.println();
		}
		if(c1==0)
		{

			System.out.println(Main.green+"                                         *Password must contain more than 10 characters*"+Main.def);
			System.out.println(Main.green+"                                      *Password must contain atleast one special character*"+Main.def);
			System.out.println(Main.green+"                                           *Password must contain atleast one number *"+Main.def);
			char[] passwordArray = Main.console.readPassword(Main.skblue+"                                       Enter your Password : (Password will not be visible)"+Main.def);
			String Password = new String(passwordArray);

						System.out.println();
			setPassword(Password);
			if(c1==0)
			{
			System.out.println(Main.green+"                                                     CONFIRM PASSWORD"+Main.def);
			do
			{
			char[] passwordArray1 = Main.console.readPassword(Main.skblue+"                                       Enter your Password : (Password will not be visible)"+Main.def);
			String Password1 = new String(passwordArray1);
				if(Password1.equals(this.Password))
				{
					System.out.println(Main.green+"                                                     PASSWORD MATCHED "+Main.def);
					n5=1;
				}
				else
				{
					System.out.println(Main.red+"                                                     PASSWORD NOT MATCHED"+Main.def);
				}
			}while(n5!=1);
			}
		}
		if(c2==0)
		{

			System.out.println(Main.green+"                        Phonenumber Should contain 10 numbers and should start with 9 (or) 8 (or) 7 "+Main.def);
						System.out.print(Main.skblue+"                                                     Enter Phonenumber   : "+Main.def);
			String Phonenumber=Main.sc.next();
			setPhonenumber(Phonenumber);
			
		}
			

	}
	void setUsername(String Username)
	{
		if(Username.length()>=10)
		{
			this.Username=Username;
		}
		else
		{
			System.out.println(Main.red+Main.blink+"                                      Your Username should contain atleast ten characters"+Main.def);
			signup();
		}
	}
	void setPassword(String Password)
	{
		if(Password.length()>=10)
		{
			int count=0;
			int count1=0;
			int i;
			for(i=0;i<Password.length();i++)
			{
				char ch=Password.charAt(i);
				if(ch>='a' && ch<='z')
				{
					
				}
				else if(ch>='A' && ch<='Z')
				{
					
				}
				else if(ch>='0' && ch<='9')
				{
					count1++;
				}
				else
				{
					count++;
				}
			}
			if(count1>0 && count>0)
			{
				this.Password=Password;
			}
			else if(count==0)
			{
				System.out.println(Main.red+Main.blink+"                                      Password must contain atleast one special character"+Main.def);
				c=1;
				signup();
			}
			else if(count1==0)
			{
				System.out.println(Main.red+Main.blink+"                                          Password must contain atleast one number"+Main.def);
				c=1;
				signup();
			}
		}
		else
		{
			System.out.println(Main.red+Main.blink+"                                      Password must contain more than 10 characters"+Main.def);
			c=1;
			signup();
		}
	}
	void setPhonenumber(String Phonenumber)
	{
		if(Phonenumber.length()==10 && (Phonenumber.charAt(0)=='9' || Phonenumber.charAt(0)=='8' || Phonenumber.charAt(0)=='7'))
		{
			this.Phonenumber=Phonenumber;
			c=1;
			c1=1;
			c2=1;
			n5=1;
		}
		else
		{
			System.out.println(Main.red+Main.blink+"                                                     Invalid Phone Number"+Main.def);
			c=1;
			c1=1;
			n5=1;
			signup();
		}
	}
	
}
class RoomDisplay
{
	static Living_Room_default NewRoomobj=new Living_Room_default();
	static Kitchen_default NewRoomobj1=new Kitchen_default();
	static Bedroom_default NewRoomobj2=new Bedroom_default();
	static Bathroom_default NewRoomobj3=new Bathroom_default();
	static int NoOfRooms=4;
	static String NewRoom;
	static String NewRoom1;
	static String NewRoom2;
	static String NewRoom3;
	static int count=0;
	static int count1=0;
	static int count2=0;
	void RoomDisplay()
	{
		System.out.print(Main.yellow);
		System.out.println("                                           ***************************************");
		System.out.println("                                                              ROOMS               ");
		System.out.println("                                                         1 . LIVING ROOM          ");
		System.out.println("                                                         2 . KITCHEN              ");
		System.out.println("                                                         3 . BEDROOM              ");
		System.out.println("                                                         4 . BATHROOM             ");
		System.out.print(Main.def);
		if(NoOfRooms==5)
		{
			System.out.println(Main.yellow+"                                                         5 . "+NewRoom+Main.def);
			count=1;
			NewRoom1=NewRoom;
		}
		if(count==1 && NoOfRooms!=5)
		{
			System.out.println(Main.yellow+"                                                         5 . "+NewRoom1+Main.def);
		}
		if(NoOfRooms==6)
		{	
			System.out.println(Main.yellow+"                                                         6 . "+NewRoom+Main.def);
			count1=2;
			NewRoom2=NewRoom;
		}
		if(count1==2 && NoOfRooms!=6)
		{
			System.out.println(Main.yellow+"                                                         6 . "+NewRoom2+Main.def);
		}
		if(NoOfRooms==7)
		{	
			System.out.println(Main.yellow+"                                                         7 . "+NewRoom+Main.def);
			count2=3;
			NewRoom3=NewRoom;
		}
		if(count2==3 && NoOfRooms!=7)
		{
			System.out.println(Main.yellow+"                                                         7 . "+NewRoom3+Main.def);
		}
		if(NoOfRooms==8)
		{	
			System.out.println(Main.yellow+"                                                         8 . "+NewRoom+Main.def);
		}
		System.out.println(Main.yellow+"                                                      0 . WANT TO ADD NEW ROOM"+Main.def);
		System.out.println(Main.yellow+"                                           ***************************************"+Main.def);
		System.out.print(Main.skblue+"                                                     Enter the Room Number : "+Main.def);
			int RoomSelection=Main.sc.nextInt();
			switch(RoomSelection)
			{
				case 1:Living_Room_default obj=new Living_Room_default();
					obj.appliance_selection();
					break;
				case 2:Kitchen_default obj1=new Kitchen_default();
					obj1.appliance_selection();
					break;
				case 3:Bedroom_default obj2=new Bedroom_default();
					obj2.appliance_selection();
					break;
				case 4:Bathroom_default obj3=new Bathroom_default();
					obj3.appliance_selection();
					break;
				case 5:if(count==1)
					{
						if(NewRoom1.equals("LIVING ROOM"))
						{
							NewRoomobj.appliance_selection();
						}
						if(NewRoom1.equals("KITCHEN"))
						{
							NewRoomobj1.appliance_selection();
						}
						if(NewRoom1.equals("BEDROOM"))
						{
							NewRoomobj2.appliance_selection();
						}
						if(NewRoom1.equals("BATHROOM"))
						{
							NewRoomobj3.appliance_selection();
						}
					}
					else
					System.out.println("ROOM NOT AVILABLE");
					break;
				case 6:if(count1==2)
					{
						if(NewRoom2.equals("LIVING ROOM"))
						{
							NewRoomobj.appliance_selection();
						}
						if(NewRoom2.equals("KITCHEN"))
						{
							NewRoomobj1.appliance_selection();
						}
						if(NewRoom2.equals("BEDROOM"))
						{
							NewRoomobj2.appliance_selection();
						}
						if(NewRoom2.equals("BATHROOM"))
						{
							NewRoomobj3.appliance_selection();
						}
					}
					else
					System.out.println("ROOM NOT AVILABLE");
					break;
				case 7:if(count2==3)
					{
						if(NewRoom3.equals("LIVING ROOM"))
						{
							NewRoomobj.appliance_selection();
						}
						if(NewRoom3.equals("KITCHEN"))
						{
							NewRoomobj1.appliance_selection();
						}
						if(NewRoom3.equals("BEDROOM"))
						{
							NewRoomobj2.appliance_selection();
						}
						if(NewRoom3.equals("BATHROOM"))
						{
							NewRoomobj3.appliance_selection();
						}
					}
					else
					System.out.println("ROOM NOT AVILABLE");
					break;
				case 8:if(NoOfRooms==8)
					{
						if(NewRoom.equals("LIVING ROOM"))
						{
							NewRoomobj.appliance_selection();
						}
						if(NewRoom.equals("KITCHEN"))
						{
							NewRoomobj1.appliance_selection();
						}
						if(NewRoom.equals("BEDROOM"))
						{
							NewRoomobj2.appliance_selection();
						}
						if(NewRoom.equals("BATHROOM"))
						{
							NewRoomobj3.appliance_selection();
						}
					}
					else
					System.out.println("ROOM NOT AVILABLE");
					break;
				case 0:	System.out.print(Main.yellow+"                               1 . LIVING ROOM	");
					System.out.print(Main.yellow+"2 . KITCHEN	");
					System.out.print(Main.yellow+"3 . BEDROOM	");
					System.out.println(Main.yellow+"4 . BATHROOM	"+Main.def);
					System.out.print(Main.skblue+"                                                     Enter New Room Number : "+Main.def);
						int NewRoomSelection=Main.sc.nextInt();
						NoOfRooms++;
						switch(NewRoomSelection)
						{
						case 1:NewRoomobj.appliance_selection();
									NewRoom="LIVING ROOM";

									break;
						case 2:NewRoomobj1.appliance_selection();
									NewRoom="KITCHEN";
									break;
						case 3:NewRoomobj2.appliance_selection();
									NewRoom="BEDROOM";
									break;
						case 4:NewRoomobj3.appliance_selection();
									NewRoom="BATHROOM";
									break;
						}
					break;
				default: System.out.print(Main.red+Main.blink+"INVALID INPUT"+Main.def);
			}
		System.out.println("GO BACK TO ROOMS");
		System.out.println("YES / NO");
		String GOBACK=Main.sc.next();
		if(GOBACK.equalsIgnoreCase("yes"))
		{
			RoomDisplay();
		}
	}
}
class Orient
{
	String Temperature="0";
	String LightColour="DEFAULT WHITE";
	int e=5;
	int Minutes=0;
	LocalTime currentTime1 = LocalTime.now();
    LocalTime currentTime1PlusMinutes = currentTime1.plusMinutes(Minutes);
	int count=0;
	int count1=0;
	int count3=0;
	int count4=0;
	int count5=0;
	int count6=0;
	int count7=0;
	int count8=0;
	int count9=0;
	int count10=0;
	int count11=0;
	int count12=0;
	int count13=0;
	static Time Timeobj=new Time();
	void bulb1()
	{
		count++;
		count1++;
		if(count==1)
		{
			if(count1==1)
			{
			System.out.println(Main.yellow+"                                         PRESS 1 IF YOU WANT TO SWITCH ON THE BULB1"+Main.def);
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			int a=Main.sc.nextInt();
			if(a==1)
			{
				    System.out.println();
					System.out.print(Main.green+Main.blink+"                                                          BULB1 IS ON"+Main.def);
					Time.Bulb1OnTime=LocalTime.now();
					System.out.println();
			}
			}
				System.out.println();
				System.out.print(Main.yellow);
				System.out.println("                                                    ||||||||||||||||||||||");
					System.out.println("                                                    || SET LIGHT COLOUR ||");
				{

					System.out.println("                                                    ||   1 . WHITE      ||");
					System.out.println("                                                    ||   2 . BLUE       ||");
					System.out.println("                                                    ||   3 . RED        ||");
					System.out.println("                                                    ||   4 . PRUPLE     ||");
					System.out.println("                                                    ||   5 . GREEN      ||");
					System.out.println("                                                    ||   6 . ORANGE     ||");
					System.out.println("                                                    ||||||||||||||||||||||");
					System.out.print(Main.def);
					System.out.println();
					int n=0;
					do
					{
						System.out.print(Main.skblue+"                                                  ENTER THE COLOUR NUMBER : "+Main.def);
					String c=Main.sc.next();
					switch(c)
					{
						case "1": System.out.println(Main.yellow+"                                                       1 . WARM WHITE"+Main.def);
								  System.out.println(Main.yellow+"                                                       2 . COOL WHITE"+Main.def);
								  System.out.println(Main.yellow+"                                                       3 . NEUTRAL WHITE"+Main.def);
								  System.out.print(Main.skblue+"                                                    ENTER LIGHT NUMBER : "+Main.def);
							int d=Main.sc.nextInt();
							if(d==1)
							{
								LightColour="WARM WHITE";
							}
							if(d==2)
							{
								LightColour="COOL WHITE";
							}
							if(d==3)
							{
								LightColour="NEUTRAL WHITE";
							}
							n=1;
							break;
						case "2":LightColour="BLUE";
							n=1;
							break;
						case "3":LightColour="RED";
							n=1;
							break;
						case "4":LightColour="PRUPLE";
							n=1;
							break;
						case "5":LightColour="GREEN";
							n=1;
							break;
						case "6":LightColour="ORANGE";
							n=1;
							break;
						default : System.out.println(Main.red+Main.blink+"                                                         INVALID INPUT"+Main.def);
							
					}
					}while(n!=1);
				}
				System.out.println(Main.yellow+"                                                       SET LIGHT INTENSITY"+Main.def);
				{
					System.out.println(Main.yellow+"                                           SELECT LIGHT INTENSITY IN RANGE 1 - 10"+Main.def);
					int n1=0;
					do
					{
						System.out.print(Main.skblue+"                                                  ENTER LIGHT INTENSITY : "+Main.def);
					e=Main.sc.nextInt();
					if(e>=1 && e<=10)
					{
						n1=1;
					}
					else
					{
						System.out.println(Main.red+Main.blink+"                                                  INVALID LIGHT INTENSITY "+Main.def);
					}
					}while(n1!=1);
				}
				System.out.println();
				System.out.println("                                                    LIGHT COLOUR    : "+LightColour+Main.def);
				System.out.println("                                                    LIGHT INTENSITY : "+e+Main.def);
				System.out.println();
		}
		else if(count>1)
		{
			System.out.println(Main.yellow+"                                           1 . WANT TO SWITCH OFF THE LIGHT"+Main.def);
			System.out.println(Main.yellow+"                                           2 . WANT TO CHANGE COLOUR OR INTENSITY"+Main.def);
			int n2=0;
			do
			{
				System.out.print(Main.skblue+"                                                     ENTER THE INPUT : "+Main.def);
			String f=Main.sc.next();
			switch(f)
			{
			case "1":
					System.out.println(Main.red+"                                                          BULB 1 is OFF"+Main.def);
					Time.Bulb1OffTime=LocalTime.now();
					Timeobj.bulb1time();
					count=0;
					count1=0;
					n2=1;
					break;
			case "2":
				count=0;
				n2=1;
				bulb1();
				break;
			default: System.out.println(Main.red+Main.blink+"                                                          INVALID INPUT"+Main.def);
			}
			}while(n2!=1);
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			bulb1();
		}
		
	}
	void bulb2()
	{
		count3++;
		count4++;
		if(count3==1)
		{
			if(count4==1)
			{
			System.out.println(Main.yellow+"                                         PRESS 1 IF YOU WANT TO SWITCH ON THE BULB2"+Main.def);
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			int a=Main.sc.nextInt();
			if(a==1)
			{
					System.out.print(Main.green+Main.blink+"                                                          BULB2 IS ON"+Main.def);
					Time.Bulb2OnTime=LocalTime.now();
			}
			}
				System.out.println();
				System.out.print(Main.yellow);
				System.out.println("                                                    ||||||||||||||||||||||");
				System.out.println("                                                    || SET LIGHT COLOUR ||");
				{
					System.out.println("                                                    ||   1 . WHITE      ||");
					System.out.println("                                                    ||   2 . BLUE       ||");
					System.out.println("                                                    ||   3 . RED        ||");
					System.out.println("                                                    ||   4 . PRUPLE     ||");
					System.out.println("                                                    ||   5 . GREEN      ||");
					System.out.println("                                                    ||   6 . ORANGE     ||");
					System.out.println("                                                    ||||||||||||||||||||||");
					System.out.print(Main.def);
					System.out.println();
					int n=0;
					do
					{
					System.out.print(Main.skblue+"                                                  ENTER THE COLOUR NUMBER : "+Main.def);
					String c=Main.sc.next();
					switch(c)
					{
						case "1": System.out.println(Main.yellow+"                                                       1 . WARM WHITE"+Main.def);
								  System.out.println(Main.yellow+"                                                       2 . COOL WHITE"+Main.def);
								  System.out.println(Main.yellow+"                                                       3 . NEUTRAL WHITE"+Main.def);
								  System.out.print(Main.skblue+"                                                    ENTER LIGHT NUMBER : "+Main.def);
							int d=Main.sc.nextInt();
							if(d==1)
							{
								LightColour="WARM WHITE";
							}
							if(d==2)
							{
								LightColour="COOL WHITE";
							}
							if(d==3)
							{
								LightColour="NEUTRAL WHITE";
							}
							n=1;
							break;
						case "2":LightColour="BLUE";
							n=1;
							break;
						case "3":LightColour="RED";
							n=1;
							break;
						case "4":LightColour="PRUPLE";
							n=1;
							break;
						case "5":LightColour="GREEN";
							n=1;
							break;
						case "6":LightColour="ORANGE";
							n=1;
							break;
						default : System.out.println(Main.red+Main.blink+"                                                         INVALID INPUT"+Main.def);
							
					}
					}while(n!=1);
				}
				System.out.println(Main.yellow+"                                                       SET LIGHT INTENSITY"+Main.def);
				{
					System.out.println(Main.yellow+"                                           SELECT LIGHT INTENSITY IN RANGE 1 - 10"+Main.def);
					int n1=0;
					do
					{
						System.out.print(Main.skblue+"                                                  ENTER LIGHT INTENSITY : "+Main.def);
					e=Main.sc.nextInt();
					if(e>=1 && e<=10)
					{
						n1=1;
					}
					else
					{
						System.out.println(Main.red+Main.blink+"                                                  INVALID LIGHT INTENSITY "+Main.def);
					}
					
					}while(n1!=1);
				}
				System.out.println();
				System.out.println("                                                    LIGHT COLOUR    : "+LightColour+Main.def);
				System.out.println("                                                    LIGHT INTENSITY : "+e+Main.def);
				System.out.println();
		}
		else if(count3>1)
		{
			System.out.println(Main.yellow+"                                           1 . WANT TO SWITCH OFF THE LIGHT"+Main.def);
			System.out.println(Main.yellow+"                                           2 . WANT TO CHANGE COLOUR OR INTENSITY"+Main.def);
			int n2=0;
			do
			{
				System.out.print(Main.skblue+"                                                     ENTER THE INPUT : "+Main.def);
			String f=Main.sc.next();
			switch(f)
			{
			case "1":
					System.out.println(Main.red+"                                                          BULB 2 is OFF"+Main.def);
					Time.Bulb2OffTime=LocalTime.now();
					Timeobj.bulb2time();
					count3=0;
					count4=0;
					n2=1;
					break;
			case "2":
				count3=0;
				n2=1;
				bulb2();
				break;
			default: System.out.println(Main.red+Main.blink+"                                                          INVALID INPUT"+Main.def);
			}
			}while(n2!=1);
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			bulb2();
		}
		
	}
	void fan1()
	{
		count7++;
		count8++;
		if(count7==1)
		{
			if(count8==1)
			{
			System.out.println(Main.yellow+"                                                  PRESS 1 TO SWITCH ON THE FAN1"+Main.def);
			int n=0;
			do
			{
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			String a=Main.sc.next();
			switch(a)
			{
			case "1": 				System.out.println();
			System.out.print(Main.green+Main.blink+"                                                          FAN1 IS ON"+Main.def);
			Time.Fan1OnTime=LocalTime.now();
							System.out.println();
					n=1;
					break;
			default:System.out.println(Main.red+Main.blink+"                                                          INVALID INPUT"+Main.def);
			}
			}while(n!=1);
			}
				System.out.println();
				System.out.println(Main.yellow+"                                                       SET FAN1 SPEED"+Main.def);
				{
					System.out.println(Main.yellow+"                                                 SELECT FAN SPEED IN RANGE 1 - 5"+Main.def);
					int n1=0;
					do
					{
					System.out.print(Main.skblue+"                                                  ENTER FAN SPEED : "+Main.def);
					e=Main.sc.nextInt();
					if(e>=1 && e<=5)
						n1=1;
					else
					{
						System.out.println(Main.red+Main.blink+"                                                      INVALID FAN SPEED"+Main.def);
					}
					}while(n1!=1);
				}
				System.out.println();
				System.out.println("                                                         FAN SPEED : "+e+Main.def);
				System.out.println();
		}
		else if(count7>1)
		{
			System.out.println(Main.yellow+"                                           1 . WANT TO SWITCH OFF THE FAN1"+Main.def);
			System.out.println(Main.yellow+"                                           2 . WANT TO CHANGE SPEED OF FAN1"+Main.def);
			int n2=0;
			do
			{
			System.out.print(Main.skblue+"                                                     ENTER THE INPUT : "+Main.def);
			String f=Main.sc.next();
			switch(f)
			{
			case "1":
					System.out.println(Main.red+"                                                          FAN1 is OFF"+Main.def);
					Time.Fan1OffTime=LocalTime.now();
					Timeobj.fan1time();
					count7=0;
					count8=0;
					n2=1;
					break;
			case "2":
				count7=0;
				fan1();
				n2=1;
				break;
			default :System.out.println(Main.red+Main.blink+"                                                          INVALID INPUT"+Main.def);
			}
			}while(n2!=1);
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			fan1();
		}
		
	}
	void fan2()
	{
		count9++;
		count10++;
		if(count9==1)
		{
			if(count10==1)
			{
			System.out.println(Main.yellow+"                                                  PRESS 1 TO SWITCH ON THE FAN2"+Main.def);
			int n=0;
			do
			{			
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			String a=Main.sc.next();
			switch(a)
			{
			case "1": System.out.println();
			System.out.print(Main.green+Main.blink+"                                                          FAN2 IS ON"+Main.def);
			
			Time.Fan2OnTime=LocalTime.now();
							System.out.println();
					n=1;
					break;
			default:System.out.println(Main.red+Main.blink+"                                                          INVALID INPUT"+Main.def);
			}
			}while(n!=1);
			}
				System.out.println();
				System.out.println(Main.yellow+"                                                       SET FAN2 SPEED"+Main.def);
				{
					System.out.println(Main.yellow+"                                                 SELECT FAN SPEED IN RANGE 1 - 5"+Main.def);
					int n1=0;
					do
					{
					System.out.print(Main.skblue+"                                                  ENTER FAN SPEED : "+Main.def);
					e=Main.sc.nextInt();
					if(e>=1 && e<=5)
						n1=1;
					else
					{
						System.out.println(Main.red+Main.blink+"                                                      INVALID FAN SPEED"+Main.def);
					}
					}while(n1!=1);
				}
				System.out.println();
				System.out.println("                                                          FAN SPEED : "+e+Main.def);
				System.out.println();
		}
		else if(count9>1)
		{
			System.out.println(Main.yellow+"                                           1 . WANT TO SWITCH OFF THE FAN2"+Main.def);
			System.out.println(Main.yellow+"                                           2 . WANT TO CHANGE SPEED OF FAN2"+Main.def);
			int n2=0;
			do
			{
			System.out.print(Main.skblue+"                                                     ENTER THE INPUT : "+Main.def);
			String f=Main.sc.next();
			switch(f)
			{
			case "1":
					System.out.println(Main.red+"                                                          FAN2 is OFF"+Main.def);
					Time.Fan2OffTime=LocalTime.now();
					Timeobj.fan2time();
					count9=0;
					count10=0;
					n2=1;
					break;
			case "2":
				count9=0;
				fan2();
				n2=1;
				break;
			default :System.out.println(Main.red+Main.blink+"                                                          INVALID INPUT"+Main.def);
			}
			}while(n2!=1);
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			fan2();
		}
		
	}
	void bedlamp()
	{
		count5++;
		count6++;
		if(count5==1)
		{
			if(count6==1)
			{
			System.out.println(Main.yellow+"                                         PRESS 1 IF YOU WANT TO SWITCH ON THE BEDLAMP");
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			int a=Main.sc.nextInt();
			if(a==1)
			{
					System.out.print(Main.green+Main.blink+"                                                          BEDLAMP IS ON"+Main.def);
					Time.BedlampOnTime=LocalTime.now();
			}
			}
				System.out.println();
				System.out.print(Main.yellow);
				System.out.println("                                                    ||||||||||||||||||||||");
				System.out.println("                                                    || SET LIGHT COLOUR ||");
				{
					System.out.println("                                                    ||   1 . WHITE      ||");
					System.out.println("                                                    ||   2 . BLUE       ||");
					System.out.println("                                                    ||   3 . RED        ||");
					System.out.println("                                                    ||   4 . PRUPLE     ||");
					System.out.println("                                                    ||   5 . GREEN      ||");
					System.out.println("                                                    ||   6 . ORANGE     ||");
					System.out.println("                                                    ||||||||||||||||||||||");
					System.out.print(Main.def);
					int n=0;
					do
					{
					System.out.print(Main.skblue+"                                                  ENTER THE COLOUR NUMBER : "+Main.def);
					String c=Main.sc.next();
					switch(c)
					{
						case "1":System.out.println(Main.yellow+"                                                       1 . WARM WHITE"+Main.def);
								  System.out.println(Main.yellow+"                                                       2 . COOL WHITE"+Main.def);
								  System.out.println(Main.yellow+"                                                       3 . NEUTRAL WHITE"+Main.def);
								  System.out.print(Main.skblue+"                                                    ENTER LIGHT NUMBER : "+Main.def);
							int d=Main.sc.nextInt();
							if(d==1)
							{
								LightColour="WARM WHITE";
							}
							if(d==2)
							{
								LightColour="COOL WHITE";
							}
							if(d==3)
							{
								LightColour="NEUTRAL WHITE";
							}
							n=1;
							break;
						case "2":LightColour="BLUE";
							n=1;
							break;
						case "3":LightColour="RED";
							n=1;
							break;
						case "4":LightColour="PRUPLE";
							n=1;
							break;
						case "5":LightColour="GREEN";
							n=1;
							break;
						case "6":LightColour="ORANGE";
							n=1;
							break;
						default : System.out.println(Main.red+Main.blink+"                                                         INVALID INPUT"+Main.def);
							
					}
					}while(n!=1);
				}
				System.out.println(Main.yellow+"                                                       SET LIGHT INTENSITY"+Main.def);
				{
					System.out.println(Main.yellow+"                                           SELECT LIGHT INTENSITY IN RANGE 1 - 4"+Main.def);
					int n1=0;
					do
					{
					System.out.print(Main.skblue+"                                                  ENTER LIGHT INTENSITY : "+Main.def);
					e=Main.sc.nextInt();
					if(e>=1 && e<=4)
					{
						n1=1;
					}
					else
					{
						System.out.println(Main.red+Main.blink+"                                                  INVALID LIGHT INTENSITY "+Main.def);
					}
					}while(n1!=1);
				}
				System.out.println();
				System.out.println("                                                    LIGHT COLOUR    : "+LightColour+Main.def);
				System.out.println("                                                    LIGHT INTENSITY : "+e+Main.def);
				System.out.println();
		}
		else if(count5>1)
		{
			System.out.println(Main.yellow+"                                           1 . WANT TO SWITCH OFF THE LIGHT"+Main.def);
			System.out.println(Main.yellow+"                                           2 . WANT TO CHANGE COLOUR OR INTENSITY"+Main.def);
			int n2=0;
			do
			{
				System.out.print(Main.skblue+"                                                     ENTER THE INPUT : "+Main.def);
			String f=Main.sc.next();
			switch(f)
			{
			case "1":
					System.out.println(Main.red+"                                                    BEDLAMP is OFF"+Main.def);
					Time.BedlampOffTime=LocalTime.now();
					Timeobj.bedlamptime();
					count5=0;
					count6=0;
					n2=1;
					break;
			case "2":
				count5=0;
				n2=1;
				bedlamp();
				break;
			default: System.out.println(Main.red+Main.blink+"                                                          INVALID INPUT"+Main.def);
			}
			}while(n2!=1);
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			bedlamp();
		}
		
	}
	void geyser()
	{
		count11++;
		count12++;
		if(count11==1)
		{
			if(count12==1)
			{
			System.out.println(Main.yellow+"                                         PRESS 1 IF YOU WANT TO SWITCH ON THE GEYSER"+Main.def);
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			int a=Main.sc.nextInt();
			if(a==1)
			{
					System.out.print(Main.green+Main.blink+"                                                          GEYSER IS ON"+Main.def);
					Time.GeyserOnTime=LocalTime.now();
			}
			}
				System.out.println();
				System.out.println(Main.yellow+"                                                       SET WATER TEMPERATURE"+Main.def);
				{
					System.out.println(Main.yellow+"                                                           1 . TOO HOT"+Main.def);
					System.out.println(Main.yellow+"                                                           2 . MODERATE"+Main.def);
					System.out.println(Main.yellow+"                                                           3 . LOW"+Main.def);
					int n=0;
					do
					{
					System.out.print(Main.skblue+"                                                        ENTER INPUT : "+Main.def);
					int c=Main.sc.nextInt();
					switch(c)
					{
						case 1:Temperature="TOO HOT";
								n=1;
							break;
						case 2:Temperature="MODERATE";
								n=1;
							break;
						case 3:Temperature="LOW";
								n=1;
							break;
						default:System.out.println(Main.red+Main.blink+"                                                         INVALID INPUT"+Main.def);
					}
					}while(n!=1);
				}
				if(count12==1)
				{
					System.out.println(Main.yellow+"                                      WANT TO SET TIMER TO SWITCH OFF GEYSER AUTOMATICALLY"+Main.def);
					System.out.println(Main.yellow+"                                                          YES / NO"+Main.def);
					System.out.print(Main.skblue+"                                                        ENTER INPUT : "+Main.def);
					String t=Main.sc.next();
					if(t.equalsIgnoreCase("yes"))
					{
							count13++;
							System.out.print(Main.skblue+"                                           ENTER THE TIMER IN MINUTES : "+Main.def);
							int timer=Main.sc.nextInt();
							Minutes=timer;
							System.out.println();
							System.out.println(Main.blue+"                                      GEYSER WILL AUTOMATICALLY OFF AT TIME : "+currentTime1.plusMinutes(Minutes)+Main.def);
							System.out.println();
					}
				}
				System.out.println();
				System.out.println("                                                 GEYSER TEMPERATURE : "+Temperature+Main.def);
				System.out.println();
		}
		else if(count11>1)
		{
			System.out.println(Main.yellow+"                                           1 . WANT TO SWITCH OFF THE GEYSER"+Main.def);
			System.out.println(Main.yellow+"                                           2 . WANT TO CHANGE TEMPERATURE"+Main.def);
			System.out.print(Main.skblue+"                                           Enter the input : "+Main.def);
			int f=Main.sc.nextInt();
			if(f==1)
			{
				if(count13>0)
				{
					LocalTime currentTime2 = LocalTime.now();
					if (currentTime2.isAfter(currentTime1.plusMinutes(Minutes)) || currentTime1.plusMinutes(Minutes).equals(currentTime2))
					{
						System.out.println(Main.red+"                                           TIMER ENDED AND GEYSER IS OFF"+Main.def);
					Time.Bulb1OnTime=LocalTime.now();
					Timeobj.geysertime();
					}
					else
					System.out.println(Main.red+Main.blink+"                                                 WAIT UNTIL TIMER GOES OFF"+Main.def);
				}
				else
				{
					System.out.println();
					System.out.println(Main.red+"                                           GEYSER IS OFF"+Main.def);
					Time.Bulb1OnTime=LocalTime.now();
					Timeobj.geysertime();
					System.out.println();
					count11=0;
					count12=0;
				}
			
			}
			else if(f==2)
			{
				count11=0;
				geyser();
			}
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			geyser();
		}
	}
}
class AC
{
	static Time Timeobj=new Time();
	static Scanner sc=new Scanner(System.in);
	static int count=0;
	static void remote(int temperature)
	{
			if(temperature>=16 && temperature<=30)
			{
				System.out.println("                                                   AC Temperature  : "+temperature+Main.def);
			}
			else
			{
				System.out.println(Main.red+Main.blink+"                                                   INVALID INPUT"+Main.def);	
			}
			
	}
	static void remote(double timer)
	{
		LocalTime currentTime1 = LocalTime.now();
		LocalTime currentTime1PlusTwoMinutes = currentTime1.plusMinutes((int)timer);
		System.out.println("                                          AC will be turned off at "+currentTime1PlusTwoMinutes+Main.def);
	}
	static void remote(byte Fanspeed)
	{
		if(Fanspeed<=5)
		{
			System.out.println("                                                   Fanspeed        : "+Fanspeed+Main.def);
		}
		else
		{
			System.out.println(Main.red+Main.blink+"                                                   INVALID INPUT"+Main.def);
		}
	}
	static void remote(boolean Swing,String SwingOption)
	{
		if(Swing)
		{	
		System.out.println("                                                   Swing           : ON"+Main.def);
		}
		else
		{
		System.out.println("                                                   Swing           : OFF"+Main.def);
		}
		System.out.println("                                                   Swing Option    : "+SwingOption+Main.def);
	}
	static void remote(boolean Power)
	{
		if(Power)
		{	
		System.out.println(Main.green+Main.blink+"                                                   AC POWER        :ON"+Main.def);
		Time.ACOnTime=LocalTime.now();
		count++;
		}
		else
		{
		System.out.println(Main.red+"                                                   AC POWER        :OFF"+Main.def);
		Time.ACOffTime=LocalTime.now();
		Timeobj.actime();
		count=0;
		}
		
	}
	static void remote(String Mode)
	{
		System.out.println("                                                   AC Mode : "+Mode+Main.def);
	}
	static void selectAC()
	{
		System.out.print(Main.yellow);
		System.out.println("                                        .___________________________________________.");
		System.out.println("                                        |         1    : AC POWER                   |");
		System.out.println("                                        |         2    : Change Temperature         |");
		System.out.println("                                        |         3    : Set Timer                  |");
		System.out.println("                                        |         4    : Set Fan Speed              |");
		System.out.println("                                        |         5    : Set Swing And its Options  |");
		System.out.println("                                        |         6    : Set Mode                   |");	
		System.out.println("                                        |___________________________________________|");
		System.out.print(Main.def);
		  System.out.print(Main.skblue+"                                                      Enter the Input :"+Main.def);
		int input=sc.nextInt();
		System.out.println(Main.yellow+"                                        ******************************************"+Main.def);
		switch(input)
		{
			case 1:System.out.println(Main.yellow+"                                                   TRUE  : AC POWER ON"+Main.def);
				   System.out.println(Main.yellow+"                                                   FALSE : AC POWER OFF"+Main.def);
				   System.out.print(Main.skblue+"                                                   Enter the Input :"+Main.def);
				   remote(sc.nextBoolean());
				   break;
			case 2:if(count>0)
					{
						System.out.print(Main.skblue+"                                        ENTER THE TEMPERATURE : "+Main.def);
						remote(sc.nextInt());
					}
					else
					{
						System.out.println(Main.yellow+"                                                   PLEASE SWITCH ON THE AC"+Main.def);
						System.out.println(Main.yellow+"                                                   TRUE  : AC POWER ON"+Main.def);
						System.out.println(Main.yellow+"                                                   FALSE : AC POWER OFF"+Main.def);
						System.out.print(Main.skblue+"                                                   Enter the Input :"+Main.def);
						remote(sc.nextBoolean());
						System.out.print(Main.skblue+"                                                   ENTER THE TEMPERATURE : "+Main.def);
						remote(sc.nextInt());
					}
				break;
			case 3:if(count>0)
					{
						System.out.print(Main.skblue+"                                                   SET TIME : "+Main.def);
						remote(sc.nextDouble());
					}
					else
					{
						System.out.println(Main.yellow+"                                                   PLEASE SWITCH ON THE AC"+Main.def);
						System.out.println(Main.yellow+"                                                   TRUE  : AC POWER ON"+Main.def);
						System.out.println(Main.yellow+"                                                   FALSE : AC POWER OFF"+Main.def);
						System.out.print(Main.skblue+"                                                   Enter the Input :"+Main.def);
						remote(sc.nextBoolean());
						System.out.print(Main.skblue+"                                                   SET TIMER IN MINUTES : "+Main.def);
						remote(sc.nextDouble());
					}
				break;
			case 4:if(count>0)
					{
						System.out.print(Main.skblue+"                                                   ENTER FAN SPEED : "+Main.def);
						remote(sc.nextByte());
					}
					else
					{	
						System.out.println(Main.yellow+"                                                   PLEASE SWITCH ON THE AC"+Main.def);
						System.out.println(Main.yellow+"                                                   TRUE  : AC POWER ON"+Main.def);
						System.out.println(Main.yellow+"                                                   FALSE : AC POWER OFF"+Main.def);
						System.out.print(Main.skblue+"                                                   Enter the Input :"+Main.def);
						remote(sc.nextBoolean());
						System.out.print(Main.skblue+"                                                   ENTER FAN SPEED : "+Main.def);
						remote(sc.nextByte());
					}
				break;
			case 5:if(count>0)
					{
						System.out.println(Main.yellow+"                                                   TRUE   : SWING ON"+Main.def);
						System.out.println(Main.yellow+"                                                   FALSE  : SWING OFF"+Main.def);
						System.out.println(Main.yellow+"                                       ENTER OPTIONS FOR HORIZONTAL OR VERTICAL SWING"+Main.def);
						System.out.print(Main.skblue+"                                        Enter the Input for SWING ON/OFF :"+Main.def);
						boolean a=sc.nextBoolean();
						System.out.print(Main.skblue+"                                       Enter the Input for SWING OPTIONS :"+Main.def);
						String b=sc.next();
						remote(a,b);
					}
					else
					{
						System.out.println(Main.yellow+"                                                   PLEASE SWITCH ON THE AC"+Main.def);
						System.out.println(Main.yellow+"                                                   TRUE  : AC POWER ON"+Main.def);
						System.out.println(Main.yellow+"                                                   FALSE : AC POWER OFF"+Main.def);
						System.out.print(Main.skblue+"                                                   Enter the Input :"+Main.def);
						remote(sc.nextBoolean());
						System.out.println(Main.yellow+"                                                   TRUE   : SWING ON"+Main.def);
						System.out.println(Main.yellow+"                                                   FALSE  : SWING OFF"+Main.def);
						System.out.println(Main.yellow+"                                       ENTER OPTIONS FOR HORIZONTAL OR VERTICAL SWING"+Main.def);
						System.out.print(Main.skblue+"                                        Enter the Input for SWING ON/OFF :"+Main.def);
						boolean a=sc.nextBoolean();
						System.out.print(Main.skblue+"                                       Enter the Input for SWING OPTIONS :"+Main.def);
						String b=sc.next();
						remote(a,b);
					}
				break;
			case 6:if(count>0)
					{
						System.out.print(Main.skblue+"                                          SET THE MODE (COOL,HOT,MODERATE COOL) : "+Main.def);
						remote(sc.next());
					}
					else
					{
						System.out.println(Main.yellow+"                                                   PLEASE SWITCH ON THE AC"+Main.def);
						System.out.println(Main.yellow+"                                                   TRUE  : AC POWER ON"+Main.def);
						System.out.println(Main.yellow+"                                                   FALSE : AC POWER OFF"+Main.def);
						System.out.print(Main.skblue+"                                                   Enter the Input :"+Main.def);
						remote(sc.nextBoolean());	
						System.out.print(Main.skblue+"                                          SET THE MODE (COOL,HOT,MODERATE COOL) : "+Main.def);
						remote(sc.next());						
					}
				break;
			default:System.out.println(Main.red+Main.blink+"                                                   INVALID INPUT"+Main.def);
		}
		System.out.println(Main.yellow+"                                        ******************************************"+Main.def);
	}
}
class Samsung extends AC
{
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	static Time Timeobj=new Time();
	void tv()
	{
		count++;
		count1++;
		if(count==1)
		{
			if(count1==1)
			{
				System.out.println(Main.yellow+"                                                  PRESS 1 TO SWITCH ON THE TV"+Main.def);
				System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
				int a=Main.sc.nextInt();
				if(a==1)
				{
					System.out.println();
					System.out.println(Main.green+Main.blink+"                                                          TV IS ON"+Main.def);
					Time.TVOnTime=LocalTime.now();
					System.out.println();
				}
			}
		}
		else if(count>1)
		{
			System.out.println(Main.yellow+"                                                  1 . WANT TO SWITCH OFF THE TV"+Main.def);
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			int f=Main.sc.nextInt();
			if(f==1)
			{
					System.out.println(Main.red+"                                                          TV is OFF"+Main.def);
					Time.TVOffTime=LocalTime.now();
					Timeobj.tvtime();
					count=0;
					count1=0;
			}
			else if(f==2)
			{
				count=0;
				tv();
			}
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			tv();
		}
		
	}

	void fridge()
	{
		count2++;
		count3++;
		if(count2==1)
		{
			if(count3==1)
			{
				System.out.println(Main.yellow+"                                                  PRESS 1 TO SWITCH ON THE FRIDGE"+Main.def);
				System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
				int a=Main.sc.nextInt();
				if(a==1)
				{
					System.out.println();
					System.out.println(Main.green+Main.blink+"                                                          FRIDGE IS ON"+Main.def);
					Time.FridgeOnTime=LocalTime.now();
					System.out.println();
				}
			}
		}
		else if(count2>1)
		{
			System.out.println(Main.yellow+"                                                  1 . WANT TO SWITCH OFF THE FRIDGE"+Main.def);
			System.out.print(Main.skblue+"                                                    ENTER THE INPUT : "+Main.def);
			int f=Main.sc.nextInt();
			if(f==1)
			{
					System.out.println(Main.red+"                                                          FRIDGE is OFF"+Main.def);
					Time.FridgeOffTime=LocalTime.now();
					Timeobj.fridgetime();
					count2=0;
					count3=0;
			}
			else if(f==2)
			{
				count2=0;
				fridge();
			}
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			fridge();
		}
	}
}
class LG extends AC
{
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	void tv()
	{
		count++;
		count1++;
		if(count==1)
		{
			if(count1==1)
			{
				System.out.println("PRESS 1 TO SWITCH ON THE TV");
				int a=Main.sc.nextInt();
				if(a==1)
				{
					System.out.println("TV IS ON");
				}
			}
		}
		else if(count>1)
		{
			System.out.println("1 . WANT TO SWITCH OFF THE TV");
			int f=Main.sc.nextInt();
			if(f==1)
			{
					System.out.println("TV is OFF");
					count=0;
			}
			else if(f==2)
			{
				count=0;
				tv();
			}
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			tv();
		}
		
	}
	void fridge()
	{
		count2++;
		count3++;
		if(count2==1)
		{
			if(count3==1)
			{
				System.out.println("PRESS 1 TO SWITCH ON THE FRIDGE");
				int a=Main.sc.nextInt();
				if(a==1)
				{
					System.out.println("FRIDGE IS ON");
				}
			}
		}
		else if(count2>1)
		{
			System.out.println("1 . WANT TO SWITCH OFF THE FRIDGE");
			int f=Main.sc.nextInt();
			if(f==1)
			{
					System.out.println("FRIDGE is OFF");
					count2=0;
			}
			else if(f==2)
			{
				count2=0;
				fridge();
			}
		}
		else
		{
			System.out.println("INCORRECT INPUT ");
			System.out.println("PLEASE ENTER CORRECT INPUT");
			fridge();
		}
	}
}
abstract class New_Room
{
	abstract void appliance_selection();
}
class Living_Room_default extends New_Room
{
static Orient objOrient =new Orient();
static Samsung objSamsung=new Samsung();
	void appliance_selection()
	{
		System.out.print(Main.yellow);
		System.out.println("                                           ************* LIVING ROOM**************");
		System.out.println("                                           **********APPLIANCES AVIALBLE**********");
		System.out.println("                                           *              1 . TV                 *");
		System.out.println("                                           *              2 . BULB 1             *");
		System.out.println("                                           *              3 . BULB 2             *");
		System.out.println("                                           *              4 . FAN 1              *");
		System.out.println("                                           *              5 . FAN 2              *");
		System.out.println("                                           ***************************************");
		System.out.print(Main.def);
		System.out.println();
		System.out.print(Main.skblue+"                                           ENTER THE APPLIANCE NUMBER : "+Main.def);
		int Appliance_Selection=Main.sc.nextInt();
		switch(Appliance_Selection)
		{
			case 1:objSamsung.tv();
				break;
			case 2:objOrient.bulb1();
				break;
			case 3:objOrient.bulb2();
				break;
			case 4:objOrient.fan1();
				break;
			case 5:objOrient.fan2();
				break;
		}
	}
}
class Kitchen_default extends New_Room
{
static Orient objOrient =new Orient();
static Samsung objSamsung=new Samsung();
	void appliance_selection()
	{
				System.out.print(Main.yellow);
		System.out.println("                                           *****************KITCHEN***************");
		System.out.println("                                           **********APPLIANCES AVIALBLE**********");
		System.out.println("                                           *             1 . BULB 1              *");
		System.out.println("                                           *             2 . FAN 1               *");
		System.out.println("                                           *             3 . FRIDGE              *");
		System.out.println("                                           ***************************************");
				System.out.print(Main.def);
		System.out.println();
		System.out.print(Main.skblue+"                                           ENTER THE APPLIANCE NUMBER : "+Main.def);
		int Appliance_Selection=Main.sc.nextInt();
		switch(Appliance_Selection)
		{
			case 1:objOrient.bulb1();
				break;
			case 2:objOrient.fan1();
				break;
			case 3:objSamsung.fridge();
				break;
		}
	}
}
class Bedroom_default extends New_Room
{
	static Orient objOrient =new Orient();
	static Samsung objSamsung=new Samsung();
	void appliance_selection()
	{
				System.out.print(Main.yellow);
		System.out.println("                                           *****************BEDROOM***************");
		System.out.println("                                           **********APPLIANCES AVIALBLE**********");
		System.out.println("                                           *            1 . BEDLAMP              *");
		System.out.println("                                           *            2 . BULB 1               *");
		System.out.println("                                           *            3 . FAN 1                *");
		System.out.println("                                           *            4 . AC                   *");
		System.out.println("                                           ***************************************");
				System.out.print(Main.def);
		System.out.println();
		System.out.print(Main.skblue+"                                           ENTER THE APPLIANCE NUMBER : "+Main.def);
		int Appliance_Selection=Main.sc.nextInt();
		switch(Appliance_Selection)
		{
			case 1:objOrient.bedlamp();
				break;
			case 2:objOrient.bulb1();
				break;
			case 3:objOrient.fan1();
				break;
			case 4:AC objAC=new AC();
					objAC.selectAC();
				break;
		}
	}
}
class Bathroom_default extends New_Room
{
	static Orient objOrient =new Orient();
	static Samsung objSamsung=new Samsung();
	void appliance_selection()
	{
				System.out.print(Main.yellow);
		System.out.println("                                           ****************BATHROOM***************");
		System.out.println("                                           **********APPLIANCES AVIALBLE**********");
		System.out.println("                                           *            1 . BULB 1               *");
		System.out.println("                                           *            2 . GEYSER               *");
		System.out.println("                                           ***************************************");
				System.out.print(Main.def);
		System.out.println();
		System.out.print(Main.skblue+"                                           ENTER THE APPLIANCE NUMBER : "+Main.def);
		int Appliance_Selection=Main.sc.nextInt();
		switch(Appliance_Selection)
		{
			case 1:objOrient.bulb1();
				break;
			case 2:objOrient.geyser();
				break;
		}
	}
}
class Time
{
	static Currentbill currentbillobj = new Currentbill();
	static LocalTime Bulb1OnTime;
	static LocalTime Bulb1OffTime;
	static LocalTime Bulb2OnTime;
	static LocalTime Bulb2OffTime;
	static LocalTime Fan1OnTime;
	static LocalTime Fan1OffTime;
	static LocalTime Fan2OnTime;
	static LocalTime Fan2OffTime;
	static LocalTime BedlampOnTime;
	static LocalTime BedlampOffTime;
	static LocalTime GeyserOnTime;
	static LocalTime GeyserOffTime;
	static LocalTime ACOnTime;
	static LocalTime ACOffTime;
	static LocalTime TVOnTime;
	static LocalTime TVOffTime;
	static LocalTime FridgeOnTime;
	static LocalTime FridgeOffTime;
	
	void bulb1time()
	{
		System.out.println("                                   	           Bulb1 ON Time  : "+Bulb1OnTime);
		System.out.println("                                   	           Bulb1 OFF Time : "+Bulb1OffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(Bulb1OnTime, Bulb1OffTime);
		currentbillobj.bill(differenceMinutes*2);
	}
	void bulb2time()
	{
		System.out.println("                                   	           Bulb2 ON Time  : "+Bulb2OnTime);
		System.out.println("                                   	           Bulb2 OFF Time : "+Bulb2OffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(Bulb2OnTime, Bulb2OffTime);
		currentbillobj.bill(differenceMinutes*2);
	}
	void fan1time()
	{
		System.out.println("                                   	           Fan1 ON Time  : "+Fan1OnTime);
		System.out.println("                                   	           Fan1 OFF Time : "+Fan1OffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(Fan1OnTime, Fan1OffTime);
		currentbillobj.bill(differenceMinutes*3);
	}
	void fan2time()
	{
		System.out.println("                                   	           Fan2 ON Time  : "+Fan2OnTime);
		System.out.println("                                   	           Fan2 OFF Time : "+Fan2OffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(Fan2OnTime, Fan2OffTime);
		currentbillobj.bill(differenceMinutes*3);
	}
	void bedlamptime()
	{
		System.out.println("                                   	           Bedlamp ON Time  : "+BedlampOnTime);
		System.out.println("                                   	           Bedlamp OFF Time : "+BedlampOffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(BedlampOnTime, BedlampOffTime);
		currentbillobj.bill(differenceMinutes*1);
	}
	void geysertime()
	{
		System.out.println("                                   	           Geyser ON Time  : "+GeyserOnTime);
		System.out.println("                                   	           Geyser OFF Time : "+GeyserOffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(GeyserOnTime, GeyserOffTime);
		currentbillobj.bill(differenceMinutes*5);
	}
	void actime()
	{
		System.out.println("                                   	           AC ON Time  : "+ACOnTime);
		System.out.println("                                   	           AC OFF Time : "+ACOffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(ACOnTime, ACOffTime);
		currentbillobj.bill(differenceMinutes*10);
	}
	void tvtime()
	{
		System.out.println("                                   	           TV ON Time  : "+TVOnTime);
		System.out.println("                                   	           TV OFF Time : "+TVOffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(TVOnTime, TVOffTime);
		currentbillobj.bill(differenceMinutes*6);
	}
	void fridgetime()
	{
		System.out.println("                                   	           Fridge ON Time  : "+FridgeOnTime);
		System.out.println("                                   	           Fridge OFF Time : "+FridgeOffTime);
		long differenceMinutes = ChronoUnit.MINUTES.between(FridgeOnTime, FridgeOffTime);
		currentbillobj.bill(differenceMinutes*6);
	}
	
}
class Currentbill
{
	void bill(long a)
	{
		long sum=0;
		int count=0;
		if(a<50)
		{
			sum=sum+(a*3);
		}
		if(a>50)
		{
			a=a-50;
			sum=sum+(50*3);
			count=1;
		}
		if(a>75)
		{
			a=a-75;
			sum=sum+(75*4);
			count=2;
		}
		if(a>125)
		{
			a=a-125;
			sum=sum+(125*5);
			count=3;
		}
		if(a>150)
		{
			a=a-150;
			sum=sum+(150*7);
			count=4;
		}
		if(a!=0)
		{
			switch(count)
			{
			case 1: sum=sum+(a*4);
				break;
			case 2: sum=sum+(a*5);
				break;
			case 3: sum=sum+(a*7);
				break;
			case 4: sum=sum+(a*10);
				break;
			}
		}
		System.out.println(Main.whitebackground+Main.black+"				Current bill for the appliance used in between Time shown above : "+sum+" rs"+Main.def);
		System.out.println("	If you feel you are using the appliance for more time, check bill and use appliance for less time from next Time");
		System.out.println("                                                         "+Main.whitebackground+Main.green+"SAVE ELECTRICITY"+Main.def);
	}
}