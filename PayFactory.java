public class PayFactory {
    public Payments paymethod(String p)
    {
        if(p.equalsIgnoreCase("creditcard"))
            return new CreditCard();
        else if(p.equalsIgnoreCase("debitcard"))
            return new DebitCard();
        else if(p.equalsIgnoreCase("wallets"))
            return new Wallet();
        else if(p.equalsIgnoreCase("netbanking"))
            return new NetBanking();
        else if(p.equalsIgnoreCase("cod"))
            return new COD();
        else
            return null;
    }
}
