const objA = { a: 10, b: 20, c: 30 }
const objB = { a: 3, c: 6, d: 3 }
let value = {}
let holder = []
for (let key in objA) {
    if (!holder.includes(key)) { holder.push(key) }
}
for (let key in objB) {
    if (!holder.includes(key)) { holder.push(key) }
}
holder.map(key => {
    let temp_A = 0
    let temp_B = 0
    if (objA[key] != undefined) { temp_A = objA[key] }
    if (objB[key] != undefined) { temp_B = objB[key] }
    let x = parseInt(temp_A) + parseInt(temp_B)
    value[key] = x

})
console.log('Return => ' + JSON.stringify(value))