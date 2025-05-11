package designPattern.flyweightPattern;

// ConcreteFlyweight
public class CharacterGlyph implements Glyph{


    private final char symbol; // Intrinsic state


    public CharacterGlyph(char symbol) {
        this.symbol = symbol;
    }

//    @Override
//    public void render(String position) {
//        System.out.println("Rendering '" + symbol +  "' at " + position);
//    }

    @Override
    public void render(String position) {
        System.out.println("Rendering '" + symbol +  "' at " + position +
                " | Glyph ID: " + System.identityHashCode(this));
    }
}
