/**
 * This class represents a receipt printer that will print receipt according to
 * the selected product barcodes.
 */
import product from "./product";

export default class ReceiptPrinter {
    /**
     * Create a receipt printer with supported product list.
     *
     * @param {Product} products The supported product list.
     */
    constructor(products) {
        this.products = [...products];
    }

    /**
     * Create a receipt according to the barcodes. The receipt is formatted using
     * the following template:
     *
     * ```
     * ==================== Receipt ====================
     * $product name$                x$count$  $unit$
     * ...
     * ===================== Total =====================
     * $total price$
     * ```
     *
     * * The *product name* should padding to 30 characters wide.
     * * The *x$count$* section should padding to 10 characters wide.
     * * The *unit* should have no padding.
     * * The products in the receipt should be ordered by *barcode*.
     * * The total price should be formatted by 2 decimal digits e.g. `2.00`. If the total price is negative, the total price should be 0.00.
     * * The line breaking character is `'\n'`
     *
     * @param {string[]} barcodes The barcodes.
     *
     * @throws When one of the barcode is not supported. The message should be `"Unknown barcode: $barcode$."`.
     * @throws When you have selected too many products (larger than 5000 items).
     */
    print(barcodes) {
        // TODO: Please implement the method
        // <-start-
        if (barcodes.length > 5000) {
            throw new Error();
        }

        barcodes.sort();
        let map = new Map();
        for (const product of products) {
            map.set(product.barcode, product);
        }
        let totalPrice = 0;
        let productInfo = new Map();
        for (const barcode of barcodes) {
            if (map.has(barcode)) {
                let product = map.get(barcode);
                if (productInfo.has(product)) {
                    productInfo.set(product, productInfo.get(product) + 1);
                } else {
                    productInfo.set(product, 1);
                }
                totalPrice += product.price;
            }
        }

        if (productInfo.size === 0) {
            throw new Error("Unknown barcode: " + barcodes + ".");
            // console.log("Unknown barcode: " + barcodes + ".");
        }

        let res = "";
        res += "==================== Receipt ====================\n";
        let maxNameLength = "Coca Cola                     ".length;
        for (const info of productInfo) {
            // console.log(info + "\t" + productInfo[info]);
            // console.log(info[0].name + "\t" + info[1] + "\t" + info[0].unit);
            res += info[0].name;
            let blank = " ";
            res += blank.repeat(maxNameLength - info[0].name.length);
            res += "x";
            res += info[1];
            res += "        ";
            res += info[0].unit;
            res += "\n";
        }
        totalPrice = totalPrice < 0 ? 0 : totalPrice;
        totalPrice = totalPrice.toFixed(2);
        res += "===================== Total =====================\n";
        res += totalPrice;
        // console.log(res);
        return res;
        // --end->
    }
}

// TODO: You can add additional function or even class if you want
// <-start
// --end->
