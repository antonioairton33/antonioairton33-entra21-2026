
const prompt = require('prompt-sync')();

let opcao, resultado;

do{

    console.log('\n//---------CALCULADORA---------//\n');
    
    const numero1 = Number(prompt('Digite o primeiro número: '));
    const numero2 = Number(prompt('Digite o segundo número: '));

    console.log('\n1 - Soma');
    console.log('2 - Subtração');
    console.log('3 - Multiplicação');
    console.log('4 - Divisão');
    console.log('0 - Encerrar');

    opcao = Number(prompt('\nDigite o numero da opcão: '));
    console.log('\n');

    switch (opcao) {
        case 1:
            resultado = numero1 + numero2;
            console.log('RESPOSTA: ' + resultado);
            break;
        ;    

        case 2: 
            resultado = numero1 - numero2;
            console.log('RESPOSTA: ' + resultado);
            break;
        ;

        case 3:
            resultado = numero1 * numero2;
            console.log('RESPOSTA: ' + resultado);
            break;
        ;

        case 4:
            resultado = numero1 / numero2;
            console.log('RESPOSTA: ' + resultado);
            break;
        ;

        case 0:
            console.log('Encerrando...');
            break;
        ;

        default:
            console.log('Opcão inválida');
            break;
        ;
    }

    
} while(opcao !== 0);



/*
function operacoes(numero1, numero2, opcao){
}
*/