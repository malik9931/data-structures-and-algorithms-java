package hashtable;

public class RepeatedWord {

    public String repeatedWord(String str){
        String[] splattedString = str.split(" ");
        String uniCases;
        Hashtable hashTable = new Hashtable();
        for (int i = 0; i < splattedString.length ; i++) {
            if(splattedString[i].endsWith(".") || splattedString[i].endsWith(",")){
                uniCases = splattedString[i].substring(0, splattedString[i].length() - 1);
            }else {
                uniCases = splattedString[i];
            }

            if(!hashTable.add(uniCases.toLowerCase(), splattedString[i]))
            {
                return uniCases.toLowerCase();
            }
        }
        return "Not Found a repeated word";
    }
}
