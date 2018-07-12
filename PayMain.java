public class PayMain {
    public static void main(String[] args)
    {
    PayFactory pf=new PayFactory();

    Payments p1=pf.paymethod("creditcard");
    p1.pay();

    Payments p2=pf.paymethod("debitCarD");
    p2.pay();

    Payments p3=pf.paymethod("wallets");
    p3.pay();

    Payments p4=pf.paymethod("Netbanking");
    p4.pay();

    Payments p5=pf.paymethod("cod");
    p5.pay();


    }
}

