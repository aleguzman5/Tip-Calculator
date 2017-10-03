/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.tipcalculatorspringmvc;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Alejandro
 */
@Controller
public class TipCalculatorController {
    
    @RequestMapping(value="calculateTip", method = RequestMethod.POST)
    public String calculateTip(HttpServletRequest request, Map<String, Object> model){
        
        double totalBill = 0;
        double tipAmount = 0;
        
        String input1 = request.getParameter("totalBill");
        double bill = Double.parseDouble(input1);
        
        String input2 = request.getParameter("tipPerc");
        double tipPerc = Float.parseFloat(input2);
        
        tipAmount = Math.round(bill * (tipPerc/100));
        totalBill = tipAmount + bill;
        
        model.put("tipPerc", tipPerc);
        model.put("totalBill", totalBill);
        model.put("bill", bill);
        model.put("tipAmount", tipAmount);
        
        return "result";
    }
}
