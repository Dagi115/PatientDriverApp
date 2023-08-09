import java.util.Scanner;

public class MovieDriver {
    private String title;
    private String rating;
    private int ticketsSold;

    public MovieDriver() {
        title = "";
        rating = "";
        ticketsSold = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public String toString() {
        return "Title: " + title + "\nRating: " + rating + "\nTickets Sold: " + ticketsSold;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            Movie movie = new Movie();

            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the movie's rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = scanner.nextInt();
            movie.setSoldTickets(ticketsSold);

            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.println("\nMovie Information:");
            System.out.println(movie.toString());

            System.out.print("Do you want to enter another movie? (yes/no): ");
            continueInput = scanner.nextLine();
        } while (continueInput.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
