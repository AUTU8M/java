
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipcheck {
    public static void main(String[] args) {
        try {
            // Get all IP addresses associated with "localhost"
            InetAddress[] addresses = InetAddress.getAllByName("localhost");

            // Loop through each address
            for (InetAddress address : addresses) {
                // Print the hostname and the IP address
                System.out.println("Localhost: " + address.getHostAddress());

                // Check if the address is an IPv6 or IPv4 type
                if (address.getHostAddress().contains(":")) {
                    System.out.println("This is IPv6");
                } else {
                    System.out.println("This is IPv4");
                }
            }
        } catch (UnknownHostException e) {
            // Handle the case where the host name "localhost" cannot be found
            e.printStackTrace();
	    //now we should get the desired output.
        }
    }
}
