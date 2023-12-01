public class DiceRoller {

  private int numDiceOneSides;
  private int numDiceTwoSides;
  public static int TOTAL;

  public DiceRoller() {
    this(6, 6);
  }

  public DiceRoller(int numDiceOneSides, int numDiceTwoSides) {
    this.numDiceOneSides = numDiceTwoSides;
    this.numDiceTwoSides = numDiceTwoSides;
  }

  public int randInt(int startRange, int endRange) {
    int range = endRange - startRange;
    return (int) Math.random() * range + startRange;
  }
  
  public int rollDice() {
    // initial roll, two dice
    // if one die rolls maximum, roll singular die again
    // take higher number from both dice

    int diceOneTotal = 0;
    int diceTwoTotal = 0;

    // DICE ONE
    do {

      int diceOneRoll = randInt(1, numDiceOneSides);

      if (diceOneRoll == numDiceOneSides) {
        diceOneTotal += diceOneRoll;
      } else {
        diceOneTotal += diceOneRoll;
        break;
      }
      
    } while(true);

    // DICE TWO
    do {

      int diceTwoRoll = randInt(1, numDiceTwoSides);

      if (diceTwoRoll == numDiceTwoSides) {
        diceTwoTotal += diceTwoRoll;
      } else {
        diceTwoTotal += diceTwoRoll;
        break;
      }
      
    } while(true);

    if ()

    
  }
  
}