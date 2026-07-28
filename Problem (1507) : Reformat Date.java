import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String dayStr = parts[0];
        String monthStr = parts[1];
        String yearStr = parts[2];

        // Map months to two-digit numbers
        Map<String, String> monthMap = new HashMap<>();
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                          "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < months.length; i++) {
            monthMap.put(months[i], String.format("%02d", i + 1));
        }

        // Extract day number (removing the suffix)
        String dayNum = dayStr.replaceAll("[a-z]", "");
        if (dayNum.length() == 1) {
            dayNum = "0" + dayNum;
        }

        return yearStr + "-" + monthMap.get(monthStr) + "-" + dayNum;
    }
}
