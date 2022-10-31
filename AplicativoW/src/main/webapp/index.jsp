<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/estilos.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@500&display=swap" rel="stylesheet">
</head>
<body>



<div class="contenedor">
    <header class="superior">
        <div class="logo">
            <img src="Multimedia/hospital.png" alt="">
        </div>

        <nav class="menu">
            <ul class="opciones">
                <li><a href="" target="_self">Citas</a></li>
                <li><a href="" >Medicamentos</a></li>
                <li><a href="" >Laboratorios</a></li>
                <li><a href="" >Contactenos</a></li>
            </ul>
        </nav>
    </header>

    <div class="contenedor-principal">
        <button id="flecha-izquierda" class="flecha-izquierda"><i class="fas fa-arrow-circle-left"></i></button>
        <div class="contenedor-carousel">
            <div class="carousel">
                <div class="slider"><img scr="Multimedia/medica.jpg" alt=""  width="800" height="400"></div>
                <video scr="Multimedia/video.mp4" controls="play" width="700" height="400"></video>
                <div class="slider"><img src="Multimedia/vitaminas.png" alt="" width="800" height="400"></div>
            </div>
        </div>
        <button id="flecha-derecha" class="flecha-derecha"><i class="fas fa-arrow-circle-rigth"></i></button>
    </div>

    <h1 class="titulo">Agendamiento de citas</h1>
    <h2 class="subtitulo">Reserve aqui su cita</h2>

    <form action="ServletAgendar" method="get">
        <label for="nombre">Nombre del paciente</label><br>
        <input type="text" id="nombre" name="paciente" placeholder="Nombre del paciente"><br>
        <label for="">Cedula</label><br>
        <input type="text" id="Cedula" placeholder="Cedula"><br>
        <label for="">EPS</label><br>
        <input type="text" id="eps" placeholder="EPS"><br>
        <label for="">Direccion</label><br>
        <input type="text" id="direccion" placeholder="Direccion"><br>
        <label for="">Especialidad</label><br>
        <input type="text" id="especialidad" placeholder="Especialidad"><br>

        <label for="">Sexo</label><br>
        <input type="radio" name="sexo" value="Masculino">Masculino
        <input type="radio" name="sexo" value="Femenino">Femenino<br>

        <label for="">Observaciones</label><br>
        <textarea name="observacion" id="" cols="30" rows="10"></textarea><br><br>

        <input class="boton" type="submit" name="agendamiento" value="Agendar">
        <input class="boton" type="submit" name="agendamiento" value="Consultar">
        <input class="boton" type="submit" name="agendamiento" value="Cancelar"><br><br>
    </form>

</div>

</body>
</html>