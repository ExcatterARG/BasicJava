import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int maxNumberOfBalloons(String text) {
        int letterB=0,letterA=0,letterL=0,letterO=0,letterN=0;
        for(char ch:text.toCharArray()){
            switch(ch){
                case 'B':
                    ++letterB;
                    break;
                case 'A':
                    ++letterA;
                    break;
                case 'L':
                    ++letterL;
                    break;
                case 'O':
                    ++letterO;
                    break;
                case 'N':
                    ++letterN;
                    break;
            }
        }

        return Collections.min(Arrays.asList(letterB,letterA,letterL/2,letterO/2,letterN));
    }
}
