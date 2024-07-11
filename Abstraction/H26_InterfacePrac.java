package Abstraction;


interface Camera{
    void takeSnap();
    void recordVideo();
    private  void greatGM(){
        System.out.println("Good Morning ...");
    }
    // default methods...
    default void record4KVideo(){
        greatGM();
        System.out.println("Recording 4k Videos ");
    }
}
interface Wifi{
    String [] getNetwork();
    void connectNetwork(String network);
}

class MyCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting ...");
    }
}

class SmartPhone extends MyCellPhone implements Wifi, Camera {

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap..");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video..");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks..");
        return new String[]{"Abid","Rifat","Raju"};
        //return new String[0];
    }

    @Override
    public void connectNetwork(String Network) {
        System.out.println("Conncting to Network "+ Network);
    }
}
public class H26_InterfacePrac {
    public static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        ms.record4KVideo();
        // cant access private ms.greatGM;
        String [] ar= ms.getNetwork();
        for (String st : ar){
            System.out.println(st);
        }

        Wifi wifiobj = new SmartPhone(); // this object can only use Wifi methods
        wifiobj.connectNetwork("Robi");
        //wifiobj.takeSnap();

    }
}





