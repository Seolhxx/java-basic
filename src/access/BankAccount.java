package access;

public class BankAccount {

    private int balance; // 초기값 설정안해줘도 처음엔 0

    //  생성자
    public BankAccount() {
       balance = 0; //사실 초기값 안해줘도 됨
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountVaild(amount)) { // 2. 여기에 true반환
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다."); // 입금안함
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if(isAmountVaild(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : getBalance : 잔액
    public int getBalance() {
        return balance;
    }

    //입금금액이 제대로 들어왔는지 검증 로직
    private boolean isAmountVaild(int amount) {
        // 금액이 0보다 커야함
        return amount > 0; // 1. 참이면 true가 반환될 것
    }
}


