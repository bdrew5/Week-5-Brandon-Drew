import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;
    
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delList = new ArrayList<String>();
        for (int i = 0; i < tokens.length; i++){
            if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
                delList.add(tokens[i]);
            }
        }
        return delList;
    }

    public boolean isBalanced(ArrayList<String> delimiters){
        int numOpenDel = 0;
        int numCloseDel = 0;
        for(int i = 0; i < delimiters.size(); i++) {
            if (delimiters.get(i).equals(openDel)) {
                numOpenDel++;
            }
            if (delimiters.get(i).equals(closeDel)) {
                numCloseDel++;
            }
            if (numCloseDel > numOpenDel) {
                return false;
            }
        }
        if(numCloseDel==numOpenDel){
            return true;
        }
        else
            return false;
    }

}
