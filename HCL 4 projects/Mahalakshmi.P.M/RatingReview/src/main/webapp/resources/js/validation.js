 function validateForm()
		{
		var fname=document.registerform.fullname.value;	
		var pass=document.registerform.upwd.value;
		var repass=document.registerform.repwd.value;
		var mail=document.registerform.mail.value;
		var uname=document.registerform.uname.value;	
		var address=document.registerform.address.value;
		var mobile=document.registerform.mobile.value;
     			if(fname==null || fname=="")
				{
					alert("name cannot be empty");
					return false;
				}
			
			var mobcheck=/^\d{10}$/;
			if(mobile==null || mobile=="" ||(mobcheck.test(mobile)==false))
				{
					alert("Enter a valid mobile number");
					return false;
				}
			
			var regularexpression = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(regularexpression.test(mail)==false)
				{
					alert("Enter valid Mail Id");
					return false;
				}

				if(address==null || address=="")
				{
					alert("Address cannot be empty");
					return false;
				}	
		if(uname==null || uname=="")
		{
				alert("user cannot be empty");
				return false;
		}
		if(pass.length <= 3)
		{
				alert("Password length should be greater than 3");
				return false;
		}
		
		
		if(  pass!=repass )
		{
				alert("Passwords Did not Match");
				return false;
		}
}