console.log("9. Return the number of vowels in a string")
console.log('-------------------------------------------')
countVowel= (str) => str.match(/[aeiou]/gi).length;
let words= 'Vivian'
console.log(`The number of vowels in ${words} is ${countVowel(words)}`)
console.log('***********************************************************************************')
console.log('')
console.log('')