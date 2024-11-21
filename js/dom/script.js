function validateGender(){
    var status = true;
    var rdMale = document.getElementById("rdMale").checked;
    var rdFemale = document.getElementById("rdFemale").checked;
    var genderError = document.getElementById("genderError");
    if(!(rdMale || rdFemale)){
        status = false;
        genderError.innerText = "select gender";
    }
    else
      genderError.innerText = "";
    return status;
}
function validateProfile(){
    var stauts = true;
    var profile = document.getElementById("profile");
    var profileError = document.getElementById("profileError");
    if(profile.files[0]){
       var fileName = profile.files[0].name;
       var dotIndex = fileName.lastIndexOf(".");
       var fileExtension = fileName.substring(dotIndex);
       if(fileExtension != ".jpeg"){
        status = false;
        profileError.innerText = "Only jpeg is allowed";
       }
       else
         profileError.innerText = "";
    }
    else{
        status = false;
        profileError.innerText = "upload profile pic";
    }

    return status;
}
function validateQualification(){
    var status = true;
    var qualification = document.getElementById("qualification").value;
    var qualificationError = document.getElementById("qualificationError");
    if(qualification == "0"){
        status = false;
        qualificationError.innerText = "select qualification";
    }
    else
      qualificationError.innerText = "";
    return status;
}
function validateMobile(){
    var status = true;
    var mobile = document.getElementById("mobile").value;
    var mobileError = document.getElementById("mobileError");
    if(mobile.length == 0){
        status = false;
        mobileError.innerText = "mobile number is required";
    }
    else if(isNaN(mobile)){
       status = false;
       mobileError.innerText = "Only digits are allowed";  
    }
    else if(mobile.length!=10){
        status = false;
        mobileError.innerText = "Invalid mobile number";
    }
    else
      mobileError.innerText = "";
    return status;
}
function validatePassword(){
    var status = true;
    var password = document.getElementById("password").value;
    var passwordError = document.getElementById("passwordError");
    if(password.length==0){
        status = false;
        passwordError.innerText = "password is required";
    }
    else if(password.length < 6 || password.length > 10){
        status = false;
        passwordError.innerText = "password must contain 6-10 letters only";
    }
    else
     passwordError.innerText = "";
    return status;
}
function togglePassword(){
    var passwordInput = document.getElementById("password");
    var label = document.getElementById("toggle");
    if(label.innerText == "Show"){
        passwordInput.type ="text";
        label.innerText = "Hide";
    }
    else if(label.innerText == "Hide"){
        passwordInput.type = "password";
        label.innerText = "Show";
    }
}
function validateUsername(){
    var status = true;
    var username = document.getElementById("username").value;
    var usernameError = document.getElementById("usernameError");
    if(username.length == 0){
        status = false;
        usernameError.innerText = 'Username is required';
    }
    else
      usernameError.innerText = "";
    return status;
}
function validateForm(){
   var usernameStatus =  validateUsername();
   var passwordStatus =  validatePassword();
   var mobileStatus =  validateMobile();
   var qualificationStatus =  validateQualification();
   var profileStatus =  validateProfile();
   var genderStatus =  validateGender();
   if(usernameStatus && passwordStatus && mobileStatus && qualificationStatus && profileStatus && genderStatus)
     return true;
   return false; 
}