package package1;
import java.nio.file.*;import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.HashMap;
import java.io.*;
import java.io.IOException;
import static java.nio.file.AccessMode.*;
import java.io.FileWriter;
import java.util.*;
import java.util.regex.Pattern;
import java.awt.Desktop;
import java.io.PrintWriter;
import java.io.BufferedReader;
import javax.sound.sampled.*;
public class Object implements Bookable, MovieListViewable,Showable, Cancellable, Checkable,adminshit{
	
	static Scanner s = new Scanner(System.in);
	int standardPricing = 300;
	int premiumPricing = 600;
	List<String> customers = new ArrayList<>();
	static List<String> Movies = new ArrayList<>();
	static {
		Movies.add("");
		Movies.add("The Matrix");
		Movies.add("Fight Club");
		Movies.add("Avengers: Endgame");
		Movies.add("The Dark Knight");
		Movies.add("Avengers: Endgame");
	}
	static List<String> bookings = new ArrayList<>();
	static {
		bookings.add("");
		}	
	static List<String> premiumBookings = new ArrayList<>();
	static {
		premiumBookings.add("");
	}
	static ArrayList<Integer> standardPayments = new ArrayList<Integer>();
	static{
		standardPayments.add(0);
	}
	static ArrayList<Integer> premiumPayments = new ArrayList<Integer>();
	static{
		premiumPayments.add(0);
	}
	public static final String GREEN ="\u001B[32m";
	 public static final String RED = "\u001B[31m";
    final String BLUE = "\u001B[36m";
     static final String NON = "\u001B[0m";
	private String MovieName1;
	private String MovieName2;
	private String TicketID;
	private String MovieName3;
	int maxSeats = 20;
	static LinkedHashMap<String, String> Standardseats = new LinkedHashMap<String, String>();
	 static {
		 Standardseats.put("A1", "available");
		 Standardseats.put("A2", "available");
		 Standardseats.put("A3", "available");
		 Standardseats.put("A4", "available");
		 Standardseats.put("A5", "available");
		 Standardseats.put("A6", "available");
		 Standardseats.put("A7", "available");
		 Standardseats.put("A8", "available");
		 Standardseats.put("A9", "available");
		 Standardseats.put("A10", "available\n");
		 Standardseats.put("A11", "available");
		 Standardseats.put("A12", "available");
		 Standardseats.put("A13", "available");
		 Standardseats.put("A14", "available");
		 Standardseats.put("A15", "available");
		 Standardseats.put("A16", "available");
		 Standardseats.put("A17", "available");
		 Standardseats.put("A18", "available");
		 Standardseats.put("A19", "available");
		 Standardseats.put("A20", "available\n");
		 Standardseats.put("A21", "available");
		 Standardseats.put("A22", "available");
		 Standardseats.put("A23", "available");
		 Standardseats.put("A24", "available");
		 Standardseats.put("A25", "available");
		 Standardseats.put("A26", "available");
		 Standardseats.put("A27", "available");
		 Standardseats.put("A28", "available");
		 Standardseats.put("A29", "available");
		 Standardseats.put("A30", "available\n");
		 Standardseats.put("A31", "available");
		 Standardseats.put("A32", "available");
		 Standardseats.put("A33", "available");
		 Standardseats.put("A34", "available");
		 Standardseats.put("A35", "available");
		 Standardseats.put("A36", "available");
		 Standardseats.put("A37", "available");
		 Standardseats.put("A38", "available");
		 Standardseats.put("A39", "available");
		 Standardseats.put("A40", "available");
		 Standardseats.put("A41", "available");
		 Standardseats.put("A42", "available");
		 Standardseats.put("A43", "available");
		 Standardseats.put("A44", "available");
		 Standardseats.put("A45", "available");
		 Standardseats.put("A46", "available");
		 Standardseats.put("A47", "available");
		 Standardseats.put("A48", "available");
		 Standardseats.put("A49", "available");
		 Standardseats.put("A50", "available");

	 }
	 static LinkedHashMap<String,String> Premiumseats = new LinkedHashMap<String,String>();
	 static {
		 Premiumseats.put("A1P", "available");
		 Premiumseats.put("A2P", "available");
		 Premiumseats.put("A3P", "available");
		 Premiumseats.put("A4P", "available");
		 Premiumseats.put("A5P", "available");
		 Premiumseats.put("A6P", "available");
		 Premiumseats.put("A7P", "available");
		 Premiumseats.put("A8P", "available");
		 Premiumseats.put("	A9P", "available");
		 Premiumseats.put("A10P", "available\n");
		 Premiumseats.put("A11P", "available");
		 Premiumseats.put("A12P", "available");
		 Premiumseats.put("A13P", "available");
		 Premiumseats.put("A14P", "available");
		 Premiumseats.put("A15P", "available");
		 Premiumseats.put("A16P", "available");
		 Premiumseats.put("A17P", "available");
		 Premiumseats.put("A18P", "available");
		 Premiumseats.put("A19P", "available");
		 Premiumseats.put("A20P", "available\n");
		 Premiumseats.put("A21P", "available");
		 Premiumseats.put("A22P", "available");
		 Premiumseats.put("A23P", "available");
		 Premiumseats.put("A24P", "available");
		 Premiumseats.put("A25P", "available");
		 Premiumseats.put("A26P", "available");
		 Premiumseats.put("A27P", "available");
		 Premiumseats.put("A28P", "available");
		 Premiumseats.put("A29P", "available");
		 Premiumseats.put("A30P", "available\n");
		 Premiumseats.put("A31P", "available");
		 Premiumseats.put("A32P", "available");
		 Premiumseats.put("A33P", "available");
		 Premiumseats.put("A34P", "available");
		 Premiumseats.put("A35P", "available");
		 Premiumseats.put("A36P", "available");
		 Premiumseats.put("A37P", "available");
		 Premiumseats.put("A38P", "available");
		 Premiumseats.put("A39P", "available");
		 Premiumseats.put("A40P", "available\n");
		 Premiumseats.put("A41P", "available");
		 Premiumseats.put("A42P", "available");
		 Premiumseats.put("A43P", "available");
		 Premiumseats.put("A44P", "available");
		 Premiumseats.put("A45P", "available");
		 Premiumseats.put("A46P", "available");
		 Premiumseats.put("A47P", "available");
		 Premiumseats.put("A48P", "available");
		 Premiumseats.put("A49P", "available");
		 Premiumseats.put("A50P", "available\n");


	 }
	 static LinkedHashMap<String, String> Standardstatus = new LinkedHashMap<String, String>();
	 static {
		    Standardstatus.put("A1", GREEN +  "██" + NON);
		    Standardstatus.put("A2", GREEN +  "██" + NON);
		    Standardstatus.put("A3", GREEN +  "██" + NON);
		    Standardstatus.put("A4", GREEN +  "██" + NON);
		    Standardstatus.put("A5", GREEN +  "██" + NON);
		    Standardstatus.put("A6", GREEN +  "██" + NON);
		    Standardstatus.put("A7", GREEN +  "██" + NON);
		    Standardstatus.put("A8", GREEN +  "██" + NON);
		    Standardstatus.put("A9", GREEN +  "██" + NON);
		    Standardstatus.put("A10", GREEN + "██" + NON + "\n");
		    Standardstatus.put("A11", GREEN + "██" + NON);
		    Standardstatus.put("A12", GREEN + "██" + NON);
		    Standardstatus.put("A13", GREEN + "██" + NON);
		    Standardstatus.put("A14", GREEN + "██" + NON);
		    Standardstatus.put("A15", GREEN + "██" + NON);
		    Standardstatus.put("A16", GREEN + "██" + NON);
		    Standardstatus.put("A17", GREEN + "██" + NON);
		    Standardstatus.put("A18", GREEN + "██" + NON);
		    Standardstatus.put("A19", GREEN + "██" + NON);
		    Standardstatus.put("A20", GREEN + "██" + NON + "\n");
		    Standardstatus.put("A21", GREEN + "██" + NON);
		    Standardstatus.put("A22", GREEN + "██" + NON);
		    Standardstatus.put("A23", GREEN + "██" + NON);
		    Standardstatus.put("A24", GREEN + "██" + NON);
		    Standardstatus.put("A25", GREEN + "██" + NON);
		    Standardstatus.put("A26", GREEN + "██" + NON);
		    Standardstatus.put("A27", GREEN + "██" + NON);
		    Standardstatus.put("A28", GREEN + "██" + NON);
		    Standardstatus.put("A29", GREEN + "██" + NON);
		    Standardstatus.put("A30", GREEN + "██" + NON + "\n");
		    Standardstatus.put("A31", GREEN + "██" + NON);
		    Standardstatus.put("A32", GREEN + "██" + NON);
		    Standardstatus.put("A33", GREEN + "██" + NON);
		    Standardstatus.put("A34", GREEN + "██" + NON);
		    Standardstatus.put("A35", GREEN + "██" + NON);
		    Standardstatus.put("A36", GREEN + "██" + NON);
		    Standardstatus.put("A37", GREEN + "██" + NON);
		    Standardstatus.put("A38", GREEN + "██" + NON);
		    Standardstatus.put("A39", GREEN + "██" + NON);
		    Standardstatus.put("A40", GREEN + "██" + NON);
		    Standardstatus.put("A41", GREEN + "██" + NON);
		    Standardstatus.put("A42", GREEN + "██" + NON);
		    Standardstatus.put("A43", GREEN + "██" + NON);
		    Standardstatus.put("A44", GREEN + "██" + NON);
		    Standardstatus.put("A45", GREEN + "██" + NON);
		    Standardstatus.put("A46", GREEN + "██" + NON);
		    Standardstatus.put("A47", GREEN + "██" + NON);
		    Standardstatus.put("A48", GREEN + "██" + NON);
		    Standardstatus.put("A49", GREEN + "██" + NON);
		    Standardstatus.put("A50", GREEN + "██" + NON);
	 }
	 static LinkedHashMap<String, String> Premiumstatus = new LinkedHashMap<String, String>();
	 static {
	     Premiumstatus.put("A1P", GREEN + "██" + NON);
	     Premiumstatus.put("A2P", GREEN + "██" + NON);
	     Premiumstatus.put("A3P", GREEN + "██" + NON);
	     Premiumstatus.put("A4P", GREEN + "██" + NON);
	     Premiumstatus.put("A5P", GREEN + "██" + NON);
	     Premiumstatus.put("A6P", GREEN + "██" + NON);
	     Premiumstatus.put("A7P", GREEN + "██" + NON);
	     Premiumstatus.put("A8P", GREEN + "██" + NON);
	     Premiumstatus.put("A9P", GREEN + "██" + NON);
	     Premiumstatus.put("A10P", GREEN + "██" + NON + "\n");
	     Premiumstatus.put("A11P", GREEN + "██" + NON);
	     Premiumstatus.put("A12P", GREEN + "██" + NON);
	     Premiumstatus.put("A13P", GREEN + "██" + NON);
	     Premiumstatus.put("A14P", GREEN + "██" + NON);
	     Premiumstatus.put("A15P", GREEN + "██" + NON);
	     Premiumstatus.put("A16P", GREEN + "██" + NON);
	     Premiumstatus.put("A17P", GREEN + "██" + NON);
	     Premiumstatus.put("A18P", GREEN + "██" + NON);
	     Premiumstatus.put("A19P", GREEN + "██" + NON);
	     Premiumstatus.put("A20P", GREEN + "██" + NON + "\n");
	     Premiumstatus.put("A21P", GREEN + "██" + NON);
	     Premiumstatus.put("A22P", GREEN + "██" + NON);
	     Premiumstatus.put("A23P", GREEN + "██" + NON);
	     Premiumstatus.put("A24P", GREEN + "██" + NON);
	     Premiumstatus.put("A25P", GREEN + "██" + NON);
	     Premiumstatus.put("A26P", GREEN + "██" + NON);
	     Premiumstatus.put("A27P", GREEN + "██" + NON);
	     Premiumstatus.put("A28P", GREEN + "██" + NON);
	     Premiumstatus.put("A29P", GREEN + "██" + NON);
	     Premiumstatus.put("A30P", GREEN + "██" + NON + "\n");
	     Premiumstatus.put("A31P", GREEN + "██" + NON);
	     Premiumstatus.put("A32P", GREEN + "██" + NON);
	     Premiumstatus.put("A33P", GREEN + "██" + NON);
	     Premiumstatus.put("A34P", GREEN + "██" + NON);
	     Premiumstatus.put("A35P", GREEN + "██" + NON);
	     Premiumstatus.put("A36P", GREEN + "██" + NON);
	     Premiumstatus.put("A37P", GREEN + "██" + NON);
	     Premiumstatus.put("A38P", GREEN + "██" + NON);
	     Premiumstatus.put("A39P", GREEN + "██" + NON);
	     Premiumstatus.put("A40P", GREEN + "██" + NON);
	     Premiumstatus.put("A41P", GREEN + "██" + NON);
	     Premiumstatus.put("A42P", GREEN + "██" + NON);
	     Premiumstatus.put("A43P", GREEN + "██" + NON);
	     Premiumstatus.put("A44P", GREEN + "██" + NON);
	     Premiumstatus.put("A45P", GREEN + "██" + NON);
	     Premiumstatus.put("A46P", GREEN + "██" + NON);
	     Premiumstatus.put("A47P", GREEN + "██" + NON);
	     Premiumstatus.put("A48P", GREEN + "██" + NON);
	     Premiumstatus.put("A49P", GREEN + "██" + NON);
	     Premiumstatus.put("A50P", GREEN + "██" + NON);
	 }

	
	@Override
	public boolean isValidName(String name) {
        return name.matches("[A-Za-z\\- ]{1,}");
    }

