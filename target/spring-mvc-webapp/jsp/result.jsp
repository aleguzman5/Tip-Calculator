<%-- 
    Document   : result
    Created on : Oct 3, 2017, 4:42:15 PM
    Author     : Alejandro
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Tip Calculator</title>
    </head>
    <body>
        <h1>Tip Calculator Results</h1>
        <p>
            Amount: $${bill}
        </p>
        <p>
            Tip%: ${tipPerc}
        </p>
        <p>
            Total Tip: $${tipAmount}
        </p>
        <p>
            Total Bill: $${totalBill} 
        </p>
        <p>
            <a href="index.jsp">Calculate a new tip</a>
        </p>

    </body>
</html>
