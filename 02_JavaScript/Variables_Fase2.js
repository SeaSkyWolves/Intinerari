
fase2();
function fase2(){
        //FASE 2
        console.log("FASE 2");

        //Creeu una constant amb el valor de lâ€™any (1948).
        const primerAnyTransicio = 1948;
        
        //Creeu una variable que guardi cada quan hi ha un any de traspÃ s.
        const interval = 4;

        //Calculeu quants anys de traspÃ s hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
        const anyNeixement = 1990;
        
        let numeroTransicions = Math.trunc((anyNeixement - primerAnyTransicio)/interval);
        
        //Mostreu per pantalla el resultat del cÃ lcul.
        console.log("Resposta: Des de l'any %d fins l'any %d han passat %d anys de transició sense comptar el de l'any 1948.", primerAnyTransicio, anyNeixement, numeroTransicions);


       
        
    }