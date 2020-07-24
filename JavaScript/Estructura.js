fase1();

fase2();

fase3();

fase4();

function fase1(){
    console.log("Fase 1");

    //Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
    let javaCharArray = ['M', 'A', 'R', 'C', 'E', 'L'];
    javaCharArray.forEach(char => console.log(char));
}

function fase2(){
    console.log("Fase 2");

    //Canvia la taula per una llista (List<Character>)
    const chars = ['M', '1', 'R', 'C', 'E', 'L'];
    
    //Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
    printChar(chars);
    //Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’
    checkNumber(chars);

}

function fase3(){
    console.log("Fase 3");

    word = ['M', 'A', 'R', 'C', 'E', 'L','L','O','B','O'];
    console.log(countCharacters(word));
}


function fase4(){
    console.log("Fase 4");

    let nom = ['N', 'O', 'M'];
    let cognom = ['C','O','G','N', 'O', 'M'];

    fullName = fullName(nom, cognom);
    console.log(fullName);
}

function fullName(nom, cognom) {
    let fullName = [].concat(...nom, " ", ...cognom);
    return fullName;
}


//Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
function printChar (chars) {
    for (character of chars) {
        if (isVocal(character)) {
            console.log(character + " és VOCAL");
        } else if (!isNaN(character)) {
            console.log(character + " No és una lletra.");
        } else {
            console.log(character + " és una CONSONANT");
        }
    }
}


//Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’
function checkNumber (chars) {
    for (character of chars) {
        if (!isNaN(character)) {
            console.log("Els noms de persones no contenen números!");
            break;
        } 
    }
}


function isVocal (char) {
    vocals = ['A','E','I','O','U'];

    for (vocal of vocals) {
        if (character === vocal) {
            return true;
        }
    }
    return false;
}  

    
function countCharacters(word) {
    repeatedChar = {};
    for (key of word) {
        if (repeatedChar.hasOwnProperty(key)){
            repeatedChar[key] += 1;
        } else {
            repeatedChar[key] = 1;
        }
    }
    return repeatedChar;
}