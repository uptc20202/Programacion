package test;

import java.text.ParseException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class Test {

	public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException {
		// TODO Auto-generated method stub
		SynthLookAndFeel laf = new SynthLookAndFeel(); 
		laf.load(Test.class.getResourceAsStream("data/laf.xml"), Test.class); 
		UIManager.setLookAndFeel(laf);


	}

}
