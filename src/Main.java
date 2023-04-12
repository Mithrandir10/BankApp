public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Bank sbi1=new SBIBank(1000,"Parteek","parteek@123");
        sbi1.addMoney(110);
        System.out.println(sbi1.checkBalance());
    }
}