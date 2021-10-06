function validateForm(){
	let x = document.forms["myForm"]["name"].value;
	let y = document.forms["myForm"]["pwd"].value;
	if(x == ""){
		alert("Name must be filled out");
		return false;
	}
	if(y.length<8){
		alert("Password should be greater than 8 letter");
		return false;
	}
}