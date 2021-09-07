class Product {
    constructor(barcode, name, price, unit) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }
}

// const products = [
//     new Product('BC001', 'Coca Cola', 3, 'Bottle'),
//     new Product('BC003', 'Pepsi Cola', 5, 'Can'),
//     new Product('BC005', 'Dr. Peppa', 10, 'Bottle'),
//     new Product('BC007', '3M Masks', 50, 'Box'),
//     new Product('BC009', 'Core Java Vol I', 120, 'Volumn')
// ];
const products = [
    new Product('BC001', 'Coca Cola', 3, 'Bottle'),
    new Product('BC003', 'Pepsi Cola', 5, 'Can'),
    new Product('BC005', 'Dr. Peppa', 10, 'Bottle'),
    new Product('BC007', '3M Masks', 50, 'Box'),
    new Product('BC009', 'Core Java Vol I', 120, 'Volumn'),
    new Product('BC999', 'Discount Code', -1, 'Each'),
    new Product('BC000', 'Free Product List', 0, '(NA)')
];
// let barcodes = ['barcode not found'];
// let barcodes = ['BC001', 'BC001', 'BC001'];
let barcodes = ['BC001', 'BC000', 'BC000'];
// let barcodes = ['BC999', 'BC999', 'BC001', 'BC999'];
// let barcodes = ['BC999', 'BC999', 'BC999'];
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
    // throw new Error("Unknown barcode: " + barcodes + ".");
    console.log("Unknown barcode: " + barcodes + ".");
}


// for (var i = 0; i < productInfo.size; i++) {
//     console.log(productInfo[i]);
// }
// console.log(productInfo);
// for (const info of productInfo) {
//     // console.log(info.toString());
//     console.log(productInfo[info]);
//     // console.log(info.name + "\t" + productInfo.get(info) + "\t" + info.unit);
// }

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
// console.log(totalPrice);
res += totalPrice;
console.log(res);