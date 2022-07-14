window.onload = function() {
    let registrationForm = document.getElementById("registrationForm");
    if(registrationForm) {
        registrationForm.addEventListener("input", () => {
            var firstName = document.getElementById("firstName").value;
            if(/^[a-zA-Z]+$/.test(firstName)) {
                var lastName = document.getElementById("lastName").value;
                if(/^[a-zA-Z]+$/.test(lastName)) {
                    var emailId = document.getElementById("emailId").value;
                    if (/^[a-zA-Z0-9]+@(yash.com)$/.test(emailId)) {
                        var password = document.getElementById("password").value;
                        var confirmPassword = document.getElementById("confirmPassword").value;
                        if(password == confirmPassword) {
                            var gender = document.querySelector('input[name = "gender"]:checked').value;
                            if (gender != '') {
                                let hobbie = document.getElementsByName("hobbie");
                                var hobbies = [];
                                for (var checkbox of hobbie) {
                                    if (checkbox.checked) { 
                                        hobbies.push(checkbox.value);
                                    }
                                }
                                if (hobbies.length > 0) {
                                    var sourceOfIncome = document.getElementById("sourceOfIncome").value;
                                    if (sourceOfIncome != '') {
                                        var income = document.getElementById("income").value;
                                        if (income != 0) {
                                            var fileUpload = document.getElementById("fileUpload").value; 
                                            if (fileUpload != '') {
                                                var age = document.getElementById("age").value;
                                                if (age > 17) {
                                                    var bio = document.getElementById("bio").value;
                                                    if (bio != '') {
                                                        submitBtn.removeAttribute('disabled');
                                                        document.getElementById("submitBtn").style.backgroundColor = "#4aa58d";
                                                        document.getElementById("submitBtn").style.color = "#eff2f1";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
        });
    }
}

// window.onload = function() {
//     let registrationForm = document.getElementById("registrationForm");
//     if(registrationForm) {
//         registrationForm.addEventListener("input", () => {
//             let firstName = document.getElementById("firstName").value;
//             if(/^[a-zA-Z]+$/.test(firstName)) {
//                 let lastName = document.getElementById("lastName").value;
//                 if(/^[a-zA-Z]+$/.test(lastName)) {
//                     let emailId = document.getElementById("emailId").value;
//                     if (/^[a-zA-Z0-9]+@(yash.com)$/.test(emailId)) {
//                         let password = document.getElementById("password").value;
//                         let confirmPassword = document.getElementById("confirmPassword").value;
//                         if(password == confirmPassword) {
//                             let gender = document.querySelector('input[name = "gender"]:checked').value;
//                             if (gender != '') {
//                                 let hobbie = document.getElementsByName("hobbie");
//                                 let hobbies = [];
//                                 for (var checkbox of hobbie) {
//                                     if (checkbox.checked) { 
//                                         hobbies.push(checkbox.value);
//                                     }
//                                 }
//                                 if (hobbies.length > 0) {
//                                     let sourceOfIncome = document.getElementById("sourceOfIncome").value;
//                                     if (sourceOfIncome != '') {
//                                         let income = document.getElementById("income").value;
//                                         if (income != 0) {
//                                             let fileUpload = document.getElementById("fileUpload").value; 
//                                             if (fileUpload != '') {
//                                                 let age = document.getElementById("age").value;
//                                                 if (age > 17) {
//                                                     let bio = document.getElementById("bio").value;
//                                                     if (bio != '') {
//                                                         submitBtn.removeAttribute('disabled');
//                                                     } else {
//                                                         submitBtn.removeAttribute('disabled', 'disabled');
//                                                         alert("Enter Bio");
//                                                     }
//                                                 } else {
//                                                     submitBtn.removeAttribute('disabled', 'disabled');
//                                                     alert("Enter Correct Age");
//                                                 }
//                                             } else {
//                                                 submitBtn.removeAttribute('disabled', 'disabled');
//                                                 alert("Upload File");
//                                             }
//                                         } else {
//                                             submitBtn.removeAttribute('disabled', 'disabled');
//                                             alert("Enter Income");
//                                         }
//                                     } else {
//                                         submitBtn.removeAttribute('disabled', 'disabled');
//                                         alert("Select Source of Income");
//                                     }
//                                 } else {
//                                     submitBtn.removeAttribute('disabled', 'disabled');
//                                     alert("Select Hobbies");
//                                 }
//                             } else {
//                                 submitBtn.removeAttribute('disabled', 'disabled');
//                                 alert("Select Gender");
//                             }
//                         } else {
//                             submitBtn.removeAttribute('disabled', 'disabled');
//                             alert("Password and Confirm Password not Matched");
//                         }
//                     } else {
//                         submitBtn.removeAttribute('disabled', 'disabled');
//                         alert("Enter email with @yash.com as Domain Name");
//                     }
//                 } else {
//                     submitBtn.removeAttribute('disabled', 'disabled');
//                     alert("Only alphabets are Allowed in Last Name");
//                 }
//             } else {
//                 submitBtn.removeAttribute('disabled', 'disabled');
//                 alert("Only alphabets are Allowed in First Name");
//             }
//         });
//     }
// }

function myfunction() {
    console.log(firstName, lastName, emailId, password, confirmPassword, gender, hobbies, sourceOfIncome, income, fileUpload, age, bio); 
}


