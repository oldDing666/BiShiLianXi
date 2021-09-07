import ReceiptPrinter from './receipt-printer';
import Product from './product';

describe('when using receipt printer (teacher extended)', () => {
  const products = [
    new Product('BC001', 'Coca Cola', 3, 'Bottle'),
    new Product('BC003', 'Pepsi Cola', 5, 'Can'),
    new Product('BC005', 'Dr. Peppa', 10, 'Bottle'),
    new Product('BC007', '3M Masks', 50, 'Box'),
    new Product('BC009', 'Core Java Vol I', 120, 'Volumn'),
    new Product('BC999', 'Discount Code', -1, 'Each'),
    new Product('BC000', 'Free Product List', 0, '(NA)')
  ];

  it('should throw for too many barcodes', () => {
    const printer = new ReceiptPrinter(products);
    expect(() => printer.print(new Array(5001).fill('barcode'))).toThrowError();
  });

  it('should throw if the barcode cannot be found', () => {
    const printer = new ReceiptPrinter(products);
    expect(() => printer.print(['barcode not found'])).toThrowError('Unknown barcode: barcode not found.');
  });

  it('should handle free product correctly', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC001', 'BC000', 'BC000']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Free Product List             x2        (NA)\n' +
      'Coca Cola                     x1        Bottle\n' +
      '===================== Total =====================\n' +
      '3.00'
    );
  });

  it('should handle all free products correctly', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC000', 'BC000']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Free Product List             x2        (NA)\n' +
      '===================== Total =====================\n' +
      '0.00'
    );
  });

  it('should handle discount correctly', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC999', 'BC999', 'BC001', 'BC999']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Coca Cola                     x1        Bottle\n' +
      'Discount Code                 x3        Each\n' +
      '===================== Total =====================\n' +
      '0.00'
    );
  });

  it('should handle discount correctly (negative price)', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC999', 'BC999', 'BC999']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Discount Code                 x3        Each\n' +
      '===================== Total =====================\n' +
      '0.00'
    );
  });
});
