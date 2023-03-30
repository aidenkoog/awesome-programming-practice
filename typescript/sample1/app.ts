console.log("Your code goes here...");

const person: {
  name: string;
  age: number;
  hobbies: string[];
  role: [number, string];
} = {
  name: "koo",
  age: 30,
  hobbies: ["AAA", "BBB"],
  role: [2, "test"],
};

person.role.push("admin");
person.role = [0, "test"];

let activities: string[];
activities = ["CCC"];

console.log(person.name);

for (const hobby of person.hobbies) {
  console.log(hobby.toUpperCase());
}

function add(n1: number, n2: number): number {
  return n1 + n2;
}

let combineValues: Function;
combineValues = add;
//combineValues = 5 // Runtime error

console.log(combineValues(8, 8));

let combineValues2: (a: number, b: number) => number;
combineValues2 = add;

function addAndHandle(n1: number, n2: number, cb: (num: number) => void) {
  const result = n1 + n2;
  cb(result);
}

addAndHandle(10, 20, (result) => {
  console.log(result);
});

let userInput: unknown;
let userName: string;

userInput = 5;
userInput = "Max";

if (typeof userInput === "string") {
  userName = userInput;
}

function generateError(message: string, code: number): never {
  throw { message: message, errorCode: code };
}

generateError("An error occurred!", 505);
