package Fundamentos;
 class CuentaBancaria {
	 public int saldo;
     public static int numero=0;
    }
 public class Variables {
	public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo +=10;
    }
	public static void sumarSaldo(int saldo){
        saldo +=10;
    }
	//crear 10 objetos
	public static void main(String[] args) {
    CuentaBancaria ct1 = new CuentaBancaria();
    CuentaBancaria ct2=ct1;
    ct1.saldo = 1000; 
    sumarSaldo(ct1);
    sumarSaldo(ct2);
    System.out.println("ct1:" +ct1.saldo);
    System.out.println("ct2:" +ct2.saldo);
    ct2 = new CuentaBancaria();
    System.out.println("ct2:" +ct2.saldo);
    CuentaBancaria ct3 = new CuentaBancaria();
    ct3.saldo = 400;
    sumarSaldo(ct3);
    System.out.println("ct3:" +ct3.saldo);
    CuentaBancaria ct4 = new CuentaBancaria();
    ct4.saldo = 6788;
    sumarSaldo(ct4);
    System.out.println("ct4:" +ct4.saldo);
    CuentaBancaria ct5 = new CuentaBancaria();
    ct5.saldo = 350;
    sumarSaldo(ct5);
    System.out.println("ct5:" +ct5.saldo);
    CuentaBancaria ct6 = new CuentaBancaria();
    ct6.saldo = 78;
    sumarSaldo(ct6);
    System.out.println("ct6:" +ct6.saldo);
    CuentaBancaria ct7 = new CuentaBancaria();
    ct7.saldo = 304409;
    sumarSaldo(ct7);
    ct7 = ct5;
    System.out.println("ct7:" +ct7.saldo);
    CuentaBancaria ct8 = new CuentaBancaria();
    ct8.saldo = 4556;
    sumarSaldo(ct8);
    System.out.println("ct8:" +ct8.saldo);
    CuentaBancaria ct9 = new CuentaBancaria();
    ct9.saldo = 7899;
    sumarSaldo(ct9);
    ct9 = ct4;
    System.out.println("ct9:" +ct9.saldo);
    CuentaBancaria ct10 = new CuentaBancaria();
    ct10.saldo = 8000;
    sumarSaldo(ct10);
    System.out.println("ct10:" +ct10.saldo);
	}
 }
    
    