package com.archis.archiPagos;
import org.springframework.stereotype.Component;
import com.example.demo.wsdl.CreditCard;

@Component
public class ValidacionTC {

    public Boolean validacion(CreditCard cc){
        String ccNumber = cc.getNumber();
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() -1;i>= 0; i--){
            int n = Integer.parseInt(ccNumber.substring(i,i+1));
            if (alternate){
                n*=2;
                if (n>9){
                    n = (n%10)+1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
