<html>

<head>
    <meta charset="UTF-8">
    <title>compare</title>
    <script src = "https://cdn.bootcss.com/jquery/1.12.4/jquery.js"></script>

</head>
<body>
<table>
    <thead>

    <tr>
        <th>ProteinID</th>
        <th>Symbol</th>
        <th>Description</th>
        <th>MW(kDa)</th>
    </tr>

    </thead>
    <tbody>


    </tbody>

</table>

</body>
<script>
    $.ajax({
        type: 'get',
        dataType: 'JSON',
        url: 'http://localhost:8080/init',
        success: function (data) {
            console.log(data)
        }
    })


</script>
</html>