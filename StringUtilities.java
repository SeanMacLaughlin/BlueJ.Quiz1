
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return (baseValue + valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuffer rev = new StringBuffer(valueToBeReversed);
        rev.reverse();
        
        String output = rev.toString();
        return output;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int pos;
        int len;
        if(word.length() % 2 == 0) {
            pos = word.length() / 2 - 1;
            len = 2;
        } else {
            pos = word.length() /2;
            len = 1;
        }
       
        String output = word.substring(pos, pos + len);
        char outfield = output.charAt(0);
        return outfield;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder stickStickly = new StringBuilder();
        char[] removal = value.toCharArray();
        for(int i=0; i<removal.length; i++){
            if(removal[i] == charToRemove){

            } else {
                stickStickly.append(removal[i]);
            }
        }
        return stickStickly.toString();
    }
    

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String last = sentence.substring(sentence.lastIndexOf(" ")+1);
        return last;
    }
}
