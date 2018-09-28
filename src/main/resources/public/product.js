console.log("loaded");

axios.get('/api/products')
    .then(function (response) {
        // handle success
        let products = response.data;
        console.log(products);

        let productsDiv = document.getElementById("products");

        let productsHtml = "";

        for (product of products) {
            productsHtml += "<p>" + product.name + " - " + product.price + "$" + "</p>";
        }

        productsDiv.innerHTML = productsHtml;
    });

