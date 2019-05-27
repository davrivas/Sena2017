/* SEGUIR HACIENDO ESO */
$().ready(function() {
    /*swal({
        text: 'Bienvenido a nuestro sistema'
    });*/

    $('#tabla').html(""+
        "<tr>"+
            "<td>Rivas</td>"+
            "<td>David</td>"+
            "<td>dsrivas2@misena.edu.co</td>"+
            "<td class=\"accion\">"+
                "<button class=\"btn btn-danger btn-eliminar m-1\">"+
                    "<span class=\"fa fa-trash\"></span>"+
                "</button>"+
                "<button class=\"btn btn-primary btn-editar m-1\">"+
                    "<span class=\"fa fa-pencil\"></span>"+
                "</button>"+
                "<button class=\"btn btn-warning btn-duplicar m-1\">"+
                    "<span class=\"fa fa-clone\"></span>"+
                "</button>"+
                "<button class=\"btn btn-success btn-nuevo m-1\">"+
                    "<span class=\"fa fa-plus\"></span>"+
                "</button>"+
            "</td>"+
        "</tr>"
    );

    $('.btn-success').click(function() {
        //swal('Hola');
        $('#tabla').append("" +
            "<tr>" +
                "<td>" +
                    "<input type=\"text\" id=\"apellido\" />" +
                "</td>" +
                "<td>" +
                    "<input type=\"text\" id=\"nombre\" />" +
                "</td>" +
                "<td>" +
                    "<input type=\"email\" id=\"correo\" />" +
                "</td>" +
                "<td>" +
                    "<button class=\"btn btn-success btn-guardar m-1\">"+
                        "<span class=\"fa fa-save\"></span>"+
                    "</button>"+
                "</td>" +
            "</tr>"
        );
        /*y poner input en cada td e icono guardar y cancelar y validar todos los campos*/
    });

    /*boora confirmar ,
    va varibla = $(this)
    swal confirm 2 opciones
    if (isConfirm)
    borarr padre padre.remove()*/
    /**/

    /*duplicar
    confirm
    */

    /*append
    appendTo*/
});