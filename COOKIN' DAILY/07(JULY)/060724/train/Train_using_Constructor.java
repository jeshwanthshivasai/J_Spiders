package train;

public class Train_using_Constructor {

    private static final String boardingPoint = "Kacheguda";
    private String destinationPoint;
    private String name;
    private String id;
    private int journeyDistance;
    private int journeyTime;

    public Train_using_Constructor(String destinationPoint, int journeyDistance, int journeyTime) {
        this.destinationPoint = destinationPoint;
        this.name = destinationPoint + " Express";
        this.journeyDistance = journeyDistance;
        this.journeyTime = journeyTime;
        this.id = generateID();
    }

    private String generateID() {
        String id = "Ka" + destinationPoint.substring(destinationPoint.length() - 2) + "01";
        return id;
    }

    private int validate() {
        if (!boardingPoint.equals("Kacheguda")) {
            return 0;
        }
        if (!(destinationPoint.equals("Chennai") || destinationPoint.equals("Pune") ||
              destinationPoint.equals("Mumbai") || destinationPoint.equals("Vijayawada"))) {
            return 0;
        }
        if (journeyDistance < 400 || journeyDistance > 800) {
            return 0;
        }
        if (journeyTime < 6 || journeyTime > 12) {
            return 0;
        }
        if (id == null || !id.matches("^Ka..\\d\\d$")) {
            return 0;
        }
        return 1;
    }

    private int calculateSpeed() {
        return (int) ((double) journeyDistance / journeyTime);
    }

    public int displayTrainDetails() {
        if (validate() == 0) {
            System.out.println("Train details are invalid.");
            return 0;
        }
        System.out.println("The Train name "+ name+" with number "+ id +" travelling to "+destinationPoint+" covering a distance of "+journeyDistance+" kms takes "+ journeyTime + "hrs.");
        return 1;
    }
}