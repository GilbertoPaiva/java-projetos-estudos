public class StringSwitch {
    public static void main(String[] args) throws Exception {

        String command = "cancel";

        switch (command){
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("command Error!");
                break;
        }
    }
}
