public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) throws IllegalArgumentException {
        if (balance >= amount )
        return balance -=amount;
        else
            throw new IllegalArgumentException();
    }

    public int debit(int amount) throws IllegalArgumentException {
        if (amount >0) {
            return balance +=amount;
        }
        else
            throw new IllegalArgumentException();
    }
    public int transferTo(Account another,int amount){
          if (balance>=amount) {
              return balance - amount;
          }
          else
              throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

