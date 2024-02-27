# GenesysBe
 Servizio Genesys che restituisce le code attive su cui attivare la survey automatica
 il servizio è http://localhost:8086/getCode

 N.B è presnete @CrossOrigin(origins = "*") sul controller per i test in locale con la seguente pagina HTML 



 <!DOCTYPE html>
<head>
<title>Lista di Code</title>
</head>
<body>

    <h1>Lista di Code</h1>

    <ul id="codeList">
    </ul>

    <script>
    window.onload = function() {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "http://localhost:8086/getCode", true);
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
        var codeArray = JSON.parse(xhr.responseText);
        var codeList = document.getElementById("codeList");
        codeArray.forEach(function(code) {
            var listItem = document.createElement("li");
            listItem.textContent = code;
            codeList.appendChild(listItem);
        });
        }
    };
    xhr.send();
    };
    </script>

</body>
</html>
