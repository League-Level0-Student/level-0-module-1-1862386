
public class Badger {
	public static void main(String[] args) {
		for (int r = 0; r < 5; r++) {

			for (int i = 0; i < 10; i++) {
				System.out.println("badger");

			}

			if (r == 3) {
				for (int h = 0; h < 2; h++)
					
				{
					System.out.println("Snake");
				}
			}

			if (r != 3) {
				for (int k = 0; k < 2; k++) {

					System.out.println("Mushroom");
				}
			}

		}
	}
}