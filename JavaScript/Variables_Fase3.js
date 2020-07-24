fase3();    

function fase3(){
    const primerAnyTransicio = 1948;
    const interval = 4;
    const anyNeixement = 1990;
    const numeroTransicions = (anyNeixement - primerAnyTransicio)/4;
    
    //FASE 3
    console.log("FASE 3");

    //Forma 1.
    //Partint de lâ€™any 1948 heu de fer un bucle for i mostrar els anys de traspÃ s fins arriba al vostre any de naixement.
    console.log("Métode 1 - Els anys de transcició després del 1948 són: ");
    
    for (let i = 0; i < numeroTransicions; ++i){
        console.log(primerAnyTransicio + (i+1)*interval);
    }
    
    
    console.log("Métode 2 - Els anys de transcició són: ");
    
    
    for (let anysTransicions = primerAnyTransicio; anysTransicions < anyNeixement; anysTransicions += 4){
        console.log(anysTransicions);
    }
    
    //Creeu una variable bool que sera certa si lâ€™any de naixement Ã©s de traspÃ s o falsa si no ho Ã©s.
    let transicio = false;
    //Creeu dues variables string per guardar les frases
    const fraseCerta = "És un any de transició. ";
    const fraseFalsa = "No és un any de transició. ";
    
    //Complin amb l'enunciat
    console.log("Mètode 3 - Fent cas a l'enunciat: ");
    for (let anys = primerAnyTransicio; anys <= anyNeixement; ++anys){
        console.log("Any: " + anys + ". ");

        for (let anysTransicio = primerAnyTransicio; anysTransicio <= anyNeixement; anysTransicio += 4){
            if (anys == anysTransicio){
                transicio = true;
                break;
            } else {
                transicio = false;
            }
        }
                        if (transicio){
                console.log(fraseCerta);
            }
            else{
                console.log(fraseFalsa);
            }
    }
}
