

public class main{

	public static int bin_dec(String number){
		int dec_value = Integer.parseInt(number, 2);
		return dec_value;
	}
	public static int oct_dec(String number){
		int dec_value = Integer.parseInt(number,8);
		return dec_value;
	}
	public static int hex_dec(String number){
		int dec_value = Integer.parseInt(number, 16);
		return dec_value;
	}
	public static void help(){
		System.out.println("bin-dec (convert a binary number to its decimal value)\n"+
					"oct-dec (convert an octal number to its decimal value)\n"+
					"hex-dec (convert a hexadecimal number to its decimal value)\n");
		return;
	}		   
				
		


		public static void main(String[] args){
		if (args.length < 1) {
			System.out.println("ERROR, enter a valid number of arguments!");
			System.out.println("Type --help for a list of commands");
			return;
		}
			String command = args[0];

			if (command.equals("--help")){
				help();
				return;
			}

			if (args.length < 2){
				System.out.println("Error: second argument expected after your first argument!");
				System.out.println("Type --help for a list of commands.");
				return;
			}
			String number = args[1];
			
			try{
				
				switch(command){ 
					case "bin-dec":
						System.out.println("Your input: " + number);
						System.out.println("Your decimal value: " + bin_dec(number));
						System.exit(0);
					case "oct-dec":
						System.out.println("Your input: " + number);
						System.out.println("Your decimal value: " + oct_dec(number));
						System.exit(0);
					case "hex-dec":
						System.out.println("Your input: " + number);
						System.out.println("Your decimal value: " + hex_dec(number));
						System.exit(0);
					default:
						System.out.println("Invalid argument: " + command);
						System.exit(0);
				}
			}catch(Exception e){
				System.out.println("Invalid value!");
				System.exit(0);
			}
		
		}
	}

				



