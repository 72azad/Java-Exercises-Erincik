public class Main {
            public static void main(String[] args) {
                String input1 = "codingschool";
                String reversed1 = reverseString(input1);
                System.out.println("Reversed: " + reversed1);

                String input2 = "mustermann";
                String reversed2 = reverseString(input2);
                System.out.println("Reversed: " + reversed2);
            }

            public static String reverseString(String input) {
                StringBuilder reversed = new StringBuilder();

                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed.append(input.charAt(i));
                }

                return reversed.toString();
            }
        }