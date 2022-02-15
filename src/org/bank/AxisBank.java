package org.bank;

public class AxisBank extends Bankinfo {
public void deposit() {
	System.out.println("20000");
}
public static void main(String [] args) {
AxisBank a= new AxisBank();
a.deposit();
a.saving();
a.fixed();

}
}
