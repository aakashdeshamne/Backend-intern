import java.util.*;

abstract class Pen{
     public abstract void write(String content);

     public abstract void refill();
}

class FountainPen extends Pen {
    public String nib;

    public FountainPen(String nibType) {
        this.nib = nibType;
    }

    public void write(String content) {
        System.out.println("Writing with a fountain pen. Nib Type: " + nib);

    }
    public void refill() {
        System.out.println("Refilling fountain pen with ink. Nib Type: " + nib);
    }
    public void changeNib(String newNib) {
        System.out.println("Changing nib to: " + newNib);
        this.nib = newNib;
    }
}
interface BasicAnimal {
    void eat();
    void sleep();
}

// Monkey class
class Monkey {
    public void jump() {
        System.out.println("Monkey is jumping.");
    }

    public void bite() {
        System.out.println("Monkey is biting.");
    }
}
class Human extends Monkey implements BasicAnimal {

    public void eat() {
        System.out.println("Human is eating.");
    }


    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

abstract class Telephone{
    public abstract void ring();

    public abstract void lift();

    public abstract void disconnect();

}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Smart phone is ringing");
    }

    public void lift() {
        System.out.println("Smart phone is lifted");
    }

    public void disconnect() {
        System.out.println("Smart phone is disconnected");
    }

}
interface TvRemote {
    void turnOn();

    void turnOff();

    void changeChannel(int channel);
}

interface SmartTvRemote extends TvRemote {

}

// Implementation of SmartTvRemote
class Smart implements SmartTvRemote {
    private boolean isOn;
    private int currentChannel;


    public void turnOn() {
        isOn = true;
        System.out.println("Smart TV is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Smart TV is turned off.");
    }

    public void changeChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Channel changed to: " + channel);
        } else {
            System.out.println("Smart TV is off. Cannot change channel.");
        }
    }
}

class Tv implements TvRemote{
    public void turnOn(){
        System.out.println("congratulation tv is on");
    }
    public void changeChannel(int channel){
        System.out.println("current channel is this "+ channel);
    }
    public void turnOff(){
        System.out.println("So Bad !! tv is again off");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task 1
        //(from line 3 to line 7)

        //task2
        FountainPen fountainPen = new FountainPen("Medium");
        fountainPen.write("Hello, World!");
        fountainPen.refill();
        fountainPen.changeNib("Fine");
        fountainPen.write("This is a fountain pen");

        //task3
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();


        //task4
        SmartTelephone smartPhone = new SmartTelephone();
        smartPhone.ring();
        smartPhone.lift();
        smartPhone.disconnect();

        //task5
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Human();
        monkey1.jump();
        monkey1.bite();
        monkey2.jump();
        monkey2.bite();

        //task6
        Smart smartRemote = new Smart();
        smartRemote.turnOn();
        smartRemote.changeChannel(5);
        smartRemote.turnOff();

        //task7
        Tv mytv=new Tv();
        mytv.turnOn();
        mytv.changeChannel(23);
        mytv.turnOff();
    }
}