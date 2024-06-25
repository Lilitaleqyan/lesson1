package Rectangle;

class Rectangle {
    private  final int width;
    private final int height;
    Rectangle (int width, int height) {
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }



    public int getHeight() {
        return height;
    }


}
class  Main {
    public static void main (String[] args) {
        Rectangle rect=new Rectangle(12,18);
        System.out.println("Area="+rect.getWidth() * rect.getHeight());
        System.out.println("Perimeter="+2*(rect.getWidth()+rect.getWidth()));
    }
}