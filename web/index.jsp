<%--
  Created by IntelliJ IDEA.
  User: AmorettS-local
  Date: 27.08.2020
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script>
      //to show the formulary
      $(document).ready(function(){
        $('#myButton').on('click',function () {
            $('#myDiv').toggleClass().show("slow");
        });
      });
    </script>

    <title>WebApp_DT</title>
  </head>
  <body>
    <div class="container" style="background: azure">
      <h1>This text look many difirent because, has beeb added one bootstrap DNS</h1>
      <a href="/AppWeb_DataTransfer_war_exploded/users" id="btn1" class="btn btn-primary">Show all the items</a>
      <h2>The value will be submited here, sended and keeped in servletTransfer, to ende will be showed an index2</h2>
      <button id="myButton" class="btn btn-primary">Open Formulary</button>
    </div>
    <div id="myDiv" style="display: none; background: antiquewhite"><a href="#">Uppsala! we need method "doPost"</a>
      <form action="/AppWeb_DataTransfer_war_exploded/transfer" method="post">
        <label>Id: </label>
          <input type="number" name="id_form">
        <label>Name: </label>
          <input type="String" name="name_form">
        <label>Surname: </label>
          <input type="String" name="surname_form">
        <button type="submit">Send</button>
      </form></div>
  </body>
</html>
