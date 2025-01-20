package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        //balance를 public으로 바꾸면 외부에서도 사용 가능
//        int amount = 1000;
//        account.balance += amount;

// isAmountVaild메서드가 public일 경우 검증해야 하는지 의문을 가짐
//        int amount = 1000;
//        boolean isValid = account.isAmountVaild(amount);
//        if(isValid) {
//        account.deposit(10000);
//        account.withdraw(3000); }

        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
