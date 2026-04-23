const prompt = require('prompt-sync')()


const frutas = ['Amora']
/*
frutas.push('maça')
frutas.unshift('laranja')
frutas.pop()


console.log(frutas)
console.log(frutas[1])
*/
var fruta = 'c'
while(fruta.length > 0){
    fruta = prompt('Informe o nome da fruta: ');
    frutas.push(fruta)
}
frutas.pop()
console.log(frutas)
/*
let fruta = prompt('Informe nome de fruta: ');
frutas.push(fruta)

console.log(frutas)
*/