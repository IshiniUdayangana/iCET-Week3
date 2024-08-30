import java.util.*;
class Coursework3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t  ___                       _     _____         _     _");
		System.out.println("\t\t / __|                     | |   | ____|       | |   (_)");
		System.out.println("\t\t| (__  _ __ ___   __ _ _ __| |_  | |__ __ _ ___| |__  _  ___  _ __");
		System.out.println("\t\t \\__ \\| '_ ` _  \\/ _` | `__| __| |  __/  ` / __| '_ \\| |/ _ \\| '_ \\ ");
		System.out.println("\t\t ___) | | | | | | (_| | |  | |_  | | | (_| \\__ \\ | | | | (_) | | | |");
		System.out.println("\t\t|____/|_| |_| |_|\\__,_|_|   \\__| |_|  \\__,_|___/_| |_|_|\\___/|_| |_|");
		
		System.out.print("\n\n\t\tDate : ");
		String date = input.next();
		
		System.out.print("\n\t\tCutomer Name : ");
		String name = input.next();
		
		System.out.println("\n\t\t____________________________________________________________________");
		
		System.out.println("\n\n\t\t\t\t _____    ___ _    _     _");
		System.out.println("\t\t\t\t|_   _|__/ __| |_ (_)_ _| |_ ___ ");
		System.out.println("\t\t\t\t  | ||___\\__ \\ ' \\| | '_|  _(_-<");
		System.out.println("\t\t\t\t  |_|    |___/_||_|_|_|  \\__/__/\n");
		
		int noTShirts = 0;
		double TunitPrice = 0;
		float TdiscountRate = 0;
		int tr_len = 0, Tuni_len = 0, Tdis_len = 0;
		try{
			while (true){
				System.out.print("\n\n\t\tNumber of T-Shirts : ");
				noTShirts = input.nextInt();
				tr_len = String.valueOf(noTShirts).length();
				
				if (noTShirts >= 0){
					System.out.print("\n\t\tUnit Price of T-Shirts : ");
					TunitPrice = input.nextDouble();
					Tuni_len = String.valueOf(Math.round(TunitPrice*100.0)/100.0).length();
					
					if (TunitPrice >= 0){
						System.out.print("\n\t\tDiscount Rate (%) : ");
						TdiscountRate = input.nextFloat();
						Tdis_len = String.valueOf(TdiscountRate).length();
						
						if (TdiscountRate >= 0 && TdiscountRate <= 100){
							break;
						}
					}else{
						System.out.println("\t\tInvalid input");
					}
				}else{
					System.out.println("\t\tInvalid input");
				}
			}
		}catch (Exception e){
			System.out.println("\t\tInvalid input. Please input a numeric value");
		}
		
		double TShirtsAmount = TunitPrice * noTShirts - TdiscountRate / 100;
		int Tam_len = String.valueOf(Math.round(TShirtsAmount*100.0)/100.0).length();
		String TQtySpaces = " ".repeat(13 - tr_len);
		String TUniSpaces = " ".repeat(19 - Tuni_len);
		String TAmSpaces = " ".repeat(19 - Tam_len);
		
		System.out.println("\n\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.println("\t\t|      Description       |     QTY     |     Unit Price     |       Amount       |");
		System.out.println("\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.printf ("\t\t|        T-Shirt         |%d%s|%.2f%s|%.2f%s|", noTShirts,TQtySpaces,TunitPrice,TUniSpaces, TShirtsAmount, TAmSpaces);
		System.out.println("\n\t\t+------------------------+-------------+--------------------+--------------------+");
		
		System.out.println("\n\t\t___________________________________________________________________________________");
		
		System.out.println("\n\n\t\t\t\t _____");
		System.out.println("\t\t\t\t|_   _| _ ___ _  _ ___ ___ _ _ ___");
		System.out.println("\t\t\t\t  | || '_/ _ \\ || (_-</ -_) '_(_-<");
		System.out.println("\t\t\t\t  |_||_| \\___/\\_,_/__/\\___|_| /__/\n");
		
		int noTrousers = 0;
		double TrUnitPrice = 0;
		float TrDiscountRate = 0;
		int Tr_len = 0, Tr_uni_len = 0, Tr_dis_len = 0;
		try{
			while (true){
				System.out.print("\n\n\t\tNumber of Trousers : ");
				noTrousers = input.nextInt();
				tr_len = String.valueOf(noTrousers).length();
				
				if (noTrousers >= 0){
					System.out.print("\n\t\tUnit Price of a Trouser : ");
					TrUnitPrice = input.nextDouble();
					Tr_uni_len = String.valueOf(Math.round(TrUnitPrice*100.0)/100.0).length();
					
					if (TrUnitPrice >= 0){
						System.out.print("\n\t\tDiscount Rate (%) : ");
						TrDiscountRate = input.nextFloat();
						Tr_dis_len = String.valueOf(TrDiscountRate).length();
						
						if (TrDiscountRate >= 0 && TrDiscountRate <= 100){
							break;
						}
					}else{
						System.out.println("\t\tInvalid input");
					}
				}else{
					System.out.println("\t\tInvalid input");
				}
			}
		}catch (Exception e){
			System.out.println("\t\tInvalid input. Please input a numeric value");
		}
		
		double TrousersAmount = TrUnitPrice * noTrousers - TrDiscountRate / 100;
		int Tr_am_len = String.valueOf(Math.round(TrousersAmount*100.0)/100.0).length();
		String TrQtySpaces = " ".repeat(12 - Tr_len);
		String TrUniSpaces = " ".repeat(19 - Tr_uni_len);
		String TrAmSpaces = " ".repeat(20 - Tr_am_len);
		
		System.out.println("\n\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.println("\t\t|      Description       |     QTY     |     Unit Price     |       Amount       |");
		System.out.println("\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.printf ("\t\t|        Trouser         |%d%s|%.2f%s|%.2f%s|", noTrousers,TrQtySpaces,TrUnitPrice,TrUniSpaces, TrousersAmount, TrAmSpaces);
		System.out.println("\n\t\t+------------------------+-------------+--------------------+--------------------+");
		
		System.out.println("\n\t\t___________________________________________________________________________________");

		System.out.println("\n\t\t\t\t   ___ _    _     _");
		System.out.println("\t\t\t\t  / __| |_ (_)_ _| |_ ___ ");
		System.out.println("\t\t\t\t  \\__ \\ ' \\| | '_|  _(_-<");
		System.out.println("\t\t\t\t  |___/_||_|_|_|  \\__/__/");
		
		
		int noShirts = 0;
		double SUnitPrice = 0;
		float SDiscountRate = 0;
		int S_len = 0, S_uni_len = 0, S_dis_len = 0;
		try{
			while (true){
				System.out.print("\n\n\t\tNumber of Shirts : ");
				noShirts = input.nextInt();
				S_len = String.valueOf(noShirts).length();
				
				if (noShirts >= 0){
					System.out.print("\n\t\tUnit Price of a Shirt : ");
					SUnitPrice = input.nextDouble();
					S_uni_len = String.valueOf(Math.round(SUnitPrice*100.0)/100.0).length();
					
					if (SUnitPrice >= 0){
						System.out.print("\n\t\tDiscount Rate (%) : ");
						SDiscountRate = input.nextFloat();
						S_dis_len = String.valueOf(SDiscountRate).length();
						
						if (TdiscountRate >= 0 && TdiscountRate <= 100){
							break;
						}
					}else{
						System.out.println("\t\tInvalid input");
					}
				}else{
					System.out.println("\t\tInvalid input");
				}
			}
		}catch (Exception e){
			System.out.println("\t\tInvalid input. Please input a numeric value");
		}
		
		double ShirtsAmount = SUnitPrice * noShirts - SDiscountRate / 100;
		int S_am_len = String.valueOf(Math.round(ShirtsAmount*100.0)/100.0).length();
		String SQtySpaces = " ".repeat(13 - S_len);
		String SUniSpaces = " ".repeat(19 - S_uni_len);
		String SAmSpaces = " ".repeat(20 - S_am_len);
		
		System.out.println("\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.println("\t\t|      Description       |     QTY     |     Unit Price     |       Amount       |");
		System.out.println("\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.printf ("\t\t|        Shirt           |%d%s|%.2f%s|%.2f%s|", noShirts,SQtySpaces,SUnitPrice,SUniSpaces, ShirtsAmount, SAmSpaces);
		System.out.println("\n\t\t+------------------------+-------------+--------------------+--------------------+");
		
		System.out.println("\n\t\t___________________________________________________________________________________");
		
		System.out.println("\n\n\t\t\t\t ___ _            _");
		System.out.println("\t\t\t\t/ __| |_  ___ _ _| |_ ___");
		System.out.println("\t\t\t\t\\__ \\ ' \\/ _ \\ '_|  _(_-<");
		System.out.println("\t\t\t\t|___/_||_\\___/_|  \\__/__/\n");
		
		
		int noShorts = 0;
		double ShUnitPrice = 0;
		float ShDiscountRate = 0;
		int sh_len = 0, sh_uni_len = 0, sh_dis_len = 0;
		try{
			while (true){
				System.out.print("\n\n\t\tNumber of Shorts : ");
				noShorts = input.nextInt();
				sh_len = String.valueOf(noTShirts).length();
				
				if (noTShirts >= 0){
					System.out.print("\n\t\tUnit Price of a Shorts : ");
					ShUnitPrice = input.nextDouble();
					sh_uni_len = String.valueOf(Math.round(ShUnitPrice*100.0)/100.0).length();
					
					if (TunitPrice >= 0){
						System.out.print("\n\t\tDiscount Rate (%) : ");
						ShDiscountRate = input.nextFloat();
						sh_dis_len = String.valueOf(ShDiscountRate).length();
						
						if (ShDiscountRate >= 0 && ShDiscountRate <= 100){
							break;
						}
					}else{
						System.out.println("\t\tInvalid input");
					}
				}else{
					System.out.println("\t\tInvalid input");
				}
			}
		}catch (Exception e){
			System.out.println("\t\tInvalid input. Please input a numeric value");
		}
		
		double ShortsAmount = ShUnitPrice * noShorts - ShDiscountRate / 100;
		int sh_am_len = String.valueOf(Math.round(ShortsAmount*100.0)/100.0).length();
		String ShQtySpaces = " ".repeat(13 - sh_len);
		String ShUniSpaces = " ".repeat(19 - sh_uni_len);
		String ShAmSpaces = " ".repeat(19 - sh_am_len);
		
		System.out.println("\n\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.println("\t\t|      Description       |     QTY     |     Unit Price     |       Amount       |");
		System.out.println("\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.printf ("\t\t|        Shorts          |%d%s|%.2f%s|%.2f%s|", noTShirts,ShQtySpaces,ShUnitPrice,ShUniSpaces, ShortsAmount, ShAmSpaces);
		System.out.println("\n\t\t+------------------------+-------------+--------------------+--------------------+");
		
		System.out.println("\n\t\t___________________________________________________________________________________");
		
		double total = TShirtsAmount + TrousersAmount + ShirtsAmount + ShortsAmount;
		int tot_len = String.valueOf(Math.round(total*100.0)/100.0).length();
		String totalSpaces = " ".repeat(19 - tot_len);
		
		System.out.println("\n\n\t\t+--------------------------------------------------------------------------------+");
		System.out.println("\t\t|                 ___ _ _ _   ___                                                |");
		System.out.println("\t\t|                | _ |_) | | / __|_  _ _ __  _ __  __ _ _ _ _  _                 |");
		System.out.println("\t\t|                | _ \\ | | | \\__ \\ || | '  \\| '  \\/ _` | '_| || |                |");
		System.out.println("\t\t|                |___/_|_|_| |___/\\_,_|_|_|_|_|_|_\\__,_|_|  \\_, |                |");
		System.out.println("\t\t|                                                            |__/                |");
		System.out.println("\t\t|                                                                                |");
		System.out.printf ("\t\t| Customer : %s                                     Date : %s        |\n",name,date);
		System.out.println("\t\t|                                                                                |");
		System.out.println("\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.println("\t\t|      Description       |     QTY     |     Unit Price     |       Amount       |");
		System.out.println("\t\t+------------------------+-------------+--------------------+--------------------+");
		System.out.printf ("\t\t|        T-Shirt         |%d%s|%.2f%s|%.2f%s|\n", noTShirts,TQtySpaces,TunitPrice,TUniSpaces, TShirtsAmount, TAmSpaces);
		System.out.println("\t\t|                        |             |                    |                    |");
		System.out.printf ("\t\t|        Trouser         |%d%s|%.2f%s|%.2f%s|\n", noTrousers,TrQtySpaces,TrUnitPrice,TrUniSpaces, TrousersAmount, TrAmSpaces);
		System.out.println("\t\t|                        |             |                    |                    |");
		System.out.printf ("\t\t|        Shirt           |%d%s|%.2f%s|%.2f%s|\n", noShirts,SQtySpaces,SUnitPrice,SUniSpaces, ShirtsAmount, SAmSpaces);
		System.out.println("\t\t|                        |             |                    |                    |");
		System.out.printf ("\t\t|        Shorts          |%d%s|%.2f%s|%.2f%s|\n", noTShirts,ShQtySpaces,ShUnitPrice,ShUniSpaces, ShortsAmount, ShAmSpaces);
		System.out.println("\t\t|                        |             |                    |                    |");
		System.out.println("\t\t+--------------------------------------------------------------------------------+");
		System.out.printf ("\t\t|          Total                                            |%.2f%s|\n", total,totalSpaces);
		System.out.println("\t\t+--------------------------------------------------------------------------------+");
		
	}
}
