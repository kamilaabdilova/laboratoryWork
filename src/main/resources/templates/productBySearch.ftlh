
<!DOCTYPE html>
<html lang="${.locale}">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/productsStyle.css">
    <link rel="icon" href="data:,">
    <title>Product</title>
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a href="/">Товар</a>
        </div>
    </div>
</nav>
<div class="container" id="container">
    <div class="row row-cols-2 row-cols-xl-4 row-cols-lg-3 row-cols-md-2 row-cols-sm-1 g-4">
        <#list products as product>
            <div class="col" id="itemList">
                <div class="card h-100">
                    <div class="card-body text-center">
                        <a href="${product.id}"><p>${product.name}</p></a>
                        <p class="category">${product.category}</p>
                        <a href="${product.id}"> <img src="/images/${product.image}" class="card-img-top"></a>
                        <p class="price">Цена ${product.price} $</p>
                        <p class="description">${product.description}</p>
                    </div>
                </div>
            </div>
        </#list>
    </div>
</div>

<#include "pagination.ftlh">


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>