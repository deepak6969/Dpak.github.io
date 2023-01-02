function Signin()
{
    var firstname=document.getElementById("first").value;
    var middlename=document.getElementById("middle").value;
    var Lastname=document.getElementById("dob").value;
    var exp1=/^[A-Za-z]+$/
    var exp2=/^[A-Za-z]$/
    var exp3=/^[0-9]$/

    if(!exp1.test(firstname))
    {
        document.getElementById("warn1").innerHTML="Only characters allowed";
    }

    if(!exp2.test(middlename))
    {
        document.getElementById("warn2").innerHTML="Only single characters allowed";
    }

    if(!exp1.test(dateofbirth))
    {
        document.getElementById("warn3").innerHTML="Only single characters allowed";
    }
    
}