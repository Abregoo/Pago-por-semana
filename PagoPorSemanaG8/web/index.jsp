<%-- 
    Document   : index
    Created on : 09-18-2020, 08:30:02 AM
    Author     : ale_a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

        <title>Formulario Trabajador</title>
    </head>
    <body>
        <div class="container">
            &nbsp;&nbsp;
            <h1 class="text-secondary border border-primary border-top-0 border-left-0 border-right-0">
                Formulario Trabajador - GRUPO 8</h1>
            <form action="HorasTrabajador" method="post">
                <table class="table table-bordered">
                    <tbody>
                        <tr>
                            <td>Nombre Completo:</td>
                            <td>
                                <input class="form-cotrol" required="" minlength="8" type="text" name="txtnombre" >
                            </td>
                        </tr>

                        <tr>
                            <td>Total de horas trabajadas(Semanales)</td>
                            <td>
                                <input required="" type="number" min="1" name="txthoras"  class="form-cotrol">
                            </td>
                        </tr>
                        <tr>
                            <td>Pago de hora</td>
                            <td>
                                <input required="" type="number" min="0.01" step="0.01" name="txtprecio"  class="form-cotrol">
                            </td>
                        </tr>

                        <tr >
                            <td colspan="2">
                                <input type="submit" value="Enviar" class="btn btn-primary">
                            </td>
                        </tr>

                    </tbody>
                </table>
            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    </body>
</html>
