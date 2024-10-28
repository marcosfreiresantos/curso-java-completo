package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    // SimpleDateFormat, está como static para não que não seja estanciado um novo
    // SimpleDateFormat para cada objeto reservation que minha aplication tiver, só preciso de um.
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getChekin() {
        return checkIn;
    }

    public Date getCheckou() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut =  checkOut;
    }
    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("Room ");
     sb.append(roomNumber);
     sb.append(", check-in: ");
     sb.append(sdf.format(checkIn));
     sb.append(", check-out: ");
     sb.append(sdf.format(checkOut));
     sb.append(", ");
     sb.append(duration());
     sb.append(" nights");
     return sb.toString();
    }
}



















