package edu.rpi.legup.puzzle.treetent.rules;

import edu.rpi.legup.model.gameboard.PuzzleElement;
import edu.rpi.legup.model.rules.BasicRule;
import edu.rpi.legup.model.tree.TreeTransition;

public class TentForTreeBasicRule extends BasicRule
{

    public TentForTreeBasicRule()
    {
        super("Tent for Tree", "If only one unlinked tent and no blank cells are adjacent to an unlinked tree, the unlinked tree must link to the unlinked tent.", "images/treetent/NewTreeLink.png");
    }

    /**
     * Checks whether the child node logically follows from the parent node
     * at the specific puzzleElement index using this rule
     *
     * @param transition   transition to check
     * @param puzzleElement equivalent puzzleElement
     *
     * @return null if the child node logically follow from the parent node at the specified puzzleElement,
     * otherwise error message
     */
    @Override
    public String checkRuleRawAt(TreeTransition transition, PuzzleElement puzzleElement)
    {
        return null;
    }

    /**
     * Checks whether the child node logically follows from the parent node using this rule
     * and if so will perform the default application of the rule
     *
     * @param transition transition to apply default application
     *
     * @return true if the child node logically follow from the parent node and accepts the changes
     * to the board, otherwise false
     */
    @Override
    public boolean doDefaultApplication(TreeTransition transition)
    {
        return false;
    }

    /**
     * Checks whether the child node logically follows from the parent node at the
     * specific puzzleElement index using this rule and if so will perform the default application of the rule
     *
     * @param transition   transition to apply default application
     * @param puzzleElement equivalent puzzleElement
     *
     * @return true if the child node logically follow from the parent node and accepts the changes
     * to the board, otherwise false
     */
    @Override
    public boolean doDefaultApplicationAt(TreeTransition transition, PuzzleElement puzzleElement)
    {
        return false;
    }
}