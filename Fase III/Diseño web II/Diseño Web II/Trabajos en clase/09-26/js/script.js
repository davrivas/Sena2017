var nombre = prompt("Digite su nombre:");

var edad = prompt('Digite por favor su edad:');

if (edad < 18) {
	alert('No eres apto para ingresar a este sistema.')
} else {
	if (edad == 18) {
		alert('Casi que no entras ' + nombre);
	}

	alert('Bienvenido ' + nombre + ' a nuestro sistema!');

	do {
		var texto = prompt(nombre + ' digite la palabra que quiere que se repita');
	} while (texto == null || texto == "");

	do {
		var repetir = prompt('Digite la cantidad que quiera que se repita');
	} while (repetir == 0 || repetir == null);

	for (var i = 1; i <= repetir; i++) {
		document.write("<p class='repetir'>" + texto + "</p>");
	}
}