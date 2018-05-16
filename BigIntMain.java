package RevisedBigInt;


public class BigIntMain
{
	public static void main(String[] args)
	{
		BigInt b1,b2,b3;
		b1 = new BigInt("-78888ert888888");
		b2 = new BigInt("69999999999");
		b3 = b1.subtract(b2);
		System.out.println(b3);

//
//		b1 = new BigInt("-0");
//		b2 = new BigInt("+0");
//		b3 = b1.add(b2);
//		System.out.println("1) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//		b1 = new BigInt("1");
//		b2 = new BigInt("1");
//		b3 = b1.add(b2);
//		System.out.println("\n2) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-1");
//		b2 = new BigInt("1");
//		b3 = b1.add(b2);
//		System.out.println("\n3) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("1");
//		b2 = new BigInt("-1");
//		b3 = b1.add(b2);
//		System.out.println("\n4) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-1");
//		b2 = new BigInt("-1");
//		b3 = b1.add(b2);
//		System.out.println("\n5) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("+1");
//		b2 = new BigInt("+1");
//		b3 = b1.add(b2);
//		System.out.println("\n6) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("100");
//		b2 = new BigInt("100");
//		b3 = b1.add(b2);
//		System.out.println("\n7) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("100");
//		b2 = new BigInt("-100");
//		b3 = b1.add(b2);
//		System.out.println("\n8) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-100");
//		b2 = new BigInt("-100");
//		b3 = b1.add(b2);
//		System.out.println("\n9) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("100");
//		b2 = new BigInt("100");
//		b3 = b1.add(b2);
//		System.out.println("\n10) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("200");
//		b2 = new BigInt("-0");
//		b3 = b1.add(b2);
//		System.out.println("\n11) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-200");
//		b2 = new BigInt("-0");
//		b3 = b1.add(b2);
//		System.out.println("\n12) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-0");
//		b2 = new BigInt("200");
//		b3 = b1.add(b2);
//		System.out.println("\n13) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-0");
//		b2 = new BigInt("-200");
//		b3 = b1.add(b2);
//		System.out.println("\n14) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("37");
//		b2 = new BigInt("26");
//		b3 = b1.add(b2);
//		System.out.println("\n15) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-37");
//		b2 = new BigInt("26");
//		b3 = b1.add(b2);
//		System.out.println("\n16) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("37");
//		b2 = new BigInt("-26");
//		b3 = b1.add(b2);
//		System.out.println("\n17) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-37");
//		b2 = new BigInt("-26");
//		b3 = b1.add(b2);
//		System.out.println("\n18) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-200111111111111111199999999");
//		b2 = new BigInt("3333333333333388888888888888888888555555555555555555555555");
//		b3 = b1.add(b2);
//		System.out.println("\n19) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("66666666666666666666677777777777777777777711111111111111111200");
//		b2 = new BigInt("-3333333333333333333344444444444");
//		b3 = b1.add(b2);
//		System.out.println("\n20) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-66666666666666666666677777777777777777777711111111111111111200");
//		b2 = new BigInt("-333333");
//		b3 = b1.add(b2);
//		System.out.println("\n21) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("6666666");
//		b2 = new BigInt("3333333333333333333344444444444444444444455555555555555550");
//		b3 = b1.add(b2);
//		System.out.println("\n22) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b2 = new BigInt("99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b3 = b1.add(b2);
//		System.out.println("\n23) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b2 = new BigInt("99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b3 = b1.add(b2);
//		System.out.println("\n24) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b2 = new BigInt("-99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b3 = b1.add(b2);
//		System.out.println("\n25) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);
//
//
//
//		b1 = new BigInt("-1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b2 = new BigInt("-99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
//		b3 = b1.add(b2);
//		System.out.println("\n26) sum b3 is " + b1 +" + " + b2 + " = " + b3);
//		b3 = b1.subtract(b2);
//		System.out.println("1) difference b3 is " + b1 +" - " + b2 + " = " + b3);
//		b3 = b1.multiply(b2);
//		System.out.println("1) product b3 is " + b1 +" * " + b2 + " = " + b3);



	}
}
