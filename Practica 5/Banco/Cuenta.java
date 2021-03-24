package Banco;

public class Cuenta {
    private String name, pin;
    private float saldo;

    Cuenta(String name, float saldo, String pin) {
        this.name = name;
        this.saldo = saldo;
        this.pin = pin;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
