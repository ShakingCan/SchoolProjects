package package1;
import java.nio.file.*;import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.HashMap;
import java.io.*;
import java.io.IOException;
import static java.nio.file.AccessMode.*;
import java.io.FileWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Desktop;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

		Movies.add("The Matrix");
		Movies.add("Fight Club");
		Movies.add("Avengers: Endgame");
		Movies.add("The Dark Knight");
		Movies.add("Avengers: Endgame");
	}
	static int padding = 42; //padding
	
	static List<String> bookings = new ArrayList<>();
	static {
		
		}	
	static List<String> premiumBookings = new ArrayList<>();
	static {
		
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
		 Standardseats.put("A10", "available");
		 Standardseats.put("A11", "available");
		 Standardseats.put("A12", "available");
		 Standardseats.put("A13", "available");
		 Standardseats.put("A14", "available");
		 Standardseats.put("A15", "available");
		 Standardseats.put("A16", "available");
		 Standardseats.put("A17", "available");
		 Standardseats.put("A18", "available");
		 Standardseats.put("A19", "available");
		 Standardseats.put("A20", "available");
		 Standardseats.put("A21", "available");
		 Standardseats.put("A22", "available");
		 Standardseats.put("A23", "available");
		 Standardseats.put("A24", "available");
		 Standardseats.put("A25", "available");
		 Standardseats.put("A26", "available");
		 Standardseats.put("A27", "available");
		 Standardseats.put("A28", "available");
		 Standardseats.put("A29", "available");
		 Standardseats.put("A30", "available");
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
		 Premiumseats.put("A10P", "available");
		 Premiumseats.put("A11P", "available");
		 Premiumseats.put("A12P", "available");
		 Premiumseats.put("A13P", "available");
		 Premiumseats.put("A14P", "available");
		 Premiumseats.put("A15P", "available");
		 Premiumseats.put("A16P", "available");
		 Premiumseats.put("A17P", "available");
		 Premiumseats.put("A18P", "available");
		 Premiumseats.put("A19P", "available");
		 Premiumseats.put("A20P", "available");
		 Premiumseats.put("A21P", "available");
		 Premiumseats.put("A22P", "available");
		 Premiumseats.put("A23P", "available");
		 Premiumseats.put("A24P", "available");
		 Premiumseats.put("A25P", "available");
		 Premiumseats.put("A26P", "available");
		 Premiumseats.put("A27P", "available");
		 Premiumseats.put("A28P", "available");
		 Premiumseats.put("A29P", "available");
		 Premiumseats.put("A30P", "available");
		 Premiumseats.put("A31P", "available");
		 Premiumseats.put("A32P", "available");
		 Premiumseats.put("A33P", "available");
		 Premiumseats.put("A34P", "available");
		 Premiumseats.put("A35P", "available");
		 Premiumseats.put("A36P", "available");
		 Premiumseats.put("A37P", "available");
		 Premiumseats.put("A38P", "available");
		 Premiumseats.put("A39P", "available");
		 Premiumseats.put("A40P", "available");
		 Premiumseats.put("A41P", "available");
		 Premiumseats.put("A42P", "available");
		 Premiumseats.put("A43P", "available");
		 Premiumseats.put("A44P", "available");
		 Premiumseats.put("A45P", "available");
		 Premiumseats.put("A46P", "available");
		 Premiumseats.put("A47P", "available");
		 Premiumseats.put("A48P", "available");
		 Premiumseats.put("A49P", "available");
		 Premiumseats.put("A50P", "available");


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
		    Standardstatus.put("A40", GREEN + "██" + NON+"\n");
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
	     Premiumstatus.put("A40P", GREEN + "██" + NON+ "\n");
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
        final String BOLD = "\u001B[1m";
        final String GOLD = "\u001B[33m";
				
				int BookNum =0;
				String CustomerName;
				String MovieName;
		        String seatcodes;

		      
		       
				
				try  {
					while(true) {
						System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
						System.out.println("										          Please enter how many tickets will be booked?"+RESET);
						System.out.println("											 	      Example: 3 ");
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+"Choice: "+NON);
						BookNum = s.nextInt();
						System.out.println("");
						s.nextLine();
						if(BookNum>0) {
							break;
						}
					}
					System.out.println();
					//System.out.print("                                                                                                     ");
					System.out.println("                                                                                                   ---------------------");
					System.out.print("                                                                                                   " );
				System.out.println("|Type " +RED+BOLD+ "CANCEL "+NON+"TO STOP|");
				//System.out.print("" );
				System.out.println("                                                                                                   ---------------------");
					
					while(true) {
					
						System.out.print("                                                                                                        " );                                                                                     
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+"Enter Name: "+NON);
						CustomerName=s.nextLine();
						if (isValidName(CustomerName)&&!CustomerName.equalsIgnoreCase("cancel")) {
							break;
						}else if(CustomerName.equalsIgnoreCase("cancel")) {
							recurseStandard();
						}
						System.out.print("                                                                                                        " );
						System.out.println("Wrong format. Try again.");
					}
					System.out.println();
					System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
					System.out.println(BOLD);
					while(true) {
						System.out.println(BOLD + "        		 				   ┌─────────────────────────────────────────────────────────────────────────────────────────────────┐");
						System.out.println(BOLD + "        		 				   │" + GOLD + "                                            MOVIE LIST!" + RESET + BOLD +"                                          │");
						System.out.println(BOLD + "        		 				   └─────────────────────────────────────────────────────────────────────────────────────────────────┘");

						
						for (int i = 0; i < Movies.size(); i++) {
							System.out.print("                                                                                                        " );
				            System.out.println((i + 1) + ". " + Movies.get(i)); 
				           
				            
				        }
						System.out.println();
						System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
						System.out.println(BOLD);
						System.out.print("                                                                                                        " );
						
								System.out.println("Enter movie choice ex: 1");
								System.out.println();
								System.out.print("                                                                                                        " );//here
								System.out.print(CYAN+BOLD+"Choice: "+NON);
								
								int moviechoice = s.nextInt();
								s.nextLine();
								if(moviechoice==0) {
									recurseStandard();
								}
								 MovieName = Movies.get(moviechoice-1);
								 System.out.println();
								 System.out.print("                                                                                                        " );
								 System.out.println("Chosen movie: "+ MovieName);

								break;
						
						
				/*		
				System.out.println(CYAN + "						     ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗" + RESET);
				System.out.println(CYAN + "						     ║              			                             🎬 Movies                                                     ║" + RESET);
				System.out.println(CYAN+"						     ║ "+Movies+"                                           ║");
				System.out.println(CYAN + "						     ╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣" + RESET);
						
						
						
						
						
						
				System.out.print("                                                                                                        " );
						System.out.println("Enter movie name:");
						
						
						
						System.out.print("                                                                                                        " );
						MovieName = s.nextLine();
						boolean isMatch = false;
				        for (String movies : Movies) {
				            if (movies.equalsIgnoreCase(MovieName)) {
				                isMatch = true;
				                break;
				            }
				        }
						if(!MovieName.isEmpty()&& isMatch ) {
							for(String i: Movies) {
								if(i.equalsIgnoreCase(MovieName)) {
									break;
								}
							}
							break;
						
						}else if(MovieName.equalsIgnoreCase("cancel")) {
							Recurse();
						}
						System.out.print("                                                                                                        " );
						System.out.println("Wrong format. Try again.");
						*/
					}
					while(true) {
						System.out.print("                                                                                                        " );
						System.out.println("Enter Ticket ID ex:1234 ");
						System.out.print("                                                                                                        " );
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+"Ticket ID: "+NON);
						TicketID = s.nextLine();
						if(isValidTicketID(TicketID)&&!TicketID.equalsIgnoreCase("cancel")) {
							break;
						}else if(CustomerName.equalsIgnoreCase("cancel")) {
							recurseStandard();
						}
						System.out.print("                                                                                                        " );
						System.out.println("Wrong format. Try again.");
					}
					System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
					System.out.println();
					System.out.println();
					while(true) {
						String codePattern = "A([1-9]|[1-4][0-9]|50)";
					String fullPattern = "^(" + codePattern + "\\s?){" + BookNum + "}$";
						Standardstatus();
						System.out.print("                                                                                                        " );
						System.out.println("If more than 1, use space ex: A1 A2 A3");
						System.out.print("                                                                                                        " );
						System.out.println("Enter planned seat codes: ");
						System.out.print("                                                                                                        " );
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+"Choice: "+NON);
						seatcodes = s.nextLine();
						if(seatcodes.matches(fullPattern)&&!seatcodes.equalsIgnoreCase("cancel")) {
							break;
						}else if(seatcodes.equalsIgnoreCase("cancel")) {
							recurseStandard();
						}
						System.out.print("                                                                                                        " );
						System.out.println("Wrong format. Try again.");
					}
					while(true) {
						try {	
							int change=0;
							int total = BookNum*standardPricing;
							System.out.print("                                                                                                        " );
							System.out.println("Total cost: "+ total);
							System.out.print("                                                                                                        " );
							System.out.println("Enter payment");
							System.out.print("                                                                                                        " );
							System.out.println();
							System.out.print("                                                                                                        " );//here
							System.out.print(CYAN+BOLD+"Payment: "+NON);
							int payment = s.nextInt();
							s.nextLine();
							if(payment ==total) {
								premiumPayments.add(payment);
								for (int i = 0; i < BookNum; i++){
									LocalDateTime now = LocalDateTime.now(); // Gets current date and time

							        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
							        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
							        String formattedDate = now.format(date);
							        String formattedTime = now.format(time);
									String entry =  "\n,Customer Name: " + CustomerName + "\n,Movie Name: " + MovieName + "\n,Ticket ID: " + TicketID+ "\n,Seats reserved: "+seatcodes+"\n,Payment: "+payment+"\n,Change: "+change
											+"\n,Date: "+ formattedDate+ "\n,Time: "+formattedTime;
									bookings.add(entry);
									customers.add(CustomerName);
									int nig = bookings.size() -1; 
									
									
								}
								break;
							}else if(payment>total) {
								 change = payment-total;
								int recordpay = BookNum*standardPricing;
								System.out.print("                                                                                                        " );
								System.out.println("Change: "+ change);
								standardPayments.add(recordpay);
								for (int i = 0; i < BookNum; i++){
									LocalDateTime now = LocalDateTime.now(); // Gets current date and time

							        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
							        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
							        String formattedDate = now.format(date);
							        String formattedTime = now.format(time);
									String entry =  "\n,Customer Name: " + CustomerName + "\n,Movie Name: " + MovieName + "\n,Ticket ID: " + TicketID+ "\n,Seats reserved: "+seatcodes+"\n,Payment: "+payment+"\n,Change: "+change
											+"\n,Date: "+ formattedDate+ "\n,Time: "+formattedTime;
									bookings.add(entry);
									customers.add(CustomerName);
									int nig = bookings.size() -1; 
									
									
								}
								break;
							}else {
								System.out.print("                                                                                                        " );
								System.out.println("Sorry, your payment is insufficient");
								System.out.print("                                                                                                        " );
								System.out.println("Please pay with higher amount");
								
							}
							
							
					
						}catch(InputMismatchException e) {
							System.out.print("                                                                                                        " );
							System.out.println("Numbers only");
							
							s.nextLine();
						}
					}
					System.out.print("                                                                                                        " );
					System.out.println(BookNum+" Tickets successfully booked");
					int regu = bookings.size();
					stanresult(TicketID, BookNum, regu);
				
					
					PrintWriter writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));
					 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt"));
					 writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));
						writerB.print(bookings);
						writerB.flush();

						PrintWriter writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\Standardpayments.txt", true));
						 writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\Standardpayments.txt"));
						 writerP = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\Standardpayments.txt", true));
						writerP.print(standardPayments);
						writerP.flush();

					}catch(IOException e) {
						System.out.print("                                                                                                        " );
						System.out.println("Error has occured");
					}catch(InputMismatchException e) {
						System.out.print("                                                                                                        " );
						System.out.println("Numbers only");
						s.nextLine();
						recurseStandard();
					
					}catch(IndexOutOfBoundsException e) {
						System.out.print("                                                                                                        " );
						System.out.println("We only have "+Movies.size()+" movies");
						recurseStandard();
					}
				
				
				StandardmultiSeatRes();
				}

			 	
	 static void premresult(String id,int num, int reg) {
		 final String CYAN = "\u001B[96m";
	        final String BOLD = "\u001B[1m";
	        final String CLEAR = "\u001B[0m";
	        final String DB = "\u001B[34m";
	        final String RED = "\u001B[31m";
	        final String GOLD = "\u001B[33m";
	       
		 
		 
		 System.out.println("                                                                     ╔════════════════════════════════════════════════════════════════════════════════════════╗");
		 System.out.println("                                                                     ║                                      PREMIUM TICKETS                                   ║");
		 System.out.println("                                                                     ╠════════════════════════════════════════════════════════════════════════════════════════╣");
		 System.out.println();
			System.out.println(CYAN+BOLD+"        		 								    ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
		int stopper = reg-num;
		for (int  it=premiumBookings.size()-1 ;it>=0 && num>0;it--) {
			String str = premiumBookings.get(it);
			String target = id;
			if(str.contains(target)) {
				String Plit = str.replaceAll(",", "                                                                                                        ");
        		System.out.println(Plit);
        		num--;
        		System.out.println();
				System.out.println(CYAN+BOLD+"        		 								   ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
        		System.out.println();
        		System.out.println("                                                                     ══════════════════════════════════════════════════════════════════════════════════════════");
        		System.out.println();
        		System.out.println();
        		
			}
			
		}
	 }
	 static void stanresult(String id,int num, int reg) {
		 final String CYAN = "\u001B[96m";
	        final String BOLD = "\u001B[1m";
	        final String CLEAR = "\u001B[0m";
	        final String DB = "\u001B[34m";
	        final String RED = "\u001B[31m";
	        final String GOLD = "\u001B[33m";
		 System.out.println("                                                                     ╔════════════════════════════════════════════════════════════════════════════════════════╗");
		 System.out.println("                                                                     ║                                     STANDARD TICKETS                                   ║");
		 System.out.println("                                                                     ╠════════════════════════════════════════════════════════════════════════════════════════╣");
		 System.out.println();
			System.out.println(CYAN+BOLD+"        		 								    ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
		int stopper = reg-num;
		for (int  it=bookings.size()-1 ;it>=0 && num>0;it--) {
			String str = bookings.get(it);
			String target = id;
			if(str.contains(target)) {
				String Plit = str.replaceAll(",", "                                                                                                        ");
        		System.out.println(Plit);
        		num--;
        		 System.out.println();
     			System.out.println(CYAN+BOLD+"        		 								    ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
        		System.out.println("                                                                     ══════════════════════════════════════════════════════════════════════════════════════════");
        		System.out.println();
        		System.out.println();
			}
			
		}
	 }
	public void curatePremiumTicket(String id,int num, int reg) {

		 System.out.println("                                                                     ╔════════════════════════════════════════════════════════════════════════════════════════╗");
		 System.out.println("                                                                     ║                              CURATED PREMIUM TICKETS                                   ║");
		 System.out.println("                                                                     ╠════════════════════════════════════════════════════════════════════════════════════════╣");
		int stopper = reg-num;
		for (int  it=premiumBookings.size()-1 ;it>=0 && num>0;it--) {
			String str = premiumBookings.get(it);
			String target = id;
			if(str.contains(target)) {
				String Plit = str.replace(",", "                                                                                                        ");
        		System.out.println(Plit);
        		num--;
        		System.out.println("                                                                     ══════════════════════════════════════════════════════════════════════════════════════════");
			}
			
		}
		
	}
	public void curateStandardTicket(String id,int num, int reg) {

		 System.out.println("                                                                     ╔════════════════════════════════════════════════════════════════════════════════════════╗");
		 System.out.println("                                                                     ║                              CURATED STANDARD TICKETS                                  ║");
		 System.out.println("                                                                     ╠════════════════════════════════════════════════════════════════════════════════════════╣");
		int stopper = reg-num;
		for (int  it=bookings.size()-1 ;it>=0 && num>0;it--) {
			String str = bookings.get(it);
			String target = id;
			if(str.contains(target)) {
				String Plit = str.replace(",", "                                                                                                        ");
       		System.out.println(Plit);
       		num--;
       		System.out.println("                                                                     ══════════════════════════════════════════════════════════════════════════════════════════");
			}
			
		}
		
	}
		
		
		
		
		/*boolean found = false;
		while (!found) {

			for(int t=1; t<premiumBookings.size(); t++) {
				String current = premiumBookings.get(t);
				if (current.contains(id)) {
					found = true;
	        		String Plit = current.replaceAll(",", "                                                                                                        ");
	        		System.out.println(Plit);
	        		
	        	} else {
	        		System.out.print("                                                                                                        " ); 
	        		System.out.println("Others' ticket");
	        		s.nextLine();
	        	}
				}
		}*/
		
	
	
	public void premiumMultiBook() {
		 final String CYAN = "\u001B[96m";
	        final String BOLD = "\u001B[1m";
	        final String CLEAR = "\u001B[0m";
	        final String DB = "\u001B[34m";
	        final String RED = "\u001B[31m";
	        final String GOLD = "\u001B[33m";
		
		Path fp = Paths.get("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
		
		 final String YELLOW = "\u001B[33m";
		final String RESET = "\u001B[0m";
				
				int BookNum =0;
				String CustomerName;
				String MovieName;
		        String seatcodes;
		        
		        
		    
				
				try  {
					while(true) {
						System.out.println();
						System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
						System.out.println();
						System.out.println();
						System.out.println("										          Please enter how many tickets will be booked?"+RESET);
						System.out.println("											 	          Example: 3 ");
						System.out.println();
						System.out.print("                                                                                                           " );//here
						System.out.print(CYAN+BOLD+"Choice: "+NON);
						
						BookNum = s.nextInt();
						s.nextLine();
						if(BookNum>0) {
							break;
						}
					}
					System.out.println();
					System.out.println("                                                                                                   ---------------------");
					System.out.print("                                                                                                   " );
				System.out.println("|Type " +RED+BOLD+ "CANCEL "+NON+"TO STOP|");
				//System.out.print("" );
				System.out.println("                                                                                                   ---------------------");
					
					
					while(true) {
						                                                                                  
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+" Enter Name: "+NON);
						CustomerName=s.nextLine();
						if (isValidName(CustomerName)&&!CustomerName.equalsIgnoreCase("cancel")) {
							break;
						}else if(CustomerName.equalsIgnoreCase("cancel")) {
							recursePremium();
						}
						System.out.print("                                                                                                        " );
						System.out.println("Wrong format. Try again.");
					}
					while(true) {
						System.out.println();
						System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
						System.out.println();
						System.out.println();
						System.out.println(BOLD + "                                                                                               ╔══════════════════════════════╗");
						System.out.println(BOLD + "                                                                                               ║" + GOLD + "          MOVIE LIST!         " + RESET + BOLD + "║");
						System.out.println(BOLD + "                                                                                               ╚══════════════════════════════╝");
						System.out.println();
						System.out.println();
			            System.out.println();
			            
			            
						for (int i = 0; i < Movies.size(); i++) {
							System.out.print("                                                                                                        " );
				            System.out.println((i + 1) + ". " + Movies.get(i)); // index + 1 for display


				        }
						System.out.println();
						System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
						System.out.println(BOLD);
						System.out.print("                                                                                                        " );
						
						
						
				/*System.out.println(CYAN + "						     ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗" + RESET);
				System.out.println(CYAN + "						     ║              			                             🎬 Movies                                                     ║" + RESET);
				System.out.println(CYAN+"						     ║ "+Movies+"                                           ║");
				System.out.println(CYAN + "						     ╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣" + RESET);
				*/		
						
						
						


						System.out.println();
				System.out.print("                                                                                                      " );
						System.out.println("Enter movie choice ex: 1");
						System.out.print("                                                                                                        " );
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+"Choice: "+NON);
						int moviechoice = s.nextInt();
						System.out.println();
						System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
						s.nextLine();
						if(moviechoice==0) {
							recursePremium();
						}
						 MovieName = Movies.get(moviechoice-1);
						 System.out.println();
						 System.out.print("                                                                                                        " );
						 System.out.println("Chosen movie: "+ DB + MovieName + NON);

						 
						break;
						
						/* System.out.print("                                                                                                        " );
							MovieName = s.nextLine();
							boolean isMatch = false;
					        for (String movies : Movies) {
					            if (movies.equalsIgnoreCase(MovieName)) {
					                isMatch = true;
					                break;
					            }
					        }
							if(!MovieName.isEmpty()&& isMatch ) {
								for(String i: Movies) {
									if(i.equalsIgnoreCase(MovieName)) {
										break;
									}
								}
								break;
							
							}else if(MovieName.equalsIgnoreCase("cancel")) {
								Recurse();
							}
							System.out.print("                                                                                                        " );
							System.out.println("Wrong format. Try again."); */
					} 
					
					while(true) {
						System.out.print("                                                                                                        " );
						System.out.println("Enter Ticket ID ex:1234 ");
						System.out.print("                                                                                                        " );
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+"Ticket ID: "+NON);
						TicketID = s.nextLine();
						System.out.println();
						
						if(isValidTicketID(TicketID)&&!TicketID.equalsIgnoreCase("cancel")) {
							break;
						}else if(CustomerName.equalsIgnoreCase("cancel")) {
							recursePremium();
							}
						System.out.print("                                                                                                        " );
						System.out.println("Wrong format. Try again.");
					}
					System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
					System.out.println();
					System.out.println();
					while(true) {
						//("^A(?:[1-9]|[1-4][0-9]|50)P(?:\\s*\\s*A(?:[1-9]|[1-4][0-9]|50)P)*$");
						//("A([1-9]|[1-4][0-9]|50)P{+count+}");
						String codePattern = "A([1-9]|[1-4][0-9]|50)P";
						String fullPattern = "^(" + codePattern + "\\s?){" + BookNum + "}$";
						Premiumstatus();
						System.out.print("                                                                                                        " );
						System.out.println("if more than 1, use space ex: A1P A2P A3P");
						System.out.print("                                                                                                        " );
						System.out.println("Enter planned seat codes: ");
						System.out.print("                                                                                                        " );
						System.out.println();
						System.out.print("                                                                                                        " );//here
						System.out.print(CYAN+BOLD+"Choice: "+NON);
						seatcodes = s.nextLine();
						if(seatcodes.matches(fullPattern)&&!seatcodes.equalsIgnoreCase("cancel")) {
							break;
						}else if(seatcodes.equalsIgnoreCase("cancel")) {
							recursePremium();
						}
						System.out.print("                                                                                                        " );
						System.out.println("Wrong format. Try again.");
					}
					while(true) {
						try {	
							int change=0;
							int total = BookNum*premiumPricing;
							System.out.print("                                                                                                        " );
							System.out.println("Total cost: "+ total);
							System.out.print("                                                                                                        " );
							System.out.println("Enter payment");
							System.out.print("                                                                                                        " );
							System.out.println();
							System.out.print("                                                                                                        " );//here
							System.out.print(CYAN+BOLD+"Payment: "+NON);
							int payment = s.nextInt();
							s.nextLine();
							if(payment ==total) {
								premiumPayments.add(payment);
								for (int i = 0; i < BookNum; i++){
									LocalDateTime now = LocalDateTime.now(); // Gets current date and time

							        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
							        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
							        String formattedDate = now.format(date);
							        String formattedTime = now.format(time);
									String entry =  "\n,Customer Name: " + CustomerName + "\n,Movie Name: " + MovieName  + "\n,Ticket ID: " + TicketID+ "\n,Seats reserved: "+seatcodes+"\n,Payment: "+payment+"\n,Change: "+change
											+"\n,Date: "+ formattedDate+ "\n,Time: "+formattedTime;
									premiumBookings.add(entry);
									customers.add(CustomerName);
									int nig = premiumBookings.size() -1; 
									
									
								}
								break;
							}else if(payment>total) {
								 change = payment-total;
								int recordpay = BookNum*premiumPricing;
								System.out.print("                                                                                                        " );
								System.out.println("Change: "+ change);
								premiumPayments.add(recordpay);
								for (int i = 0; i < BookNum; i++){
									LocalDateTime now = LocalDateTime.now(); // Gets current date and time

							        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
							        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
							        String formattedDate = now.format(date);
							        String formattedTime = now.format(time);
									String entry =  "\n,Customer Name: " + CustomerName + "\n,Movie Name: " + MovieName + "\n,Ticket ID: " + TicketID+ "\n,Seats reserved: "+seatcodes+"\n,Payment: "+payment+"\n,Change: "+change
											+"\n,Date: "+ formattedDate+ "\n,Time: "+formattedTime;
									premiumBookings.add(entry);
									customers.add(CustomerName);
									int nig = premiumBookings.size() -1; 
									
									
								}
								break;
							}else {
								System.out.print("                                                                                                        " );
								System.out.println("Sorry, your payment is insufficient");
								System.out.print("                                                                                                        " );
								System.out.println("Please pay with higher amount");
								
							}
							
							
					
						}catch(InputMismatchException e) {
							System.out.print("                                                                                                        " );
							System.out.println("   Numbers only, going back to Premium Section");
							
							s.nextLine();
						}
					}
					System.out.print("                                                                                                        " );
					System.out.println(BookNum+" Tickets successfully booked");
					int regu = premiumBookings.size();
					premresult(TicketID, BookNum, regu);
				
					
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
						System.out.print("                                                                                                        " );
						System.out.println("Error has occured");
					}catch(InputMismatchException e) {
						System.out.print("                                                                                                        " );
						System.out.println("Numbers only");
						
						recursePremium();
					
					}catch(IndexOutOfBoundsException e) {
						System.out.print("                                                                                                        " );
						System.out.println("We only have "+Movies.size()+" movies");
						recursePremium();
					}
				
				PremiummultiSeatRes();
				}

			 	

	
	public void StandardmultiCancel() {

		final String CYAN = "\u001B[96m";

		final String BOLD = "\u001B[1m";

		final String CLEAR = "\u001B[0m";

		final String DB = "\u001B[34m";

		final String RED = "\u001B[31m";

		final String GOLD = "\u001B[33m";

		final String RESET = "\u001B[0m";

		int numtodel;

		int bs = bookings.size();

		String seatinput;

		String target;

		int multiplier;

		System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);

		System.out.println(BOLD + "        		 				   ┌─────────────────────────────────────────────────────────────────────────────────────────────────┐");
		System.out.println(BOLD + "        		 				   │" + GOLD + "                                STANDARD BOOKING CANCELLING SECTION!" + RESET + BOLD +"                             │");
		System.out.println(BOLD + "        		 				   └─────────────────────────────────────────────────────────────────────────────────────────────────┘");


		//cm1

		while (true) {

		try {

		System.out.print("                                                                                                        " );//here

		System.out.println("Enter number of bookings to cancel");

		System.out.println();

		System.out.print("                                                                                                        " );//here

		System.out.print(CYAN+BOLD+"Choice: "+NON);

		numtodel = s.nextInt();

		s.nextLine();

		if(numtodel<=bs&&numtodel !=0) {

		System.out.println("                                                                                                    Proceeding now...");

		break;

		}

		else if (numtodel==0) {

		 

		System.out.println("                                                                                                    Invalid");

		 

		}

		else {

		 

		 

		System.out.println("                                                                                                    Invalid");

		 

		 

		}

		}catch(InputMismatchException e){

		System.out.println("                                                                                                    Invalid");

		System.out.println("                                                                                                    Enter number of bookings to cancel");

		s.nextLine();

		}

		}

		//cm2

		while(true) {

		try {

		for(int i=0; i<numtodel;) {

		Standardstatus();

		
		System.out.print("                                                                                                    " );


		System.out.println("Type the seat codes you have reserevd to cancel reservation ex: A1");

		System.out.println();

		System.out.print("                                                                                                    " );//here

		System.out.print(CYAN+BOLD+"Choice: "+NON);

		seatinput = s.nextLine();

		if(isStandardSeatValid(seatinput)&&Standardseats.containsKey(seatinput)&&!Standardseats.get(seatinput).equals("available")) {

		Standardseats.put(seatinput,"available");

		Standardstatus.put(seatinput, GREEN+"██"+NON );

		System.out.println("                                                                                                    "+seatinput+ "is now "+ Standardseats.get(seatinput));

		Standardstatus();

		i++;

		 

		}else {

		System.out.print("                                                                                                    " );

		System.out.println("Invalid. Try again");

		}

		 

		}

		 

		break;

		 

		}catch(InputMismatchException e){

		 

		System.out.println("Numbers only");

		System.out.println("Enter number of bookings to cancel");

		s.nextLine();

		}

		}

		//cm3

		while(true) {

		try {

		boolean found= false;

		System.out.print("                                                                                                    " );

		System.out.println("Enter your ticket ID to cancel the bookings in your name ex: 1234");

		System.out.println();

		System.out.print("                                                                                                    " );//here

		System.out.print(CYAN+BOLD+"Ticket ID: "+NON);

		target = s.nextLine();

		for(String s: bookings) {

		if (s.contains(target)) {

		found=true;

		break;

		}

		}

		if(found&& isValidTicketID(target)) {

		int removed =0;

		for (int i = bookings.size() - 1; i >= 0 && removed < numtodel; i--) {

		String str = bookings.get(i);

		if (str.contains(target)) {

		bookings.remove(i);

		removed++;

		PrintWriter writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));

		writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt"));

		writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\StandardBookings.txt", true));

		writerB.print(bookings);

		writerB.flush();

		 

		}

		}

		break;

		}else {

		System.out.println("                                                                                                    Invalid");

		System.out.println("                                                                                                    Try again");

		}

		 

		 

		 

		}catch(InputMismatchException e) {

			System.out.println("Numbers only");

		
		s.nextLine();

		}catch(IOException e) {

		 

		}

		}

		//cm4

		while(true) {

		int value = standardPricing;

		int cost = value*numtodel;

		int payment;

		int refund;

		int remains;

		int panukli;

		int overpayment;

		 

		try {

		 

		System.out.println("                                                                                                    refunded amount: "+cost);

		System.out.println("                                                                                                    updated bookings");

		int regu = bookings.size();

		multiplier = bookings.size();

		curateStandardTicket(target,multiplier,regu);

		 

		break;

		}catch(InputMismatchException e) {

			System.out.println("Numbers only");

		}

		}




		 

		Recurse();

		}




		public void PremiummultiCancel() {

			final String CYAN = "\u001B[96m";

			final String BOLD = "\u001B[1m";

			final String CLEAR = "\u001B[0m";

			final String DB = "\u001B[34m";

			final String RED = "\u001B[31m";

			final String GOLD = "\u001B[33m";

			final String RESET = "\u001B[0m";

			int numtodel;

			int bs = premiumBookings.size();

			String seatinput;

			String target;

			int multiplier;

			System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);

			System.out.println(BOLD + "        		 				   ┌─────────────────────────────────────────────────────────────────────────────────────────────────┐");
			System.out.println(BOLD + "        		 				   │" + GOLD + "                                PREMIUM BOOKING CANCELLING SECTION!" + RESET + BOLD +"                              │");
			System.out.println(BOLD + "        		 				   └─────────────────────────────────────────────────────────────────────────────────────────────────┘");


			//cm1

			while (true) {

			try {

			System.out.print("                                                                                                        " );//here

			System.out.println("Enter number of bookings to cancel");

			System.out.println();

			System.out.print("                                                                                                        " );//here

			System.out.print(CYAN+BOLD+"Choice: "+NON);

			numtodel = s.nextInt();

			s.nextLine();

			if(numtodel<=bs&&numtodel !=0) {

			System.out.println("                                                                                                    Proceeding now...");

			break;

			}

			else if (numtodel==0) {

			 

			System.out.println("                                                                                                    Invalid");

			 

			}

			else {

			 

			 

			System.out.println("                                                                                                    Invalid");

			 

			 

			}

			}catch(InputMismatchException e){

			System.out.println("                                                                                                    Invalid");

			System.out.println("                                                                                                    Enter number of bookings to cancel");

			s.nextLine();

			}

			}

			//cm2

			while(true) {

			try {

			for(int i=0; i<numtodel;) {

			Premiumstatus();

			
			System.out.print("                                                                                                    " );


			System.out.println("Type the seat codes you have reserevd to cancel reservation ex: A1");

			System.out.println();

			System.out.print("                                                                                                    " );//here

			System.out.print(CYAN+BOLD+"Choice: "+NON);

			seatinput = s.nextLine();

			if(isPremiumSeatValid(seatinput)&&Premiumseats.containsKey(seatinput)&&!Premiumseats.get(seatinput).equals("available")) {

				Premiumseats.put(seatinput,"available");

			Premiumstatus.put(seatinput, GREEN+"██"+NON );

			System.out.println("                                                                                                    "+seatinput+ "is now "+ Premiumseats.get(seatinput));

			Premiumstatus();

			i++;

			 

			}else {

			System.out.print("                                                                                                    " );

			System.out.println("Invalid. Try again");

			}

			 

			}

			 

			break;

			 

			}catch(InputMismatchException e){

			 

				System.out.println("Numbers only");

			System.out.println("Enter number of bookings to cancel");

			s.nextLine();

			}

			}

			//cm3

			while(true) {

			try {

			boolean found= false;

			System.out.print("                                                                                                    " );

			System.out.println("Enter your ticket ID to cancel the bookings in your name ex: 1234");

			System.out.println();

			System.out.print("                                                                                                    " );//here

			System.out.print(CYAN+BOLD+"Ticket ID: "+NON);

			target = s.nextLine();

			for(String s: premiumBookings) {

			if (s.contains(target)) {

			found=true;

			break;

			}

			}

			if(found&& isValidTicketID(target)) {

			int removed =0;

			for (int i = premiumBookings.size() - 1; i >= 0 && removed < numtodel; i--) {

			String str = premiumBookings.get(i);

			if (str.contains(target)) {

				premiumBookings.remove(i);

			removed++;

			PrintWriter writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt", true));

			writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt"));

			writerB = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\JavaFiles\\PremiumBookings.txt", true));

			writerB.print(premiumBookings);

			writerB.flush();

			 

			}

			}

			break;

			}else {

			System.out.println("                                                                                                    Invalid");

			System.out.println("                                                                                                    Try again");

			}

			 

			 

			 

			}catch(InputMismatchException e) {

				System.out.println("Numbers only");

			

			s.nextLine();

			}catch(IOException e) {

			 

			}

			}

			//cm4

			while(true) {

			int value = premiumPricing;

			int cost = value*numtodel;

			int payment;

			int refund;

			int remains;

			int panukli;

			int overpayment;

			 

			try {

			 

			System.out.println("                                                                                                    refunded amount: "+cost);

			System.out.println("                                                                                                    updated bookings");

			int regu = premiumBookings.size();

			multiplier = premiumBookings.size();

			curateStandardTicket(target,multiplier,regu);

			 

			break;

			}catch(InputMismatchException e) {

				System.out.println("Numbers only");

			}

			}




			 

			Recurse();

			}



		 


		 



	
	@Override
	public void check() {
		Path ip = Paths.get("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
		File booked = new File("C:\\Users\\USER\\Desktop\\JavaFiles\\BookedPeople.txt");
		System.out.print("                                                                                                        " );
		  System.out.println("These are all the booked tickets");
		  System.out.print("                                                                                                        " );
		  System.out.println(bookings);
		  System.out.print("                                                                                                        " );
		  System.out.println("Would you like to confirm it and get the receipt?(yes or no)");
		  System.out.print("                                                                                                        " );
		  String decision = s.nextLine();
		  
		  if (decision.equalsIgnoreCase("yes")) {
			  try {
				  PrintWriter pw = new PrintWriter(new FileWriter(ip.toString(), true));
				  try {
		                Desktop.getDesktop().open(booked); 
		            } catch (IOException e) {
		            	System.out.print("                                                                                                        " );
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
		 final String CYAN = "\u001B[96m";
	        final String BOLD = "\u001B[1m";
	        final String CLEAR = "\u001B[0m";
	        final String DB = "\u001B[34m";
	        final String RED = "\u001B[31m";
	        final String GOLD = "\u001B[33m";
	        System.out.print("                                                                                          " );
			System.out.println("  Welcome this is seat reservation section.");
		
		int nameMatchCount=0;
		System.out.print("                                                                                             " );
		System.out.println("Enter your ticket ID for verification");
		System.out.print("                                                                                                        " );
		System.out.println();
		System.out.print("                                                                                                        " );//here
		System.out.print(CYAN+BOLD+"Ticket ID: "+NON);
		 String target = s.nextLine();
		
		 List<String> fs = new ArrayList<>();
		 //int  i=0;i<bookings.size();i++
			 for (String i:bookings) {
				 if(i.contains(target)) {
					 nameMatchCount++;
				 }else{
					 StandardmultiSeatRes();
				 }
			// String str = bookings.get(i);
			 //if(str.contains(target)) {
				// bookings.get(i);
				// nameMatchCount++;
			// }else {
			//	 StandardmultiSeatRes(); 
			// }
		 }
		 if (nameMatchCount > 0) {
			 for(int i1=0; i1<nameMatchCount;i1++) {
				 while(true) {
						try {
							System.out.println();
							System.out.println("                                                                                                   ---------------------");
							System.out.print("                                                                                                   " );
						System.out.println("|Type " +RED+BOLD+ "CANCEL "+NON+"TO STOP|");
						//System.out.print("" );
						System.out.println("                                                                                                   ---------------------");	
						System.out.print("                                                                                           " );
							System.out.println("Green means avialable and red means occupied");
							
							Standardstatus();
							System.out.print("                                                                               " );
							System.out.println("Please enter seat ID to proceed with seat reservation(A1P-A50P)");
						
							System.out.println();
							System.out.print("                                                                                                        " );//here
							System.out.print(CYAN+BOLD+"Seat code: "+NON);
							String choice = s.nextLine();
							System.out.println();
							 if (Standardseats.get(choice).equals("Reserved")) {  
								 System.out.print("                                                                                                        " );
							        System.out.println("Sorry, the seat " + choice + " is already reserved.");
							        System.out.print("                                                                                                        " );
							        System.out.println("Try a different seat");
							        
							    }
							if (Standardseats.containsKey(choice)&& !Standardseats.get(choice).equals("Reserved") && isStandardSeatValid(choice)) {
								System.out.print("                                                                                              " );
								System.out.println("Successfully registered. your seat is "+ choice);
								Standardseats.put(choice, "Reserved");
								Standardstatus.put(choice, RED + "██" + NON);
								break;
							}else if(choice.equalsIgnoreCase("cancel")) {
								Recurse();
							}
						}
						catch(NullPointerException e) {
							System.out.print("                                                                                                        " );
							System.out.println("Upto A50 only. Try again");
						}
					}
			}

		 }
			Recurse();

	}
	
	@Override
	
	public void PremiummultiSeatRes() {
		 final String CYAN = "\u001B[96m";
	        final String BOLD = "\u001B[1m";
	        final String CLEAR = "\u001B[0m";
	        final String DB = "\u001B[34m";
	        final String RED = "\u001B[31m";
	        final String GOLD = "\u001B[33m";
		System.out.print("                                                                                          " );
		System.out.println("  Welcome this is seat reservation section.");
		
		int nameMatchCount=0;
		System.out.print("                                                                                             " );
		System.out.println("Enter your ticket ID for verification");
		System.out.print("                                                                                                        " );
		System.out.println();
		System.out.print("                                                                                                        " );//here
		System.out.print(CYAN+BOLD+"Ticket ID: "+NON);
		 String target = s.nextLine();
		
		 List<String> fs = new ArrayList<>();
		 for (String i:premiumBookings) {
			 if(i.contains(target)) {
				 nameMatchCount++;
			 }else{
				 PremiummultiSeatRes();
			 }
		 
		 //for (int  i=0;i<premiumBookings.size();i++) {
			// String str = premiumBookings.get(i);
			 //if(str.contains(target)) {
				// premiumBookings.get(i);
				// nameMatchCount++;
		//	 }else {
			//	 PremiummultiSeatRes();
			// }
		 }
		 if (nameMatchCount > 0) {
			 						
			 for(int i1=0; i1<nameMatchCount;i1++) {
				 while(true) {
						try {
							System.out.println();
							System.out.println("                                                                                                   ---------------------");
							System.out.print("                                                                                                   " );
						System.out.println("|Type " +RED+BOLD+ "CANCEL "+NON+"TO STOP|");
						//System.out.print("" );
						System.out.println("                                                                                                   ---------------------");
							System.out.print("                                                                                           " );
							System.out.println("Green means avialable and red means occupied");
							Premiumstatus();
							System.out.print("                                                                               " );
							System.out.println("Please enter seat ID to proceed with seat reservation(A1P-A50P)");
						
							System.out.println();
							System.out.print("                                                                                                        " );//here
							System.out.print(CYAN+BOLD+"Seat code: "+NON);
							String choice = s.nextLine();
							System.out.println();
							 if (Premiumseats.get(choice).equals("Reserved")) {  
								 System.out.print("                                                                                                        " );
							        System.out.println("Sorry, the seat " + choice + " is already reserved.");
							        System.out.print("                                                                                                        " );
							        System.out.println("Try a different seat");
							        
							    }
							if (Premiumseats.containsKey(choice)&& !Premiumseats.get(choice).equals("Reserved") && isPremiumSeatValid(choice)) {
								System.out.print("                                                                                              " );
								System.out.println("Successfully registered. your seat is "+ choice);
								
								Premiumseats.put(choice, "Reserved");
								Premiumstatus.put(choice, RED + "██" + NON);
								Premiumstatus();
								break;
							}else if(choice.equalsIgnoreCase("cancel")) {
								Recurse();
							}
							
						}
						catch(NullPointerException e) {
							System.out.print("                                                                                                        " );
							System.out.println("Upto A50P only. Try again");
						}
					}
			}

		 }
			recursePremium();

	}

	
	
	public boolean isStandardSeatValid(String seat) {
		return seat.matches("^A([1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|50)$");
	}
	public boolean isPremiumSeatValid(String seat) {
		return seat.matches("^A([1-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|50)P$");
	}
	
	public boolean standardseattyping(String seat) {
		return seat.matches("^A(?:[1-9]|[1-4][0-9]|50)(?:\\sA(?:[1-9]|[1-4][0-9]|50))*$");

	}
	
	static void Standardstatus() {
		System.out.println("                                                                ╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
	     System.out.println("                                                                ║                                      🎟️ STANDARD STATUS BLOCKS                                       ║");
	     System.out.println("                                                                ╠══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
	     System.out.println("                                                                ║                                                                                                      ║");
	     System.out.println("                                                                ║                                         |  S C R E E N  |                                            ║");
	     System.out.println("                                                                ║                                                                                                      ║");
	     System.out.println("                                                                ║ Left Exit                                                                                Right Exit  ║");
	     System.out.println("                                                                ║                                                                                                      ║");
	     int count = 0;
	     System.out.print("                                                                ║ ");
	     for (Map.Entry<String, String> entry : Standardstatus.entrySet()) {
	         String seatCode = entry.getKey();
	         String seatBlock = entry.getValue();
	         switch(count) {
	         case 0:
	        	 System.out.print("R1   ");
	        	 break;
	         case 10:
	        	 System.out.print(" R2   ");
	        	 break;
	         case 20:
	        	 System.out.print(" R3   ");
	        	 break;
	         case 30:
	        	 System.out.print(" R4   ");
	        	 break;
	         case 40:
	        	 System.out.print(" R5   ");
	        	 break;
	   
	         }
	        
	         System.out.printf("%-6s", seatCode + " " + seatBlock+" ");
	         count++;

	         if (count % 10 == 0) {
	             System.out.println("                                                               ║");
	             if (count < 50) System.out.print("                                                                ║");
	         }
	     }

	     System.out.println("                                                                ╚══════════════════════════════════════════════════════════════════════════════════════════════════════╝");
	 }
	static void Premiumstatus() {
	 System.out.println("                                                                ╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
     System.out.println("                                                                ║                                      💎 PREMIUM STATUS BLOCKS                                        ║");
     System.out.println("                                                                ╠══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
     System.out.println("                                                                ║                                                                                                      ║");
     System.out.println("                                                                ║                                         |  S C R E E N  |                                            ║");
     System.out.println("                                                                ║ Left Exit                                                                                Right Exit  ║");
     System.out.println("                                                                ║                                                                                                      ║");
     
     int count = 0;
     
     System.out.print("                                                                ║ ");
     for (Map.Entry<String, String> entry : Premiumstatus.entrySet()) {
         String seatCode = entry.getKey();
         String seatBlock = entry.getValue();
         switch(count) {
         case 0:
        	 System.out.print("R1   ");
        	 break;
         case 10:
        	 System.out.print(" R2   ");
        	 break;
         case 20:
        	 System.out.print(" R3   ");
        	 break;
         case 30:
        	 System.out.print(" R4   ");
        	 break;
         case 40:
        	 System.out.print(" R5   ");
        	 break;
   
         }

         // Pad to make it look aligned, e.g., "A1P ██"
         System.out.printf("%-6s", seatCode + " " + seatBlock+" ");
         count++;

         if (count % 10 == 0) {
        	 
             System.out.println("                                                               ║");
             if (count < 50) System.out.print("                                                                ║");
         }
     }

     System.out.println("                                                                ╚══════════════════════════════════════════════════════════════════════════════════════════════════════╝");
 }

	
	/*	int regulator=0;
for (Map.Entry<String,String> entry: Premiumstatus.entrySet()) {
String key= entry.getKey();
String value = entry.getValue();
 System.out.print(key + value+"     ");
 regulator++;
 if(regulator%10==0) {
	 System.out.println("");
 }
}*/

	
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

}
	
	static void Recurse() {
	try {
		while(true) {
			Object O1 = new Object();
	        final String CYAN = "\u001B[96m";
	        final String BOLD = "\u001B[1m";
	        final String CLEAR = "\u001B[0m";
	        final String DB = "\u001B[34m";
	        final String RED = "\u001B[31m";
	        final String GOLD = "\u001B[33m";
	        System.out.println("        		 			─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
	        System.out.println(GOLD+"										 		 	 	 G O O D  D A Y!" + NON);
	        System.out.println("        		 			 ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────── ");
	        System.out.println();
	        System.out.println(CYAN+"""
	        		     		     		     		     	 ███████╗██╗██╗     ███╗   ███╗██╗  ██╗ ██████╗ ██╗   ██╗███████╗███████╗
	        		     		     		     		     	 ██╔════╝██║██║     ████╗ ████║██║  ██║██╔═══██╗██║   ██║██╔════╝██╔════╝
	        		     		     		     		     	 █████╗  ██║██║     ██╔████╔██║███████║██║   ██║██║   ██║███████╗█████╗ 
	        		     		     		     		     	 ██╔══╝  ██║██║     ██║╚██╔╝██║██╔══██║██║   ██║██║   ██║╚════██║██╔══╝  
	        		     		     		     		     	 ██║     ██║███████╗██║ ╚═╝ ██║██║  ██║╚██████╔╝╚██████╔╝███████║███████╗ 
	        		     		     		     		     	 ╚═╝     ╚═╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝
	   """+ NON);
	        System.out.println("        		 			 ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────── ");
	        System.out.println(BOLD+"										 		 	 	 W E L C O M E!" + NON);
	        System.out.println("        		 			─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println();	
			System.out.println(CYAN+BOLD+"        		 								  ============🎬🍿 FilmHouse 🎥🎞️============       		 			        		 		"+NON);
			System.out.println();
			System.out.println(BOLD+"													 Please select mode of booking");
			System.out.println();
			System.out.println(BOLD + "														1. Premium");
			System.out.println("													2. Standard");
			System.out.println(RED +"														3. Exit" + CLEAR );
			System.out.println();
			System.out.print("                                                                                                        " );//here
			System.out.print(CYAN+BOLD+"Choice: "+NON);
			int input = s.nextInt();
			s.nextLine();
			if (input == 1) {
				recursePremium();
			}else if(input ==2) {
				recurseStandard();
			}else if (input ==3) {
				System.exit(0);
			}else if(input == 007) {
				O1.adminLogin();
			}
		}
		
	}catch(InputMismatchException e) {
		System.out.print("                                                                                                        " );
		System.out.println("only numbers");
		System.out.print("                                                                                                        " );
		s.nextLine();
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
				        Object std = new Object();
				        System.out.println();
				        System.out.println();
				        System.out.println(CYAN + BOLD + "                                                                                          ============🎬🍿 FilmHouse 🎥🎞️============" + NON);
				        System.out.println(BOLD);
				        System.out.println(BOLD + "                                                                                    ╔════════════════════════════════════════════════════╗");
				        System.out.println("                                                                                    ║                 STANDARD SECTION                   ║");
				        System.out.println("                                                                                    ╠════════════════════════════════════════════════════╣");
				        System.out.println("                                                                                    ║                   ENTER A NUMBER                   ║");
				        System.out.println("                                                                                    ║                                                    ║");
				        System.out.println("                                                                                    ║                " + RED + "0" + NON + " Back                              ║");
				        System.out.println("                                                                                    ║                1 Ticket Booking                    ║");
				        System.out.println("                                                                                    ║                2 Show Ticket                       ║");
				        System.out.println("                                                                                    ║                3 Cancellation                      ║");
				        System.out.println("                                                                                    ╚════════════════════════════════════════════════════╝");

					
						System.out.print("                                                                                                        " );
						System.out.print(CYAN+BOLD+"Choice: "+NON);

//for inputs
				int input = s.nextInt();
				s.nextLine();
				if(input ==0) {
					Recurse();
				}
				else if (input ==1 ) {
					std.bookTicket();
				}else if (input == 2) {
					std.standardShowTicket();
				}else if (input ==3 ) {
					std.StandardmultiCancel();
				}else if (input == 4) {
					
				}
			}catch(InputMismatchException e) {
				System.out.print("                                                                                                        " );
				System.out.println("Numbers only");
				System.out.print("                                                                                                        " );
				s.nextLine();
			}
		}
		
	}
	//all admin features
	public void adminLogin() {
		String password;
		
		System.out.println("Enter password");
		System.out.print("                                                                                                        " );
		password=s.nextLine();
		if (password.equals("admin")) {
			adminRecurse();
		}else {
			System.out.print("                                                                                                        " );
			System.out.println("Wrong password");
			Recurse();
		}
		
	}
	
	
	public void addNewMovie() {
		System.out.print("                                                                                                        " );
		System.out.println("How many movies will you add");
		System.out.print("                                                                                                        " );
		int amount = s.nextInt();
		s.nextLine();
		for (int i = 0; i<amount;i++) {
			System.out.print("                                                                                                        " );
			System.out.println("Type the movie name to add");
			System.out.print("                                                                                                        " );
			String Minput = s.nextLine();
			Movies.add(Minput);
			System.out.print("                                                                                                        " );
			System.out.println(Minput+ " Successfully added to the list");
		}
		System.out.print("                                                                                                        " );
		System.out.println("Movies added");
		adminRecurse();
	}
	
		public void adminRecurse() {
		
		String choice;
		System.out.print("                                                                                                        " );
		System.out.println("Welcome to the admin section");
		System.out.print("                                                                                                        " );
		System.out.println("here's the list of features we have");
		System.out.print("                                                                                                        " );
		System.out.println("1.add movies");
		System.out.print("                                                                                                        " );
		System.out.println("2.edit movies");
		System.out.print("                                                                                                        " );
		System.out.println("3.see total bookings");
		System.out.print("                                                                                                        " );
		System.out.println("4.movie list");
		System.out.print("                                                                                                        " );
		System.out.println("5.logout");
		System.out.print("                                                                                                        " );
		choice = s.nextLine().toLowerCase();
		if(choice.equals("add movies")) {
			addNewMovie();
		}else if (choice.equals("edit movies")) {
			editMovie();
	
		}else if (choice.equals("see total bookings")) {
			seeTotalBookings();	
		}else if (choice.equals("movie list")) {
			showMovieList();
		}else if(choice.equals("logout")) {
			Recurse();
		}
		
	}
		
	public void editMovie() {
		while(true) {
			try {
				int numtodel;
				System.out.println("List of movies");
				showMovieList();
				System.out.println("Enter how many movies will be removed");
				int amount = s.nextInt();
				s.nextLine();
				
				for(int it=0; it<amount;it++) {
					System.out.println("Enter the movie name to cancel it");
					 String target = s. nextLine();
					if (Movies.contains(target)) {
						Movies.remove(target);
					}else {
						System.out.println("No matching movies found");
						it--;
					}
				}	
				showMovieList();
				adminRecurse();
			}catch(InputMismatchException e) {
				System.out.println("Numbers only");
				s.nextLine();
			}
		}
	}
	public void seeTotalBookings() {
		System.out.println("premium or standard");
		String sop = s.nextLine().toLowerCase();
		if(sop.equals("premium")) {
			System.out.println(premiumBookings);
		}else if(sop.equals("standard")) {
			System.out.println(bookings);
		}
		
		
		adminRecurse();
	}public void showMovieList() {
		final String CYAN = "\u001B[36m";
		 final String YELLOW = "\u001B[33m";
		final String RESET = "\u001B[0m";

		System.out.println(CYAN + "						     ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗" + RESET);
		System.out.println(CYAN + "						     ║              			                             🎬 Movies                                                     ║" + RESET);
		System.out.println(CYAN+"						     ║ "+Movies+"                                           ║");
		System.out.println(CYAN + "						     ╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣" + RESET);
				
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
				Object prm = new Object();
				 System.out.println();
			        System.out.println();
			        System.out.println(CYAN + BOLD + "                                                                                          ============🎬🍿 FilmHouse 🎥🎞️============" + NON);
			        System.out.println(BOLD);
			        System.out.println(BOLD + "                                                                                    ╔════════════════════════════════════════════════════╗");
			        System.out.println("                                                                                    ║                  PREMIUM SECTION                   ║");
			        System.out.println("                                                                                    ╠════════════════════════════════════════════════════╣");
			        System.out.println("                                                                                    ║                   ENTER A NUMBER                   ║");
			        System.out.println("                                                                                    ║                                                    ║");
			        System.out.println("                                                                                    ║                " + RED + "0" + NON + " Back                              ║");
			        System.out.println("                                                                                    ║                1 Ticket Booking                    ║");
			        System.out.println("                                                                                    ║                2 Show Ticket                       ║");
			        System.out.println("                                                                                    ║                3 Cancellation                      ║");
			        System.out.println("                                                                                    ╚════════════════════════════════════════════════════╝");

			
				System.out.print("                                                                                                        " );
				System.out.print(CYAN+BOLD+"Choice: "+NON);
				
				int input = s.nextInt();
				s.nextLine();
				if(input ==0) {
					Recurse();
				}
				else if(input ==1 ) {
					prm.premiumMultiBook();
				}else if (input == 2) {
					prm.premiumShowTicket();
				}else if (input ==3 ) {
					prm.PremiummultiCancel();
				}else if(input ==4) {
					
				}
			}catch(InputMismatchException e) {
				
				System.out.println("Numbers only");
					
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
		while (true) {
			int nameMatchCount = 0;
			System.out.print("                                                                                                        " );
			System.out.println("Welcome! this is the premium ticket viewing section.");
					
			System.out.print("                                                                                                        " );
					System.out.println("Enter your ticket ID to identify which ticket to show");
					System.out.print("                                                                                                        " );
					 String target = s.nextLine();
					 
					
					 int matchCount = 0;
					 int regu = bookings.size();

					 for (String entry : bookings) {
					     if (entry.contains("Ticket ID: " + target)) {
					         curateStandardTicket(entry, matchCount + 1, regu);
					         matchCount++;
					     }
					 }

					 if (matchCount == 0) {
						 System.out.print("                                                                                                        " );
					     System.out.println("Invalid ticket ID.");
					     recurseStandard();
					 }
					 
					/*for (int  i=0;i<bookings.size();i++) {
						 String str = bookings.get(i);
						 if(str.contains(target)) {
							 bookings.get(i);
							 nameMatchCount++;
							 int regu = bookings.size();
							 curateStandardTicket(target, nameMatchCount,regu );
							 
						 }else {
							 StandardmultiSeatRes(); 
						 }
					 }*/
					 /*if(bookings.contains(target)) {
						 System.out.print("                                                                                                        " );
						 System.out.println("Enter how many tickets you wanna see");
						 System.out.print("                                                                                                        " );
						 int count = s.nextInt();
						 s.nextLine();
						 int regu = bookings.size();
						 curateStandardTicket(target, count,regu );
					 }else if (!bookings.contains(target)){
						 System.out.print("                                                                                                        " );
						 System.out.println("Invalid ticket ID");
						 System.out.println(bookings);
						 recurseStandard();
					 }*/
					 
					

		recurseStandard();
	}
				
	}
	public void premiumShowTicket() {
		while (true) {
			
				System.out.print("                                                                                                        " );
				System.out.println("Welcome! this is the premium ticket viewing section.");
						
				System.out.print("                                                                                                        " );
						System.out.println("Enter the ticket ID to identify which ticket to show");
						System.out.print("                                                                                                        " );
						 String target = s.nextLine();
						 int matchCount = 0;
						 int regu = premiumBookings.size();

						 for (String entry : premiumBookings) {
						     if (entry.contains("Ticket ID: " + target)) {
						         curatePremiumTicket(entry, matchCount + 1, regu);
						         matchCount++;
						     }
						 }

						 if (matchCount == 0) {
							 System.out.print("                                                                                                        " );
						     System.out.println("Invalid ticket ID.");
						     recursePremium();
						 }
						 /*if(premiumBookings.contains(target)) {
							 System.out.print("                                                                                                        " );
							 System.out.println("Enter how many tickets you wanna see");
							 System.out.print("                                                                                                        " );
							 int count = s.nextInt();
							 s.nextLine();
							 int regu = premiumBookings.size();
							 curatePremiumTicket(target, count,regu );
						 }else if(!premiumBookings.contains(target)){
							 System.out.print("                                                                                                        " );
							 System.out.println("Invalid ticket ID");
							
							recursePremium();
						 }*/
						 
						

			recursePremium();
		}
	}

	
}