/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem;

/**
 *
 * @author alave
 */
public class EventDemo {
    
public static void main(String[] args) {
int guests =
CarlysEvent.getNumberOfGuests();
String eventNumber =
CarlysEvent.getEventNumber();
Event event = new Event();
event.setEventNumber(eventNumber);
event.setGuests(guests);
CarlysEvent.displayMotto(event);
}


}
