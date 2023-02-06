console.log('Your code goes here...')

const person: {
    name: string;
    age: number;
    hobbies: string[];
    role: [number, string]
} = {
    name: "koo",
    age: 30,
    hobbies: ['AAA', 'BBB'],
    role: [2, 'test']
};

person.role.push("admin");
person.role = [0, "test"];

let activities: string[];
activities = ['CCC'];

console.log(person.name)

for (const hobby of person.hobbies) {
    console.log(hobby.toUpperCase());
}