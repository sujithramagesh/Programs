package Programs;
import java.math.BigDecimal;
import java.math.BigInteger;

public class chessboard {

	public chessboard() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		BigInteger bigi=new BigInteger("0");
		BigInteger exp;
		for(int i=0;i<64;i++)
		{
			exp=BigDecimal.valueOf(Math.pow(2, i)).toBigInteger();
			bigi=bigi.add(exp);
		}
		System.out.println(bigi);
	}

}
