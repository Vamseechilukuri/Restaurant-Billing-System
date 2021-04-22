import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.SecureRandom;
import java.awt.Color;
import javax.swing.JTextArea;

public class Restaurant {

	private JFrame frmRestaurantBillingSystem;
	private JTextField textField_Total;
	private JTextField textField_Tax;
	private JTextField textField_BillRs;
	private JTextField textField_potato;
	private JTextField textField_Panner;
	private JTextField textField_Manchurian;
	private JTextField textField_Chicken65;
	private JTextField textField_lolipop;
	private JTextField textField_MuttonTikka;
	private JTextField textField_RoseMilk;
	private JTextField textField_OreoShake;
	private JTextField textField_ChocolateThickShake;
	private JTextField textField_ChickenBiryani;
	private JTextField textField_MuttonBiryani;
	private JTextField textField_MugulayiBiryani;
	private JTextField textField_PrawnsBiryani;
	private JTextField textField_EggBiryani;
	private JTextField textField_EggFriedRice;
	private JTextField textField_PannerBiryani;
	private JTextField textField_VegFriedRice;
	private JTextField textField_MushroomBiryani;
	private JTextField textField_VegFamilyPack;
	private JTextField textField_NonVegFamilyPack;
	private JTextField textField_ChocolateMuffin;
	private JTextField textField_Brownies;
	private JTextField textField_IceCreams;
	private JTextField textField_Pastery;
	private JTextField textField_Doughnuts;
	String iTax,iBill,iTotal,change;
	double itemcost[]=new double[30];
	private JTextField textField_Change;
	private JTextField textField_Cash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frmRestaurantBillingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurantBillingSystem = new JFrame();
		frmRestaurantBillingSystem.getContentPane().setEnabled(false);
		frmRestaurantBillingSystem.setTitle("Restaurant Billing System");
		frmRestaurantBillingSystem.setBounds(100, 100, 1500, 550);
		frmRestaurantBillingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurantBillingSystem.getContentPane().setLayout(null);
		
