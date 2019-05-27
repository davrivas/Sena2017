$().ready(function() {
    alertify.prompt('Sucursal', 'Ingrese la cantidad de sucursales', '',
        function(evt, value) {
            for (var i = 1; i <= value; i++) {
                $('#tabla').append(
                    "<tr>" +
                        "<th class=\"inverse\">Sucursal " + i + "</th>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                        "<td></td>" +
                    "</tr>"
                );
            }
       },
       function() { alertify.error('Cancel') }
    );
});