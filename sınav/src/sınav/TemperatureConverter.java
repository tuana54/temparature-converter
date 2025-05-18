package sınav;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TemperatureConverter {
	public static void main(String[] args) {
		// Ana pencere oluşturma
		JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300, 200);
	    frame.setLayout(new GridLayout(3, 2, 10, 10));

	     // Bileşenleri oluşturma
	    	JLabel celsiusLabel = new JLabel("Celsius:");
	        JTextField celsiusField = new JTextField();
	        JButton convertButton = new JButton("Dönüştür");
	        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
	        JTextField fahrenheitField = new JTextField();
	        fahrenheitField.setEditable(false);

	        // Convert butonuna tıklama işlemi
	        convertButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    // Celsius değeri al ve Fahrenheit'e çevir
	                    double celsius = Double.parseDouble(celsiusField.getText());
	                    double fahrenheit = (celsius * 9 / 5) + 32;
	                    fahrenheitField.setText(String.format("%.2f", fahrenheit));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Lütfen geçerli bir sayı girin.", "Hata", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	        // Bileşenleri pencereye ekleme
	        frame.add(celsiusLabel);
	        frame.add(celsiusField);
	        frame.add(convertButton);
	        frame.add(fahrenheitLabel);
	        frame.add(fahrenheitField);

	        // Pencereyi görünür hale getirme
	        frame.setVisible(true);
	    }

}
