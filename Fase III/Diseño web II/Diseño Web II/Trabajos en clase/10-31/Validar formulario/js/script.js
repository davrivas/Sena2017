function validacion() {
    var correo = $('#correo').val(),
        contrasena = $('#contrasena').val();

    if (correo == "david@rivas.com" && contrasena == "1234") {
        alert('Bienvenido Administrador');
        $('#formulario').attr('action', 'admin.html');
        //window.location.href = "admin.html";
    } else if (correo == "rivas@david.com" && contrasena == "0000") {
        alert('Bienvenido Cliente');
        $('#formulario').attr('action', 'cliente.html');
        //window.location.href = "cliente.html";
    } else {
        alert('Error: verifique su correo y/o contraseña');
    }
}

/*console.log(correo);
console.log(contrasena);*/