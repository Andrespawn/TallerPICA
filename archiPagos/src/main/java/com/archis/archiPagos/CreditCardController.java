package com.archis.archiPagos;

import javax.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.demo.wsdl.CreditCard;
import com.example.demo.wsdl.ObjectFactory;

@Controller

public class CreditCardController {


    private ValidacionTC validacionTC;

    @Autowired
    public CreditCardController(ValidacionTC validacionTC){
        this.validacionTC= validacionTC;
    }





    @ResponsePayload
    @RequestMapping(value="/prueba",method= RequestMethod.POST,consumes="application/json", produces="application/json")
    public Boolean VerifyCC (@RequestPayload CreditCard request){
        ObjectFactory objectFactory = new ObjectFactory();
        if (validacionTC.validacion(request)){

            objectFactory.createCreditCard();
            return true;

        }

        return false;

    }
}
