package airlineticketbooking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirlineReservationSystem extends JFrame {

    private JComboBox<String> flightComboBox;
    private JTextField nameField;
    private JTextField seatsField;

    public AirlineReservationSystem() {
        super("Airline Reservation System");

        // Create UI components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel flightLabel = new JLabel("Flight:");
        String[] flights = {"Flight 101", "Flight 102", "Flight 103"};
        flightComboBox = new JComboBox<>(flights);

        JLabel seatsLabel = new JLabel("Number of Seats:");
        seatsField = new JTextField(5);

        JButton reserveButton = new JButton("Reserve");

        // Set layout manager
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add components to the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(flightLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(flightComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(seatsLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(seatsField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(reserveButton, gbc);

        // Event handling for the reserve button
        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String selectedFlight = (String) flightComboBox.getSelectedItem();
                int numberOfSeats = Integer.parseInt(seatsField.getText());

                // Perform reservation logic (you need to implement this)
                makeReservation(name, selectedFlight, numberOfSeats);
            }
        });

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Placeholder method for reservation logic
    private void makeReservation(String name, String flight, int numberOfSeats) {
        // Implement reservation logic here
        System.out.println("Reservation made for " + name + " on " + flight +
                " for " + numberOfSeats + " seat(s).");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AirlineReservationSystem();
            }
        });
    }
}
