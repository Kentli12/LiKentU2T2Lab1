public class Point {
    //instances variables
    private int x;
    private int y;

    //constructor that accepts both values
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    //constructor that accepts one value
    public Point (int num) {
        x = num;
        y = num;
    }

    //constructor that can accepts tno parameters
    public Point (){
        x = 0;
        y = 0;
    }

    //getter methods
    public int getX () {return x;}
    public int getY () {return y;}

    // setter methods
    public void setX (int newX){x = newX;}
    public void setY (int newY){y = newY;}
    public String coordinate () {return "(" + x + ", "+ y + ")";}


    public String quadrant () {
        String quadrant;
        if (x == 0 && y == 0) {
            quadrant = "origin";
        } else if (x == 0 || y == 0) {
            quadrant = "on an axis";
        } else if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else {
            quadrant = "IV";
        }
        return quadrant;
      }
    }



