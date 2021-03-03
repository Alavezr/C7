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
class Event {
    public static int PRICE_PER_GUEST = 35;
public static int CUT_OFF = 50;
private String eNumber;
private int numGuests;
private double price;
public Event()
{
eNumber = "Not Set";
numGuests = 0;
price = 0;
}
public void setEventNumber(String eNumber)
{
this.eNumber = eNumber;
}
public void setGuests(int numguests)
{
this.numGuests = numguests;
computePrice(numguests);
}
private void computePrice(int numguests)
{
price = numguests*PRICE_PER_GUEST;
}
public String getEventNumber()
{
return eNumber;
}
public int getGuests()
{
return numGuests;
}
public double getPrice()
{
return price;
}
}
