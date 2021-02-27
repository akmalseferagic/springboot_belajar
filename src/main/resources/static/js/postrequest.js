$(document).ready(function(){
	//submit form
	$("#customerForm").submit(function(event){
		//prevent the form submitting via the browser
		event.preventDevault();
		ajaxPost();
	});

	function ajaxPost(){
		//prepare form data
		var formData = {
			
	        username : $("#username").val(),
	        password : $("#password").val(),
	        firtsname : $("#firstname").val(),
	        lastname : $("#lastname").val(),
	        birthdate : $("#birthdate").val(),
	        phonetype : $("#phonetype").val(),
	        phonenumber : $("#phonenumber").val()
		}
		//do post
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "Customer/post",
			dataType : 'json',

		});
	}
})