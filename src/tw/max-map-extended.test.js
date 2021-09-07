import maxMap from './max-map';

describe('when calling maxMap()', () => {
    it('should work for zero (falsy) value', () => {
        expect(maxMap([-100, -15, 0, -10], value => value)).toBe(0);
    });

    it('should work with strings', () => {
        expect(maxMap(['a', 'b', 'c', 'd'], value => value)).toBe('d');
    });

    it('should ignore the mapped undefined, NaN and null', () => {
        expect(maxMap([1, 2, 3, 4, 5], value => value % 2 !== 0 ? undefined : value)).toBe(4);
    });

    it('should not ignore mapped valid value', () => {
        expect(maxMap([null, 5], value => (!value) ? 6 : undefined)).toBeNull();
    });

    it('should work for this special case', () => {
        expect(maxMap([undefined, -1000, undefined], value => value)).toBe(-1000);
        expect(maxMap([NaN, -1000, NaN], value => value)).toBe(-1000);
    });
});
