package MultiThreading_01;
import java .util.*;
public class KBCGame {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Question> questions = new ArrayList<>();

	        
	        questions.add(new Question("What is the capital of India?",
	            new String[]{"Delhi", "Mumbai", "Kolkata", "Chennai"}, 0));

	        questions.add(new Question("Which planet is known as the Red Planet?",
	            new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 1));

	        questions.add(new Question("Who wrote the national anthem of India?",
	            new String[]{"Rabindranath Tagore", "Mahatma Gandhi", "Nehru", "Subhash Chandra Bose"}, 0));
	        questions.add(new Question("What is the capital of India?",
	        	    new String[]{"New Delhi", "Mumbai", "Kolkata", "Chennai"}, 0));

	        	questions.add(new Question("Who is known as the Father of the Nation (India)?",
	        	    new String[]{"Subhash Chandra Bose", "Jawaharlal Nehru", "Mahatma Gandhi", "Bhagat Singh"}, 2));

	        	questions.add(new Question("Which is the largest planet in our solar system?",
	        	    new String[]{"Earth", "Saturn", "Jupiter", "Mars"}, 2));

	        	questions.add(new Question("What is the national flower of India?",
	        	    new String[]{"Rose", "Lotus", "Sunflower", "Marigold"}, 1));

	        	questions.add(new Question("Which Indian cricketer is known as 'Master Blaster'?",
	        	    new String[]{"Virat Kohli", "MS Dhoni", "Kapil Dev", "Sachin Tendulkar"}, 3));

	        	questions.add(new Question("What is the chemical symbol for water?",
	        	    new String[]{"O2", "H2", "H2O", "HO2"}, 2));

	        	questions.add(new Question("Who wrote the Ramayana?",
	        	    new String[]{"Ved Vyasa", "Tulsidas", "Valmiki", "Kalidasa"}, 2));

	        	questions.add(new Question("Which festival is known as the festival of lights?",
	        	    new String[]{"Holi", "Diwali", "Eid", "Raksha Bandhan"}, 1));

	        	questions.add(new Question("Which is the longest river in the world?",
	        	    new String[]{"Amazon", "Yangtze", "Ganges", "Nile"}, 3));

	        	questions.add(new Question("In which year did India get independence?",
	        	    new String[]{"1945", "1947", "1950", "1942"}, 1));

	        	questions.add(new Question("What is the currency of Japan?",
	        	    new String[]{"Yuan", "Yen", "Won", "Ringgit"}, 1));

	        	questions.add(new Question("Who discovered gravity?",
	        	    new String[]{"Albert Einstein", "Isaac Newton", "Galileo", "Kepler"}, 1));

	        	questions.add(new Question("Which is the smallest continent?",
	        	    new String[]{"Australia", "Europe", "Antarctica", "South America"}, 0));

	        	questions.add(new Question("Which state is known as the 'Land of Five Rivers'?",
	        	    new String[]{"Haryana", "Punjab", "Uttar Pradesh", "Bihar"}, 1));

	        	questions.add(new Question("Which is the hardest natural substance?",
	        	    new String[]{"Gold", "Iron", "Diamond", "Graphite"}, 2));

	        	questions.add(new Question("Who was the first President of India?",
	        	    new String[]{"Dr. Rajendra Prasad", "Dr. Radhakrishnan", "Jawaharlal Nehru", "Zakir Hussain"}, 0));

	        	questions.add(new Question("What is the boiling point of water?",
	        	    new String[]{"90°C", "95°C", "100°C", "105°C"}, 2));

	        	questions.add(new Question("What does CPU stand for?",
	        	    new String[]{"Central Performance Unit", "Central Processing Unit", "Computer Power Unit", "Control Processing Unit"}, 1));

	        	questions.add(new Question("Which planet is closest to the Sun?",
	        	    new String[]{"Venus", "Earth", "Mercury", "Mars"}, 2));

	        	questions.add(new Question("What is the national animal of India?",
	        	    new String[]{"Elephant", "Tiger", "Lion", "Peacock"}, 1));

	        	questions.add(new Question("Who painted the Mona Lisa?",
	        	    new String[]{"Pablo Picasso", "Leonardo da Vinci", "Van Gogh", "Michelangelo"}, 1));

	        	questions.add(new Question("Which organ purifies our blood?",
	        	    new String[]{"Heart", "Lungs", "Liver", "Kidney"}, 3));

	        	questions.add(new Question("How many players are there in a cricket team?",
	        	    new String[]{"9", "10", "11", "12"}, 2));

	        	questions.add(new Question("Which city is known as the Pink City of India?",
	        	    new String[]{"Udaipur", "Jaipur", "Jodhpur", "Bikaner"}, 1));

	        	questions.add(new Question("What is the national song of India?",
	        	    new String[]{"Jana Gana Mana", "Vande Mataram", "Sare Jahan Se Achha", "Mera Bharat Mahan"}, 1));

	        	questions.add(new Question("Which gas is essential for respiration?",
	        	    new String[]{"Nitrogen", "Oxygen", "Carbon Dioxide", "Hydrogen"}, 1));

	        	questions.add(new Question("Which bird is the fastest on land?",
	        	    new String[]{"Sparrow", "Peacock", "Ostrich", "Penguin"}, 2));

	        	questions.add(new Question("Who is known as the 'Missile Man of India'?",
	        	    new String[]{"APJ Abdul Kalam", "Vikram Sarabhai", "Homi Bhabha", "Ratan Tata"}, 0));

	        	questions.add(new Question("Which is the largest desert in the world?",
	        	    new String[]{"Gobi", "Thar", "Sahara", "Antarctica"}, 3));

	        	questions.add(new Question("Which element is used in bulbs to glow?",
	        	    new String[]{"Oxygen", "Hydrogen", "Nitrogen", "Tungsten"}, 3));

	        
	        Collections.shuffle(questions); // Shuffle the list

	        int score = 0;
	        int totalQuestions = 10;  

	        for (int i = 0; i < totalQuestions; i++) {
	            Question q = questions.get(i);
	            System.out.println("\nQuestion " + (i + 1) + ":");
	            q.display();

	            System.out.print("Your answer (A/B/C/D): ");
	            char userInput = scanner.next().toUpperCase().charAt(0);

	            if (q.isCorrect(userInput)) {
	                System.out.println("✅ Correct!");
	                score++;
	            } else {
	                System.out.println("❌ Wrong! The correct answer was: " +
	                    (char)('A' + q.correctOption) + ": " + q.options[q.correctOption]);
	            }
	        }

	        System.out.println("\nGame Over! Your Score: " + score + " out of " + totalQuestions);
	        scanner.close();
	    }
	}

