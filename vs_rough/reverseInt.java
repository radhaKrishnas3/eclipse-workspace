import java.math.BigInteger;
import java.util.LinkedList;

public class reverseInt{ 

    public String reverse(String y){
        LinkedList<Long> ls = new LinkedList<>(); 
        String res = "";
        boolean flagNegative=false;
        long digit=0;
        BigInteger bi = new BigInteger(y);

        long x = bi.longValue();

        //handle exceptions 1- negative number
        if(x<0){
            flagNegative= true;
            x=-x;
        }
        
        //handle exception 2- zero exception
        if(x==0){
            return "0";
        }
        
        while(x>0){
            digit = x%10;
            x=x/10;
            ls.add(digit);
        }
        for(int i=0; i< ls.size(); i++){
            res+= String.valueOf(ls.get(i));
        }
        
        //handle exception 3 - out of bound of integer
        if(bi.intValue() > Math.pow(2, 31)-1 || bi.intValue() < -Math.pow(2, 31)){
            return "0";
        }

        //sending negative values
        if(flagNegative){
            return "-"+res;
        }
        return res;
    } 
    public static void main(String[] args) {
        reverseInt ri = new reverseInt();
        System.out.println(ri.reverse("-12213123"));
    }
}
