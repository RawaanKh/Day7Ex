public class Main {
    public static void main(String[] args) {
          Account A=new Account("111","Rawan",100000);
          Account another=new Account("100","YARA",20000);
          Employee E=new Employee("112","REEMA",15000);

        System.out.println("FIRST ACCOUNT INFO");
        System.out.println(A.toString());
        System.out.println(A.credit(200));
        System.out.println(A.debit(1000));
        System.out.println( A.transferTo(another,500));
        System.out.println("------------------");
        System.out.println("SECOND ACCOUNT INFO");
        System.out.println(another.toString());
        System.out.println("------------------");
        System.out.println("EMPLOYEE INFO");
        System.out.println(E.toString());
        System.out.println(E.raisedSalary(20));
        System.out.println(E.getAnnualSalary());


    }
}