package StringCalculator;

import java.util.Objects;

public class StringCalculator {

    public int addInt(String numbers){

        int sum = 0;
        char delimiter = ',';

        if (numbers.isEmpty()){
            return 0;
        }

        else if (numbers.length() == 1){
            return Integer.parseInt(numbers);
        }

        else {
            if (numbers.charAt(0) == '\n' || numbers.charAt(numbers.length()-1) == '\n' ){
                return 0; //should be exception message or something
            }

            if (numbers.charAt(0) == '/'){
                delimiter = numbers.charAt(2);
                if (delimiter != ',') {
                    for (int i = 0; i < numbers.length(); i++){
                        if (numbers.charAt(i) == delimiter && numbers.charAt(i+1) != '\n'){
                            System.out.println(numbers.charAt(i));
                            sum += Integer.parseInt(String.valueOf(numbers.charAt(i-1)));
                            sum += Integer.parseInt(String.valueOf(numbers.charAt(i+1)));
                        }
                    }
                    return sum;
                }
            }

            else{
                for (int i = 0; i < numbers.length(); i++){
                    String number = numbers.substring(i, i+1);
                    if (!number.equals(",") && !number.equals("\n")){
                        sum += Integer.parseInt(number);
                    }
                }
            }

        }
        return sum;
    }
}
