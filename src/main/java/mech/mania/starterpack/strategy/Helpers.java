package mech.mania.starterpack.strategy;
import mech.mania.starterpack.game.character.Character;
import mech.mania.starterpack.game.character.action.AbilityActionType;
import mech.mania.starterpack.game.util.Position;
import java.lang.Math;
import mech.mania.starterpack.game.character.action.AbilityAction;
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
    public static AbilityAction Build(
        String id,
        Position _buildPosition
    )   {return new AbilityAction(id, null, _buildPosition,AbilityActionType.BUILD_BARRICADE);}
    public static AbilityAction Heal(
        String id,
        Character _healTarget
    )   {return new AbilityAction(id, _healTarget.id(), null,AbilityActionType.HEAL);}
    
}