    @Override
    public boolean isValidMovie(String movie) {
        return movie.matches("[A-Za-z0-9\\-\\: ]{1,}"); 
    }

    @Override
    public boolean isValidTicketID(String ticketID) {
        return ticketID.matches("^\\d{4}$");
    }
    
	@Override
	public void bookTicket() {
		while(true) {
			
				
				
					multiBook();
		}
	}
	public void multiBook() {
Path fp = Paths.get("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
final String RED = "\u001B[31m";
final String CYAN = "\u001B[36m";
 final String YELLOW = "\u001B[33m";
final String RESET = "\u001B[0m";
		
		int BookNum =0;
		String CustomerName;
		String MovieName;
		
		try (Scanner scan = new Scanner(fp)) {
			while(true) {
				System.out.println("Please enter how many tickets will be booked");
				BookNum = s.nextInt();
				s.nextLine();
				if(BookNum>0) {
					break;
				}
			}
			
			System.out.println("just type cancel if you dont wanna continue");
			while(true) {
				System.out.println("Enter Name:");
				CustomerName=s.nextLine();
				if (isValidName(CustomerName)) {
					break;
				}else if(CustomerName.equalsIgnoreCase("cancel")) {
					Recurse();
				}
				System.out.println("Wrong format. Try again.");
			}
			while(true) {
				
				
				
				
				System.out.println(CYAN + "									  ╔═══════════════════════════════════════════════════════════════════════════════════╗" + RESET);
		        System.out.println(CYAN + "									  ║      🎬 Movies				  				      ║" + RESET);
		        System.out.println(CYAN+"									  ║ "+Movies+ 							   " ║");
		        System.out.println(CYAN + "									  ╠═══════════════════════════════════════════════════════════════════════════════════╣" + RESET);
				//System.out.println("Available movies right now "+Movies);
				
				
				
				
				
				
				System.out.println("Enter movie name:");
				MovieName = s.nextLine();
				if(Movies.contains(MovieName)&&isValidMovie(MovieName)) {
					break;
				}else if(CustomerName.equalsIgnoreCase("cancel")) {
					Recurse();
				}
				System.out.println("Wrong format. Try again.");
			}
			while(true) {
				System.out.println("Enter Ticket ID: ");
				TicketID = s.nextLine();
				if(isValidTicketID(TicketID)) {
					break;
				}else if(CustomerName.equalsIgnoreCase("cancel")) {
					Recurse();
				}
				System.out.println("Wrong format. Try again.");
			}
			
			for (int i = 0; i < BookNum; i++){

				String entry =  "\nCustomer Name: " + CustomerName + "\nMovie Name: " + MovieName + "\nTicket ID: " + TicketID+ "\n";
				bookings.add(entry);
				customers.add(CustomerName);
				int nig = bookings.size() -1; 
				System.out.println("your slots are "+nig);
			}
			int recordpay=0;
			int total = BookNum*standardPricing;
			System.out.println("total cost: "+ total);
			while(true) {
				try {
					System.out.println("enter payment");
					int payment = s.nextInt();
					if(payment ==total) {
						System.out.println(bookings);
						System.out.println("cost: "+payment );
						standardPayments.add(payment);
						break;
					}else if(payment>total) {
						recordpay = BookNum*standardPricing;
						int change = payment-total;
						System.out.println(bookings);
						System.out.println("cost: "+recordpay );
						System.out.println("Change: "+ change);
						standardPayments.add(recordpay);
						break;
					}else {
						System.out.println("sorry, your payment is insufficient");
						System.out.println("Please pay with higher amount");
					}
				}catch(InputMismatchException e) {
					System.out.println("numbers only");
					s.nextLine();
				}
			}
		
			System.out.println(BookNum+" Tickets successfully booked");
			
			
			
			
			
			PrintWriter writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));
			 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt"));
			 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));
			writerB.print(bookings);
			writerB.flush();
			
			PrintWriter writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardPayments.txt", true));
			 writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardPayments.txt"));
			 writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardPayments.txt", true));
			writerP.print(standardPayments);
			writerP.flush();

			}catch(IOException e) {
				System.out.println("Error has occured");
			}catch(InputMismatchException e) {
				System.out.println("Numbers only");
			}
		recurseStandard();
			}
			
	
	
	public void premiumMultiBook() {
		Path fp = Paths.get("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
		final String RED = "\u001B[31m";
		final String CYAN = "\u001B[36m";
		 final String YELLOW = "\u001B[33m";
		final String RESET = "\u001B[0m";
				
				int BookNum =0;
				String CustomerName;
				String MovieName;
				
				try (Scanner scan = new Scanner(fp)) {
					while(true) {
						System.out.println("Please enter how many tickets will be booked");
						BookNum = s.nextInt();
						s.nextLine();
						if(BookNum>0) {
							break;
						}
					}
					
				System.out.println("just type cancel to cancel");
					
					while(true) {
						System.out.println("Enter Name:");
						CustomerName=s.nextLine();
						if (isValidName(CustomerName)) {
							break;
						}else if(CustomerName.equalsIgnoreCase("cancel")) {
							Recurse();
						}
						System.out.println("Wrong format. Try again.");
					}
					while(true) {
						
						
						
						
						
				System.out.println(CYAN + "									  ╔═══════════════════════════════════════════════════════════════════════════════════╗" + RESET);
				System.out.println(CYAN + "									  ║      🎬 Movies				  				      ║" + RESET);
				System.out.println(CYAN+"									  ║ "+Movies+ 							   " ║");
				System.out.println(CYAN + "									  ╠═══════════════════════════════════════════════════════════════════════════════════╣" + RESET);
						
						
						
						
						
						
						
						System.out.println("Enter movie name:");
						
						
						
						
						MovieName = s.nextLine();
						if(Movies.contains(MovieName)&&isValidMovie(MovieName)) {
							break;
						}else if(CustomerName.equalsIgnoreCase("cancel")) {
							Recurse();
						}
						System.out.println("Wrong format. Try again.");
					}
					while(true) {
						System.out.println("Enter Ticket ID: ");
						TicketID = s.nextLine();
						if(isValidTicketID(TicketID)) {
							break;
						}else if(CustomerName.equalsIgnoreCase("cancel")) {
							Recurse();
						}
						System.out.println("Wrong format. Try again.");
					}
					
					for (int i = 0; i < BookNum; i++){

						String entry =  "\nCustomer Name: " + CustomerName + "\nMovie Name: " + MovieName + "\nTicket ID: " + TicketID+ "\n";
						premiumBookings.add(entry);
						customers.add(CustomerName);
						int nig = premiumBookings.size() -1; 
						System.out.println("your slots are "+nig);
					}
					int total = BookNum*premiumPricing;
					System.out.println("total cost: "+ total);
					while(true) {
						try {
							System.out.println("enter payment");
							int payment = s.nextInt();
							if(payment ==total) {
								premiumPayments.add(payment);
								break;
							}else if(payment>total) {
								int change = payment-total;
								int recordpay = BookNum*premiumPricing;
								System.out.println("Change: "+ change);
								premiumPayments.add(recordpay);
								break;
							}else {
								System.out.println("sorry, your payment is insufficient");
								System.out.println("Please pay with higher amount");
							}
						}catch(InputMismatchException e) {
							System.out.println("numbers only");
							s.nextLine();
						}
					}
					
					System.out.println(BookNum+" Tickets successfully booked");
					System.out.println(premiumBookings);
					
					PrintWriter writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt", true));
					 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt"));
					 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt", true));
						writerB.print(premiumBookings);
						writerB.flush();

						PrintWriter writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumPayments.txt", true));
						 writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumPayments.txt"));
						 writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumPayments.txt", true));
						writerP.print(premiumPayments);
						writerP.flush();

					}catch(IOException e) {
						System.out.println("Error has occured");
					}catch(InputMismatchException e) {
						System.out.println("Numbers only");
					}
				
				recursePremium();
					}

			 	

	
		public void StandardmultiCancel() {
		int numtodel=0;
		int bs = bookings.size() -1; 
		while(true) {
			try {
				
				System.out.println("enter number of bookings and seat reservations to cancel");
				 numtodel= s.nextInt();
				 s.nextLine();
				 if(numtodel>bs) {
					 System.out.println("hollup man thats above the number of bookings");
				 }else if(numtodel<=bs) {
					 break;
				 }
			}catch(InputMismatchException e) {
				System.out.println(" that aint a number");
				s.nextLine();
			}
		}
		
		while(true) {
			try {
				
					Path ip = Paths.get("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
					
					for(int i=0;i<numtodel;i++) {
						
						Standardstatus();
							 System.out.println("type the seat codes you have reserevd to cancel reservation");
							 
							String input = s.nextLine();
							 if (Standardseats.containsKey(input)&&isStandardSeatValid(input)&&	!Standardseats.get(input).equals("available")) {
								 Standardseats.put(input,"available");
								 Standardstatus.put(input, GREEN+"██"+NON  );
								System.out.println(input+ "is now "+ Standardseats.get(input));
								Standardstatus();
							}else {
								 i--;
								 System.out.println("follow the instructions!");
						
					}
					}
			
				System.out.println("now Type your ticket ID to cancel the bookings in your name");
				 String target = s.nextLine();
				 List<String> fs = new ArrayList<>();
		//this might cause error some time soon
				 for (int  it=bookings.size()-1 ;it>=0 && numtodel>0;it--) {
					 String str = bookings.get(it);
					 if(str.contains(target)) {
						 bookings.remove(it);
						 PrintWriter writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));
						 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt"));
						 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));
						writerB.print(bookings);
						writerB.flush();
						 numtodel--;
						
					 }
				 }
				 System.out.println("type number of cancelled bookings to refund");
				 int multiplier = s.nextInt();
				 int value = standardPricing;
				 int targetvalue = value*multiplier;
				 int refund; 
				 int remains;
				 for (int index = 0; index< standardPayments.size(); index++){
					 int payment = standardPayments.get(index);
				 if(payment>=targetvalue){
				 remains = payment-targetvalue;
				 refund=targetvalue;
				 
				 standardPayments.remove(index);
				 standardPayments.add(remains);
				 System.out.println("refunded amount: "+refund);
				 break;
				 }	
				 }
				 PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardPayments.txt", true));
				 pw = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardPayments.txt"));
				 pw = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardPayments.txt", true));
				 pw.print(standardPayments);
					pw.flush();
				
				 System.out.println("updated bookings"+bookings);
				Recurse();
				
				
				
		           			 
			
					}
					catch(IOException e) {
				System.out.println("an error has occured");}
			}
			}

		
	
	public void PremiummultiCancel() {
		int numtodel=0;
		int bs = premiumBookings.size() -1; 
		while(true) {
			try {
				
				System.out.println("enter number of bookings and seat reservations to cancel");
				 numtodel= s.nextInt();
				 s.nextLine();
				 if(numtodel>bs) {
					 System.out.println("hollup man thats above the number of bookings");
				 }else if(numtodel<=bs) {
					 break;
				 }
			}catch(InputMismatchException e) {
				System.out.println("nigga that aint a number");
				s.nextLine();
			}
		}
			System.out.println("If you're done cancelling seat reservation type 0");
		while(true) {
			try {
				
					Path ip = Paths.get("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
					
					for(int i=0;i<numtodel;i++) {
						
						
						Premiumstatus();
							 System.out.println("type your seat name or code to cancel reservation");
							 
							String input = s.nextLine();
							 if (Premiumseats.containsKey(input)&&isPremiumSeatValid(input)&&	!Premiumseats.get(input).equals("available")) {
								 Premiumseats.put(input,"available");
								 Premiumstatus.put(input, GREEN+"██"+NON  );
								System.out.println(input+ "is now "+ Premiumseats.get(input));
								Premiumstatus();
							}else if (input == "0") {
								continue;
							}
							 else {
								 i--;
								 System.out.println("follow the instructions!");
							}
						
					}
			
				System.out.println("now Type your ticket ID to cancel all the bookings in your name");
				 String target = s.nextLine();
				 List<String> fs = new ArrayList<>();
				 for (int  i=premiumBookings.size()-1 ;i>=0 && numtodel>0;i--) {
					 String str = premiumBookings.get(i);
					 if(str.contains(target)) {
						 premiumBookings.remove(i);
						 PrintWriter writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt", true));
						 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt"));
						 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt", true));
							writerB.print(premiumBookings);
							writerB.flush();
						 numtodel--;
						
					 }
				 }
				 System.out.println("type number of cancelled bookings to refund");
				 int multiplier = s.nextInt();
				 int value = premiumPricing;
				 int targetvalue = value*multiplier;
				 int refund; 
				 int remains;
				 for (int index = 0; index< premiumPayments.size(); index++){
					 int payment = premiumPayments.get(index);
				 if(payment>=targetvalue){
				 remains = payment-targetvalue;
				 refund=targetvalue;
				 
				 premiumPayments.remove(index);
				 premiumPayments.add(remains);
				 System.out.println("refunded amount: "+refund);
				 break;
				 }	
				 }
				 PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumPayments.txt", true));
				 pw = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumPayments.txt"));
				 pw = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumPayments.txt", true));
				 pw.print(premiumPayments);
					pw.flush();
			
				
				 /*System.out.println("now Type your ticket ID to cancel the bookings in your name");
				 String target = s.nextLine();
				 List<String> fs = new ArrayList<>();
		//this might cause error some time soon
				 for (int  it=bookings.size()-1 ;it>=0 && numtodel>0;it--) {
					 String str = bookings.get(it);
					 if(str.contains(target)) {
						 bookings.remove(it);
						 numtodel--;*/
				 System.out.println("updated bookings"+premiumBookings);
				Recurse();
		           			 
			
			}catch(IOException e) {
				System.out.println("an error has occured");
			}
			}

		}

	
	@Override
	public void check() {
		Path ip = Paths.get("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
		File booked = new File("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
		  System.out.println("These are all the booked tickets");
		  System.out.println(bookings);
		  System.out.println("Would you like to confirm it and get the receipt?(yes or no)");
		  String decision = s.nextLine();
		  
		  if (decision.equalsIgnoreCase("yes")) {
			  try {
				  PrintWriter pw = new PrintWriter(new FileWriter(ip.toString(), true));
				  try {
		                Desktop.getDesktop().open(booked); 
		            } catch (IOException e) {
		                System.out.println("Error opening the file: " + e.getMessage());
		            }
				  pw.println(bookings);
				  System.out.println(booked);
				  pw.close();
	            
	          } catch (IOException e) {
	              System.out.println("Error opening the file: " + e.getMessage());
	          }
		  }else if (decision.equalsIgnoreCase("no")) {
			  System.out.println("Okay nigger");
		  }

	}
	@Override
	
	public void StandardmultiSeatRes() {
		System.out.println("Welcome! this is the multi seat reservation section.");
		
		int nameMatchCount=0;
		System.out.println("now Type your ticket ID to verify if you really booked before reserving multi seats");
		 String target = s.nextLine();
		
		 List<String> fs = new ArrayList<>();
		 for (int  i=0;i<bookings.size();i++) {
			 String str = bookings.get(i);
			 if(str.contains(target)) {
				 bookings.get(i);
				 nameMatchCount++;
			 }				
		 }
		 if (nameMatchCount > 0) {
			 for(int i1=0; i1<nameMatchCount;i1++) {
				 while(true) {
						try {
							System.out.println("Type cancel to cancel");
							System.out.println("green means avialable and red means occupied");
							Standardstatus();
							System.out.println("Please enter seat ID to proceed with seat reservation(A1-A12)");
							
							
							String choice = s.nextLine();
							 if (Standardseats.get(choice).equals("Reserved")) {  
							        System.out.println("Sorry, the seat " + choice + " is already reserved.");
							        System.out.println("try a different seat");
							        
							    }
							if (Standardseats.containsKey(choice)&& !Standardseats.get(choice).equals("Reserved") && isStandardSeatValid(choice)) {
								System.out.println("Successfully registered. your seat is "+ choice);
								Standardseats.put(choice, "Reserved");
								Standardstatus.put(choice, RED + "██" + NON);
								break;
							}else if(choice.equalsIgnoreCase("cancel")) {
								Recurse();
							}
						}
						catch(NullPointerException e) {
							System.out.println("Upto A12 only. Try again");
						}
					}
			}

		 }
			Recurse();

	}
	
	@Override
	
	public void PremiummultiSeatRes() {
		System.out.println("Welcome! this is the multi seat reservation section.");
		
		int nameMatchCount=0;
		System.out.println("now Type your ticket ID to verify if you really booked before reserving multi seats");
		 String target = s.nextLine();
		
		 List<String> fs = new ArrayList<>();
		 for (int  i=0;i<premiumBookings.size();i++) {
			 String str = premiumBookings.get(i);
			 if(str.contains(target)) {
				 premiumBookings.get(i);
				 nameMatchCount++;
			 }				
		 }
		 if (nameMatchCount > 0) {
			 						
			 for(int i1=0; i1<nameMatchCount;i1++) {
				 while(true) {
						try {
							System.out.println("type cancel to cancel");
							System.out.println("green means avialable and red means occupied");
							Premiumstatus();
							System.out.println("Please enter seat ID to proceed with seat reservation(A1-A12)");
							String choice = s.nextLine();
							 if (Premiumseats.get(choice).equals("Reserved")) {  
							        System.out.println("Sorry, the seat " + choice + " is already reserved.");
							        System.out.println("try a different seat");
							        
							    }
							if (Premiumseats.containsKey(choice)&& !Premiumseats.get(choice).equals("Reserved") && isPremiumSeatValid(choice)) {
								System.out.println("Successfully registered. your seat is "+ choice);
								Premiumseats.put(choice, "Reserved");
								Premiumstatus.put(choice, RED + "██" + NON);
								break;
							}else if(choice.equalsIgnoreCase("cancel")) {
								Recurse();
							}
							
						}
						catch(NullPointerException e) {
							System.out.println("Upto A12 only. Try again");
						}
					}
			}

		 }
			Recurse();

	}

	
	
	public boolean isStandardSeatValid(String seat) {
		return seat.matches("^A([1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|50)$");
	}
	public boolean isPremiumSeatValid(String seat) {
		return seat.matches("^A([1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|50)P$");
	}
	static void Standardstatus() {
		int regulator=0;
for (Map.Entry<String,String> entry: Standardstatus.entrySet()) {
	String key= entry.getKey();
	String value = entry.getValue();
	 System.out.print(key + value+"     ");
	 regulator++;
	 if(regulator%10==0) {
		 System.out.println("");
	 }
}
	}
static void Premiumstatus() {
	int regulator=0;
for (Map.Entry<String,String> entry: Premiumstatus.entrySet()) {
String key= entry.getKey();
String value = entry.getValue();
 System.out.print(key + value+"     ");
 regulator++;
 if(regulator%10==0) {
	 System.out.println("");
 }
}

	}
	public void StandardseatCount() {
		int regulator=0;
for (Map.Entry<String,String> entry: Standardseats.entrySet()) {
	String key= entry.getKey();
	String value = entry.getValue();
	 System.out.print(key + value+"     ");
	 regulator++;
	 if(regulator%10==0) {
		 System.out.println("");
	 }
	
		}
System.out.println("");
System.out.println("");
	}
public void PremiumseatCount() {
	int regulator=0;
for (Map.Entry<String,String> entry: Premiumseats.entrySet()) {
		String key= entry.getKey();
		String value = entry.getValue();
		 System.out.print(key + ": " + value+"     ");
		 regulator++;
		 if(regulator%10==0) {
			 System.out.println("");
		 }
		}
System.out.println("");
System.out.println("");
}
	
	static void Recurse() {
		Object O1 = new Object();
        final String CYAN = "\u001B[96m";
        final String BOLD = "\u001B[1m";
        final String CLEAR = "\u001B[0m";
        final String DB = "\u001B[34m";
        final String RED = "\u001B[31m";
        System.out.println();
        System.out.println(CYAN+"""
        		     		     		     		     	███████╗██╗██╗     ███╗   ███╗██╗  ██╗ ██████╗ ██╗   ██╗███████╗███████╗
        		     		     		     		     	██╔════╝██║██║     ████╗ ████║██║  ██║██╔═══██╗██║   ██║██╔════╝██╔════╝
        		     		     		     		     	█████╗  ██║██║     ██╔████╔██║███████║██║   ██║██║   ██║███████╗█████╗ 
        		     		     		     		     	██╔══╝  ██║██║     ██║╚██╔╝██║██╔══██║██║   ██║██║   ██║╚════██║██╔══╝  
        		     		     		     		     	██║     ██║███████╗██║ ╚═╝ ██║██║  ██║╚██████╔╝╚██████╔╝███████║███████╗ 
        		     		     		     		     	╚═╝     ╚═╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝
   """+ NON);
        System.out.println("        		 			 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println(BOLD+"										 		 	 	 W E L C O M E!" + NON);
        System.out.println("        		 			- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println();
		System.out.println(BOLD+"													 Please select mode of booking");
		System.out.println();
		System.out.println(BOLD + "														1. Premium");
		System.out.println("													2. Standard");
		System.out.println(RED +"														3. Exit" + CLEAR );
		int input = s.nextInt();
		s.nextLine();
		if (input == 1) {
			recursePremium();
		}else if(input ==2) {
			recurseStandard();
		}else if (input ==3) {
			return;
		}else if(input == 177013) {
			O1.adminLogin();
		}
		
		
	}
	static void recurseStandard() {
		while(true) {
					try {
				        final String CYAN = "\u001B[96m";
				        final String BOLD = "\u001B[1m";
				        final String CLEAR = "\u001B[0m";
				        final String DB = "\u001B[34m";
				        final String RED = "\u001B[31m";
		System.out.println("        		 			- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println(BOLD+"										 		 	 	STANDARD SECTION" + NON);
		System.out.println("        		 			- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println();
				Object std = new Object();
		System.out.println(BOLD+"													   Type the Number to select");
		System.out.println();
		System.out.println(BOLD+RED+"														0 Back"+CLEAR);
		System.out.println(BOLD+"														1 Ticket Booking");
		System.out.println("													2 Seat Reservation");
		System.out.println("													3 Cancellation");
		System.out.println("													4 Show Ticket");
					
				
				int input = s.nextInt();
				s.nextLine();
				if(input ==0) {
					Recurse();
				}
				else if (input ==1 ) {
					std.bookTicket();
				}else if (input == 2) {
					std.StandardmultiSeatRes();
				}else if (input ==3 ) {
					std.StandardmultiCancel();
				}else if (input == 4) {
					std.standardShowTicket();
				}
			}catch(InputMismatchException e) {
				System.out.println("numbers 1-4 only");
				s.nextLine();
			}
		}
		
	}
	//all admin features
	public void adminLogin() {
		String password;
		System.out.println("Enter password");
		password=s.nextLine();
		if (password.equals("WeLoveNadeko")) {
			adminRecurse();
		}else {
			System.out.println("Wrong password");
		}
		
	}
	
	public void adminLogout() {
		String dec = s.nextLine();
		if (dec.equals("AdiosCoworkers")) {
			System.out.println("aight bye");
			Recurse();
		}
	}
	public void addNewMovie() {
		System.out.println("how many movies will you add");
		int amount = s.nextInt();
		s.nextLine();
		for (int i = 0; i<amount;i++) {
			System.out.println("type the movie name to add");
			String Minput = s.nextLine();
			Movies.add(Minput);
			System.out.println(Minput+ " successfully added to the list");
		}
		System.out.println("Movies added");
		adminRecurse();
	}
	
		public void adminRecurse() {
		
		String choice;
		System.out.println("aight my fella you're in");
		System.out.println("here's the list of features we have");
		System.out.println("1.add movies");
		System.out.println("2.edit movies");
		System.out.println("3.delete movies");
		System.out.println("4.see total bookings");
		System.out.println("5.show movie list");
		choice = s.nextLine().toLowerCase();
		if(choice.equals("add movies")) {
			addNewMovie();
		}else if (choice.equals("edit movies")) {
			editMovie();
	
		}else if (choice.equals("see total bookings")) {
			seeTotalBookings();	
		}else if (choice.equals("show movie list")) {
			showMovieList();
		}
		
	}
		
	public void editMovie() {
		while(true) {
			try {
				int numtodel;
				System.out.println("here's the list of movies");
				showMovieList();
				System.out.println("type how many movies will be removed");
				int amount = s.nextInt();
				s.nextLine();
				
				for(int it=0; it<amount;it++) {
					System.out.println("type the movie name to cancel it");
					 String target = s.nextLine();
					if (Movies.contains(target)) {
						Movies.remove(target);
					}
				}	
				adminRecurse();
			}catch(InputMismatchException e) {
				System.out.println("type a number");
				s.nextLine();
			}
		}
	}
	public void seeTotalBookings() {
		System.out.println("which one? premium or standard");
		String sop = s.nextLine().toLowerCase();
		if(sop.equals("premium")) {
			System.out.println(premiumBookings);
		}else if(sop.equals("standard")) {
			System.out.println(bookings);
		}
		adminRecurse();
	}public void showMovieList() {
		System.out.println(Movies);
	}
	
	
	static void recursePremium() {
		while(true) {
			try {
				
		        final String CYAN = "\u001B[96m";
		        final String BOLD = "\u001B[1m";
		        final String CLEAR = "\u001B[0m";
		        final String DB = "\u001B[34m";
		        final String RED = "\u001B[31m";
		        final String YL = "\u001B[33m";
				System.out.println("        		 			- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println(BOLD+YL+"										 		 	 	PREMIUM SECTION" + NON+CLEAR);
				System.out.println("        		 			- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.out.println();
			Object prm = new Object();
				System.out.println(BOLD+"													   Type the Number to select");
				System.out.println();
				System.out.println(BOLD+RED+"														0 Back"+CLEAR);
				System.out.println(BOLD+"														1 Ticket Booking");
				System.out.println("													2 Seat Reservation");
				System.out.println("													3 Cancellation");
				System.out.println("													4 Show Ticket");
				
			
				int input = s.nextInt();
				s.nextLine();
				if(input ==0) {
					Recurse();
				}
				else if(input ==1 ) {
					prm.premiumMultiBook();
				}else if (input == 2) {
					prm.PremiummultiSeatRes();
				}else if (input ==3 ) {
					prm.PremiummultiCancel();
				}else if(input ==4) {
					prm.premiumShowTicket();
				}
			}catch(InputMismatchException e) {
				System.out.println("number 1-5 only");
				s.nextLine();
			}
		}
	
	}
	public String getMovieName1() {
		return this.MovieName1;
	}
	public void setMovieName1(String MovieName1) {
		this.MovieName1 = MovieName1;
	}
	public String getMovieName2() {
		return this.MovieName2;
	}
	public void setMovieName2(String MovieName2) {
		this.MovieName2 = MovieName2;
	}public String getMovieName3() {
		return this.MovieName3;
	}
	public void setMovieName3(String MovieName3) {
		this.MovieName3 = MovieName3;
	}
	public String getTicketID() {
		return this.TicketID;
	}
	public void setTicketID(String TicketID) {
		this.TicketID = TicketID;
	}
	public void Title() {
		 System.out.println(BLUE +"""
	        		        ███████╗██╗██╗     ███╗   ███╗██╗  ██╗ ██████╗ ██╗   ██╗███████╗███████╗
	        		        ██╔════╝██║██║     ████╗ ████║██║  ██║██╔═══██╗██║   ██║██╔════╝██╔════╝
	        		        █████╗  ██║██║     ██╔████╔██║███████║██║   ██║██║   ██║███████╗█████╗ 
	        		        ██╔══╝  ██║██║     ██║╚██╔╝██║██╔══██║██║   ██║██║   ██║╚════██║██╔══╝  
	        		        ██║     ██║███████╗██║ ╚═╝ ██║██║  ██║╚██████╔╝╚██████╔╝███████║███████╗ 
	        		        ╚═╝     ╚═╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝
	   """+ NON);
	}
	public void standardShowTicket() {
		System.out.println("Welcome! this is the ticket viewing section.");
		
		
		System.out.println("now Type the ticket ID to identify which ticket to show");
		 String target = s.nextLine();
		

		 for (int  i=0;i<bookings.size();i++) {
			 String str = bookings.get(i);
			 if(str.contains(target)) {
				 System.out.println(bookings.get(i));
			
			 }				
		 }
	}
	public void premiumShowTicket() {
System.out.println("Welcome! this is the premium ticket viewing section.");
		
		
		System.out.println("now Type the ticket ID to identify which ticket to show");
		 String target = s.nextLine();
		

		 for (int  i=0;i<premiumBookings.size();i++) {
			 String str = premiumBookings.get(i);
			 if(str.contains(target)) {
				 System.out.println(premiumBookings.get(i));
			
			 }				
		 }
	}

	
}
