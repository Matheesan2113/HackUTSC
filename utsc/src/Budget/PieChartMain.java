
package Budget;

import javax.swing.JFrame;

public class PieChartMain {

    public static void main(String[] args) {
        CreateChart pie=new CreateChart("Budget Statistics", "Expense Comparison");
        pie.pack();
        pie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pie.setVisible(true);
    
    }
    
}

