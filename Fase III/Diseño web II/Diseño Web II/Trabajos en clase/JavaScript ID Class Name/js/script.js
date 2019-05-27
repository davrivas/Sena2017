var contenedor = document.getElementById('contenedor'),
    id = document.getElementById('aidi'),
    clase = document.getElementsByClassName('clase'),
    nombre = document.getElementsByTagName('p'),
    btnNombre = document.getElementById('btn-nombre'),
    btnId = document.getElementById('btn-id'),
    btnClase = document.getElementById('btn-clase');

function cambiarWrapper() {
    contenedor.style.backgroundColor = '#ff0';
}

function cambiarClase() {
    for (var i = 0; i < clase.length; i++) {
        clase[i].style.fontSize = '20px';
        clase[i].style.color = '#00f';
        clase[i].style.fontFamily = 'Verdana';
    }
}

function cambiarNombre() {
    for (var i = 0; i < nombre.length; i++) {
        nombre[i].style.fontSize = '25px';
        nombre[i].style.color = 'rgba(0, 255, 0, 1)';
        nombre[i].style.fontFamily = 'Garamond';
    }
}

function cambiarId() {
    id.style.fontSize = '1.5em';
    id.style.color = 'hsl(0, 100%, 50%)';
    id.style.fontFamily = 'Georgia';
}

contenedor.addEventListener("mouseover", cambiarWrapper);
btnNombre.addEventListener("click", cambiarNombre);
btnId.addEventListener("click", cambiarId);
btnClase.addEventListener("click", cambiarClase);