class MarkStringEnds {
    public static String[] markStringEnds(String originalString) {
        // write your code below this line
        String[] out = new String [2];

        String firstElement = originalString.substring(0,1);
        String firstElementUpp = firstElement.toUpperCase();
        String firstWord = originalString.substring(1,originalString.length());
        String first = firstElementUpp+firstWord;
        out[0]=first;

        String secondWord = originalString.substring(0, originalString.length()-1);
        String lastElement = originalString.substring(originalString.length()-1);
        String lastElementDawn = lastElement.toUpperCase();
        String second = secondWord+lastElementDawn;
        out[1]=second;

        return out;
        // write your code above this line
    }
}
class BigSmall {
    public static void main (String[] args){
        String in = "hello";
        String [] outMain;

        outMain = MarkStringEnds.markStringEnds(in);
        System.out.println(outMain);
    }
}