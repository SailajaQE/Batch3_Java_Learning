package teamex1;
public class LetterCount {
    public static void main(String[] args) {
        String letter= "TeamE Group Study";
        int lowerCount =0;
        int upperCount = 0;
        int spaceCount =0;
        for (int i=0;i<letter.length();i++)
        {
            char ch = letter.charAt(i);
            if (ch == 32) {
                spaceCount++;
            }
            if (ch>=65 && ch <=90)
            {
                upperCount++;
            }
            else if (ch>=97 && ch <= 122)
            {
                lowerCount++;
            }

        }
        System.out.println("lower Case Letter Count:   "+ lowerCount);
        System.out.println("Upper Case Letter Count:   "+upperCount);
        System.out.println("Space Count:   "+spaceCount);
    }
}
