package com.hz;

public class Adapter {
    public Boolean checkValue(String value) {
        String[] adapter = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        Boolean answer = false;

        for (String acceptedValue : adapter) {
            if (!answer) {
                answer = value.equals(acceptedValue);
            }
        }
        return answer;
    }
}
