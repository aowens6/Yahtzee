import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JLabel;
import java.awt.Font;


public class Yahtzee {
	
	 
	
	
	ArrayList<Integer> diceArray = new ArrayList<>();
	
	public int score = 0;
	public int btnCounter = 0;
	private JFrame frame;
	private JTextField txtDice1;
	private JTextField txtDice2;
	private JTextField txtDice3;
	private JTextField txtDice4;
	private JTextField txtDice5;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yahtzee window = new Yahtzee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Yahtzee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 676, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDice1 = new JTextField();
		txtDice1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDice1.setBounds(15, 33, 97, 26);
		frame.getContentPane().add(txtDice1);
		txtDice1.setColumns(10);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTotalScore.setBounds(273, 240, 144, 50);
		frame.getContentPane().add(lblTotalScore);
		
		final JLabel lblScore = new JLabel("");
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblScore.setBounds(436, 240, 84, 50);
		frame.getContentPane().add(lblScore);
		
		JButton btnKeep1 = new JButton("Keep");
		btnKeep1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnKeep1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDice1.isEnabled()){
					txtDice1.setEnabled(false);
				}else{
					txtDice1.setEnabled(true);
				}
				
			}
		});
		btnKeep1.setBounds(15, 75, 97, 29);
		frame.getContentPane().add(btnKeep1);
		
		txtDice2 = new JTextField();
		txtDice2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDice2.setColumns(10);
		txtDice2.setBounds(146, 33, 97, 26);
		frame.getContentPane().add(txtDice2);
		
		JButton btnKeep2 = new JButton("Keep");
		btnKeep2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnKeep2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDice2.isEnabled()){
					txtDice2.setEnabled(false);
				}else{
					txtDice2.setEnabled(true);
				}
				
			}
		});
		btnKeep2.setBounds(146, 75, 97, 29);
		frame.getContentPane().add(btnKeep2);
		
		txtDice3 = new JTextField();
		txtDice3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDice3.setColumns(10);
		txtDice3.setBounds(273, 33, 97, 26);
		frame.getContentPane().add(txtDice3);
		
		JButton btnKeep3 = new JButton("Keep");
		btnKeep3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnKeep3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDice3.isEnabled()){
					txtDice3.setEnabled(false);
				}else{
					txtDice3.setEnabled(true);
				}
				
			}
		});
		btnKeep3.setBounds(273, 75, 97, 29);
		frame.getContentPane().add(btnKeep3);
		
		txtDice4 = new JTextField();
		txtDice4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDice4.setColumns(10);
		txtDice4.setBounds(403, 33, 97, 26);
		frame.getContentPane().add(txtDice4);
		
		JButton btnKeep4 = new JButton("Keep");
		btnKeep4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnKeep4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDice4.isEnabled()){
					txtDice4.setEnabled(false);
				}else{
					txtDice4.setEnabled(true);
				}
				
			}
		});
		btnKeep4.setBounds(403, 75, 97, 29);
		frame.getContentPane().add(btnKeep4);
		
		txtDice5 = new JTextField();
		txtDice5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDice5.setColumns(10);
		txtDice5.setBounds(529, 33, 97, 26);
		frame.getContentPane().add(txtDice5);
		
		JButton btnKeep5 = new JButton("Keep");
		btnKeep5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnKeep5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDice5.isEnabled()){
					txtDice5.setEnabled(false);
				}else{
					txtDice5.setEnabled(true);
				}
				
			}
		});
		btnKeep5.setBounds(529, 75, 97, 29);
		frame.getContentPane().add(btnKeep5);
		
		
		final JButton btnRollDice = new JButton("Roll Dice");
		btnRollDice.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnRollDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (btnCounter <= 2){
					if (txtDice1.isEnabled()){
						txtDice1.setText("" + ThreadLocalRandom.current().nextInt(1, 7));
					}
					if (txtDice2.isEnabled()){
						txtDice2.setText("" + ThreadLocalRandom.current().nextInt(1, 7));
					}
					if (txtDice3.isEnabled()){
						txtDice3.setText("" + ThreadLocalRandom.current().nextInt(1, 7));
					}
					if (txtDice4.isEnabled()){
						txtDice4.setText("" + ThreadLocalRandom.current().nextInt(1, 7));
					}
					if (txtDice5.isEnabled()){
						txtDice5.setText("" + ThreadLocalRandom.current().nextInt(1, 7));		
					}
				}
				
				if (btnCounter > 2){
					btnRollDice.setEnabled(false);
				}
				btnCounter++;
			}
		});
		btnRollDice.setBounds(210, 148, 261, 50);
		frame.getContentPane().add(btnRollDice);
		
		final JComboBox<String> cbxCombos = new JComboBox<String>();
		cbxCombos.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Aces", "Twos", "Threes", "Fours", "Fives", "Sixes", "Three of a Kind", "Four of a Kind", "Full House", "Small Straight", "Large Straight", "Scratch", "Yahtzee"}));
		cbxCombos.setBounds(15, 203, 144, 29);
		frame.getContentPane().add(cbxCombos);
		
		final JLabel lblCombos = new JLabel("Combo List");
		lblCombos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCombos.setBounds(15, 137, 200, 50);
		frame.getContentPane().add(lblCombos);
		
		JButton btnSaveDice = new JButton("Save Dice");
		btnSaveDice.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSaveDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try{
				
				int numOfAces = 0;
				int numOfTwos = 0;
				int numOfThrees = 0;
				int numOfFours = 0;
				int numOfFives = 0;
				int numOfSixes = 0;
				
				diceArray.add(Integer.parseInt(txtDice1.getText()));
				diceArray.add(Integer.parseInt(txtDice2.getText()));
				diceArray.add(Integer.parseInt(txtDice3.getText()));
				diceArray.add(Integer.parseInt(txtDice4.getText()));
				diceArray.add(Integer.parseInt(txtDice5.getText()));
				
				Collections.sort(diceArray);                                    
				
				
				
				if (cbxCombos.getSelectedItem() == "Aces"){
					
					score += combos.Aces(diceArray);
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
					
					
				}else if (cbxCombos.getSelectedItem() == "Twos"){
					
					score += combos.Twos(diceArray);
					
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
					
				}else if (cbxCombos.getSelectedItem() == "Threes"){
					
					score += combos.Threes(diceArray);
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
					
				}else if (cbxCombos.getSelectedItem() == "Fours"){
					
					score += combos.Fours(diceArray);
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
					
				}else if (cbxCombos.getSelectedItem() == "Fives"){
					
					score += combos.Fives(diceArray);
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
					
				}else if (cbxCombos.getSelectedItem() == "Sixes"){
					
					score += combos.Sixes(diceArray);
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
					
				}else if (cbxCombos.getSelectedItem() == "Three of a Kind"){
						for (Integer dice : diceArray){
						
						if (dice == 1){
							numOfAces++;
						}else if (dice == 2){
							numOfTwos++;
						}else if (dice == 3){
							numOfThrees++;
						}else if (dice == 4){
							numOfFours++;
						}else if (dice == 5){
							numOfFives++;
						}else if (dice == 6){
							numOfSixes++;
						} 		
					}
					
					if ((numOfAces >= 3)||(numOfTwos >= 3)||(numOfThrees >= 3)||(numOfFours >= 3)||(numOfFives >= 3)||(numOfSixes >= 3)){
						for (Integer dice : diceArray){
							score += dice;
						}
					}
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
				}else if (cbxCombos.getSelectedItem() == "Four of a Kind"){
					for (Integer dice : diceArray){
						
						if (dice == 1){
							numOfAces++;
						}else if (dice == 2){
							numOfTwos++;
						}else if (dice == 3){
							numOfThrees++;
						}else if (dice == 4){
							numOfFours++;
						}else if (dice == 5){
							numOfFives++;
						}else if (dice == 6){
							numOfSixes++;
						} 		
					}
					
					if ((numOfAces >= 4)||(numOfTwos >= 4)||(numOfThrees >= 4)||(numOfFours >= 4)||(numOfFives >= 4)||(numOfSixes >= 4)){
						for (Integer dice : diceArray){
							score += dice;
						}
					}
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
				}else if (cbxCombos.getSelectedItem() == "Full House"){
					for (Integer dice : diceArray){
						
						if (dice == 1){
							numOfAces++;
						}else if (dice == 2){
							numOfTwos++;
						}else if (dice == 3){
							numOfThrees++;
						}else if (dice == 4){
							numOfFours++;
						}else if (dice == 5){
							numOfFives++;
						}else if (dice == 6){
							numOfSixes++;
						} 		
					}
					
					if (((numOfAces >= 2)||(numOfTwos >= 2)||(numOfThrees >= 2)||(numOfFours >= 2)||(numOfFives >= 2)||(numOfSixes >= 2)) && ((numOfAces >= 3)||(numOfTwos >= 3)||(numOfThrees >= 3)||(numOfFours >= 3)||(numOfFives >= 3)||(numOfSixes >= 3))) {
						
						score += 25;
					}
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
				}else if (cbxCombos.getSelectedItem() == "Small Straight"){
					for (Integer dice : diceArray){
						
						if (dice == 1){
							numOfAces++;
						}else if (dice == 2){
							numOfTwos++;
						}else if (dice == 3){
							numOfThrees++;
						}else if (dice == 4){
							numOfFours++;
						}else if (dice == 5){
							numOfFives++;
						}else if (dice == 6){
							numOfSixes++;
						} 		
					}
					
					if (((numOfAces >= 1)&&(numOfTwos >= 1)&&(numOfThrees >= 1)&&(numOfFours >= 1)) || ((numOfTwos >= 1)||(numOfThrees >= 1)||(numOfFours >= 1)||(numOfFives >= 1))||(((numOfThrees >= 1)&&(numOfFours >= 1)&&(numOfFives >= 1)&&(numOfSixes >= 1)))) {
						
						score += 30;
					}
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
				}else if (cbxCombos.getSelectedItem() == "Large Straight"){
					for (Integer dice : diceArray){
						
						if (dice == 1){
							numOfAces++;
						}else if (dice == 2){
							numOfTwos++;
						}else if (dice == 3){
							numOfThrees++;
						}else if (dice == 4){
							numOfFours++;
						}else if (dice == 5){
							numOfFives++;
						}else if (dice == 6){
							numOfSixes++;
						} 		
					}
					
					if (((numOfAces >= 1)&&(numOfTwos >= 1)&&(numOfThrees >= 1)&&(numOfFours >= 1)&&(numOfFives >= 1)) || ((numOfTwos >= 1)||(numOfThrees >= 1)||(numOfFours >= 1)||(numOfFives >= 1)||(numOfSixes >= 1))) {
						
						score += 40;
					}
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
				}else if (cbxCombos.getSelectedItem() == "Yahtzee"){
					for (Integer dice : diceArray){
						
						if (dice == 1){
							numOfAces++;
						}else if (dice == 2){
							numOfTwos++;
						}else if (dice == 3){
							numOfThrees++;
						}else if (dice == 4){
							numOfFours++;
						}else if (dice == 5){
							numOfFives++;
						}else if (dice == 6){
							numOfSixes++;
						} 		
					}
					
					if (((numOfAces == 5)||(numOfTwos == 5)||(numOfThrees == 5)||(numOfFours == 5)||(numOfFives == 5)) || (numOfSixes == 5)) {
						
						score += 50;
					}
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
				}else if (cbxCombos.getSelectedItem() == "Scratch"){
					for (Integer dice : diceArray){
						
						score += dice;		
					}
					cbxCombos.removeItemAt(cbxCombos.getSelectedIndex());
				}else if (cbxCombos.getSelectedItem() == "" || cbxCombos.getSelectedIndex() == -1){
					JOptionPane.showMessageDialog(null, "You must select a combo");
				}
				
				lblScore.setText("" + score);
				btnCounter = 0;
				btnRollDice.setEnabled(true);
				txtDice1.setEnabled(true);
				txtDice2.setEnabled(true);
				txtDice3.setEnabled(true);
				txtDice4.setEnabled(true);
				txtDice5.setEnabled(true);
					
				if (cbxCombos.getSelectedItem() != "" && cbxCombos.getSelectedIndex() != -1){
					
					txtDice1.setText("");
					txtDice2.setText("");
					txtDice3.setText("");
					txtDice4.setText("");
					txtDice5.setText("");
				}
				
				diceArray.clear();
				cbxCombos.setSelectedIndex(-1);	
			}
			
			catch (Exception e1){
				e1.getMessage();
				JOptionPane.showMessageDialog(null, "You must roll dice");
			}
				
			}

		});
		btnSaveDice.setBounds(15, 242, 225, 48);
		frame.getContentPane().add(btnSaveDice);
		
		final JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setBounds(31, 331, 113, 20);
		frame.getContentPane().add(lblEnterName);
		
		final JComboBox<Object> cbxPlayers = new JComboBox<Object>();
		cbxPlayers.setModel(new DefaultComboBoxModel<Object>(new String[] {""}));
		cbxPlayers.setBounds(426, 327, 200, 29);
		frame.getContentPane().add(cbxPlayers);
		
		JButton btnAddName = new JButton("Add Name");
		btnAddName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String playerName;
				playerName = txtName.getText();
				
				players.setPlayerName(playerName);
				
				cbxPlayers.addItem(players.getPlayerName());
				txtName.setText("");
			}
		});
		btnAddName.setBounds(293, 327, 115, 29);
		frame.getContentPane().add(btnAddName);
		
		txtName = new JTextField();
		txtName.setBounds(132, 328, 146, 26);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);

		
	}
	
	
}


