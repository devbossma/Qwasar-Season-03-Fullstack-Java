package Quest04.ex01;

abstract class BankAccount {
    String account_number;
    Person owner;

    BankAccount(Person _owner) {
        this.owner = _owner;
        this.account_number = MyHelper.DigestMD5(this.owner.getName()+ " md5 " +this.getClass());
    }

    String getAccountNumber() {
        return this.account_number;
    }

    Person getOwner() {
        return this.owner;
    }

    void print() {
        System.out.println(this.owner.getName()+ " --" +this.getClass().toString().replace("class", "") + " - "+this.getAccountNumber());
    }
}