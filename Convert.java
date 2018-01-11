
public class Convert {

	public void binary(int decimal) {
		int[] store_binary_digits = new int[20];
		int i = 0;
		while (decimal >= 1) {
			store_binary_digits[i] = decimal%2;
			decimal = decimal/2;
			i++;
		}
		for (int j = i-1; j >= 0; j--) {
			System.out.print(store_binary_digits[j]);
		}
		System.out.println("");
	}
	
	public void hex(int decimal) {
		int[] store_hex_digits = new int[20];
		int i = 0;
		while (decimal >= 1) {
			int modulo = decimal%16;
			store_hex_digits[i] = modulo;
			decimal = decimal/16;
			i++;
		}
		for (int j = i-1; j >= 0; j--) {
				if (store_hex_digits[j] == 10) {
				System.out.print('A');
				}
				else if (store_hex_digits[j] == 11) {
					System.out.print('B');
				}
				else if (store_hex_digits[j] == 12) {
					System.out.print('C');
				}
				else if (store_hex_digits[j] == 13) {
					System.out.print('D');
				}
				else if (store_hex_digits[j] == 14) {
					System.out.print('E');
				}
				else if (store_hex_digits[j] == 15) {
					System.out.print('F');
				}
				else {
				System.out.print(store_hex_digits[j]);
				}
			}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Convert number = new Convert();
		int binary = 100;
		int hex = 25;
		System.out.println(binary + " " + "in binary is:");
		number.binary(hex);
		System.out.println(hex + " " + "in hex is:");
		number.hex(25);
	}

}
