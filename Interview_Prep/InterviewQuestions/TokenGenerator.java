package InterviewQuestions;

import java.util.Random;

public class TokenGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int token = 1000 + random.nextInt(9000);
        System.out.println("The generated token number is: " + token);
    }
}

// random.nextInt(9000) → produces a random integer between 0 and 8999.

// 1000 + ... → shifts the range, ensuring the final number falls between 1000
// and 9999.
