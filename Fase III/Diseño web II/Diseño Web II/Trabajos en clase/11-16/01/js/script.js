$().ready(function() {
    swal({text: 'Bienvenido David Rivas'});

    $('#boton-azul').click(function() {
        swal(
            'Bienvenido',
            'Sea bienvenido a nuestro sistema',
            'success'
        );
    });

    $('#boton-verde').click(function() {
        swal({
            title: 'Digite un texto',
            input: 'text',
            confirmButtonText: 'OK'
        });
    });

    $('#boton-rojo').click(function mostrarRojo() {
        swal(
            '¡Ups!',
            'Algo falló.',
            'error'
        );
    });
});    