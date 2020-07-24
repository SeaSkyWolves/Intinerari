fase4();      

function fase4(){
    let nom = "Iori";
    let cognom1 = "Yagami";
    let cognom2 = "Nuñez";
    
    let dia = 07;
    let mes = 07;
    let any = 2020;
    
    let NomComplet = nom + " " + cognom1 + " " + cognom2;
    let data = dia+"/"+mes+"/"+any;
    
    let frase = `
        El meu nom és ${NomComplet}
        Vaig néixer el ${data}
        El meu any de naixement no és de traspàs`;

    console.log(frase);
}