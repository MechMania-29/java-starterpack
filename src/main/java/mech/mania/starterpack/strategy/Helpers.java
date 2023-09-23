package mech.mania.starterpack.strategy;
import mech.mania.starterpack.game.character.Character;
import mech.mania.starterpack.game.util.Position;
import java.lang.Math;
public class Helpers{
    public static int ManhattonDistanceFunction(
        Position a,
        Position b
    ) {
        return Math.abs(a.x() - b.x()) + Math.abs(a.y()-b.y());
    }
    public static int ChebyshevDistanceFunction(
        Position a,
        Position b
    ) {
        return Math.max(Math.abs(a.x() - b.x()), Math.abs(a.y()-b.y()));
    }
}
