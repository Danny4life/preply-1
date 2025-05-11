package designPattern.flyweightPattern;

public class FlyweightDemo {

    public static void main(String[] args) {

        GlyphFactory factory = new GlyphFactory();

        String document = "flyweightflyweight";

        for(int i = 0; i < document.length(); i++){
            char ch = document.charAt(i);
            Glyph glyph = factory.getGlyph(ch);
            glyph.render("Position " + i);
        }
    }
}
