//Calculates the ceasar cipher
const caesar = (str, amount) => str.toLowerCase().replace(/[a-z]/g, c => String.fromCharCode((c.charCodeAt(0)-97 + amount) % 26 + 97));

function myFunction(clicked_id){

    let cipherText = document.getElementById("cipherText").value;
    let shiftNumber = parseInt(document.getElementById("shiftNumber").value)

    //Checks for the number who clicked and calculates the number for the decoded calculation
    if(clicked_id === "decode")
        shiftNumber = ((shiftNumber - shiftNumber - shiftNumber)) + 26;

    document.getElementById("result").innerHTML = caesar(cipherText, shiftNumber);
}
