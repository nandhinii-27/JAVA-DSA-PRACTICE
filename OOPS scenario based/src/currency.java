

import java.util.*;

public class currency {

    double inr, usd, euro, yen;
    Scanner in = new Scanner(System.in);

    public void dollartorupee() {
        System.out.print("Enter dollars: ");
        usd = in.nextDouble();
        inr = usd * 94;
        System.out.println("Dollar = " + usd + " equal to INR = " + inr);
    }

    public void rupeetodollar() {
        System.out.print("Enter rupees: ");
        inr = in.nextDouble();
        usd = inr / 94;
        System.out.println("Rupee = " + inr + " equal to Dollar = " + usd);
    }

    public void eurotorupee() {
        System.out.print("Enter euro: ");
        euro = in.nextDouble();
        inr = euro * 110;
        System.out.println("Euro = " + euro + " equal to INR = " + inr);
    }

    public void rupeetoeuro() {
        System.out.print("Enter rupees: ");
        inr = in.nextDouble();
        euro = inr / 110;
        System.out.println("Rupee = " + inr + " equal to Euro = " + euro);
    }

    public void yentorupee() {
        System.out.print("Enter yen: ");
        yen = in.nextDouble();
        inr = yen * 1.7;
        System.out.println("Yen = " + yen + " equal to INR = " + inr);
    }

    public void rupeetoyen() {
        System.out.print("Enter rupees: ");
        inr = in.nextDouble();
        yen = inr / 1.7;
        System.out.println("INR = " + inr + " equal to Yen = " + yen);
    }
}