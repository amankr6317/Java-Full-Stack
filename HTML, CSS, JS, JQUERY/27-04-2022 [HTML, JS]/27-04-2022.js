// ----------------------------------------- block, global, local scope

var count = 0;
function myfunction() {
    let str1 = "Total count :"
    for (var i = 0; i < 10; i++) {
        const str2 = "Yash Technologies";
        count++;
        console.log(str2+" "+count);
    }
    console.log(str1+" "+count); 
}
// console.log(str1); // 27-04-2022.js:11 Uncaught ReferenceError: str1 is not defined

// ----------------------------------------- split(), toUpperCase(), substring(), join()

var str = "yash technologies";
str = str.split(" ");
for (var i=0; i<str.length; i++) {
    str[i] = str[i][0].toUpperCase()+str[i].substring(1);
}
str = str.join(" ");
console.log(str);

// ----------------------------------------- sort()

var str = "yashtechnologies";
str = str.split("");
str = str.sort().join("");
console.log(str);

// 1. Write a JavaScript program to rotate the elements left of a given array of integers of length 3

var arr = [1, 2, 3];
console.log(arr[1], arr[2], arr[0]);

// 2. Write a JavaScript program to check if 1 appears in first or last position of a given array of integers. The array length must be greater or equal to 1

if (arr[0] == 1 || arr[arr.length-1] == 1 ) {
    console.log(true);
} else {
    console.log(false);
}

// 3. Write a JavaScript program to check if the first and last elements are equal of a given array of integers length 

if (arr[0] == arr[arr.length-1]) {
    console.log(true);
} else {
    console.log(false);
}

// 4. Write a JavaScript program to reverse the elements of a given array of integers length 3

arr = [arr[2], arr[1], arr[0]]
console.log(arr);

// 5. Write a JavaScript program to find the larger value between the first or last and set all the other elements with that value. Display the new array

var max = 0;
for (var i=0; i<arr.length; i++) {
    if(max<arr[i]) {
        max = arr[i];
    }
}
for (var i=0; i<arr.length; i++) {
    arr[i] = max;
}
console.log(arr);

// 6. Write a JavaScript program to create a new array taking the middle elements of the two arrays of integer and each length 3.

var arr1 = [1, 2, 3];
var arr2 = [4, 5, 6];
var arrout = [arr1[1], arr2[1]];
console.log(arrout); 

// 7. Write a JavaScript program to create a new array taking the first and last elements from a given array of integers and length must be greater or equal to 1.

var arrout = [arr1[0], arr1[2]];
console.log(arrout);

// 8. Write a JavaScript program to test if an array of integers of length 2 contains 1 or a 3.

for (var i=0; i<arrout.length; i++) {
    if(arrout[i] == 1 || arrout[i] == 3) {
        console.log(true);
    } else {
        console.log(false);
    }
}

// 9. Write a JavaScript program to test if an array of integers of length 2 does not contain 1 or a 3.

for (var i=0; i<arrout.length; i++) {
    if(arrout[i] == 1 || arrout[i] == 3) {
        console.log(false);
    } else {
        console.log(true);
    }
}

// 10. Write a JavaScript program to test if a given array of integers contains 30 and 40 twice. The array length should be 0, 1, or 2.

var arrout = [30, 30];
if((arrout[0] == 30 && arrout[1] == 30) || (arrout[0] == 40 && arrout[1] == 40)) {
    console.log(true);
} else {
    console.log(false);
}

// 11. Write a JavaScript program to swap the first and last elements of a given array of integers. The array length should be at least 1.

var arr = [1, 2, 3];
var temp = 0;
temp = arr[0];
arr[0] = arr[2];
arr[2] = temp;
console.log(arr);


