public class Main {
            public static void main(String[] args) {
                int chestCircumference = 90;
                int height = 185;
                int gender = 0;

                int clothingSize = calculateClothingSize(chestCircumference, height, gender);
                System.out.println("Konfektionsgröße: " + clothingSize);
            }

            public static int calculateClothingSize(int chestCircumference, int height, int gender)  {
                int clothingSize = chestCircumference / 2;

                if (gender == 1) {
                    if (height >= 164 && height <= 170) {
                        clothingSize -= 6;

                    } else if (height > 170) {
                        clothingSize = clothingSize * 2 - 6;

                    } else {
                        clothingSize /= 2;
                    }
                }
                return clothingSize;
            }
        }
