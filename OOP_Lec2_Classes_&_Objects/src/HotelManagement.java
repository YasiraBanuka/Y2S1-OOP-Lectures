class Room {
    private int roomNo;
    private boolean isAvailable;

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Receptionist {
    private String ID;
    private String name;
    private int age;
    private String address;
    private Room room;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

//    public void setRoom(Room room) {
//        this.room = room;
//    }

    public Receptionist(String id, String name, int age, String address, Room room) {
        ID = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.room = room;
    }

    //method to check room availability
    public void checkRoomAvailability(Room room) {
        if(room.getRoomNo() == 10) {
            System.out.println("Room is avaialble");
        } else {
            System.out.println("Room is not available");
        }
    }

    //method to calculate the bill
    public double generateBill(int noOfDays, String roomType) {
        double roomRateLuxury = 20000.0;
        double roomRateNormal = 15000.0;

        if(roomType == "Luxury") {
            return (noOfDays * roomRateLuxury);
        } else {
            return (noOfDays * roomRateNormal);
        }
    }

    //method to get customer feedback
    public String getCustomerFeedback(String feedback) {
        return feedback;
    }
}

public class HotelManagement {

    public static void main(String[] args) {

        Room room = new Room();
        room.setRoomNo(20);

        Receptionist rep = new Receptionist("1234", "Kamal", 25, "Malabe", room);
        rep.checkRoomAvailability(room);

        System.out.println(rep.generateBill(5,"Luxury"));
    }
}
