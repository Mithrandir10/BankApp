public interface Bank {


          int checkBalance();

          Boolean addMoney(int money);

          Boolean withdrawMoney(int money);

          int getROI();

          int totalInterest(int loanAmount,int timeInYears);

}
