package week5Curriculum.classActivity1;

public class NotLambdaExpression {
    public static void main(String[] args) {
        int width = 10;

        // do this first without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable(){
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();

        // do this after
        // 1A1 with lambda expression it gives less line of code to achieve same result
        Drawable d2 = ()-> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
