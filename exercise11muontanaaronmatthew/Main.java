import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Initialization
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);

        //This will influence the subject to be displayed.
        Subject displayedSubject = math;

        //UI display
        JFrame window = new JFrame("Exercise 11");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
    
        window.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //Subject
        JLabel subjectName = new JLabel(displayedSubject.getName());
        subjectName.setForeground(Color.red);
        subjectName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 30));
        window.add(subjectName);
         
        //Image
        JLabel subjectLogo = new JLabel();
        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        subjectLogo.setIcon(img);
        window.add(subjectLogo);

        //Units
        JLabel subjectUnits = new JLabel(Double.toString(displayedSubject.getUnits()));
        subjectUnits.setForeground(Color.blue);
        subjectUnits.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 30));
        window.add(subjectUnits);

        //Grade
        JLabel subjectGrade = new JLabel(Double.toString(displayedSubject.getGrade()));
        subjectGrade.setForeground(Color.green);
        subjectGrade.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 30));
        window.add(subjectGrade);
        
        //Button
        JButton button = new JButton("Next");
        button.setHorizontalTextPosition(JButton.LEFT);
        window.add(button);
        
        window.setVisible(true);
    }
    
}
