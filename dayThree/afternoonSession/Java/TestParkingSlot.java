import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ParkingSystem{

    @Test
public void TestToCheckIfThereIsAParkingLotSpace(){
int [] slots = new int [20];
boolean expected = true;
actual = ParkingSlot.Slots(slots);
assertEquals(expected,false);


}


    @Test
public void TestToCheckIfSlotIsTakenOrEmpty(){
int [] slots = new int [20];
String expected = "Slot is Empty";
actual = ParkingSlot.Slots(slots);
assertEquals(expected,"Slot is taken");



}
