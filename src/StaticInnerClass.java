class PaymentDetails
{
    private static String name="Ritesh Singh";
    private static String psw="Jai Ram";
    static class ValidateCreditCards
    {
        void validate()
        {
            if(name.equals("Ritesh Singh") && psw.equals("Jai Ram"))
                System.out.println("Welcome");
            else
                System.out.println("Error");
        }
    }
    static class ValidateDebitCards
    {
        void validate()
        {
            if(name.equals("Ritesh Singh") && psw.equals("Jai Ram"))
                System.out.println("Welcome");
            else
                System.out.println("Error");
        }
    }
    static class ValidateNetBankingAccount
    {
        void validate()
        {
            if(name.equals("Ritesh Singh") && psw.equals("Jai Ram"))
                System.out.println("Welcome");
            else
                System.out.println("Error");
        }
    }
}
public class StaticInnerClass {

    public static void main(String[] args) {

        PaymentDetails.ValidateDebitCards val = new PaymentDetails.ValidateDebitCards();
        val.validate();
        PaymentDetails.ValidateCreditCards val1 = new PaymentDetails.ValidateCreditCards();
        val.validate();
        PaymentDetails.ValidateNetBankingAccount val2 = new PaymentDetails.ValidateNetBankingAccount();
        val.validate();

    }
}
