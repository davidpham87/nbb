import { loadFile, loadString } from 'nbb';

const { val: result } = await loadFile('test.cljs');

console.log(result);

const { val: add } = await loadString('(fn [x y] (+ x y))');

console.log(add(1,2));
