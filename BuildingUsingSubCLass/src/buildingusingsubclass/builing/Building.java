
package buildingusingsubclass.builing;


public class Building {
    
    public String numberOfFloor;
    public String numberOfAppartment;
    public String numberOfRoom;

    public Building() {
    }

    public Building(String numberOfFloor, String numberOfAppartment, String numberOfRoom) {
        this.numberOfFloor = numberOfFloor;
        this.numberOfAppartment = numberOfAppartment;
        this.numberOfRoom = numberOfRoom;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getNumberOfAppartment() {
        return numberOfAppartment;
    }

    public void setNumberOfAppartment(String numberOfAppartment) {
        this.numberOfAppartment = numberOfAppartment;
    }

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }
    
    
    public void getBuildingDetails(){
        System.out.println("Floor Size: "+ numberOfFloor);
        System.out.println("Appartment Size: "+ numberOfAppartment);
        System.out.println("Room number: "+ numberOfRoom);
    
    }
    
}
