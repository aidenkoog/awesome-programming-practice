console.log("Your code goes here...");
var person = {
    name: "koo",
    age: 30,
    hobbies: ["AAA", "BBB"],
    role: [2, "test"]
};
person.role.push("admin");
person.role = [0, "test"];
var activities;
activities = ["CCC"];
console.log(person.name);
for (var _i = 0, _a = person.hobbies; _i < _a.length; _i++) {
    var hobby = _a[_i];
    console.log(hobby.toUpperCase());
}
function add(n1, n2) {
    return n1 + n2;
}
var combineValues;
combineValues = add;
//combineValues = 5 // Runtime error
console.log(combineValues(8, 8));
var combineValues2;
combineValues2 = add;
function addAndHandle(n1, n2, cb) {
    var result = n1 + n2;
    cb(result);
}
addAndHandle(10, 20, function (result) {
    console.log(result);
});
var userInput;
var userName;
userInput = 5;
userInput = "Max";
if (typeof userInput === "string") {
    userName = userInput;
}
function generateError(message, code) {
    throw { message: message, errorCode: code };
}
generateError("An error occurred!", 505);
