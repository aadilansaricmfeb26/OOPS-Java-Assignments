import java.util.Scanner;

class Bus {
    boolean isUserAlreadyBooked;
    int seatNo;
    boolean [] seats = new boolean[10];

    Bus() {
        for (boolean seat : seats) {
            seat = false;
        }
    }

        void printSeatDetails(){

            System.out.print("Seat No:\t");

            for (int i = 0; i < seats.length; i++) {
                System.out.printf("%-8d", (i+1));
            }
            System.out.print("\nStatus: \t");
            for (int i = 0; i < seats.length; i++) {
//                System.out.printf("%-8b", seats[i]);

                System.out.printf(!seats[i] ? "A       " : "NA     ");

            }
            System.out.println("\n\t\t\t\t(A = Available, NA = Not Available)");
        }

        void bookSeat(){
            if (!isUserAlreadyBooked){
                seats[seatNo] = true;
                isUserAlreadyBooked = true;
                System.out.println("Your seat " + seatNo + " has been booked successfully");
             } else {
                System.out.println("You already booked a seat");
            }
        }

        void cancelSeat(){
            if (isUserAlreadyBooked) {
                seats[seatNo] = false;
                isUserAlreadyBooked = false;
                System.out.println("Your seat " + seatNo + " has been cancelled successfully");
            } else {
                System.out.println("Please book a seat first");
            }
        }

    void startMenu(){
        Scanner sc = new Scanner(System.in);

        menu: while(true) {

            System.out.println("\n-------- Welcome to the Bus Ticket Booking Simulation --------");
            System.out.println("\n1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Exit");

            System.out.println("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    printSeatDetails();
                    break;

                case 2: {
                    System.out.println("Enter the seat number: ");
                    seatNo = sc.nextInt();
                    if (seatNo > 0 && seatNo <= 100 )
                        bookSeat();
                    else
                        System.out.println("Please enter a valid seat number!");
                }
                break;

                case 3: {
                    cancelSeat();
                }
                break;

                case 4:
                    System.out.println("Exiting the Bus Ticket Booking System");
                    break menu;

                default:
                    System.out.println("Invalid Choice");
            }

        }

    }

    }

public class BusTicketBookingSystem {
    static void main(String[] args) {
        Bus b = new Bus();
        b.startMenu();
    }
}
