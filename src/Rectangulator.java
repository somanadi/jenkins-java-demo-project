public class Rectangulator{
	public status void main(String[] args) {
		int length=Interger.parseInt(arg[0]);
		int width= Interger.parseInt(arg[1]);

		Rectanglle myRectangle=new Rectangle(lenght,width);
		String output= String.format(""*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());

		System.out.println(output);
}

}

