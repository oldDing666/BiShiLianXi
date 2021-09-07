import maxMap from './max-map';

describe('when calling maxMap()', () => {
    it('should return max value for numbers', () => {
        expect(maxMap([-100, -15, -50, -10], value => value)).toBe(-10);
    });

    it('should ignore NaN', () => {
        expect(maxMap([NaN, -1000], value => value)).toBe(-1000);
    });

    it('should work with infinity', () => {
        expect(maxMap([Number.MAX_VALUE, Number.POSITIVE_INFINITY], value => value)).toBe(Number.POSITIVE_INFINITY);
        expect(maxMap([Number.MIN_VALUE, Number.NEGATIVE_INFINITY], value => value)).toBe(Number.MIN_VALUE);
    });

    it('should return undefined if the input array is empty', () => {
        expect(maxMap([], value => value)).toBeUndefined();
    });

    it('should return undefined if the mapped results are all null, undefined or NaN', () => {
        expect(maxMap([null, undefined, NaN], value => value)).toBeUndefined();
    });

    it('should return undefined if the input it self is null or undefined value', () => {
        expect(maxMap(null, value => value)).toBeUndefined();
        expect(maxMap(undefined, value => value)).toBeUndefined();
    });

    it('should return original value', () => {
        const input = [
            {name: 'John', age: 10},
            {name: 'Tom', age: 20},
            {name: 'Bob', age: 30}
        ];

        expect(maxMap(input, value => value.age)).toEqual({name: 'Bob', age: 30});
    });
});
