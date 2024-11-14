//RENAULT NISSAN INTERVIEW


import java.util.*;

public class wordToNumber {
public static void main (String args[]){
String input= "one, one , five , two , zero";

List <Double> output = convertwordsToNumbers(input);

System.out.println(output);
}



public static List<Double> convertwordsToNumbers(String input){
Map<String, Double> wordToNumber = new HashMap<>();

wordToNumber.put("one", 1.0);
wordToNumber.put("one", 1.0);
wordToNumber.put("two", 2.0);

wordToNumber.put("five", 5.0);

wordToNumber.put("zero", 0.0);


input.stream(input.split(",")).map(wordToNumber::get).collect(Collectors.toList());
 
}

}