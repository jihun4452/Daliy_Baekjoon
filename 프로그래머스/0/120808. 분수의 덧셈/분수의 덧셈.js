function solution(a, b, c, d) {
  let n = a * d + c * b;
  let m = b * d;
  let g = function (x, y) { return y ? g(y, x % y) : x; };
  let k = g(n, m);
  return [n / k, m / k];
}
