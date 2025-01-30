package treePrototypeTest;

import com.laiszig.prototype.treePrototype.PineTree;
import com.laiszig.prototype.treePrototype.PlasticTree;
import com.laiszig.prototype.treePrototype.Position;
import com.laiszig.prototype.treePrototype.Tree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreePrototypesUnitTest {

    @Test
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {
        double mass = 10.0;
        double height = 5.0;
        Position position = new Position(2, 3);
        Position otherPosition = new Position(7, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        assertEquals(position, plasticTree.getPosition());
        assertEquals(otherPosition, anotherPlasticTree.getPosition());
    }

    @Test
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {
        double plasticTreeMass = 12.0;
        double plasticTreeHeight = 6.0;
        Position plasticTreePosition = new Position(1, 2);

        double pineTreeMass = 15.0;
        double pineTreeHeight = 8.0;
        Position pineTreePosition = new Position(4, 5);

        PlasticTree plasticTree = new PlasticTree(plasticTreeMass, plasticTreeHeight);
        plasticTree.setPosition(plasticTreePosition);

        PineTree pineTree = new PineTree(pineTreeMass, pineTreeHeight);
        pineTree.setPosition(pineTreePosition);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).toList();

        PlasticTree plasticTreeClone = (PlasticTree) treeClones.get(0);
        PineTree pineTreeClone = (PineTree) treeClones.get(1);

        assertEquals(plasticTreeHeight, plasticTreeClone.getHeight());
        assertEquals(plasticTreePosition, plasticTreeClone.getPosition());

        assertEquals(pineTreeHeight, pineTreeClone.getHeight());
        assertEquals(pineTreePosition, pineTreeClone.getPosition());
    }
}