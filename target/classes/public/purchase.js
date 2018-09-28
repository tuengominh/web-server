console.log("loaded");

axios.get('/api/purchases')
    .then(function (response) {
        // handle success
        let purchases = response.data;
        console.log(purchases);


        let purchasesDiv = document.getElementById("purchases");

        let purchasesHtml = "";

        for (purchase of purchases) {
            purchasesHtml += "<p>" + purchase.date + " - " + purchase.product.name + " - " + purchase.quantity + " units sold - unit price: " + purchase.product.price + "$" + "</p>";
        }

        console.log(purchasesHtml);

        purchasesDiv.innerHTML = purchasesHtml;

    });
