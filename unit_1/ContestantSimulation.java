import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ContestSimulation {
    public static void main(String[] args) {
        // Step 3.1: Create Contestants
        ArrayList<Contestant> contestants = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            contestants.add(new Contestant("Contestant" + i));
        }

        // Step 3.2: Simulate a Round
        simulateRound(contestants);

        // Step 3.3: Display positions after the round
        for (Contestant contestant : contestants) {
            System.out.println(contestant.getName() + ": Position " + contestant.getPosition());
        }
    }

    private static void simulateRound(ArrayList<Contestant> contestants) {
        Collections.shuffle(contestants, new Random());
        for (int i = 0; i < contestants.size(); i++) {
            boolean isCorrectAnswer = flipCoin();
            if (isCorrectAnswer) {
                contestants.get(i).setPosition(0); // Move to the front
            } else {
                contestants.get(i).setPosition(contestants.size() - 1); // Move to the end
            }
        }
    }

    private static boolean flipCoin() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
