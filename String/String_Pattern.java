class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        StringBuilder sb=new StringBuilder();
        int[] uCount=new int[26];
        int[]lCount=new int[26];
        
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                uCount[ch-'A']++;
            }else{
                lCount[ch-'a']++;
            }
        }
        
        int i=0;
        int j=0;
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
               while(i<26 && uCount[i]==0){
                    i++;
                }
                sb.append(Character.toString((char)(i+'A')));
                uCount[i]--; 
            }else{
               while(j<26 && lCount[j]==0){
                    j++;
                }
                sb.append(Character.toString((char)(j+'a')));
                lCount[j]--;
            }
        }
        return sb.toString();
    }
}
