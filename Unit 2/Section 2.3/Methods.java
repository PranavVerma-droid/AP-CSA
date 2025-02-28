public class Methods {
    public static void main(String[] args){
        Lamp myLamp = new Lamp();
        Lamp myLamp2 = new Lamp();

        myLamp.turnOn();
        myLamp2.turnOff();

        System.out.println(myLamp.isOn);
        System.out.println(myLamp2.isOn);
    }
}

class Lamp {
    public boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}