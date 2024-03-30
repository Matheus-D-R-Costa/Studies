const notes = [];
let sum = 0;

notes.push(5);
notes.push(4);
notes.push(7);
notes.push(8);
notes.push(6);
notes.push(6.5);

for (let i = 0; i < notes.length; i++) { // parar de executar a condição se tornar false
    const note = notes[i];  
    sum = sum + note;
}

const media = sum / notes.length;

console.log(media);

