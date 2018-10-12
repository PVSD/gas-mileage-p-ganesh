package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {
    public int milesPerGallon;
    public double gallons=0.0;

    public Automobile (int a)
    {
        milesPerGallon = a;
    }
    public void fillUp (int b)
    {
        gallons =+ b;
    }
    public void takeTrip (int c)
    {
        gallons = gallons - c/milesPerGallon;
    }
    public double reportFuel ()
    {
        return gallons;
    }
}
