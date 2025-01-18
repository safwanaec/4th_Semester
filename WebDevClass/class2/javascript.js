let a = 20;
let b = 20;
let c = 5;

console.log(a+b-c);
let head = document.getElementById("head1");
for(let i=0; i<20; i++) console.log(i);
function myfunc(){
    window.alert("You Gained 100,000,000$");
    head.innerText = "Yooooooooooooooooooooo";
}
console.dir(head);
console.dir(head.innerText);
console.dir(head.innerHTML);
head.innerHTML="<p>Hi!</p>";
let h1=document.createElement("h1");
h1.innerText="helllooo!";
document.body.appendChild(h1);