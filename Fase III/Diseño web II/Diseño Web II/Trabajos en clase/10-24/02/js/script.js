var apagar = document.getElementById('apagar'),
    encender = document.getElementById('encender'),
    caja = document.getElementById('caja'),
    cambiar = document.getElementById('cambiar');

function apagarLuz() {
    caja.style.backgroundColor = '#000';
}

function encenderLuz() {
    caja.style.display = 'block';
}

function cambiarColor() {
    caja.classList.toggle('caja-dos');
}

apagar.addEventListener("click", apagarLuz);
encender.addEventListener("click", encenderLuz);
cambiar.addEventListener("click", cambiarColor);