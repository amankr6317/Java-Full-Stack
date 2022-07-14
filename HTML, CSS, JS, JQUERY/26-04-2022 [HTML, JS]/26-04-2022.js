// 1. Write a JavaScript program to display the current day and time in the following format.   Sample Output : Today is : Friday. 

var today = new Date();
var day = today.getDay();
var daylist = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"];
console.log("Today is : "+daylist[day]+".");

// 2. Current time is : 4 PM : 50 : 22

var hour = today.getHours();
var minute = today.getMinutes();
var second = today.getSeconds();
var output = "Current time is : ";
if (hour > 12) {
    hour = hour - 12;
    output = output + hour + " PM : " + minute + " : " + second;
} else {
    output = output + hour + " AM : " + minute + " : " + second;
}
console.log(output);

// 3. Write a JavaScript program to print the contents of the current window.

function myfunction() {
    document.getElementById("demo").innerHTML = output;
}

//  4. Write a JavaScript program to get the current date.   
//     Expected Output : 
//     mm-dd-yyyy, mm/dd/yyyy or dd-mm-yyyy, dd/mm/yyyy

var dd = today.getDate();
var mm = today.getMonth();
var yyyy = today.getFullYear();
var displayDate1 = mm + "-" + dd + "-" + yyyy;
var displayDate2 = mm + "/" + dd + "/" + yyyy;
var displayDate3 = dd + "-" + mm + "-" + yyyy;
var displayDate4 = dd + "/" + mm + "/" + yyyy;
console.log(displayDate1, displayDate2, displayDate3, displayDate4);

// 4. Write a JavaScript program to find the area of a triangle where lengths of the three of its sides are 5, 6, 7.  

var a = 5;
var b = 6;
var c = 7;
var s = (a+b+c)/2;
var area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
console.log(area);

// 5. Write a JavaScript program to rotate the string 'yashtechnologies' in right direction by periodically removing one letter from the end of the string and attaching it to the front

var letter = "yashtechnologies";
var rotateletter = "";
for (var i=0; i<letter.length+1; i++) {
    rotateletter = rotateletter + letter.charAt(letter.length-i);
}
console.log(rotateletter);

// 6. Write a JavaScript program to determine whether a given year is a leap year in the Gregorian calendar. 

var year = 2016;
if ((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
    console.log("Is a Leap Year")
} else {
    console.log("Not a Leap Year")
}

// 7. Write a JavaScript program to find 1st January is being a Sunday between 2014 and 2050. 

for (var i = 2014; i<2050; i++) {
    var flag = new Date(i, 0, 1);
    if (flag.getDay() == 0) {
        console.log(flag);
    }
}

// 8. Write a JavaScript program where the program takes a random integer between 1 to 10, the user is then prompted to input a guess number. If the user input matches with guess number, the program will display a message "Good Work" otherwise display a message "Not matched". 

function myfunction2() {
    var number = document.getElementById("number").value;
    var computerNumber = Math.floor(Math.random()*11);
    if (number == computerNumber) {
        console.log("Good Work");
        document.getElementById("result").innerHTML = "<br>Good Work";
    } else {
        console.log("Not matched");
        document.getElementById("result").innerHTML = "<br>Not matched";
    }
}

// 9. Write a JavaScript program to calculate days left until next Christmas.  

var dayleft = new Date(today.getFullYear(), 11, 25);
if (today.getMonth() == 11 && today.getDate() > 25) {
    dayleft.setFullYear(dayleft.getFullYear()-1);
} 
var oneDay = 1000*60*60*24;
console.log(Math.ceil((dayleft.getTime()-today.getTime())/(oneDay))+" Days left until Christmas!")

// 10. Write a JavaScript program to reverse a given string.

var letter = "yashtechnologies";
var rotateletter = "";
for (var i=0; i<letter.length+1; i++) {
    rotateletter = rotateletter + letter.charAt(letter.length-i);
}
console.log(rotateletter);

// 11. Write a JavaScript program to replace every character in a given string with the character following it in the alphabet.

var letter = "abcd";
var array = letter.split("");
// for (var i=0; i<letter.length; i++) {
//     letter = letter.replace(letter.charAt(i), String.fromCharCode(letter.charCodeAt(i)+1));
// }
console.log(array);

// 12. Write a JavaScript program to capitalize the first letter of each word of a

var str = "yash technologies";
str = str.split(" ");
for (var i=0; i<str.length; i++) {
    str[i] = str[i][0].toUpperCase()+str[i].substring(1);
}
str = str.join(" ");
console.log(str);

// 13. Write a JavaScript program to convert a given number to hours and minutes.

var number = 670;
var hour = Math.floor(number / 60);
var minute = number % 60;
console.log(hour+" hrs "+minute+" min ");

// 14. Write a JavaScript program to convert the letters of a given string in alphabetical order.

var str = "yashtechnologies";
str = str.split("");
str = str.sort().join("");
console.log(str);

// 15. Write a JavaScript program to check if the characters a and b are separated by exactly 3 places anywhere (at least once) in a given string.

var str = "aabbbbaabaaa";
if((/a...b/).test(str) || (/b...a/).test(str)) {
    console.log("Present");
} else  {
    console.log("Not Present");
}

// 16. Write a JavaScript program to count the number of vowels in a given string.

var str = "Yash Technologies"
const vowels = ["a", "e", "i", "o", "u"];
let count = 0;
for (let letter of str.toLowerCase()) {
    if (vowels.includes(letter)) {
        count++;
    }
}
console.log(count);

// 17. Write a JavaScript program to check if a given string contains equal number of p's and t's present.

var str = "IDKALSPDWPDWDJKTKAJDTT";
var strp = str.replace(/[^P]/g, "");
var strt = str.replace(/[^T]/g, "");
if(strp.length == strt.length) {
    console.log(true);
} else {
    console.log(false);
}


