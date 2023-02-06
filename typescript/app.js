console.log('Your code goes here...');
var person = {
    name: "koo",
    age: 30,
    hobbies: ['AAA', 'BBB'],
    role: [2, 'test']
};
person.role.push("admin");
person.role = [0, "test"];
var activities;
activities = ['CCC'];
console.log(person.name);
for (var _i = 0, _a = person.hobbies; _i < _a.length; _i++) {
    var hobby = _a[_i];
    console.log(hobby.toUpperCase());
}
