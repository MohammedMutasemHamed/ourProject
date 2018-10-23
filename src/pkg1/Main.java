package pkg1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Initialize e = new Initialize();
        e.CreatMines();
        e.puzzle();
        e.print();

        Click h = new Click(); //لمعرفة العناصر التي تم الكشف عنها
        Scanner scn = new Scanner(System.in);
        int i, j;
        i = scn.nextInt();
        j = scn.nextInt();

        h.testing(e, i, j);

        boolean x = e.getelement(0, 0).isClicked();
        System.out.println("\n\n" + x);
        
        
        
      
        
    }

}
