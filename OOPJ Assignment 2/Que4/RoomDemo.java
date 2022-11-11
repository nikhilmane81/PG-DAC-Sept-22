/*
. Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three fields. This class
also has a method “volume()” to calculate the volume of this room. Create another class “RoomDemo” which will
use the earlier class, create instances of rooms, and display the volume of room.
*/
class Room
{
	double height;
	double width;
	double breadth;
	void volume(double height, double width, double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
		double volume = (this.height*this.width*this.breadth);
		System.out.println("Volume of room is "+ volume);
	}
}
class RoomDemo
{
	public static void main(String [] args)
	{
		Room obj1 = new Room();
		obj1.volume(34,56,78);
	}
}