		JLabel lbRestaurantBilling = new JLabel("Restaurant Billing System");
		lbRestaurantBilling.setHorizontalAlignment(SwingConstants.CENTER);
		lbRestaurantBilling.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lbRestaurantBilling.setBounds(553, 0, 290, 83);
		frmRestaurantBillingSystem.getContentPane().add(lbRestaurantBilling);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 81, 1466, 2);
		frmRestaurantBillingSystem.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(329, 81, 1, 421);
		frmRestaurantBillingSystem.getContentPane().add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(637, 81, 1, 421);
		frmRestaurantBillingSystem.getContentPane().add(separator_1);
		
		JLabel lblStarters = new JLabel("Starters");
		lblStarters.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblStarters.setBounds(141, 81, 105, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblStarters);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 350, 322, 2);
		frmRestaurantBillingSystem.getContentPane().add(separator_3);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblMainMenu.setBounds(461, 81, 136, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblMainMenu);
		
		JLabel lblShakes = new JLabel("Shakes");
		lblShakes.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblShakes.setBounds(141, 350, 105, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblShakes);
		
		JLabel lblDesert = new JLabel("Deserts");
		lblDesert.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblDesert.setBounds(807, 81, 94, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblDesert);
		
		JLabel lblBill = new JLabel("Bill");
		lblBill.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBill.setBounds(832, 300, 62, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblBill);
		
		JCheckBox chckbxPotato_Chese_Balls = new JCheckBox("Potato Cheese Balls");
		chckbxPotato_Chese_Balls.setFocusable(false);
		chckbxPotato_Chese_Balls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPotato_Chese_Balls.isSelected()) {
					chckbxPotato_Chese_Balls.setEnabled(true);
					textField_potato.setEnabled(true);
					textField_potato.setText(null);
			}else {
				textField_potato.setEnabled(false);
				textField_potato.setText("0");
			}	
			}
		});
		chckbxPotato_Chese_Balls.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxPotato_Chese_Balls.setBounds(19, 127, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxPotato_Chese_Balls);
		
		JCheckBox chckbxPannerKabab = new JCheckBox("Panner Kabab");
		chckbxPannerKabab.setFocusable(false);
		chckbxPannerKabab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPannerKabab.isSelected()) {
					chckbxPannerKabab.setEnabled(true);
					textField_Panner.setEnabled(true);
					textField_Panner.setText(null);
			}else {
				textField_Panner.setEnabled(false);
				textField_Panner.setText("0");
			}}
		});
		chckbxPannerKabab.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxPannerKabab.setBounds(19, 161, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxPannerKabab);
		
		JCheckBox chckbxMnachurian = new JCheckBox("Gobi Manchurian");
		chckbxMnachurian.setFocusable(false);
		chckbxMnachurian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMnachurian.isSelected()) {
					chckbxMnachurian.setEnabled(true);
					textField_Manchurian.setEnabled(true);
					textField_Manchurian.setText(null);
			}else {
				textField_Manchurian.setEnabled(false);
				textField_Manchurian.setText("0");
		}}});
		chckbxMnachurian.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxMnachurian.setBounds(19, 197, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxMnachurian);
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken 65");
		chckbxChicken.setFocusable(false);
		chckbxChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChicken.isSelected()) {
					chckbxChicken.setEnabled(true);
					textField_Chicken65.setEnabled(true);
					textField_Chicken65.setText(null);
			}else {
				textField_Chicken65.setEnabled(false);
				textField_Chicken65.setText("0");
		}}});
		chckbxChicken.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxChicken.setBounds(19, 233, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxChicken);
		
		JCheckBox chckbxLolipop = new JCheckBox("Chicken lolipop");
		chckbxLolipop.setFocusable(false);
		chckbxLolipop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLolipop.isSelected()) {
					chckbxLolipop.setEnabled(true);
					textField_lolipop.setEnabled(true);
					textField_lolipop.setText(null);
			}else {
				textField_lolipop.setEnabled(false);
				textField_lolipop.setText("0");
		}}});
		chckbxLolipop.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxLolipop.setBounds(19, 268, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxLolipop);
		
		JCheckBox chckbxMuttonTikka = new JCheckBox("Mutton Tikka");
		chckbxMuttonTikka.setFocusable(false);
		chckbxMuttonTikka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMuttonTikka.isSelected()) {
					chckbxMuttonTikka.setEnabled(true);
					textField_MuttonTikka.setEnabled(true);
					textField_MuttonTikka.setText(null);
			}else {
				textField_MuttonTikka.setEnabled(false);
				textField_MuttonTikka.setText("0");
		}}});
		chckbxMuttonTikka.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxMuttonTikka.setBounds(19, 306, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxMuttonTikka);
		
		JCheckBox chckbxRoseMilk = new JCheckBox("Rose Milk");
		chckbxRoseMilk.setFocusable(false);
		chckbxRoseMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRoseMilk.isSelected()) {
					chckbxRoseMilk.setEnabled(true);
					textField_RoseMilk.setEnabled(true);
					textField_RoseMilk.setText(null);
			}else {
				textField_RoseMilk.setEnabled(false);
				textField_RoseMilk.setText("0");
		}}});
		chckbxRoseMilk.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxRoseMilk.setBounds(19, 386, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxRoseMilk);
		
		JCheckBox chckbxOreoShake = new JCheckBox("Oreo Shake");
		chckbxOreoShake.setFocusable(false);
		chckbxOreoShake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxOreoShake.isSelected()) {
					chckbxOreoShake.setEnabled(true);
					textField_OreoShake.setEnabled(true);
					textField_OreoShake.setText(null);
			}else {
				textField_OreoShake.setEnabled(false);
				textField_OreoShake.setText("0");
		}}});
		chckbxOreoShake.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxOreoShake.setBounds(19, 422, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxOreoShake);
		
		JCheckBox chckbxChocolateThick = new JCheckBox("Chocolate Thick Shake");
		chckbxChocolateThick.setFocusable(false);
		chckbxChocolateThick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChocolateThick.isSelected()) {
					chckbxChocolateThick.setEnabled(true);
					textField_ChocolateThickShake.setEnabled(true);
					textField_ChocolateThickShake.setText(null);
			}else {
				textField_ChocolateThickShake.setEnabled(false);
				textField_ChocolateThickShake.setText("0");
		}}});
		chckbxChocolateThick.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxChocolateThick.setBounds(19, 458, 181, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxChocolateThick);
		
		JCheckBox chckbxChickenBiryani = new JCheckBox("Chiken Biryani");
		chckbxChickenBiryani.setFocusable(false);
		chckbxChickenBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChickenBiryani.isSelected()) {
					chckbxChickenBiryani.setEnabled(true);
					textField_ChickenBiryani.setEnabled(true);
					textField_ChickenBiryani.setText(null);
			}else {
				textField_ChickenBiryani.setEnabled(false);
				textField_ChickenBiryani.setText("0");
		}}});
		chckbxChickenBiryani.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxChickenBiryani.setBounds(336, 127, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxChickenBiryani);
		
		JCheckBox chckbxMuttonBiryani = new JCheckBox("Mutton Biryani");
		chckbxMuttonBiryani.setFocusable(false);
		chckbxMuttonBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMuttonBiryani.isSelected()) {
					chckbxMuttonBiryani.setEnabled(true);
					textField_MuttonBiryani.setEnabled(true);
					textField_MuttonBiryani.setText(null);
			}else {
				textField_MuttonBiryani.setEnabled(false);
				textField_MuttonBiryani.setText("0");
		}}});
		chckbxMuttonBiryani.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxMuttonBiryani.setBounds(336, 161, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxMuttonBiryani);
		
		JCheckBox chckbxMugalayiBiryani = new JCheckBox("Mugalayi Biryani");
		chckbxMugalayiBiryani.setFocusable(false);
		chckbxMugalayiBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMugalayiBiryani.isSelected()) {
					chckbxMugalayiBiryani.setEnabled(true);
					textField_MugulayiBiryani.setEnabled(true);
					textField_MugulayiBiryani.setText(null);
			}else {
				textField_MugulayiBiryani.setEnabled(false);
				textField_MugulayiBiryani.setText("0");
		}}});
		chckbxMugalayiBiryani.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxMugalayiBiryani.setBounds(336, 197, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxMugalayiBiryani);
		
		JCheckBox chckbxPrwansBiryani = new JCheckBox("Prwans Biryani");
		chckbxPrwansBiryani.setFocusable(false);
		chckbxPrwansBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPrwansBiryani.isSelected()) {
					chckbxPrwansBiryani.setEnabled(true);
					textField_PrawnsBiryani.setEnabled(true);
					textField_PrawnsBiryani.setText(null);
			}else {
				textField_PrawnsBiryani.setEnabled(false);
				textField_PrawnsBiryani.setText("0");
		}}});
		chckbxPrwansBiryani.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxPrwansBiryani.setBounds(336, 231, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxPrwansBiryani);
		
		JCheckBox chckbxEggBiryani = new JCheckBox("Egg Biryani");
		chckbxEggBiryani.setFocusable(false);
		chckbxEggBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxEggBiryani.isSelected()) {
					chckbxEggBiryani.setEnabled(true);
					textField_EggBiryani.setEnabled(true);
					textField_EggBiryani.setText(null);
			}else {
				textField_EggBiryani.setEnabled(false);
				textField_EggBiryani.setText("0");
		}}});
		chckbxEggBiryani.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxEggBiryani.setBounds(336, 266, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxEggBiryani);
		
		JCheckBox chckbxEggFriedRice = new JCheckBox("Egg Fried Rice");
		chckbxEggFriedRice.setFocusable(false);
		chckbxEggFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxEggFriedRice.isSelected()) {
					chckbxEggFriedRice.setEnabled(true);
					textField_EggFriedRice.setEnabled(true);
					textField_EggFriedRice.setText(null);
			}else {
				textField_EggFriedRice.setEnabled(false);
				textField_EggFriedRice.setText("0");
		}}});
		chckbxEggFriedRice.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxEggFriedRice.setBounds(336, 298, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxEggFriedRice);
		
		JCheckBox chckbxPannerBiryani = new JCheckBox("Panner Biryani");
		chckbxPannerBiryani.setFocusable(false);
		chckbxPannerBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPannerBiryani.isSelected()) {
					chckbxPannerBiryani.setEnabled(true);
					textField_PannerBiryani.setEnabled(true);
					textField_PannerBiryani.setText(null);
			}else {
				textField_PannerBiryani.setEnabled(false);
				textField_PannerBiryani.setText("0");
		}}});
		chckbxPannerBiryani.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxPannerBiryani.setBounds(336, 334, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxPannerBiryani);
		
		JCheckBox chckbxVegFriedRice = new JCheckBox("Veg Fried Rice");
		chckbxVegFriedRice.setFocusable(false);
		chckbxVegFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxVegFriedRice.isSelected()) {
					chckbxVegFriedRice.setEnabled(true);
					textField_VegFriedRice.setEnabled(true);
					textField_VegFriedRice.setText(null);
			}else {
				textField_VegFriedRice.setEnabled(false);
				textField_VegFriedRice.setText("0");
		}}});
		chckbxVegFriedRice.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxVegFriedRice.setBounds(336, 370, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxVegFriedRice);
		
		JCheckBox chckbxMushroomBiryani = new JCheckBox("Mushrom Biryani");
		chckbxMushroomBiryani.setFocusable(false);
		chckbxMushroomBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxMushroomBiryani.isSelected()) {
					chckbxMushroomBiryani.setEnabled(true);
					textField_MushroomBiryani.setEnabled(true);
					textField_MushroomBiryani.setText(null);
			}else {
				textField_MushroomBiryani.setEnabled(false);
				textField_MushroomBiryani.setText("0");
		}}});
		chckbxMushroomBiryani.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxMushroomBiryani.setBounds(336, 402, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxMushroomBiryani);
		
		JCheckBox chckbxVegFamilyPack = new JCheckBox("Veg Family Pack");
		chckbxVegFamilyPack.setFocusable(false);
		chckbxVegFamilyPack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxVegFamilyPack.isSelected()) {
					chckbxVegFamilyPack.setEnabled(true);
					textField_VegFamilyPack.setEnabled(true);
					textField_VegFamilyPack.setText(null);
			}else {
				textField_VegFamilyPack.setEnabled(false);
				textField_VegFamilyPack.setText("0");
		}}});
		chckbxVegFamilyPack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxVegFamilyPack.setBounds(336, 438, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxVegFamilyPack);
		
		JCheckBox chckbxNonVegFamilyPack = new JCheckBox("NonVeg Family Pack");
		chckbxNonVegFamilyPack.setFocusable(false);
		chckbxNonVegFamilyPack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNonVegFamilyPack.isSelected()) {
					chckbxNonVegFamilyPack.setEnabled(true);
					textField_NonVegFamilyPack.setEnabled(true);
					textField_NonVegFamilyPack.setText(null);
			}else {
				textField_NonVegFamilyPack.setEnabled(false);
				textField_NonVegFamilyPack.setText("0");
		}}});
		chckbxNonVegFamilyPack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxNonVegFamilyPack.setBounds(336, 468, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxNonVegFamilyPack);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 119, 1466, 2);
		frmRestaurantBillingSystem.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(637, 303, 444, 2);
		frmRestaurantBillingSystem.getContentPane().add(separator_5);
		
		JCheckBox chckbxChocolateMuffin = new JCheckBox("Chocolate Muffin");
		chckbxChocolateMuffin.setFocusable(false);
		chckbxChocolateMuffin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChocolateMuffin.isSelected()) {
					chckbxChocolateMuffin.setEnabled(true);
					textField_ChocolateMuffin.setEnabled(true);
					textField_ChocolateMuffin.setText(null);
			}else {
				textField_ChocolateMuffin.setEnabled(false);
				textField_ChocolateMuffin.setText("0");
		}}});
		chckbxChocolateMuffin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxChocolateMuffin.setBounds(644, 127, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxChocolateMuffin);
		
		JCheckBox chckbxBrownies = new JCheckBox("Brownies");
		chckbxBrownies.setFocusable(false);
		chckbxBrownies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBrownies.isSelected()) {
					chckbxBrownies.setEnabled(true);
					textField_Brownies.setEnabled(true);
					textField_Brownies.setText(null);
			}else {
				textField_Brownies.setEnabled(false);
				textField_Brownies.setText("0");
		}}});
		chckbxBrownies.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxBrownies.setBounds(644, 161, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxBrownies);
		
		JCheckBox chckbxIceCreams = new JCheckBox("Ice Creams");
		chckbxIceCreams.setFocusable(false);
		chckbxIceCreams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxIceCreams.isSelected()) {
					chckbxIceCreams.setEnabled(true);
					textField_IceCreams.setEnabled(true);
					textField_IceCreams.setText(null);
			}else {
				textField_IceCreams.setEnabled(false);
				textField_IceCreams.setText("0");
		}}});
		chckbxIceCreams.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxIceCreams.setBounds(644, 199, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxIceCreams);
		
		JCheckBox chckbxPastery = new JCheckBox("Pastery");
		chckbxPastery.setFocusable(false);
		chckbxPastery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPastery.isSelected()) {
					chckbxPastery.setEnabled(true);
					textField_Pastery.setEnabled(true);
					textField_Pastery.setText(null);
			}else {
				textField_Pastery.setEnabled(false);
				textField_Pastery.setText("0");
		}}});
		chckbxPastery.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxPastery.setBounds(644, 235, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxPastery);
		
		JCheckBox chckbxDoughnuts = new JCheckBox("Doughnuts");
		chckbxDoughnuts.setFocusable(false);
		chckbxDoughnuts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDoughnuts.isSelected()) {
					chckbxDoughnuts.setEnabled(true);
					textField_Doughnuts.setEnabled(true);
					textField_Doughnuts.setText(null);
			}else {
				textField_Doughnuts.setEnabled(false);
				textField_Doughnuts.setText("0");
		}}});
		chckbxDoughnuts.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxDoughnuts.setBounds(644, 268, 166, 34);
		frmRestaurantBillingSystem.getContentPane().add(chckbxDoughnuts);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFocusable(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame Frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(Frame,"Confirm if you want to exit","Restaurant Billing",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
			    System.exit(0);
		     }
			}
		});
		
		JComboBox PaymentMethod = new JComboBox();
		PaymentMethod.setFocusable(false);
		PaymentMethod.setFont(new Font("Times New Roman", Font.BOLD, 14));
		PaymentMethod.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Debit Card","Credit Card", "UPI"}));
		PaymentMethod.setBounds(886, 370, 120, 28);
		frmRestaurantBillingSystem.getContentPane().add(PaymentMethod);
		
		JTextArea Reciept = new JTextArea();
		Reciept.setEnabled(false);
		Reciept.setBounds(1091, 127, 367, 344);
		frmRestaurantBillingSystem.getContentPane().add(Reciept);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnExit.setBounds(1387, 473, 85, 30);
		frmRestaurantBillingSystem.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFocusable(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Total.setText(null);
				textField_Tax.setText(null);
				textField_BillRs.setText(null);
				textField_potato.setText("0");
				textField_Panner.setText("0");
				textField_Manchurian.setText("0");
				textField_Chicken65.setText("0");
				textField_lolipop.setText("0");
				textField_MuttonTikka.setText("0");
				textField_RoseMilk.setText("0");
				textField_OreoShake.setText("0");
				textField_ChocolateThickShake.setText("0");
				textField_ChickenBiryani.setText("0");
				textField_MuttonBiryani.setText("0");
				textField_MugulayiBiryani.setText("0");
				textField_PrawnsBiryani.setText("0");
				textField_EggBiryani.setText("0");
				textField_EggFriedRice.setText("0");
				textField_PannerBiryani.setText("0");
				textField_VegFriedRice.setText("0");
				textField_MushroomBiryani.setText("0");
				textField_VegFamilyPack.setText("0");
				textField_NonVegFamilyPack.setText("0");
				textField_ChocolateMuffin.setText("0");
				textField_Brownies.setText("0");
				textField_IceCreams.setText("0");
				textField_Pastery.setText("0");
				textField_Doughnuts.setText("0");
				Reciept.setText(null);
				textField_Change.setText(null);
				textField_Cash.setText(null);
				
				textField_potato.setEnabled(false);
				textField_Panner.setEnabled(false);
				textField_Manchurian.setEnabled(false);
				textField_Chicken65.setEnabled(false);
				textField_lolipop.setEnabled(false);
				textField_MuttonTikka.setEnabled(false);
				textField_RoseMilk.setEnabled(false);
				textField_OreoShake.setEnabled(false);
				textField_ChocolateThickShake.setEnabled(false);
				textField_ChickenBiryani.setEnabled(false);
				textField_MuttonBiryani.setEnabled(false);
				textField_MugulayiBiryani.setEnabled(false);
				textField_PrawnsBiryani.setEnabled(false);
				textField_EggBiryani.setEnabled(false);
				textField_EggFriedRice.setEnabled(false);
				textField_PannerBiryani.setEnabled(false);
				textField_VegFriedRice.setEnabled(false);
				textField_MushroomBiryani.setEnabled(false);
				textField_VegFamilyPack.setEnabled(false);
				textField_NonVegFamilyPack.setEnabled(false);
				textField_ChocolateMuffin.setEnabled(false);
				textField_Brownies.setEnabled(false);
				textField_IceCreams.setEnabled(false);
				textField_Pastery.setEnabled(false);
				textField_Doughnuts.setEnabled(false);
				
				chckbxPotato_Chese_Balls.setSelected(false);
				chckbxPannerKabab.setSelected(false);
				chckbxMnachurian.setSelected(false);
				chckbxChicken.setSelected(false);
				chckbxLolipop.setSelected(false);
				chckbxMuttonTikka.setSelected(false);
				chckbxRoseMilk.setSelected(false);
				chckbxOreoShake.setSelected(false);
				chckbxChocolateThick.setSelected(false);
				chckbxChickenBiryani.setSelected(false);
				chckbxMuttonBiryani.setSelected(false);
				chckbxMugalayiBiryani.setSelected(false);
				chckbxPrwansBiryani.setSelected(false);
				chckbxEggBiryani.setSelected(false);
				chckbxEggFriedRice.setSelected(false);
				chckbxPannerBiryani.setSelected(false);
				chckbxVegFamilyPack.setSelected(false);
				chckbxMushroomBiryani.setSelected(false);
				chckbxVegFriedRice.setSelected(false);
				chckbxNonVegFamilyPack.setSelected(false);
				chckbxChocolateMuffin.setSelected(false);
				chckbxBrownies.setSelected(false);
				chckbxIceCreams.setSelected(false);
				chckbxPastery.setSelected(false);
				chckbxDoughnuts.setSelected(false);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnReset.setBounds(1188, 472, 85, 30);
		frmRestaurantBillingSystem.getContentPane().add(btnReset);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setFocusable(false);
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			itemcost[0]=(Double.parseDouble(textField_potato.getText())*180);
			itemcost[1]=(Double.parseDouble(textField_Panner.getText())*120);
			itemcost[2]=(Double.parseDouble(textField_Manchurian.getText())*140);
			itemcost[3]=(Double.parseDouble(textField_Chicken65.getText())*210);
			itemcost[4]=(Double.parseDouble(textField_lolipop.getText())*190);
			itemcost[5]=(Double.parseDouble(textField_MuttonTikka.getText())*220);
			itemcost[6]=(Double.parseDouble(textField_RoseMilk.getText())*90);
			itemcost[7]=(Double.parseDouble(textField_OreoShake.getText())*110);
			itemcost[8]=(Double.parseDouble(textField_ChocolateThickShake.getText())*120);
			itemcost[9]=(Double.parseDouble(textField_ChickenBiryani.getText())*200);
			itemcost[10]=(Double.parseDouble(textField_MuttonBiryani.getText())*220);
			itemcost[11]=(Double.parseDouble(textField_MugulayiBiryani.getText())*230);
			itemcost[12]=(Double.parseDouble(textField_PrawnsBiryani.getText())*240);
			itemcost[13]=(Double.parseDouble(textField_EggBiryani.getText())*250);
			itemcost[14]=(Double.parseDouble(textField_EggFriedRice.getText())*160);
			itemcost[15]=(Double.parseDouble(textField_PannerBiryani.getText())*200);
			itemcost[16]=(Double.parseDouble(textField_VegFriedRice.getText())*180);
			itemcost[17]=(Double.parseDouble(textField_MushroomBiryani.getText())*220);
			itemcost[18]=(Double.parseDouble(textField_VegFamilyPack.getText())*450);
			itemcost[19]=(Double.parseDouble(textField_NonVegFamilyPack.getText())*500);
			itemcost[20]=(Double.parseDouble(textField_ChocolateMuffin.getText())*60);
			itemcost[21]=(Double.parseDouble(textField_Brownies.getText())*70);
			itemcost[22]=(Double.parseDouble(textField_IceCreams.getText())*100);
			itemcost[23]=(Double.parseDouble(textField_Pastery.getText())*70);
			itemcost[24]=(Double.parseDouble(textField_Doughnuts.getText())*80);
			itemcost[25]=itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+
					itemcost[4]+itemcost[5]+itemcost[6]+itemcost[7]+itemcost[8]+
					itemcost[9]+itemcost[10]+itemcost[11]+itemcost[12]+itemcost[13]+
					itemcost[14]+itemcost[15]+itemcost[16]+itemcost[17]+itemcost[18]+
					itemcost[18]+itemcost[19]+itemcost[20]+itemcost[21]+itemcost[22]+itemcost[23]+itemcost[24];
			iTax=String.format("Rs %.2f",itemcost[25]*0.05);
			iBill=String.format("Rs %.2f",itemcost[25]);
			iTotal=String.format("Rs %.2f",itemcost[25]+itemcost[25]*0.05);
			textField_Total.setText(iTotal);
			textField_Tax.setText(iTax);
			textField_BillRs.setText(iBill);
			textField_Cash.setEnabled(true);
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num); 
			Reciept.setEnabled(true);
			Reciept.setEditable(false);
			Reciept.setTabSize(9);
			Reciept.append("\t\tRestaurant Billing System\n");
			Reciept.append("Bill No: "+formatted);
			Reciept.append("\n----------------------------------------------------------------------------------------------------------------------\n"
					+ "--------------------------------------------------------------------------------------------------------------------------");
			Reciept.append("\nItem name\t"+"\t"+"Cost"+"\tQuantity\n");
			if(chckbxPotato_Chese_Balls.isSelected()==true) {
				Reciept.append("\nPotato Cheese Balls:\t"+"180"+"\t"+textField_potato.getText());
			}if(chckbxPannerKabab.isSelected()==true) {
				Reciept.append("\nPanner Kabab:\t"+"\t120"+"\t"+textField_Panner.getText());
			}if(chckbxMnachurian.isSelected()==true) {
				Reciept.append("\nGobi Manchurian:\t"+"\t140"+"\t"+textField_Manchurian.getText());}
			if(chckbxChicken.isSelected()==true) {
				Reciept.append("\nChicken 65:\t"+"\t210"+"\t"+textField_Chicken65.getText());
			}if(chckbxLolipop.isSelected()==true) {
				Reciept.append("\nChicken lolipop:\t"+"\t190"+"\t"+textField_lolipop.getText());
			}if(chckbxMuttonTikka.isSelected()==true) {
				Reciept.append("\nMutton Tikka:\t"+"\t220"+"\t"+textField_MuttonTikka.getText());
			}if(chckbxRoseMilk.isSelected()==true) {
				Reciept.append("\nRose Milk:\t"+"\t90"+"\t"+textField_RoseMilk.getText());
			}if(chckbxOreoShake.isSelected()==true) {
				Reciept.append("\nOreo Shake:\t"+"\t110"+"\t"+textField_OreoShake.getText());
			}if(chckbxChocolateThick.isSelected()==true) {
				Reciept.append("\nChocolate thick shake:\t"+"\t120"+"\t"+textField_ChocolateThickShake.getText());
			}if(chckbxChickenBiryani.isSelected()==true) {
				Reciept.append("\nChicken Biryani:\t"+"\t200"+"\t"+textField_ChickenBiryani.getText());
			}if(chckbxMuttonBiryani.isSelected()==true) {
				Reciept.append("\nMutton Biryani:\t"+"\t220"+"\t"+textField_MuttonBiryani.getText());
			}if(chckbxMugalayiBiryani.isSelected()==true) {
				Reciept.append("\nMuhalayi Biryani:\t"+"\t230"+"\t"+textField_MugulayiBiryani.getText());
			}if(chckbxPrwansBiryani.isSelected()==true) {
				Reciept.append("\nPrawns Biryani:\t"+"\t240"+"\t"+textField_PrawnsBiryani.getText());
			}if(chckbxEggBiryani.isSelected()==true) {
				Reciept.append("\nEgg Biryani:\t"+"\t250"+"\t"+textField_EggBiryani.getText());
			}if(chckbxEggFriedRice.isSelected()==true) {
				Reciept.append("\nEgg Fried Rice:\t"+"\t160"+"\t"+textField_EggFriedRice.getText());
			}if(chckbxPannerBiryani.isSelected()==true) {
				Reciept.append("\nPanner Biryani:\t"+"\t200"+"\t"+textField_PannerBiryani.getText());
			}if(chckbxVegFamilyPack.isSelected()==true) {
				Reciept.append("\nVeg Family Pack Biryani:\t"+"\t450"+"\t"+textField_VegFriedRice.getText());
			}if(chckbxMushroomBiryani.isSelected()==true) {
				Reciept.append("\nMushroom Biryani:\t"+"\t220"+"\t"+textField_MushroomBiryani.getText());
			}if(chckbxVegFriedRice.isSelected()==true) {
				Reciept.append("\nVeg Fried Rice:\t"+"\t180"+"\t"+textField_VegFamilyPack.getText());
			}if(chckbxNonVegFamilyPack.isSelected()==true) {
				Reciept.append("\nNon Veg Family Pack Biryani:\t"+"\t500"+"\t"+textField_NonVegFamilyPack.getText());
			}if(chckbxChocolateMuffin.isSelected()==true) {
				Reciept.append("\nChocolate Muffin:\t"+"\t60"+"\t"+textField_ChocolateMuffin.getText());
			}if(chckbxBrownies.isSelected()==true) {
				Reciept.append("\nBrownies:\t"+"\t70"+"\t"+textField_Brownies.getText());
			}if(chckbxIceCreams.isSelected()==true) {
				Reciept.append("\nIce Creams:\t"+"\t100"+"\t"+textField_IceCreams.getText());
			}if(chckbxPastery.isSelected()==true) {
				Reciept.append("\nPastery:\t"+"\t70"+"\t"+textField_Pastery.getText());
			}if(chckbxDoughnuts.isSelected()==true) {
				Reciept.append("\nDoughnuts:\t"+"\t80"+"\t"+textField_Doughnuts.getText());
			}
			Reciept.append("\n----------------------------------------------------------------------------------------------------------------------\n"
					+ "--------------------------------------------------------------------------------------------------------------------------");
			Reciept.append("\nSub Total:\t"+textField_BillRs.getText());
			Reciept.append("\n Tax:\t"+textField_Tax.getText());
			Reciept.append("\nBill Amount:\t"+textField_Total.getText()+"\n");
			}
		});
		
		btnTotal.setBounds(886, 423, 120, 30);
		frmRestaurantBillingSystem.getContentPane().add(btnTotal);
		
		JLabel lblNewLabel_1 = new JLabel("Bill Rs:");
		lblNewLabel_1.setFocusable(false);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(648, 330, 94, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFocusable(false);
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTax.setBounds(648, 364, 114, 45);
		frmRestaurantBillingSystem.getContentPane().add(lblTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFocusable(false);
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTotal.setBounds(648, 418, 114, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblTotal);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(842, 334, 1, 119);
		frmRestaurantBillingSystem.getContentPane().add(separator_6);
		
		JLabel lblPayMode = new JLabel("Pay Mode");
		lblPayMode.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPayMode.setBounds(904, 330, 105, 40);
		frmRestaurantBillingSystem.getContentPane().add(lblPayMode);
		
		
		textField_Total = new JTextField();
		textField_Total.setFocusable(false);
		textField_Total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Total.setForeground(new Color(0, 0, 0));
		textField_Total.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Total.setText(null);
		textField_Total.setColumns(10);
		textField_Total.setBounds(746, 422, 78, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Total);
		
		textField_Tax = new JTextField();
		textField_Tax.setFocusable(false);
		textField_Tax.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Tax.setForeground(new Color(0, 0, 0));
		textField_Tax.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Tax.setText(null);
		textField_Tax.setColumns(10);
		textField_Tax.setBounds(746, 374, 78, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Tax);
		
		textField_BillRs = new JTextField();
		textField_BillRs.setFocusable(false);
		textField_BillRs.setHorizontalAlignment(SwingConstants.CENTER);
		textField_BillRs.setForeground(new Color(0, 0, 0));
		textField_BillRs.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_BillRs.setText(null);
		textField_BillRs.setColumns(10);
		textField_BillRs.setBounds(746, 338, 78, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_BillRs);
		
		textField_potato = new JTextField();
		textField_potato.setEnabled(false);
		textField_potato.setHorizontalAlignment(SwingConstants.CENTER);
		textField_potato.setForeground(new Color(0, 0, 0));
		textField_potato.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_potato.setText("0");
		textField_potato.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_potato.setColumns(10);
		textField_potato.setBounds(226, 131, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_potato);
		
		textField_Panner = new JTextField();
		textField_Panner.setEnabled(false);
		textField_Panner.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Panner.setForeground(new Color(0, 0, 0));
		textField_Panner.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Panner.setText("0");
		textField_Panner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_Panner.setColumns(10);
		textField_Panner.setBounds(226, 166, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Panner);
		textField_Manchurian = new JTextField();
		textField_Manchurian.setEnabled(false);
		textField_Manchurian.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Manchurian.setForeground(new Color(0, 0, 0));
		textField_Manchurian.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Manchurian.setText("0");
		textField_Manchurian.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_Manchurian.setColumns(10);
		textField_Manchurian.setBounds(226, 202, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Manchurian);
		
		textField_Chicken65 = new JTextField();
		textField_Chicken65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Chicken65.setForeground(new Color(0, 0, 0));
		textField_Chicken65.setEnabled(false);
		textField_Chicken65.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Chicken65.setText("0");
		textField_Chicken65.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_Chicken65.setColumns(10);
		textField_Chicken65.setBounds(226, 242, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Chicken65);
		
		textField_lolipop = new JTextField();
		textField_lolipop.setHorizontalAlignment(SwingConstants.CENTER);
		textField_lolipop.setForeground(new Color(0, 0, 0));
		textField_lolipop.setEnabled(false);
		textField_lolipop.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_lolipop.setText("0");
		textField_lolipop.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_lolipop.setColumns(10);
		textField_lolipop.setBounds(226, 277, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_lolipop);
		
		textField_MuttonTikka = new JTextField();
		textField_MuttonTikka.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MuttonTikka.setForeground(new Color(0, 0, 0));
		textField_MuttonTikka.setEnabled(false);
		textField_MuttonTikka.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_MuttonTikka.setText("0");
		textField_MuttonTikka.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_MuttonTikka.setColumns(10);
		textField_MuttonTikka.setBounds(226, 312, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_MuttonTikka);
		
		textField_RoseMilk = new JTextField();
		textField_RoseMilk.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RoseMilk.setForeground(new Color(0, 0, 0));
		textField_RoseMilk.setEnabled(false);
		textField_RoseMilk.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_RoseMilk.setText("0");
		textField_RoseMilk.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_RoseMilk.setColumns(10);
		textField_RoseMilk.setBounds(226, 391, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_RoseMilk);
		
		textField_OreoShake = new JTextField();
		textField_OreoShake.setHorizontalAlignment(SwingConstants.CENTER);
		textField_OreoShake.setForeground(new Color(0, 0, 0));
		textField_OreoShake.setEnabled(false);
		textField_OreoShake.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_OreoShake.setText("0");
		textField_OreoShake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_OreoShake.setColumns(10);
		textField_OreoShake.setBounds(226, 431, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_OreoShake);
		
		textField_ChocolateThickShake = new JTextField();
		textField_ChocolateThickShake.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ChocolateThickShake.setForeground(new Color(0, 0, 0));
		textField_ChocolateThickShake.setEnabled(false);
		textField_ChocolateThickShake.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_ChocolateThickShake.setText("0");
		textField_ChocolateThickShake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_ChocolateThickShake.setColumns(10);
		textField_ChocolateThickShake.setBounds(226, 467, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_ChocolateThickShake);
		
		textField_ChickenBiryani = new JTextField();
		textField_ChickenBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ChickenBiryani.setForeground(new Color(0, 0, 0));
		textField_ChickenBiryani.setEnabled(false);
		textField_ChickenBiryani.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_ChickenBiryani.setText("0");
		textField_ChickenBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_ChickenBiryani.setColumns(10);
		textField_ChickenBiryani.setBounds(532, 128, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_ChickenBiryani);
		
		textField_MuttonBiryani = new JTextField();
		textField_MuttonBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MuttonBiryani.setForeground(new Color(0, 0, 0));
		textField_MuttonBiryani.setEnabled(false);
		textField_MuttonBiryani.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_MuttonBiryani.setText("0");
		textField_MuttonBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_MuttonBiryani.setColumns(10);
		textField_MuttonBiryani.setBounds(532, 163, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_MuttonBiryani);
		
		textField_MugulayiBiryani = new JTextField();
		textField_MugulayiBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MugulayiBiryani.setForeground(new Color(0, 0, 0));
		textField_MugulayiBiryani.setEnabled(false);
		textField_MugulayiBiryani.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_MugulayiBiryani.setText("0");
		textField_MugulayiBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_MugulayiBiryani.setColumns(10);
		textField_MugulayiBiryani.setBounds(532, 199, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_MugulayiBiryani);
		
		textField_PrawnsBiryani = new JTextField();
		textField_PrawnsBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textField_PrawnsBiryani.setForeground(new Color(0, 0, 0));
		textField_PrawnsBiryani.setEnabled(false);
		textField_PrawnsBiryani.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_PrawnsBiryani.setText("0");
		textField_PrawnsBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_PrawnsBiryani.setColumns(10);
		textField_PrawnsBiryani.setBounds(532, 235, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_PrawnsBiryani);
		
		textField_EggBiryani = new JTextField();
		textField_EggBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textField_EggBiryani.setForeground(new Color(0, 0, 0));
		textField_EggBiryani.setEnabled(false);
		textField_EggBiryani.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_EggBiryani.setText("0");
		textField_EggBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_EggBiryani.setColumns(10);
		textField_EggBiryani.setBounds(532, 270, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_EggBiryani);
		
		textField_EggFriedRice = new JTextField();
		textField_EggFriedRice.setHorizontalAlignment(SwingConstants.CENTER);
		textField_EggFriedRice.setForeground(new Color(0, 0, 0));
		textField_EggFriedRice.setEnabled(false);
		textField_EggFriedRice.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_EggFriedRice.setText("0");
		textField_EggFriedRice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_EggFriedRice.setColumns(10);
		textField_EggFriedRice.setBounds(532, 304, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_EggFriedRice);
		
		textField_PannerBiryani = new JTextField();
		textField_PannerBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textField_PannerBiryani.setForeground(new Color(0, 0, 0));
		textField_PannerBiryani.setEnabled(false);
		textField_PannerBiryani.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_PannerBiryani.setText("0");
		textField_PannerBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_PannerBiryani.setColumns(10);
		textField_PannerBiryani.setBounds(532, 340, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_PannerBiryani);
		
		textField_VegFriedRice = new JTextField();
		textField_VegFriedRice.setHorizontalAlignment(SwingConstants.CENTER);
		textField_VegFriedRice.setForeground(new Color(0, 0, 0));
		textField_VegFriedRice.setEnabled(false);
		textField_VegFriedRice.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_VegFriedRice.setText("0");
		textField_VegFriedRice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_VegFriedRice.setColumns(10);
		textField_VegFriedRice.setBounds(532, 376, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_VegFriedRice);
		
		textField_MushroomBiryani = new JTextField();
		textField_MushroomBiryani.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MushroomBiryani.setForeground(new Color(0, 0, 0));
		textField_MushroomBiryani.setEnabled(false);
		textField_MushroomBiryani.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_MushroomBiryani.setText("0");
		textField_MushroomBiryani.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_MushroomBiryani.setColumns(10);
		textField_MushroomBiryani.setBounds(532, 408, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_MushroomBiryani);
		
		textField_VegFamilyPack = new JTextField();
		textField_VegFamilyPack.setHorizontalAlignment(SwingConstants.CENTER);
		textField_VegFamilyPack.setForeground(new Color(0, 0, 0));
		textField_VegFamilyPack.setEnabled(false);
		textField_VegFamilyPack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_VegFamilyPack.setText("0");
		textField_VegFamilyPack.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_VegFamilyPack.setColumns(10);
		textField_VegFamilyPack.setBounds(532, 444, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_VegFamilyPack);
		
		textField_NonVegFamilyPack = new JTextField();
		textField_NonVegFamilyPack.setHorizontalAlignment(SwingConstants.CENTER);
		textField_NonVegFamilyPack.setForeground(new Color(0, 0, 0));
		textField_NonVegFamilyPack.setEnabled(false);
		textField_NonVegFamilyPack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_NonVegFamilyPack.setText("0");
		textField_NonVegFamilyPack.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_NonVegFamilyPack.setColumns(10);
		textField_NonVegFamilyPack.setBounds(532, 474, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_NonVegFamilyPack);
		
		textField_ChocolateMuffin = new JTextField();
		textField_ChocolateMuffin.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ChocolateMuffin.setForeground(new Color(0, 0, 0));
		textField_ChocolateMuffin.setEnabled(false);
		textField_ChocolateMuffin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_ChocolateMuffin.setText("0");
		textField_ChocolateMuffin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_ChocolateMuffin.setColumns(10);
		textField_ChocolateMuffin.setBounds(817, 131, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_ChocolateMuffin);
		
		textField_Brownies = new JTextField();
		textField_Brownies.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Brownies.setForeground(new Color(0, 0, 0));
		textField_Brownies.setEnabled(false);
		textField_Brownies.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Brownies.setText("0");
		textField_Brownies.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_Brownies.setColumns(10);
		textField_Brownies.setBounds(817, 165, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Brownies);
		
		textField_IceCreams = new JTextField();
		textField_IceCreams.setHorizontalAlignment(SwingConstants.CENTER);
		textField_IceCreams.setForeground(new Color(0, 0, 0));
		textField_IceCreams.setEnabled(false);
		textField_IceCreams.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_IceCreams.setText("0");
		textField_IceCreams.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_IceCreams.setColumns(10);
		textField_IceCreams.setBounds(817, 201, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_IceCreams);
		
		textField_Pastery = new JTextField();
		textField_Pastery.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Pastery.setForeground(new Color(0, 0, 0));
		textField_Pastery.setEnabled(false);
		textField_Pastery.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Pastery.setText("0");
		textField_Pastery.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_Pastery.setColumns(10);
		textField_Pastery.setBounds(817, 237, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Pastery);
		
		textField_Doughnuts = new JTextField();
		textField_Doughnuts.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Doughnuts.setForeground(new Color(0, 0, 0));
		textField_Doughnuts.setEnabled(false);
		textField_Doughnuts.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Doughnuts.setText("0");
		textField_Doughnuts.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_Doughnuts.setColumns(10);
		textField_Doughnuts.setBounds(817, 272, 85, 28);
		frmRestaurantBillingSystem.getContentPane().add(textField_Doughnuts);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFocusable(false);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		   try {
			   Reciept.print();
						textField_Total.setText(null);
						textField_Tax.setText(null);
						textField_BillRs.setText(null);
						textField_potato.setText("0");
						textField_Panner.setText("0");
						textField_Manchurian.setText("0");
						textField_Chicken65.setText("0");
						textField_lolipop.setText("0");
						textField_MuttonTikka.setText("0");
						textField_RoseMilk.setText("0");
						textField_OreoShake.setText("0");
						textField_ChocolateThickShake.setText("0");
						textField_ChickenBiryani.setText("0");
						textField_MuttonBiryani.setText("0");
						textField_MugulayiBiryani.setText("0");
						textField_PrawnsBiryani.setText("0");
						textField_EggBiryani.setText("0");
						textField_EggFriedRice.setText("0");
						textField_PannerBiryani.setText("0");
						textField_VegFriedRice.setText("0");
						textField_MushroomBiryani.setText("0");
						textField_VegFamilyPack.setText("0");
						textField_NonVegFamilyPack.setText("0");
						textField_ChocolateMuffin.setText("0");
						textField_Brownies.setText("0");
						textField_IceCreams.setText("0");
						textField_Pastery.setText("0");
						textField_Doughnuts.setText("0");
						Reciept.setText(null);
						textField_Change.setText(null);
						textField_Cash.setText(null);
						
						textField_potato.setEnabled(false);
						textField_Panner.setEnabled(false);
						textField_Manchurian.setEnabled(false);
						textField_Chicken65.setEnabled(false);
						textField_lolipop.setEnabled(false);
						textField_MuttonTikka.setEnabled(false);
						textField_RoseMilk.setEnabled(false);
						textField_OreoShake.setEnabled(false);
						textField_ChocolateThickShake.setEnabled(false);
						textField_ChickenBiryani.setEnabled(false);
						textField_MuttonBiryani.setEnabled(false);
						textField_MugulayiBiryani.setEnabled(false);
						textField_PrawnsBiryani.setEnabled(false);
						textField_EggBiryani.setEnabled(false);
						textField_EggFriedRice.setEnabled(false);
						textField_PannerBiryani.setEnabled(false);
						textField_VegFriedRice.setEnabled(false);
						textField_MushroomBiryani.setEnabled(false);
						textField_VegFamilyPack.setEnabled(false);
						textField_NonVegFamilyPack.setEnabled(false);
						textField_ChocolateMuffin.setEnabled(false);
						textField_Brownies.setEnabled(false);
						textField_IceCreams.setEnabled(false);
						textField_Pastery.setEnabled(false);
						textField_Doughnuts.setEnabled(false);
						
						chckbxPotato_Chese_Balls.setSelected(false);
						chckbxPannerKabab.setSelected(false);
						chckbxMnachurian.setSelected(false);
						chckbxChicken.setSelected(false);
						chckbxLolipop.setSelected(false);
						chckbxMuttonTikka.setSelected(false);
						chckbxRoseMilk.setSelected(false);
						chckbxOreoShake.setSelected(false);
						chckbxChocolateThick.setSelected(false);
						chckbxChickenBiryani.setSelected(false);
						chckbxMuttonBiryani.setSelected(false);
						chckbxMugalayiBiryani.setSelected(false);
						chckbxPrwansBiryani.setSelected(false);
						chckbxEggBiryani.setSelected(false);
						chckbxEggFriedRice.setSelected(false);
						chckbxPannerBiryani.setSelected(false);
						chckbxVegFamilyPack.setSelected(false);
						chckbxMushroomBiryani.setSelected(false);
						chckbxVegFriedRice.setSelected(false);
						chckbxNonVegFamilyPack.setSelected(false);
						chckbxChocolateMuffin.setSelected(false);
						chckbxBrownies.setSelected(false);
						chckbxIceCreams.setSelected(false);
						chckbxPastery.setSelected(false);
						chckbxDoughnuts.setSelected(false);
		   }
		   catch(java.awt.print.PrinterException e1){
			   System.err.format("No Printer Found", e1.getMessage());
			  btnPrint.setFocusable(false);
		   }
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPrint.setBounds(1283, 473, 94, 29);
		frmRestaurantBillingSystem.getContentPane().add(btnPrint);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(1079, 81, 2, 421);
		frmRestaurantBillingSystem.getContentPane().add(separator_7);
		
		JLabel lblReciept = new JLabel("Reciept");
		lblReciept.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblReciept.setBounds(1253, 91, 105, 21);
		frmRestaurantBillingSystem.getContentPane().add(lblReciept);
		
		JLabel lblCash = new JLabel("Cash");
		lblCash.setFocusable(false);
		lblCash.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCash.setBounds(648, 464, 45, 21);
		frmRestaurantBillingSystem.getContentPane().add(lblCash);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFocusable(false);
		lblChange.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChange.setBounds(855, 457, 94, 34);
		frmRestaurantBillingSystem.getContentPane().add(lblChange);
		
		textField_Change = new JTextField();
		textField_Change.setFocusable(false);
		textField_Change.setEditable(false);
		textField_Change.setText((String) null);
		textField_Change.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Change.setForeground(Color.BLACK);
		textField_Change.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Change.setColumns(10);
		textField_Change.setBounds(970, 465, 78, 21);
		frmRestaurantBillingSystem.getContentPane().add(textField_Change);
		
		textField_Cash = new JTextField();
		textField_Cash.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Cash.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_Cash.setEnabled(false);
		textField_Cash.setBounds(746, 463, 78, 25);
		frmRestaurantBillingSystem.getContentPane().add(textField_Cash);
		textField_Cash.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Num=e.getKeyChar();
				if(!(Character.isDigit(Num))||(Num==KeyEvent.VK_BACK_SPACE)||(Num==KeyEvent.VK_DELETE)) {
				e.consume();	
				}	
			}
		});
		textField_Cash.setColumns(10);
		JButton btnPay = new JButton("Pay");
		btnPay.setFocusable(false);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PayMode=(String) PaymentMethod.getSelectedItem();
				if(PayMode=="Cash") {
					itemcost[26]=Double.parseDouble(textField_Cash.getText());
					if(itemcost[26]>=(itemcost[25]+itemcost[25]*0.05)) {
						change=String.format("%.2f",itemcost[26]-(itemcost[25]+itemcost[25]*0.05));
						textField_Change.setText(change);
						Reciept.append("Payment Method:Cash\n");
						Reciept.append("Amount:"+textField_Cash.getText()+"\n");
						Reciept.append("Change:"+change+"\n");
						Reciept.append("\n\t\tThank you");
					}else {
						JOptionPane.showMessageDialog(null, "Cash Not Enough","Restaurant Billing", JOptionPane.OK_OPTION);
					}
				}else {
					textField_Change.setText("0");
					textField_Cash.setEnabled(false);
					Reciept.append("Payment Method:Card");
					Reciept.append("\n\t\tThank you");
				}
			}
		});
		btnPay.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPay.setBounds(1084, 472, 94, 30);
		frmRestaurantBillingSystem.getContentPane().add(btnPay);
	}
}