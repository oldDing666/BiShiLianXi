import ReceiptPrinter from './receipt-printer';
import Product from './product';

describe('when using receipt printer', () => {
  const products = [
    new Product('BC001', 'Coca Cola', 3, 'Bottle'),
    new Product('BC003', 'Pepsi Cola', 5, 'Can'),
    new Product('BC005', 'Dr. Peppa', 10, 'Bottle'),
    new Product('BC007', '3M Masks', 50, 'Box'),
    new Product('BC009', 'Core Java Vol I', 120, 'Volumn')
  ];

  it('should throw if the barcode cannot be found', () => {
    const printer = new ReceiptPrinter(products);
    expect(() => printer.print(['What the hell is this'])).toThrowError('Unknown barcode: What the hell is this.');
  });

  it('should print receipt when nothing is bought (undefined)', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print();
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      '\n' +
      '===================== Total =====================\n' +
      '0.00'
    );
  });

  it('should print receipt when nothing is bought (empty)', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print([]);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      '\n' +
      '===================== Total =====================\n' +
      '0.00'
    );
  });

  it('should print receipt when bought only 1 unit of single product', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC001']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Coca Cola                     x1        Bottle\n' +
      '===================== Total =====================\n' +
      '3.00'
    );
  });

  it('should print receipt when bought multiple units of single product', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC001', 'BC001', 'BC001']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Coca Cola                     x3        Bottle\n' +
      '===================== Total =====================\n' +
      '9.00'
    );
  });

  it('should print receipt when bought 1 unit of multiple products, ordered by barcode', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC003', 'BC001', 'BC005']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Coca Cola                     x1        Bottle\n' +
      'Pepsi Cola                    x1        Can\n' +
      'Dr. Peppa                     x1        Bottle\n' +
      '===================== Total =====================\n' +
      '18.00'
    );
  });

  it('should print ordered receipt when bought multiple unit of multiple products, ordered by barcode', () => {
    const printer = new ReceiptPrinter(products);
    const receipt = printer.print(['BC003', 'BC001', 'BC005', 'BC003', 'BC001', 'BC001', 'BC005']);
    expect(receipt).toEqual(
      '==================== Receipt ====================\n' +
      'Coca Cola                     x3        Bottle\n' +
      'Pepsi Cola                    x2        Can\n' +
      'Dr. Peppa                     x2        Bottle\n' +
      '===================== Total =====================\n' +
      '39.00'
    );
  });
});
