const fs = require("fs");

fs.writeFile("./text.txt","this is node JS",(err)=>{});
//var f = fs.readFile("./text.txt","utf-8",(err)=>{});
fs.appendFile("./text.txt","\nhoooooooooooooooooooooooooooooooooooooooooo\nhhhhhhhhhh",(err)=>{});

fs.readFile("./text.txt","utf-8",(err,result)=>{
    console.log(err)
    console.log(result);
});