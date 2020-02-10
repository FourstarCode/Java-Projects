package nofussbussing;
import java.util.Scanner;

public class NoFussBussing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double child, teenager, adult;
		int age = 0;
		child = 2.00;
		teenager = 4.00;
		adult = 6.00;
		int count = 1;
		String student, returnticket;
		double discount = 1;
		int location=1;
		int citybeachtickets=0;
		int museumtickets = 0;
		int taytotickets =0;
		int jurassictickets = 0;
		Scanner k = new Scanner(System.in);
		
		
			do {
				System.out.println("Chose a location:\n"
						+ "1) City Beach (Additional surcharge of €2.00)\n"
						+ "2) Museum of cool paintings (Additional surcharge of €1.00\n"
						+ "3) Tayto Park (Additional surcharge of €5.00)\n"
						+ "4) Jurassic Park (Additional surcharge of €100\n"
						+ "5) local area\n"
						+ "0) Exit");
				location = k.nextInt();
				switch (location) {
				case 1:
					if (citybeachtickets<26) {
						citybeachtickets++;
						System.out.println("Please enter your age");
						age = k.nextInt();
						System.out.println("Are you a student Y/N?");
						student = k.next().toLowerCase();
						System.out.println("Do you want a return ticket?");
						returnticket = k.next().toLowerCase();
						if (returnticket.contains("n")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println("The price of your ticket is €" + (child + 2) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €" + (teenager + 2) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €" + (adult + 2) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €4.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {
									System.out
											.println("The price of your ticket is €" + ((child - discount) + 2) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println(
											"The price of your ticket is €" + ((teenager - discount) + 2) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out
											.println("The price of your ticket is €" + ((adult - discount) + 2) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €5.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("Invalid input");
							}
						} else if (returnticket.contains("y")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println(
											"The price of your ticket is €" + ((child + (child / 2)) + 2) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println(
											"The price of your ticket is €" + ((teenager + (teenager / 2)) + 2) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println(
											"The price of your ticket is €" + ((adult + (adult / 2)) + 2) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €6.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {

									System.out.println("The price of your ticket is €"
											+ (((child - discount) + (child - discount) / 2) + 2) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €"
											+ (((teenager - discount) + (teenager - discount) / 2) + 2) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €"
											+ (((adult - discount) + (adult - discount) / 2) + 2) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €4.50");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("You have entered an invalid input");
							}
						}
						if (count > 0) {
							System.out.println("");
						}
						break;
					} else {
						System.out.println("No tickets available");
						break;
					}
				case 2:
					if (museumtickets<26) {
						museumtickets++;
						System.out.println("Please enter your age");
						age = k.nextInt();
						System.out.println("Are you a student Y/N?");
						student = k.next().toLowerCase();
						System.out.println("Do you want a return ticket?");
						returnticket = k.next().toLowerCase();
						if (returnticket.contains("n")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println("The price of your ticket is €" + (child + 1) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €" + (teenager + 1) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €" + (adult + 1) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €5.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {
									System.out
											.println("The price of your ticket is €" + ((child - discount) + 1) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println(
											"The price of your ticket is €" + ((teenager - discount) + 1) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out
											.println("The price of your ticket is €" + ((adult - discount) + 1) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €4.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("Invalid input");
							}
						} else if (returnticket.contains("y")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println(
											"The price of your ticket is €" + ((child + (child / 2)) + 1) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println(
											"The price of your ticket is €" + ((teenager + (teenager / 2)) + 1) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println(
											"The price of your ticket is €" + ((adult + (adult / 2)) + 1) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €7.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {

									System.out.println("The price of your ticket is €"
											+ (((child - discount) + ((child - discount) / 2)) + 1) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €"
											+ (((teenager - discount) + ((teenager - discount) / 2)) + 1) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €"
											+ (((adult - discount) + ((adult - discount) / 2)) + 1) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €5.50");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("You have entered an invalid input");
							}
						}
						if (count > 0) {
							System.out.println("");
						}
						break;
					} else {
						System.out.println("No tickets available");
						break;
					}
				case 3:
					if (taytotickets<26) {
						taytotickets++;
						System.out.println("Please enter your age");
						age = k.nextInt();
						System.out.println("Are you a student Y/N?");
						student = k.next().toLowerCase();
						System.out.println("Do you want a return ticket?");
						returnticket = k.next().toLowerCase();
						if (returnticket.contains("n")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println("The price of your ticket is €" + (child + 5) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €" + (teenager + 5) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €" + (adult + 5) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €9.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {
									System.out
											.println("The price of your ticket is €" + ((child - discount) + 5) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println(
											"The price of your ticket is €" + ((teenager - discount) + 5) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out
											.println("The price of your ticket is €" + ((adult - discount) + 5) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €8.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("Invalid input");
							}
						} else if (returnticket.contains("y")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println(
											"The price of your ticket is €" + ((child + (child / 2)) + 5) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println(
											"The price of your ticket is €" + ((teenager + (teenager / 2)) + 5) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println(
											"The price of your ticket is €" + ((adult + (adult / 2)) + 5) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €11.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {

									System.out.println("The price of your ticket is €"
											+ (((child - discount) + ((child - discount) / 2)) + 5) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €"
											+ (((teenager - discount) + ((teenager - discount) / 2)) + 5) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €"
											+ (((adult - discount) + ((adult - discount) / 2)) + 5) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €9.50");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("You have entered an invalid input");
							}
						}
						if (count > 0) {
							System.out.println("");
						}
						break;
					} else {
						System.out.println("No tickets available");
						break;
					}
				case 4:
					if (jurassictickets<26) {
						jurassictickets++;
						System.out.println("Please enter your age");
						age = k.nextInt();
						System.out.println("Are you a student Y/N?");
						student = k.next().toLowerCase();
						System.out.println("Do you want a return ticket?");
						returnticket = k.next().toLowerCase();
						if (returnticket.contains("n")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println("The price of your ticket is €" + (child + 100) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €" + (teenager + 100) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €" + (adult + 100) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €104.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {
									System.out.println(
											"The price of your ticket is €" + ((child - discount) + 100) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println(
											"The price of your ticket is €" + ((teenager - discount) + 100) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println(
											"The price of your ticket is €" + ((adult - discount) + 100) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €103.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("Invalid input");
							}
						} else if (returnticket.contains("y")) {
							if (student.contains("n")) {
								if (age > 0 && age < 13) {
									System.out.println(
											"The price of your ticket is €" + ((child + (child / 2)) + 100) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €"
											+ ((teenager + (teenager / 2)) + 100) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println(
											"The price of your ticket is €" + ((adult + (adult / 2)) + 100) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €106.00");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else if (student.contains("y")) {
								if (age > 0 && age < 13) {

									System.out.println("The price of your ticket is €"
											+ (((child - discount) + ((child - discount) / 2)) + 100) + "0");
									count = 0;
								} else if (age >= 13 && age < 20) {
									System.out.println("The price of your ticket is €"
											+ (((teenager - discount) + ((teenager - discount) / 2)) + 100) + "0");
									count = 0;
								} else if (age >= 20 && age < 60) {
									System.out.println("The price of your ticket is €"
											+ (((adult - discount) + ((adult - discount) / 2)) + 100) + "0");
									count = 0;
								} else if (age > 60) {
									System.out.println("The price of your ticket is €104.50");
									count = 0;
								} else {
									System.out.println("You have entered an invalid age");
									System.out.flush();
									count = 1;
								}
							} else {
								System.out.println("You have entered an invalid input");
							}
						}
						if (count > 0) {
							System.out.println("");
						}
						break;
					} else {
						System.out.println("No tickets available");
						break;
					}
				case 5:
					System.out.println("Please enter your age");
					
					age = k.nextInt();
					System.out.println("Are you a student Y/N?");
					student = k.next().toLowerCase();
					System.out.println("Do you want a return ticket?");
					returnticket = k.next().toLowerCase();
					
					if (returnticket.contains("n")) {
						if (student.contains("n")) {
							if (age > 0 && age < 13) {
								System.out.println("The price of your ticket is €" + child + "0");
								count = 0;
							} else if (age >= 13 && age < 20) {
								System.out.println("The price of your ticket is €" + teenager + "0");
								count = 0;
							} else if (age >= 20 && age < 60) {
								System.out.println("The price of your ticket is €" + adult + "0");
								count = 0;
							} else if (age > 60) {
								System.out.println("The price of your ticket is €4.00");
								count = 0;
							} else {
								System.out.println("You have entered an invalid age");
								System.out.flush();
								count = 1;
							}
						} else if (student.contains("y")) {
							if (age > 0 && age < 13) {
								System.out.println("The price of your ticket is €" + (child - discount) + "0");
								count = 0;
							} else if (age >= 13 && age < 20) {
								System.out.println("The price of your ticket is €" + (teenager - discount) + "0");
								count = 0;
							} else if (age >= 20 && age < 60) {
								System.out.println("The price of your ticket is €" + (adult - discount) + "0");
								count = 0;
							} else if (age > 60) {
								System.out.println("The price of your ticket is €3.00");
								count = 0;
							} else {
								System.out.println("You have entered an invalid age");
								System.out.flush();
								count = 1;
							}
						}
							else {
								System.out.println("Invalid input");
							}
					}else if(returnticket.contains("y")) {
						if (student.contains("n")) {
							if (age > 0 && age < 13) {
								System.out.println("The price of your ticket is €" + child + (child/2) + "0");
								count = 0;
							} else if (age >= 13 && age < 20) {
								System.out.println("The price of your ticket is €" + teenager + (teenager/2) + "0");
								count = 0;
							} else if (age >= 20 && age < 60) {
								System.out.println("The price of your ticket is €" + adult + (adult/2) + "0");
								count = 0;
							} else if (age > 60) {
								System.out.println("The price of your ticket is €6.00");
								count = 0;
							} else {
								System.out.println("You have entered an invalid age");
								System.out.flush();
								count = 1;
							}
						} else if (student.contains("y")) {
							if (age > 0 && age < 13) {
								
								System.out.println("The price of your ticket is €" + ((child - discount) + (child - discount)/2) + "0");
								count = 0;
							} else if (age >= 13 && age < 20) {
								System.out.println("The price of your ticket is €" + ((teenager - discount) + (teenager - discount)/2) + "0");
								count = 0;
							} else if (age >= 20 && age < 60) {
								System.out.println("The price of your ticket is €" + ((adult - discount) + (adult - discount)/2) + "0");
								count = 0;
							} else if (age > 60) {
								System.out.println("The price of your ticket is €4.50");
								count = 0;
							} else {
								System.out.println("You have entered an invalid age");
								System.out.flush();
								count = 1;
							}
						}
						else {
							System.out.println("You have entered an invalid input");
						}
					}
					if(count > 0) {
					System.out.println("");
					}
				break;
				
				default:
						System.exit(0);
				break;
				
				}
					
				} while (count==0); 
			k.close();	
			}
			
	}

