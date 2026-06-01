package pekan7_2511537001;

import java.awt.*;
import javax.swing.*;

public class InsertionSortGUI_2511537001 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_7001;
	private JLabel [] labelArray_7001;
	private JButton stepButton_7001, resetButton_7001, setButton_7001;
	private JTextField inputField_7001;
	private JPanel panelArray_7001;
	private JTextArea stepArea_7001;
			
	private int i_7001 = 1 ,j_7001;
	private boolean sorting_7001 = false;
	private int stepCount_7001 = 1;
			
	public InsertionSortGUI_2511537001() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Panel input
		JPanel inputPanel_7001 = new JPanel(new FlowLayout());
		inputField_7001 = new JTextField(30);
		setButton_7001 = new JButton("Set Array");
		inputPanel_7001.add(new JLabel("Masukkan angka (pisahkan dengan koma): "));
		inputPanel_7001.add(inputField_7001);
		inputPanel_7001.add(setButton_7001);

		// Panel array visual
		panelArray_7001 = new JPanel();
		panelArray_7001.setLayout(new FlowLayout());

		// Panel kontrol
		JPanel controlPanel_7001 = new JPanel();
		stepButton_7001 = new JButton("Langkah Selanjutnya");
		resetButton_7001 = new JButton("Reset");
		stepButton_7001.setEnabled(false);
    		controlPanel_7001.add(stepButton_7001);
    		controlPanel_7001.add(resetButton_7001);
    		
    		// Area teks untuk log langkah-langkah
    		stepArea_7001 = new JTextArea(8, 60);
    		stepArea_7001.setEditable(false);
    		stepArea_7001.setFont(new Font("Monospaced", Font.PLAIN, 14));
    		JScrollPane scrollPane_7001 = new JScrollPane(stepArea_7001);

    		// Tambahkan panel ke frame
    		add(inputPanel_7001, BorderLayout.NORTH);
    		add(panelArray_7001, BorderLayout.CENTER);
    		add(controlPanel_7001, BorderLayout.SOUTH);
    		add(scrollPane_7001, BorderLayout.EAST);

    		// Event Set Array
    		setButton_7001.addActionListener(e -> setArrayFromInput());

    		// Event Langkah Selanjutnya
    		stepButton_7001.addActionListener(e -> performStep());

    		// Event Reset
    		resetButton_7001.addActionListener(e -> reset());

	}
	private void setArrayFromInput() {
	    String text_7001 = inputField_7001.getText().trim();
	    if (text_7001.isEmpty()) return;
	    String[] parts_7001 = text_7001.split(",");
	    array_7001 = new int[parts_7001.length];
	    try {
	        for (int k_7001 = 0; k_7001 < parts_7001.length; k_7001++) {
	            array_7001[k_7001] = Integer.parseInt(parts_7001[k_7001].trim());
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	                + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    
	    i_7001 = 1;
	    stepCount_7001 = 1;
	    sorting_7001 = true;
	    stepButton_7001.setEnabled(true);
	    stepArea_7001.setText("");
	    panelArray_7001.removeAll();
	    
	    labelArray_7001 = new JLabel[array_7001.length];
	    for (int k_7001 = 0; k_7001 < array_7001.length; k_7001++) {
	        labelArray_7001[k_7001] = new JLabel(String.valueOf(array_7001[k_7001]));
	        labelArray_7001[k_7001].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_7001[k_7001].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_7001[k_7001].setPreferredSize(new Dimension(50, 50));
	        labelArray_7001[k_7001].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_7001.add(labelArray_7001[k_7001]);
	    }
	    
	    panelArray_7001.revalidate();
	    panelArray_7001.repaint();
	}

	private void performStep() {
		if (i_7001 < array_7001.length && sorting_7001) {
			int key_7001 = array_7001[i_7001];
			j_7001 = i_7001 - 1;
			
			StringBuilder stepLog = new StringBuilder();
			stepLog.append("Langkah").append(stepCount_7001).
			append(": Memasukkan ").append(key_7001).append("\n");
			
			while ( j_7001 >= 0 && array_7001[j_7001] > key_7001) {
				array_7001 [j_7001 + 1] = array_7001[j_7001];
				j_7001--;
			}
			array_7001[j_7001 + 1] = key_7001;
			
			updateLabels();
			stepLog.append("Hasil: ").append(arrayToString(array_7001)).append("\n\n");
			stepArea_7001.append(stepLog.toString());
			
			i_7001++;
			stepCount_7001++;
			
			if (i_7001 == array_7001.length) {
				sorting_7001= false;
				stepButton_7001.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}
	private void updateLabels() {
	    for (int k_7001 = 0; k_7001 < array_7001.length; k_7001++) {
	        labelArray_7001[k_7001].setText(String.valueOf(array_7001[k_7001]));
	    }
	}

	private void reset() {
	    inputField_7001.setText("");
	    panelArray_7001.removeAll();
	    panelArray_7001.revalidate();
	    panelArray_7001.repaint();
	    stepArea_7001.setText("");
	    stepButton_7001.setEnabled(false);
	    sorting_7001 = false;
	    i_7001 = 1;
	    stepCount_7001 = 1;
	}

	private String arrayToString(int[] arr) {
	    StringBuilder sb = new StringBuilder();
	    for (int k = 0; k < arr.length; k++) {
	        sb.append(arr[k]);
	        if (k < arr.length - 1) sb.append(", ");
	    }
	    return sb.toString();
	}
}