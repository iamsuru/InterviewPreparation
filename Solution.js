let val = [
    { id: 3, name: "Suru" },
    { id: 1, name: "puru" },
    { id: 2, name: "quru" }
]

val.sort((a, b) => a.name.localeCompare(b.n))
console.log(val);