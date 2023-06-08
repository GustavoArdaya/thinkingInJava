package com.thinkinginjava.udemy.S7;

public class ClassesChallenge {

    public static void main(String[] args) {

        Account myAccount = new Account("Juan Perez", "juaper@gmail.com", "(123) 123847");
        myAccount.deposit(1000.00);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(500.00);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(600.00);
        System.out.println(myAccount.getBalance());
    }
    public static class Account {
        private String accountNumber;
        private Double balance;
        private String customerName;
        private String email;
        private String phoneNumber;

        public Account(String customerName, String email, String phoneNumber) {
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.accountNumber = "A1234567";
            this.balance = 0.0;
        }

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Double getBalance() {
            return this.balance;
        }

        public void setBalance(Double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return this.customerName;
        }
        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void withdraw(double amount) {
            if (this.balance - amount >= 0) {
                this.balance -= amount;
            }
        }
    }
}
