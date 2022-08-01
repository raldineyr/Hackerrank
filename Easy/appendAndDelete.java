class Result
{

    public static String appendAndDelete(String s, String t, int k)
    {
        int valueS = 0, valueT = 0, minimumOperationNeeded = 0;
        
        while (valueS < s.length() && valueT < t.length())
        {
            if (s.charAt(valueS) == s.charAt(valueT))
            { 
                valueS++;
                valueT++;
            }
            else 
            {
                break;
            }
        }
        
        minimumOperationNeeded = ((valueS - s.length()) + (valueT - t.length()));
        
        if (k < minimumOperationNeeded ) return "No";
        else if (k >= (valueS + valueT)) return "Yes";
        else if ((k - minimumOperationNeeded) % 2 == 0) return "Yes";
        return "No";

    }

}
