import java.util.*;

class Employee {
    int empid;
    long mobile;
    String name, address, mailid;

    Scanner get = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter Name of the Employee");
        name = get.nextLine();

        System.out.println("Enter Mail id");
        mailid = get.nextLine();

        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();

        System.out.println("Enter employee id ");
        empid = get.nextInt();

        System.out.println("Enter Mobile Number");
        mobile = get.nextLong();
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id : " + empid);
        System.out.println("Mail id : " + mailid);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobile);
    }
}

// ---------------- PROGRAMMER ----------------
class Programmer extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getprogrammer() {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }

    void calculateprog() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.10 * bp;

        gross = bp + da + hra;
        net = gross - (pf + club);

        System.out.println("********************************************");
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("********************************************");

        System.out.println("Basic Pay: Rs. " + bp);
        System.out.println("DA: Rs. " + da);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("PF: Rs. " + pf);
        System.out.println("CLUB: Rs. " + club);
        System.out.println("GROSS PAY: Rs. " + gross);
        System.out.println("NET PAY: Rs. " + net);
    }
}

// ---------------- ASSISTANT PROFESSOR ----------------
class Asstprofessor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getasst() {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }

    void calculateasst() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.10 * bp;

        gross = bp + da + hra;
        net = gross - (pf + club);

        System.out.println("***********************************");
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("***********************************");

        System.out.println("Basic Pay: Rs. " + bp);
        System.out.println("DA: Rs. " + da);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("PF: Rs. " + pf);
        System.out.println("CLUB: Rs. " + club);
        System.out.println("GROSS PAY: Rs. " + gross);
        System.out.println("NET PAY: Rs. " + net);
    }
}

// ---------------- ASSOCIATE PROFESSOR ----------------
class Associateprofessor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getassociate() {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }

    void calculateassociate() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.10 * bp;

        gross = bp + da + hra;
        net = gross - (pf + club);

        System.out.println("***********************************");
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("***********************************");

        System.out.println("Basic Pay: Rs. " + bp);
        System.out.println("DA: Rs. " + da);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("PF: Rs. " + pf);
        System.out.println("CLUB: Rs. " + club);
        System.out.println("GROSS PAY: Rs. " + gross);
        System.out.println("NET PAY: Rs. " + net);
    }
}