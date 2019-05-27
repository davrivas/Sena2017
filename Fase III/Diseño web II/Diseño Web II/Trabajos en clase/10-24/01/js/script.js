var luz = document.getElementById('luz'),
    apagar = document.getElementById('apagar'),
    encender = document.getElementById('encender'),
    encenderLuz = function() {
        luz.style.display = 'block';
    },
    apagarLuz = function() {
        luz.style.display = 'none';
    },
    cambio = document.getElementById('cambio'),
    cuadrado = document.getElementById('cuadrado')
    cambiar = function() {
        if (cambio.innerHTML == 'Cambio') {
            cambio.innerHTML = 'Prender'
        } else if (cambio.innerHTML == 'Prender') {
            cambio.innerHTML = Cambio;
        }

        if (luz.style.display == 'none') {
            luz.style.display = 'block';
        } else if (luz.style.display == 'block') {
            luz.style.display = 'none';
        }

        if (cuadrado.checked == true) {
            cuadrado.checked = false;
        } else {
            cuadrado.checked = true;
        }
    };

apagar.addEventListener("click", apagarLuz);
encender.addEventListener("click", encenderLuz);
cambio.addEventListener("click", cambiar);