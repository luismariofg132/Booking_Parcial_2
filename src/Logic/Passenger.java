/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author lmfg0
 */
public class Passenger {
    private String Name = "";
    private String Id = "";
    private ClassType classType = ClassType.Economy;
    private SeatType seatType = SeatType.Aisle;
    private int asignedSeat = 0;

    public Passenger(String Name, String Id, ClassType classType, SeatType seatType, int asignedSeat) {
        this.Name = Name;
        this.Id = Id;
        this.classType = classType;
        this.seatType = seatType;
        this.asignedSeat = asignedSeat;
    }

    public Passenger() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public int getAsignedSeat() {
        return asignedSeat;
    }

    public void setAsignedSeat(int asignedSeat) {
        this.asignedSeat = asignedSeat;
    }
    
    
}
