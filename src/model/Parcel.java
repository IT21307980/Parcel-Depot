package model;

import java.io.Serializable;

public class Parcel implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String parcelID;
	private int daysInDepot;
	private double weight, length, width, height;
	
	
	// Constructor
    public Parcel(String parcelID, double weight, int daysInDepot, int length, int width, int height) {
        this.parcelID = parcelID;
        this.weight = weight;
        this.daysInDepot = daysInDepot;
        this.length = length;
        this.width = width;
        this.height = height;
    }

	public String getParcelID()
	{
		return parcelID;
	}

	public void setParcelID(String parcelID)
	{
		this.parcelID = parcelID;
	}

	public int getDaysInDepot()
	{
		return daysInDepot;
	}

	public void setDaysInDepot(int daysInDepot)
	{
		this.daysInDepot = daysInDepot;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	@Override
	public int hashCode()
	{
		return parcelID.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Parcel that && parcelID.equals(that.parcelID);

	}

	@Override
	public String toString()
	{
        return "Parcel[ID=" + parcelID + ", Weight=" + weight + ", DaysInDepot=" + daysInDepot + "]";
	}
}